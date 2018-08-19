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
package co.watly.vapor.impl;

import co.watly.vapor.CommandRotate;
import co.watly.vapor.VaporPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Rotate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.watly.vapor.impl.CommandRotateImpl#getDegrees <em>Degrees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandRotateImpl extends CommandImpl implements CommandRotate
{
  /**
   * The default value of the '{@link #getDegrees() <em>Degrees</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDegrees()
   * @generated
   * @ordered
   */
  protected static final double DEGREES_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getDegrees() <em>Degrees</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDegrees()
   * @generated
   * @ordered
   */
  protected double degrees = DEGREES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandRotateImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VaporPackage.Literals.COMMAND_ROTATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getDegrees()
  {
    return degrees;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDegrees(double newDegrees)
  {
    double oldDegrees = degrees;
    degrees = newDegrees;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VaporPackage.COMMAND_ROTATE__DEGREES, oldDegrees, degrees));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case VaporPackage.COMMAND_ROTATE__DEGREES:
        return getDegrees();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VaporPackage.COMMAND_ROTATE__DEGREES:
        setDegrees((Double)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case VaporPackage.COMMAND_ROTATE__DEGREES:
        setDegrees(DEGREES_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case VaporPackage.COMMAND_ROTATE__DEGREES:
        return degrees != DEGREES_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (degrees: ");
    result.append(degrees);
    result.append(')');
    return result.toString();
  }

} //CommandRotateImpl
