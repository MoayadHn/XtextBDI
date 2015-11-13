/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BDIImpl <em>BDI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BDIImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBDI()
   * @generated
   */
  int BDI = 0;

  /**
   * The feature id for the '<em><b>Agents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDI__AGENTS = 0;

  /**
   * The number of structural features of the '<em>BDI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BDI_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AgentImpl <em>Agent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AgentImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAgent()
   * @generated
   */
  int AGENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Import</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__IMPORT = 1;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__EVENTS = 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__PARAMETERS = 3;

  /**
   * The feature id for the '<em><b>Beliefs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__BELIEFS = 4;

  /**
   * The feature id for the '<em><b>Plans</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__PLANS = 5;

  /**
   * The number of structural features of the '<em>Agent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ImportsImpl <em>Imports</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ImportsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getImports()
   * @generated
   */
  int IMPORTS = 2;

  /**
   * The feature id for the '<em><b>Imports</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS__IMPORTS = 0;

  /**
   * The number of structural features of the '<em>Imports</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.EventsImpl <em>Events</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.EventsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEvents()
   * @generated
   */
  int EVENTS = 3;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENTS__EVENTS = 0;

  /**
   * The number of structural features of the '<em>Events</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.EventImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Event Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__EVENT_TYPE = 1;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__PARAMETER = 2;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ParametersImpl <em>Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ParametersImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameters()
   * @generated
   */
  int PARAMETERS = 5;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ParameterImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.OperatorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 7;

  /**
   * The feature id for the '<em><b>Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__EQUAL_TO = 0;

  /**
   * The feature id for the '<em><b>Larger Than</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__LARGER_THAN = 1;

  /**
   * The feature id for the '<em><b>Smaller Than</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__SMALLER_THAN = 2;

  /**
   * The feature id for the '<em><b>Larger Or Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__LARGER_OR_EQUAL_TO = 3;

  /**
   * The feature id for the '<em><b>Smaller Or Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__SMALLER_OR_EQUAL_TO = 4;

  /**
   * The feature id for the '<em><b>Not Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__NOT_EQUAL_TO = 5;

  /**
   * The number of structural features of the '<em>Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ConditionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 8;

  /**
   * The feature id for the '<em><b>Subjective</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__SUBJECTIVE = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Objective</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OBJECTIVE = 2;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__AND = 3;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OR = 4;

  /**
   * The feature id for the '<em><b>Compare Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__COMPARE_CONDITION = 5;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExpressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 9;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TermImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTerm()
   * @generated
   */
  int TERM = 10;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FactorImpl <em>Factor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FactorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFactor()
   * @generated
   */
  int FACTOR = 11;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__NUMBER = TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__VARIABLE = TERM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__STRING = TERM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Boolean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__BOOLEAN = TERM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__EXPRESSION = TERM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Factor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_FEATURE_COUNT = TERM_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PlansImpl <em>Plans</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PlansImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPlans()
   * @generated
   */
  int PLANS = 12;

  /**
   * The feature id for the '<em><b>Plans</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANS__PLANS = 0;

  /**
   * The number of structural features of the '<em>Plans</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PlanImpl <em>Plan</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PlanImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPlan()
   * @generated
   */
  int PLAN = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN__NAME = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN__BODY = 1;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN__TRIGGER = 2;

  /**
   * The number of structural features of the '<em>Plan</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TriggerImpl <em>Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TriggerImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTrigger()
   * @generated
   */
  int TRIGGER = 14;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__EVENT = 0;

  /**
   * The feature id for the '<em><b>Goal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__GOAL = 1;

  /**
   * The number of structural features of the '<em>Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BeliefSetImpl <em>Belief Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BeliefSetImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBeliefSet()
   * @generated
   */
  int BELIEF_SET = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF_SET__NAME = 0;

  /**
   * The feature id for the '<em><b>Belief Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF_SET__BELIEF_SET = 1;

  /**
   * The number of structural features of the '<em>Belief Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF_SET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BeliefImpl <em>Belief</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BeliefImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBelief()
   * @generated
   */
  int BELIEF = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Fact</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF__FACT = 1;

  /**
   * The number of structural features of the '<em>Belief</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELIEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FactImpl <em>Fact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FactImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFact()
   * @generated
   */
  int FACT = 17;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Fact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.StatementsImpl <em>Statements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.StatementsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStatements()
   * @generated
   */
  int STATEMENTS = 18;

  /**
   * The feature id for the '<em><b>Statements</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENTS__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Statements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.GoalsImpl <em>Goals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.GoalsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getGoals()
   * @generated
   */
  int GOALS = 19;

  /**
   * The feature id for the '<em><b>Goals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOALS__GOALS = 0;

  /**
   * The number of structural features of the '<em>Goals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOALS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.GoalImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getGoal()
   * @generated
   */
  int GOAL = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__CONDITION = 1;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AchieveImpl <em>Achieve</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AchieveImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAchieve()
   * @generated
   */
  int ACHIEVE = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACHIEVE__NAME = GOAL__NAME;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACHIEVE__CONDITION = GOAL__CONDITION;

  /**
   * The number of structural features of the '<em>Achieve</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACHIEVE_FEATURE_COUNT = GOAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.QueryImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__NAME = GOAL__NAME;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__CONDITION = GOAL__CONDITION;

  /**
   * The feature id for the '<em><b>Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__RESULT = GOAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = GOAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MaintainImpl <em>Maintain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MaintainImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMaintain()
   * @generated
   */
  int MAINTAIN = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTAIN__NAME = GOAL__NAME;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTAIN__CONDITION = GOAL__CONDITION;

  /**
   * The number of structural features of the '<em>Maintain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAINTAIN_FEATURE_COUNT = GOAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PerformImpl <em>Perform</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PerformImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPerform()
   * @generated
   */
  int PERFORM = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORM__NAME = GOAL__NAME;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORM__CONDITION = GOAL__CONDITION;

  /**
   * The number of structural features of the '<em>Perform</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORM_FEATURE_COUNT = GOAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PlusImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 25;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MinusImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 26;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MultiplyImpl <em>Multiply</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MultiplyImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMultiply()
   * @generated
   */
  int MULTIPLY = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__LEFT = TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__RIGHT = TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DivisionImpl <em>Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DivisionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDivision()
   * @generated
   */
  int DIVISION = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__LEFT = TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__RIGHT = TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.BDI <em>BDI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BDI</em>'.
   * @see org.xtext.example.mydsl.myDsl.BDI
   * @generated
   */
  EClass getBDI();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.BDI#getAgents <em>Agents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Agents</em>'.
   * @see org.xtext.example.mydsl.myDsl.BDI#getAgents()
   * @see #getBDI()
   * @generated
   */
  EReference getBDI_Agents();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Agent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Agent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Agent
   * @generated
   */
  EClass getAgent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Agent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Agent#getName()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Agent#getImport <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Import</em>'.
   * @see org.xtext.example.mydsl.myDsl.Agent#getImport()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_Import();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Agent#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see org.xtext.example.mydsl.myDsl.Agent#getEvents()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_Events();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Agent#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.example.mydsl.myDsl.Agent#getParameters()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Agent#getBeliefs <em>Beliefs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Beliefs</em>'.
   * @see org.xtext.example.mydsl.myDsl.Agent#getBeliefs()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_Beliefs();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Agent#getPlans <em>Plans</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Plans</em>'.
   * @see org.xtext.example.mydsl.myDsl.Agent#getPlans()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_Plans();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Imports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imports</em>'.
   * @see org.xtext.example.mydsl.myDsl.Imports
   * @generated
   */
  EClass getImports();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Imports#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Imports</em>'.
   * @see org.xtext.example.mydsl.myDsl.Imports#getImports()
   * @see #getImports()
   * @generated
   */
  EAttribute getImports_Imports();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Events <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Events</em>'.
   * @see org.xtext.example.mydsl.myDsl.Events
   * @generated
   */
  EClass getEvents();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Events#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see org.xtext.example.mydsl.myDsl.Events#getEvents()
   * @see #getEvents()
   * @generated
   */
  EReference getEvents_Events();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.xtext.example.mydsl.myDsl.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Event#getEventType <em>Event Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Event Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Event#getEventType()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_EventType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Event#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Event#getParameter()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Parameter();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Parameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameters</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameters
   * @generated
   */
  EClass getParameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Parameters#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameters#getParameters()
   * @see #getParameters()
   * @generated
   */
  EReference getParameters_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see org.xtext.example.mydsl.myDsl.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Operator#isEqualTo <em>Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Equal To</em>'.
   * @see org.xtext.example.mydsl.myDsl.Operator#isEqualTo()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_EqualTo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Operator#isLargerThan <em>Larger Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Larger Than</em>'.
   * @see org.xtext.example.mydsl.myDsl.Operator#isLargerThan()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_LargerThan();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Operator#isSmallerThan <em>Smaller Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Smaller Than</em>'.
   * @see org.xtext.example.mydsl.myDsl.Operator#isSmallerThan()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_SmallerThan();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Operator#isLargerOrEqualTo <em>Larger Or Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Larger Or Equal To</em>'.
   * @see org.xtext.example.mydsl.myDsl.Operator#isLargerOrEqualTo()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_LargerOrEqualTo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Operator#isSmallerOrEqualTo <em>Smaller Or Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Smaller Or Equal To</em>'.
   * @see org.xtext.example.mydsl.myDsl.Operator#isSmallerOrEqualTo()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_SmallerOrEqualTo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Operator#isNotEqualTo <em>Not Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not Equal To</em>'.
   * @see org.xtext.example.mydsl.myDsl.Operator#isNotEqualTo()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_NotEqualTo();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.xtext.example.mydsl.myDsl.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Condition#getSubjective <em>Subjective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subjective</em>'.
   * @see org.xtext.example.mydsl.myDsl.Condition#getSubjective()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Subjective();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Condition#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operator</em>'.
   * @see org.xtext.example.mydsl.myDsl.Condition#getOperator()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Condition#getObjective <em>Objective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Objective</em>'.
   * @see org.xtext.example.mydsl.myDsl.Condition#getObjective()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Objective();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Condition#isAnd <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>And</em>'.
   * @see org.xtext.example.mydsl.myDsl.Condition#isAnd()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_And();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Condition#isOr <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Or</em>'.
   * @see org.xtext.example.mydsl.myDsl.Condition#isOr()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Or();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Condition#getCompareCondition <em>Compare Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Compare Condition</em>'.
   * @see org.xtext.example.mydsl.myDsl.Condition#getCompareCondition()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_CompareCondition();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see org.xtext.example.mydsl.myDsl.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Factor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factor</em>'.
   * @see org.xtext.example.mydsl.myDsl.Factor
   * @generated
   */
  EClass getFactor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Factor#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.xtext.example.mydsl.myDsl.Factor#getNumber()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_Number();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Factor#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.xtext.example.mydsl.myDsl.Factor#getVariable()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_Variable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Factor#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see org.xtext.example.mydsl.myDsl.Factor#getString()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_String();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Factor#isBoolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolean</em>'.
   * @see org.xtext.example.mydsl.myDsl.Factor#isBoolean()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_Boolean();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Factor#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Factor#getExpression()
   * @see #getFactor()
   * @generated
   */
  EReference getFactor_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Plans <em>Plans</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plans</em>'.
   * @see org.xtext.example.mydsl.myDsl.Plans
   * @generated
   */
  EClass getPlans();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Plans#getPlans <em>Plans</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Plans</em>'.
   * @see org.xtext.example.mydsl.myDsl.Plans#getPlans()
   * @see #getPlans()
   * @generated
   */
  EReference getPlans_Plans();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Plan <em>Plan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plan</em>'.
   * @see org.xtext.example.mydsl.myDsl.Plan
   * @generated
   */
  EClass getPlan();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Plan#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Plan#getName()
   * @see #getPlan()
   * @generated
   */
  EAttribute getPlan_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Plan#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see org.xtext.example.mydsl.myDsl.Plan#getBody()
   * @see #getPlan()
   * @generated
   */
  EAttribute getPlan_Body();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Plan#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trigger</em>'.
   * @see org.xtext.example.mydsl.myDsl.Plan#getTrigger()
   * @see #getPlan()
   * @generated
   */
  EReference getPlan_Trigger();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger</em>'.
   * @see org.xtext.example.mydsl.myDsl.Trigger
   * @generated
   */
  EClass getTrigger();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Trigger#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see org.xtext.example.mydsl.myDsl.Trigger#getEvent()
   * @see #getTrigger()
   * @generated
   */
  EReference getTrigger_Event();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Trigger#getGoal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Goal</em>'.
   * @see org.xtext.example.mydsl.myDsl.Trigger#getGoal()
   * @see #getTrigger()
   * @generated
   */
  EReference getTrigger_Goal();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.BeliefSet <em>Belief Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Belief Set</em>'.
   * @see org.xtext.example.mydsl.myDsl.BeliefSet
   * @generated
   */
  EClass getBeliefSet();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.BeliefSet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.BeliefSet#getName()
   * @see #getBeliefSet()
   * @generated
   */
  EAttribute getBeliefSet_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.BeliefSet#getBeliefSet <em>Belief Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Belief Set</em>'.
   * @see org.xtext.example.mydsl.myDsl.BeliefSet#getBeliefSet()
   * @see #getBeliefSet()
   * @generated
   */
  EReference getBeliefSet_BeliefSet();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Belief <em>Belief</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Belief</em>'.
   * @see org.xtext.example.mydsl.myDsl.Belief
   * @generated
   */
  EClass getBelief();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Belief#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Belief#getName()
   * @see #getBelief()
   * @generated
   */
  EAttribute getBelief_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Belief#getFact <em>Fact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fact</em>'.
   * @see org.xtext.example.mydsl.myDsl.Belief#getFact()
   * @see #getBelief()
   * @generated
   */
  EReference getBelief_Fact();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Fact <em>Fact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fact</em>'.
   * @see org.xtext.example.mydsl.myDsl.Fact
   * @generated
   */
  EClass getFact();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Fact#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statements</em>'.
   * @see org.xtext.example.mydsl.myDsl.Fact#getStatements()
   * @see #getFact()
   * @generated
   */
  EReference getFact_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Statements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statements</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statements
   * @generated
   */
  EClass getStatements();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Statements#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Statements</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statements#getStatements()
   * @see #getStatements()
   * @generated
   */
  EAttribute getStatements_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Goals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goals</em>'.
   * @see org.xtext.example.mydsl.myDsl.Goals
   * @generated
   */
  EClass getGoals();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Goals#getGoals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Goals</em>'.
   * @see org.xtext.example.mydsl.myDsl.Goals#getGoals()
   * @see #getGoals()
   * @generated
   */
  EReference getGoals_Goals();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal</em>'.
   * @see org.xtext.example.mydsl.myDsl.Goal
   * @generated
   */
  EClass getGoal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Goal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Goal#getName()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Goal#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.example.mydsl.myDsl.Goal#getCondition()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_Condition();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Achieve <em>Achieve</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Achieve</em>'.
   * @see org.xtext.example.mydsl.myDsl.Achieve
   * @generated
   */
  EClass getAchieve();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see org.xtext.example.mydsl.myDsl.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Query#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Result</em>'.
   * @see org.xtext.example.mydsl.myDsl.Query#getResult()
   * @see #getQuery()
   * @generated
   */
  EAttribute getQuery_Result();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Maintain <em>Maintain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Maintain</em>'.
   * @see org.xtext.example.mydsl.myDsl.Maintain
   * @generated
   */
  EClass getMaintain();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Perform <em>Perform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Perform</em>'.
   * @see org.xtext.example.mydsl.myDsl.Perform
   * @generated
   */
  EClass getPerform();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see org.xtext.example.mydsl.myDsl.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.myDsl.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.mydsl.myDsl.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see org.xtext.example.mydsl.myDsl.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.myDsl.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.mydsl.myDsl.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Multiply <em>Multiply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiply</em>'.
   * @see org.xtext.example.mydsl.myDsl.Multiply
   * @generated
   */
  EClass getMultiply();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Multiply#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.myDsl.Multiply#getLeft()
   * @see #getMultiply()
   * @generated
   */
  EReference getMultiply_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Multiply#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.mydsl.myDsl.Multiply#getRight()
   * @see #getMultiply()
   * @generated
   */
  EReference getMultiply_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division</em>'.
   * @see org.xtext.example.mydsl.myDsl.Division
   * @generated
   */
  EClass getDivision();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Division#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.myDsl.Division#getLeft()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Division#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.mydsl.myDsl.Division#getRight()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BDIImpl <em>BDI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BDIImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBDI()
     * @generated
     */
    EClass BDI = eINSTANCE.getBDI();

    /**
     * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BDI__AGENTS = eINSTANCE.getBDI_Agents();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AgentImpl <em>Agent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AgentImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAgent()
     * @generated
     */
    EClass AGENT = eINSTANCE.getAgent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__NAME = eINSTANCE.getAgent_Name();

    /**
     * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__IMPORT = eINSTANCE.getAgent_Import();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__EVENTS = eINSTANCE.getAgent_Events();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__PARAMETERS = eINSTANCE.getAgent_Parameters();

    /**
     * The meta object literal for the '<em><b>Beliefs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__BELIEFS = eINSTANCE.getAgent_Beliefs();

    /**
     * The meta object literal for the '<em><b>Plans</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__PLANS = eINSTANCE.getAgent_Plans();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ImportsImpl <em>Imports</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ImportsImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getImports()
     * @generated
     */
    EClass IMPORTS = eINSTANCE.getImports();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORTS__IMPORTS = eINSTANCE.getImports_Imports();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.EventsImpl <em>Events</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.EventsImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEvents()
     * @generated
     */
    EClass EVENTS = eINSTANCE.getEvents();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENTS__EVENTS = eINSTANCE.getEvents_Events();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.EventImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__EVENT_TYPE = eINSTANCE.getEvent_EventType();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__PARAMETER = eINSTANCE.getEvent_Parameter();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ParametersImpl <em>Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ParametersImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameters()
     * @generated
     */
    EClass PARAMETERS = eINSTANCE.getParameters();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERS__PARAMETERS = eINSTANCE.getParameters_Parameters();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ParameterImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.OperatorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOperator()
     * @generated
     */
    EClass OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '<em><b>Equal To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__EQUAL_TO = eINSTANCE.getOperator_EqualTo();

    /**
     * The meta object literal for the '<em><b>Larger Than</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__LARGER_THAN = eINSTANCE.getOperator_LargerThan();

    /**
     * The meta object literal for the '<em><b>Smaller Than</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__SMALLER_THAN = eINSTANCE.getOperator_SmallerThan();

    /**
     * The meta object literal for the '<em><b>Larger Or Equal To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__LARGER_OR_EQUAL_TO = eINSTANCE.getOperator_LargerOrEqualTo();

    /**
     * The meta object literal for the '<em><b>Smaller Or Equal To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__SMALLER_OR_EQUAL_TO = eINSTANCE.getOperator_SmallerOrEqualTo();

    /**
     * The meta object literal for the '<em><b>Not Equal To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__NOT_EQUAL_TO = eINSTANCE.getOperator_NotEqualTo();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ConditionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Subjective</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__SUBJECTIVE = eINSTANCE.getCondition_Subjective();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__OPERATOR = eINSTANCE.getCondition_Operator();

    /**
     * The meta object literal for the '<em><b>Objective</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__OBJECTIVE = eINSTANCE.getCondition_Objective();

    /**
     * The meta object literal for the '<em><b>And</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__AND = eINSTANCE.getCondition_And();

    /**
     * The meta object literal for the '<em><b>Or</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__OR = eINSTANCE.getCondition_Or();

    /**
     * The meta object literal for the '<em><b>Compare Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__COMPARE_CONDITION = eINSTANCE.getCondition_CompareCondition();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExpressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TermImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FactorImpl <em>Factor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FactorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFactor()
     * @generated
     */
    EClass FACTOR = eINSTANCE.getFactor();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__NUMBER = eINSTANCE.getFactor_Number();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__VARIABLE = eINSTANCE.getFactor_Variable();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__STRING = eINSTANCE.getFactor_String();

    /**
     * The meta object literal for the '<em><b>Boolean</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__BOOLEAN = eINSTANCE.getFactor_Boolean();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__EXPRESSION = eINSTANCE.getFactor_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PlansImpl <em>Plans</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PlansImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPlans()
     * @generated
     */
    EClass PLANS = eINSTANCE.getPlans();

    /**
     * The meta object literal for the '<em><b>Plans</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLANS__PLANS = eINSTANCE.getPlans_Plans();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PlanImpl <em>Plan</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PlanImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPlan()
     * @generated
     */
    EClass PLAN = eINSTANCE.getPlan();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLAN__NAME = eINSTANCE.getPlan_Name();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLAN__BODY = eINSTANCE.getPlan_Body();

    /**
     * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAN__TRIGGER = eINSTANCE.getPlan_Trigger();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TriggerImpl <em>Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TriggerImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTrigger()
     * @generated
     */
    EClass TRIGGER = eINSTANCE.getTrigger();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER__EVENT = eINSTANCE.getTrigger_Event();

    /**
     * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER__GOAL = eINSTANCE.getTrigger_Goal();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BeliefSetImpl <em>Belief Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BeliefSetImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBeliefSet()
     * @generated
     */
    EClass BELIEF_SET = eINSTANCE.getBeliefSet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BELIEF_SET__NAME = eINSTANCE.getBeliefSet_Name();

    /**
     * The meta object literal for the '<em><b>Belief Set</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BELIEF_SET__BELIEF_SET = eINSTANCE.getBeliefSet_BeliefSet();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BeliefImpl <em>Belief</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BeliefImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBelief()
     * @generated
     */
    EClass BELIEF = eINSTANCE.getBelief();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BELIEF__NAME = eINSTANCE.getBelief_Name();

    /**
     * The meta object literal for the '<em><b>Fact</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BELIEF__FACT = eINSTANCE.getBelief_Fact();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FactImpl <em>Fact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FactImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFact()
     * @generated
     */
    EClass FACT = eINSTANCE.getFact();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT__STATEMENTS = eINSTANCE.getFact_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.StatementsImpl <em>Statements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.StatementsImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStatements()
     * @generated
     */
    EClass STATEMENTS = eINSTANCE.getStatements();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENTS__STATEMENTS = eINSTANCE.getStatements_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.GoalsImpl <em>Goals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.GoalsImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getGoals()
     * @generated
     */
    EClass GOALS = eINSTANCE.getGoals();

    /**
     * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOALS__GOALS = eINSTANCE.getGoals_Goals();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.GoalImpl <em>Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.GoalImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getGoal()
     * @generated
     */
    EClass GOAL = eINSTANCE.getGoal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__NAME = eINSTANCE.getGoal_Name();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__CONDITION = eINSTANCE.getGoal_Condition();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AchieveImpl <em>Achieve</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AchieveImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAchieve()
     * @generated
     */
    EClass ACHIEVE = eINSTANCE.getAchieve();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.QueryImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getQuery()
     * @generated
     */
    EClass QUERY = eINSTANCE.getQuery();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY__RESULT = eINSTANCE.getQuery_Result();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MaintainImpl <em>Maintain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MaintainImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMaintain()
     * @generated
     */
    EClass MAINTAIN = eINSTANCE.getMaintain();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PerformImpl <em>Perform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PerformImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPerform()
     * @generated
     */
    EClass PERFORM = eINSTANCE.getPerform();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PlusImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MinusImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MultiplyImpl <em>Multiply</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MultiplyImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMultiply()
     * @generated
     */
    EClass MULTIPLY = eINSTANCE.getMultiply();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLY__LEFT = eINSTANCE.getMultiply_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLY__RIGHT = eINSTANCE.getMultiply_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DivisionImpl <em>Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DivisionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDivision()
     * @generated
     */
    EClass DIVISION = eINSTANCE.getDivision();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__LEFT = eINSTANCE.getDivision_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__RIGHT = eINSTANCE.getDivision_Right();

  }

} //MyDslPackage
