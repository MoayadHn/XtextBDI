/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Query#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends Goal
{
  /**
   * Returns the value of the '<em><b>Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' attribute.
   * @see #setResult(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getQuery_Result()
   * @model
   * @generated
   */
  String getResult();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Query#getResult <em>Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' attribute.
   * @see #getResult()
   * @generated
   */
  void setResult(String value);

} // Query
