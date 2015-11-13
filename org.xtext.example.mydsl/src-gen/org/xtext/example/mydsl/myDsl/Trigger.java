/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Trigger#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Trigger#getGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference.
   * @see #setEvent(Event)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTrigger_Event()
   * @model
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Trigger#getEvent <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

  /**
   * Returns the value of the '<em><b>Goal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal</em>' reference.
   * @see #setGoal(Goal)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTrigger_Goal()
   * @model
   * @generated
   */
  Goal getGoal();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Trigger#getGoal <em>Goal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goal</em>' reference.
   * @see #getGoal()
   * @generated
   */
  void setGoal(Goal value);

} // Trigger
