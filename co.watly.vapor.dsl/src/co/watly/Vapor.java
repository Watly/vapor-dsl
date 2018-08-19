/**
 * This work is licensed under the 
 * Creative Commons Attribution-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit 
 * http://creativecommons.org/licenses/by-sa/4.0/ 
 * or send a letter to 
 * Creative Commons, 
 * PO Box 1866, Mountain View, 
 * CA 94042, USA.
 */
package co.watly;

import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;

import co.watly.generator.VaporGenerator;

public class Vapor {

    private static final ResourceSet RESOURCE_SET;
    
    private static final IResourceValidator VALIDATOR;
    
    private static final JavaIoFileSystemAccess FILE_ACCESS;
    
    private static final GeneratorContext GENERATOR_CONTEXT;
    
    static {
        Injector injector = new VaporStandaloneSetup().createInjectorAndDoEMFRegistration();
        RESOURCE_SET = injector.getInstance(ResourceSet.class);
        VALIDATOR = injector.getInstance(IResourceValidator.class);
        FILE_ACCESS = injector.getInstance(JavaIoFileSystemAccess.class);
        GENERATOR_CONTEXT = new GeneratorContext();
        GENERATOR_CONTEXT.setCancelIndicator(CancelIndicator.NullImpl);
    }
    
    public static final synchronized CompletableFuture<String> generate(final String input) {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        CompletableFuture.runAsync(() -> {
            try {
                // load the resource
                Resource resource = RESOURCE_SET.createResource(URI.createURI(new Date().getTime() + ".vapor"));
                resource.load(new URIConverter.ReadableInputStream(input, "UTF-8"), null);
                
                // validate the resource
                List<Issue> list = VALIDATOR.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
                if (list != null && !list.isEmpty()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    for (Issue issue : list) {
                        stringBuilder.append(issue.toString()).append("\n\n");
                    }
                    throw new Exception(stringBuilder.toString().trim());
                }
                
                // generate the resource
                completableFuture.complete(VaporGenerator.consume(resource, FILE_ACCESS, GENERATOR_CONTEXT));
            }
            catch (Exception e) {
                completableFuture.completeExceptionally(e);
            }
        });
        return completableFuture;
    }
}