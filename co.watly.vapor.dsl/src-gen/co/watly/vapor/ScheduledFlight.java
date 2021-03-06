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
package co.watly.vapor;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Flight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.watly.vapor.ScheduledFlight#getDate <em>Date</em>}</li>
 *   <li>{@link co.watly.vapor.ScheduledFlight#getModel <em>Model</em>}</li>
 *   <li>{@link co.watly.vapor.ScheduledFlight#getCost <em>Cost</em>}</li>
 *   <li>{@link co.watly.vapor.ScheduledFlight#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see co.watly.vapor.VaporPackage#getScheduledFlight()
 * @model
 * @generated
 */
public interface ScheduledFlight extends EObject
{
  /**
   * Returns the value of the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' attribute.
   * @see #setDate(Date)
   * @see co.watly.vapor.VaporPackage#getScheduledFlight_Date()
   * @model
   * @generated
   */
  Date getDate();

  /**
   * Sets the value of the '{@link co.watly.vapor.ScheduledFlight#getDate <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' attribute.
   * @see #getDate()
   * @generated
   */
  void setDate(Date value);

  /**
   * Returns the value of the '<em><b>Model</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' attribute.
   * @see #setModel(String)
   * @see co.watly.vapor.VaporPackage#getScheduledFlight_Model()
   * @model
   * @generated
   */
  String getModel();

  /**
   * Sets the value of the '{@link co.watly.vapor.ScheduledFlight#getModel <em>Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' attribute.
   * @see #getModel()
   * @generated
   */
  void setModel(String value);

  /**
   * Returns the value of the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cost</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cost</em>' attribute.
   * @see #setCost(long)
   * @see co.watly.vapor.VaporPackage#getScheduledFlight_Cost()
   * @model
   * @generated
   */
  long getCost();

  /**
   * Sets the value of the '{@link co.watly.vapor.ScheduledFlight#getCost <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cost</em>' attribute.
   * @see #getCost()
   * @generated
   */
  void setCost(long value);

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link co.watly.vapor.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see co.watly.vapor.VaporPackage#getScheduledFlight_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

} // ScheduledFlight
