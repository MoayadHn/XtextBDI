/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Belief Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.BeliefSet#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.BeliefSet#getBeliefSet <em>Belief Set</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBeliefSet()
 * @model
 * @generated
 */
public interface BeliefSet extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBeliefSet_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.BeliefSet#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Belief Set</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Belief}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Belief Set</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Belief Set</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBeliefSet_BeliefSet()
   * @model containment="true"
   * @generated
   */
  EList<Belief> getBeliefSet();

} // BeliefSet
