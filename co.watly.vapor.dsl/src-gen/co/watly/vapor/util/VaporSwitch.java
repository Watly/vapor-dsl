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
/**
 * generated by Xtext 2.13.0
 */
package co.watly.vapor.util;

import co.watly.vapor.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see co.watly.vapor.VaporPackage
 * @generated
 */
public class VaporSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VaporPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VaporSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = VaporPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case VaporPackage.SCHEDULED_FLIGHT:
      {
        ScheduledFlight scheduledFlight = (ScheduledFlight)theEObject;
        T result = caseScheduledFlight(scheduledFlight);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaporPackage.COMMAND:
      {
        Command command = (Command)theEObject;
        T result = caseCommand(command);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaporPackage.COMMAND_COMMON:
      {
        CommandCommon commandCommon = (CommandCommon)theEObject;
        T result = caseCommandCommon(commandCommon);
        if (result == null) result = caseCommand(commandCommon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaporPackage.COMMAND_UP:
      {
        CommandUp commandUp = (CommandUp)theEObject;
        T result = caseCommandUp(commandUp);
        if (result == null) result = caseCommandCommon(commandUp);
        if (result == null) result = caseCommand(commandUp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaporPackage.COMMAND_DOWN:
      {
        CommandDown commandDown = (CommandDown)theEObject;
        T result = caseCommandDown(commandDown);
        if (result == null) result = caseCommandCommon(commandDown);
        if (result == null) result = caseCommand(commandDown);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaporPackage.COMMAND_LEFT:
      {
        CommandLeft commandLeft = (CommandLeft)theEObject;
        T result = caseCommandLeft(commandLeft);
        if (result == null) result = caseCommandCommon(commandLeft);
        if (result == null) result = caseCommand(commandLeft);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaporPackage.COMMAND_RIGHT:
      {
        CommandRight commandRight = (CommandRight)theEObject;
        T result = caseCommandRight(commandRight);
        if (result == null) result = caseCommandCommon(commandRight);
        if (result == null) result = caseCommand(commandRight);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaporPackage.COMMAND_FORWARD:
      {
        CommandForward commandForward = (CommandForward)theEObject;
        T result = caseCommandForward(commandForward);
        if (result == null) result = caseCommandCommon(commandForward);
        if (result == null) result = caseCommand(commandForward);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaporPackage.COMMAND_BACK:
      {
        CommandBack commandBack = (CommandBack)theEObject;
        T result = caseCommandBack(commandBack);
        if (result == null) result = caseCommandCommon(commandBack);
        if (result == null) result = caseCommand(commandBack);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaporPackage.COMMAND_ROTATE:
      {
        CommandRotate commandRotate = (CommandRotate)theEObject;
        T result = caseCommandRotate(commandRotate);
        if (result == null) result = caseCommand(commandRotate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scheduled Flight</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scheduled Flight</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScheduledFlight(ScheduledFlight object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommand(Command object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command Common</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command Common</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommandCommon(CommandCommon object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command Up</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command Up</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommandUp(CommandUp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command Down</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command Down</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommandDown(CommandDown object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command Left</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command Left</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommandLeft(CommandLeft object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command Right</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command Right</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommandRight(CommandRight object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command Forward</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command Forward</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommandForward(CommandForward object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command Back</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command Back</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommandBack(CommandBack object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command Rotate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command Rotate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommandRotate(CommandRotate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //VaporSwitch
