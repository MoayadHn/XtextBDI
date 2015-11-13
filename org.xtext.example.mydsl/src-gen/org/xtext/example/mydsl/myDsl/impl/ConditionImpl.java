/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Condition;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Operator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConditionImpl#getSubjective <em>Subjective</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConditionImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConditionImpl#isAnd <em>And</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConditionImpl#isOr <em>Or</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConditionImpl#getCompareCondition <em>Compare Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition
{
  /**
   * The default value of the '{@link #getSubjective() <em>Subjective</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubjective()
   * @generated
   * @ordered
   */
  protected static final String SUBJECTIVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubjective() <em>Subjective</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubjective()
   * @generated
   * @ordered
   */
  protected String subjective = SUBJECTIVE_EDEFAULT;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected Operator operator;

  /**
   * The cached value of the '{@link #getObjective() <em>Objective</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjective()
   * @generated
   * @ordered
   */
  protected Expression objective;

  /**
   * The default value of the '{@link #isAnd() <em>And</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnd()
   * @generated
   * @ordered
   */
  protected static final boolean AND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAnd() <em>And</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnd()
   * @generated
   * @ordered
   */
  protected boolean and = AND_EDEFAULT;

  /**
   * The default value of the '{@link #isOr() <em>Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOr()
   * @generated
   * @ordered
   */
  protected static final boolean OR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOr() <em>Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOr()
   * @generated
   * @ordered
   */
  protected boolean or = OR_EDEFAULT;

  /**
   * The cached value of the '{@link #getCompareCondition() <em>Compare Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompareCondition()
   * @generated
   * @ordered
   */
  protected Condition compareCondition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
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
    return MyDslPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSubjective()
  {
    return subjective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubjective(String newSubjective)
  {
    String oldSubjective = subjective;
    subjective = newSubjective;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITION__SUBJECTIVE, oldSubjective, subjective));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperator(Operator newOperator, NotificationChain msgs)
  {
    Operator oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITION__OPERATOR, oldOperator, newOperator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(Operator newOperator)
  {
    if (newOperator != operator)
    {
      NotificationChain msgs = null;
      if (operator != null)
        msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONDITION__OPERATOR, null, msgs);
      if (newOperator != null)
        msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONDITION__OPERATOR, null, msgs);
      msgs = basicSetOperator(newOperator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITION__OPERATOR, newOperator, newOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getObjective()
  {
    return objective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjective(Expression newObjective, NotificationChain msgs)
  {
    Expression oldObjective = objective;
    objective = newObjective;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITION__OBJECTIVE, oldObjective, newObjective);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjective(Expression newObjective)
  {
    if (newObjective != objective)
    {
      NotificationChain msgs = null;
      if (objective != null)
        msgs = ((InternalEObject)objective).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONDITION__OBJECTIVE, null, msgs);
      if (newObjective != null)
        msgs = ((InternalEObject)newObjective).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONDITION__OBJECTIVE, null, msgs);
      msgs = basicSetObjective(newObjective, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITION__OBJECTIVE, newObjective, newObjective));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAnd()
  {
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnd(boolean newAnd)
  {
    boolean oldAnd = and;
    and = newAnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITION__AND, oldAnd, and));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOr()
  {
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOr(boolean newOr)
  {
    boolean oldOr = or;
    or = newOr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITION__OR, oldOr, or));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getCompareCondition()
  {
    return compareCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompareCondition(Condition newCompareCondition, NotificationChain msgs)
  {
    Condition oldCompareCondition = compareCondition;
    compareCondition = newCompareCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITION__COMPARE_CONDITION, oldCompareCondition, newCompareCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompareCondition(Condition newCompareCondition)
  {
    if (newCompareCondition != compareCondition)
    {
      NotificationChain msgs = null;
      if (compareCondition != null)
        msgs = ((InternalEObject)compareCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONDITION__COMPARE_CONDITION, null, msgs);
      if (newCompareCondition != null)
        msgs = ((InternalEObject)newCompareCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONDITION__COMPARE_CONDITION, null, msgs);
      msgs = basicSetCompareCondition(newCompareCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITION__COMPARE_CONDITION, newCompareCondition, newCompareCondition));
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
      case MyDslPackage.CONDITION__OPERATOR:
        return basicSetOperator(null, msgs);
      case MyDslPackage.CONDITION__OBJECTIVE:
        return basicSetObjective(null, msgs);
      case MyDslPackage.CONDITION__COMPARE_CONDITION:
        return basicSetCompareCondition(null, msgs);
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
      case MyDslPackage.CONDITION__SUBJECTIVE:
        return getSubjective();
      case MyDslPackage.CONDITION__OPERATOR:
        return getOperator();
      case MyDslPackage.CONDITION__OBJECTIVE:
        return getObjective();
      case MyDslPackage.CONDITION__AND:
        return isAnd();
      case MyDslPackage.CONDITION__OR:
        return isOr();
      case MyDslPackage.CONDITION__COMPARE_CONDITION:
        return getCompareCondition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.CONDITION__SUBJECTIVE:
        setSubjective((String)newValue);
        return;
      case MyDslPackage.CONDITION__OPERATOR:
        setOperator((Operator)newValue);
        return;
      case MyDslPackage.CONDITION__OBJECTIVE:
        setObjective((Expression)newValue);
        return;
      case MyDslPackage.CONDITION__AND:
        setAnd((Boolean)newValue);
        return;
      case MyDslPackage.CONDITION__OR:
        setOr((Boolean)newValue);
        return;
      case MyDslPackage.CONDITION__COMPARE_CONDITION:
        setCompareCondition((Condition)newValue);
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
      case MyDslPackage.CONDITION__SUBJECTIVE:
        setSubjective(SUBJECTIVE_EDEFAULT);
        return;
      case MyDslPackage.CONDITION__OPERATOR:
        setOperator((Operator)null);
        return;
      case MyDslPackage.CONDITION__OBJECTIVE:
        setObjective((Expression)null);
        return;
      case MyDslPackage.CONDITION__AND:
        setAnd(AND_EDEFAULT);
        return;
      case MyDslPackage.CONDITION__OR:
        setOr(OR_EDEFAULT);
        return;
      case MyDslPackage.CONDITION__COMPARE_CONDITION:
        setCompareCondition((Condition)null);
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
      case MyDslPackage.CONDITION__SUBJECTIVE:
        return SUBJECTIVE_EDEFAULT == null ? subjective != null : !SUBJECTIVE_EDEFAULT.equals(subjective);
      case MyDslPackage.CONDITION__OPERATOR:
        return operator != null;
      case MyDslPackage.CONDITION__OBJECTIVE:
        return objective != null;
      case MyDslPackage.CONDITION__AND:
        return and != AND_EDEFAULT;
      case MyDslPackage.CONDITION__OR:
        return or != OR_EDEFAULT;
      case MyDslPackage.CONDITION__COMPARE_CONDITION:
        return compareCondition != null;
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
    result.append(" (subjective: ");
    result.append(subjective);
    result.append(", and: ");
    result.append(and);
    result.append(", or: ");
    result.append(or);
    result.append(')');
    return result.toString();
  }

} //ConditionImpl
