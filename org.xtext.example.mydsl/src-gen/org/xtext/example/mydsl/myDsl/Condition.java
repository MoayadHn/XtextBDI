/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Condition#getSubjective <em>Subjective</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Condition#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Condition#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Condition#isAnd <em>And</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Condition#isOr <em>Or</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Condition#getCompareCondition <em>Compare Condition</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Subjective</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subjective</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subjective</em>' attribute.
   * @see #setSubjective(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCondition_Subjective()
   * @model
   * @generated
   */
  String getSubjective();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Condition#getSubjective <em>Subjective</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subjective</em>' attribute.
   * @see #getSubjective()
   * @generated
   */
  void setSubjective(String value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' containment reference.
   * @see #setOperator(Operator)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCondition_Operator()
   * @model containment="true"
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Condition#getOperator <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' containment reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

  /**
   * Returns the value of the '<em><b>Objective</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objective</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objective</em>' containment reference.
   * @see #setObjective(Expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCondition_Objective()
   * @model containment="true"
   * @generated
   */
  Expression getObjective();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Condition#getObjective <em>Objective</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Objective</em>' containment reference.
   * @see #getObjective()
   * @generated
   */
  void setObjective(Expression value);

  /**
   * Returns the value of the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>And</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>And</em>' attribute.
   * @see #setAnd(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCondition_And()
   * @model
   * @generated
   */
  boolean isAnd();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Condition#isAnd <em>And</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>And</em>' attribute.
   * @see #isAnd()
   * @generated
   */
  void setAnd(boolean value);

  /**
   * Returns the value of the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Or</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Or</em>' attribute.
   * @see #setOr(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCondition_Or()
   * @model
   * @generated
   */
  boolean isOr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Condition#isOr <em>Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Or</em>' attribute.
   * @see #isOr()
   * @generated
   */
  void setOr(boolean value);

  /**
   * Returns the value of the '<em><b>Compare Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compare Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compare Condition</em>' containment reference.
   * @see #setCompareCondition(Condition)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCondition_CompareCondition()
   * @model containment="true"
   * @generated
   */
  Condition getCompareCondition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Condition#getCompareCondition <em>Compare Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compare Condition</em>' containment reference.
   * @see #getCompareCondition()
   * @generated
   */
  void setCompareCondition(Condition value);

} // Condition
