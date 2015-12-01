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
import org.xtext.example.mydsl.myDsl.Goals;
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
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AgentImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AgentImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AgentImpl#getBelief <em>Belief</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AgentImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AgentImpl#getPlan <em>Plan</em>}</li>
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
   * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected EList<Events> event;

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
   * The cached value of the '{@link #getBelief() <em>Belief</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBelief()
   * @generated
   * @ordered
   */
  protected EList<BeliefSet> belief;

  /**
   * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoal()
   * @generated
   * @ordered
   */
  protected EList<Goals> goal;

  /**
   * The cached value of the '{@link #getPlan() <em>Plan</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlan()
   * @generated
   * @ordered
   */
  protected EList<Plans> plan;

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
  public EList<Events> getEvent()
  {
    if (event == null)
    {
      event = new EObjectContainmentEList<Events>(Events.class, this, MyDslPackage.AGENT__EVENT);
    }
    return event;
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
  public EList<BeliefSet> getBelief()
  {
    if (belief == null)
    {
      belief = new EObjectContainmentEList<BeliefSet>(BeliefSet.class, this, MyDslPackage.AGENT__BELIEF);
    }
    return belief;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Goals> getGoal()
  {
    if (goal == null)
    {
      goal = new EObjectContainmentEList<Goals>(Goals.class, this, MyDslPackage.AGENT__GOAL);
    }
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Plans> getPlan()
  {
    if (plan == null)
    {
      plan = new EObjectContainmentEList<Plans>(Plans.class, this, MyDslPackage.AGENT__PLAN);
    }
    return plan;
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
      case MyDslPackage.AGENT__EVENT:
        return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
      case MyDslPackage.AGENT__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case MyDslPackage.AGENT__BELIEF:
        return ((InternalEList<?>)getBelief()).basicRemove(otherEnd, msgs);
      case MyDslPackage.AGENT__GOAL:
        return ((InternalEList<?>)getGoal()).basicRemove(otherEnd, msgs);
      case MyDslPackage.AGENT__PLAN:
        return ((InternalEList<?>)getPlan()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.AGENT__EVENT:
        return getEvent();
      case MyDslPackage.AGENT__PARAMETERS:
        return getParameters();
      case MyDslPackage.AGENT__BELIEF:
        return getBelief();
      case MyDslPackage.AGENT__GOAL:
        return getGoal();
      case MyDslPackage.AGENT__PLAN:
        return getPlan();
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
      case MyDslPackage.AGENT__EVENT:
        getEvent().clear();
        getEvent().addAll((Collection<? extends Events>)newValue);
        return;
      case MyDslPackage.AGENT__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameters>)newValue);
        return;
      case MyDslPackage.AGENT__BELIEF:
        getBelief().clear();
        getBelief().addAll((Collection<? extends BeliefSet>)newValue);
        return;
      case MyDslPackage.AGENT__GOAL:
        getGoal().clear();
        getGoal().addAll((Collection<? extends Goals>)newValue);
        return;
      case MyDslPackage.AGENT__PLAN:
        getPlan().clear();
        getPlan().addAll((Collection<? extends Plans>)newValue);
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
      case MyDslPackage.AGENT__EVENT:
        getEvent().clear();
        return;
      case MyDslPackage.AGENT__PARAMETERS:
        getParameters().clear();
        return;
      case MyDslPackage.AGENT__BELIEF:
        getBelief().clear();
        return;
      case MyDslPackage.AGENT__GOAL:
        getGoal().clear();
        return;
      case MyDslPackage.AGENT__PLAN:
        getPlan().clear();
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
      case MyDslPackage.AGENT__EVENT:
        return event != null && !event.isEmpty();
      case MyDslPackage.AGENT__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case MyDslPackage.AGENT__BELIEF:
        return belief != null && !belief.isEmpty();
      case MyDslPackage.AGENT__GOAL:
        return goal != null && !goal.isEmpty();
      case MyDslPackage.AGENT__PLAN:
        return plan != null && !plan.isEmpty();
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
