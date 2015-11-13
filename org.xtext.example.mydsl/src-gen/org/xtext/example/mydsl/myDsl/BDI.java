/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BDI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.BDI#getAgents <em>Agents</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBDI()
 * @model
 * @generated
 */
public interface BDI extends EObject
{
  /**
   * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Agent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agents</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBDI_Agents()
   * @model containment="true"
   * @generated
   */
  EList<Agent> getAgents();

} // BDI
