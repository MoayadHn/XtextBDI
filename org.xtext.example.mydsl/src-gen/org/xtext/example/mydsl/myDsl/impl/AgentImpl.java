/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Agent;
import org.xtext.example.mydsl.myDsl.BeliefSet;
import org.xtext.example.mydsl.myDsl.Events;
import org.xtext.example.mydsl.myDsl.Imports;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Parameters;
import org.xtext.example.mydsl.myDsl.Plans;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AgentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AgentImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AgentImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AgentImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AgentImpl#getBeliefs <em>Beliefs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AgentImpl#getPlans <em>Plans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentImpl extends MinimalEObjectImpl.Container implements Agent
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImport()
   * @generated
   * @ordered
   */
  protected EList<Imports> import_;

  /**
   * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<Events> events;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameters> parameters;

  /**
   * The cached value of the '{@link #getBeliefs() <em>Beliefs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeliefs()
   * @generated
   * @ordered
   */
  protected EList<BeliefSet> beliefs;

  /**
   * The cached value of the '{@link #getPlans() <em>Plans</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlans()
   * @generated
   * @ordered
   */
  protected EList<Plans> plans;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AgentImpl()
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
    return MyDslPackage.Literals.AGENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.AGENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Imports> getImport()
  {
    if (import_ == null)
    {
      import_ = new EObjectContainmentEList<Imports>(Imports.class, this, MyDslPackage.AGENT__IMPORT);
    }
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Events> getEvents()
  {
    if (events == null)
    {
      events = new EObjectContainmentEList<Events>(Events.class, this, MyDslPackage.AGENT__EVENTS);
    }
    return events;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameters> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Parameters>(Parameters.class, this, MyDslPackage.AGENT__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BeliefSet> getBeliefs()
  {
    if (beliefs == null)
    {
      beliefs = new EObjectContainmentEList<BeliefSet>(BeliefSet.class, this, MyDslPackage.AGENT__BELIEFS);
    }
    return beliefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Plans> getPlans()
  {
    if (plans == null)
    {
      plans = new EObjectContainmentEList<Plans>(Plans.class, this, MyDslPackage.AGENT__PLANS);
    }
    return plans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.AGENT__IMPORT:
        return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
      case MyDslPackage.AGENT__EVENTS:
        return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
      case MyDslPackage.AGENT__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case MyDslPackage.AGENT__BELIEFS:
        return ((InternalEList<?>)getBeliefs()).basicRemove(otherEnd, msgs);
      case MyDslPackage.AGENT__PLANS:
        return ((InternalEList<?>)getPlans()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MyDslPackage.AGENT__NAME:
        return getName();
      case MyDslPackage.AGENT__IMPORT:
        return getImport();
      case MyDslPackage.AGENT__EVENTS:
        return getEvents();
      case MyDslPackage.AGENT__PARAMETERS:
        return getParameters();
      case MyDslPackage.AGENT__BELIEFS:
        return getBeliefs();
      case MyDslPackage.AGENT__PLANS:
        return getPlans();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.AGENT__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.AGENT__IMPORT:
        getImport().clear();
        getImport().addAll((Collection<? extends Imports>)newValue);
        return;
      case MyDslPackage.AGENT__EVENTS:
        getEvents().clear();
        getEvents().addAll((Collection<? extends Events>)newValue);
        return;
      case MyDslPackage.AGENT__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameters>)newValue);
        return;
      case MyDslPackage.AGENT__BELIEFS:
        getBeliefs().clear();
        getBeliefs().addAll((Collection<? extends BeliefSet>)newValue);
        return;
      case MyDslPackage.AGENT__PLANS:
        getPlans().clear();
        getPlans().addAll((Collection<? extends Plans>)newValue);
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
      case MyDslPackage.AGENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.AGENT__IMPORT:
        getImport().clear();
        return;
      case MyDslPackage.AGENT__EVENTS:
        getEvents().clear();
        return;
      case MyDslPackage.AGENT__PARAMETERS:
        getParameters().clear();
        return;
      case MyDslPackage.AGENT__BELIEFS:
        getBeliefs().clear();
        return;
      case MyDslPackage.AGENT__PLANS:
        getPlans().clear();
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
      case MyDslPackage.AGENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.AGENT__IMPORT:
        return import_ != null && !import_.isEmpty();
      case MyDslPackage.AGENT__EVENTS:
        return events != null && !events.isEmpty();
      case MyDslPackage.AGENT__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case MyDslPackage.AGENT__BELIEFS:
        return beliefs != null && !beliefs.isEmpty();
      case MyDslPackage.AGENT__PLANS:
        return plans != null && !plans.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AgentImpl
