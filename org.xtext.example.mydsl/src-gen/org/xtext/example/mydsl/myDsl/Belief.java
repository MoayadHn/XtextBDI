/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Belief</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Belief#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Belief#getBeliefGoal <em>Belief Goal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Belief#getBeliefValidate <em>Belief Validate</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Belief#getFact <em>Fact</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBelief()
 * @model
 * @generated
 */
public interface Belief extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBelief_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Belief#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Belief Goal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Belief Goal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Belief Goal</em>' attribute.
   * @see #setBeliefGoal(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBelief_BeliefGoal()
   * @model
   * @generated
   */
  String getBeliefGoal();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Belief#getBeliefGoal <em>Belief Goal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Belief Goal</em>' attribute.
   * @see #getBeliefGoal()
   * @generated
   */
  void setBeliefGoal(String value);

  /**
   * Returns the value of the '<em><b>Belief Validate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Belief Validate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Belief Validate</em>' attribute.
   * @see #setBeliefValidate(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBelief_BeliefValidate()
   * @model
   * @generated
   */
  String getBeliefValidate();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Belief#getBeliefValidate <em>Belief Validate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Belief Validate</em>' attribute.
   * @see #getBeliefValidate()
   * @generated
   */
  void setBeliefValidate(String value);

  /**
   * Returns the value of the '<em><b>Fact</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Fact}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fact</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fact</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBelief_Fact()
   * @model containment="true"
   * @generated
   */
  EList<Fact> getFact();

} // Belief
