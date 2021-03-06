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

import co.watly.vapor.CommandCommon;
import co.watly.vapor.VaporPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Common</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.watly.vapor.impl.CommandCommonImpl#getMillisecs <em>Millisecs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandCommonImpl extends CommandImpl implements CommandCommon
{
  /**
   * The default value of the '{@link #getMillisecs() <em>Millisecs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMillisecs()
   * @generated
   * @ordered
   */
  protected static final int MILLISECS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMillisecs() <em>Millisecs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMillisecs()
   * @generated
   * @ordered
   */
  protected int millisecs = MILLISECS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandCommonImpl()
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
    return VaporPackage.Literals.COMMAND_COMMON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMillisecs()
  {
    return millisecs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMillisecs(int newMillisecs)
  {
    int oldMillisecs = millisecs;
    millisecs = newMillisecs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VaporPackage.COMMAND_COMMON__MILLISECS, oldMillisecs, millisecs));
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
      case VaporPackage.COMMAND_COMMON__MILLISECS:
        return getMillisecs();
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
      case VaporPackage.COMMAND_COMMON__MILLISECS:
        setMillisecs((Integer)newValue);
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
      case VaporPackage.COMMAND_COMMON__MILLISECS:
        setMillisecs(MILLISECS_EDEFAULT);
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
      case VaporPackage.COMMAND_COMMON__MILLISECS:
        return millisecs != MILLISECS_EDEFAULT;
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
    result.append(" (millisecs: ");
    result.append(millisecs);
    result.append(')');
    return result.toString();
  }

} //CommandCommonImpl
