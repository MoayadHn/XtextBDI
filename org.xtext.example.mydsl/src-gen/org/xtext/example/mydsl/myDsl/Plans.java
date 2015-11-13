/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Plans#getPlans <em>Plans</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPlans()
 * @model
 * @generated
 */
public interface Plans extends EObject
{
  /**
   * Returns the value of the '<em><b>Plans</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Plan}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plans</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plans</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPlans_Plans()
   * @model containment="true"
   * @generated
   */
  EList<Plan> getPlans();

} // Plans
