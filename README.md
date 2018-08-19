# vapor-dsl
Vapor DSL and Code Generators + UI Libraries for Eclipse Plugins

These projects have two different natures:

- Eclipse Plugins, to use DSL editor, code highliter and syntax validator inside the Eclipse Eco-System;

- Simple Java Maven projects, so to build ```co.watly.vapor.dsl``` and use it as a library just use the command

```mvn clean install```

on your command console JUST the first time, for other times use

```mvn -o clean install```, because of extremely long compilation time.