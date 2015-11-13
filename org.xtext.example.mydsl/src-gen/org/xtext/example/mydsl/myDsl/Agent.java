/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Agent#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Agent#getImport <em>Import</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Agent#getEvents <em>Events</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Agent#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Agent#getBeliefs <em>Beliefs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Agent#getPlans <em>Plans</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAgent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Agent#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Import</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Imports}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAgent_Import()
   * @model containment="true"
   * @generated
   */
  EList<Imports> getImport();

  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Events}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAgent_Events()
   * @model containment="true"
   * @generated
   */
  EList<Events> getEvents();

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Parameters}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAgent_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameters> getParameters();

  /**
   * Returns the value of the '<em><b>Beliefs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.BeliefSet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Beliefs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beliefs</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAgent_Beliefs()
   * @model containment="true"
   * @generated
   */
  EList<BeliefSet> getBeliefs();

  /**
   * Returns the value of the '<em><b>Plans</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Plans}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plans</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plans</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAgent_Plans()
   * @model containment="true"
   * @generated
   */
  EList<Plans> getPlans();

} // Agent
