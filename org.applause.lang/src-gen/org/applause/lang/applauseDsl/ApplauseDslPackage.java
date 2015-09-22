/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.applause.lang.applauseDsl.ApplauseDslFactory
 * @model kind="package"
 * @generated
 */
public interface ApplauseDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "applauseDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.applause.org/lang/ApplauseDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "applauseDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ApplauseDslPackage eINSTANCE = org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ApplauseModelImpl <em>Applause Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ApplauseModelImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getApplauseModel()
   * @generated
   */
  int APPLAUSE_MODEL = 0;

  /**
   * The feature id for the '<em><b>Application</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLAUSE_MODEL__APPLICATION = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLAUSE_MODEL__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Applause Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLAUSE_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ModelElementImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getModelElement()
   * @generated
   */
  int MODEL_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.NavigationBarItemImpl <em>Navigation Bar Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.NavigationBarItemImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getNavigationBarItem()
   * @generated
   */
  int NAVIGATION_BAR_ITEM = 2;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_BAR_ITEM__POSITION = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Icon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_BAR_ITEM__ICON = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_BAR_ITEM__TRIGGERS = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Navigation Bar Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_BAR_ITEM_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.VariableDeclarationImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.TypeDescriptionImpl <em>Type Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.TypeDescriptionImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getTypeDescription()
   * @generated
   */
  int TYPE_DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DESCRIPTION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DESCRIPTION__MANY = 1;

  /**
   * The number of structural features of the '<em>Type Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DESCRIPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ParameterImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = VARIABLE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DESCRIPTION = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ExpressionImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 7;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ObjectReferenceImpl <em>Object Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ObjectReferenceImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getObjectReference()
   * @generated
   */
  int OBJECT_REFERENCE = 6;

  /**
   * The feature id for the '<em><b>Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_REFERENCE__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_REFERENCE__TAIL = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ScalarExpressionImpl <em>Scalar Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ScalarExpressionImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getScalarExpression()
   * @generated
   */
  int SCALAR_EXPRESSION = 8;

  /**
   * The number of structural features of the '<em>Scalar Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.CollectionExpressionImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionExpression()
   * @generated
   */
  int COLLECTION_EXPRESSION = 9;

  /**
   * The number of structural features of the '<em>Collection Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.StringLiteralImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.PredefinedParameterImpl <em>Predefined Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.PredefinedParameterImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getPredefinedParameter()
   * @generated
   */
  int PREDEFINED_PARAMETER = 11;

  /**
   * The number of structural features of the '<em>Predefined Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDEFINED_PARAMETER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.SectionIdImpl <em>Section Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.SectionIdImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getSectionId()
   * @generated
   */
  int SECTION_ID = 12;

  /**
   * The number of structural features of the '<em>Section Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_ID_FEATURE_COUNT = PREDEFINED_PARAMETER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.StringFunctionImpl <em>String Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.StringFunctionImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getStringFunction()
   * @generated
   */
  int STRING_FUNCTION = 13;

  /**
   * The number of structural features of the '<em>String Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.CollectionLiteralImpl <em>Collection Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.CollectionLiteralImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionLiteral()
   * @generated
   */
  int COLLECTION_LITERAL = 14;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_LITERAL__ITEMS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Collection Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.CollectionFunctionImpl <em>Collection Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.CollectionFunctionImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionFunction()
   * @generated
   */
  int COLLECTION_FUNCTION = 15;

  /**
   * The number of structural features of the '<em>Collection Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ApplicationImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 16;

  /**
   * The feature id for the '<em><b>Tabbar Application</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__TABBAR_APPLICATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Appicon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__APPICON = 2;

  /**
   * The feature id for the '<em><b>Splash</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__SPLASH = 3;

  /**
   * The feature id for the '<em><b>Mainview</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__MAINVIEW = 4;

  /**
   * The feature id for the '<em><b>Buttons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__BUTTONS = 5;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ButtonImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 17;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__TITLE = 0;

  /**
   * The feature id for the '<em><b>Icon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__ICON = 1;

  /**
   * The feature id for the '<em><b>View</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__VIEW = 2;

  /**
   * The feature id for the '<em><b>Handler</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__HANDLER = 3;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.TypeImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.SimpleTypeImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getSimpleType()
   * @generated
   */
  int SIMPLE_TYPE = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Platform Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__PLATFORM_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.EntityImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__EXTENDS = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PROPERTIES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.PropertyImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = VARIABLE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DERIVED = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DESCRIPTION = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ContentProviderImpl <em>Content Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ContentProviderImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getContentProvider()
   * @generated
   */
  int CONTENT_PROVIDER = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__PARAMETER = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Resolver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__RESOLVER = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__TYPE = MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__MANY = MODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Xml</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__XML = MODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Html</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__HTML = MODEL_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__URL = MODEL_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Selection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__SELECTION = MODEL_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Content Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ProviderConstructionImpl <em>Provider Construction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ProviderConstructionImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getProviderConstruction()
   * @generated
   */
  int PROVIDER_CONSTRUCTION = 23;

  /**
   * The feature id for the '<em><b>Provider</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER_CONSTRUCTION__PROVIDER = 0;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER_CONSTRUCTION__ARGUMENT = 1;

  /**
   * The feature id for the '<em><b>Predefined Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER_CONSTRUCTION__PREDEFINED_PARAMETER = 2;

  /**
   * The number of structural features of the '<em>Provider Construction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER_CONSTRUCTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ViewImpl <em>View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ViewImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getView()
   * @generated
   */
  int VIEW = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__TITLE = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Buttons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__BUTTONS = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__ACTIONS = MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.SectionedViewImpl <em>Sectioned View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.SectionedViewImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getSectionedView()
   * @generated
   */
  int SECTIONED_VIEW = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW__NAME = VIEW__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW__TITLE = VIEW__TITLE;

  /**
   * The feature id for the '<em><b>Buttons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW__BUTTONS = VIEW__BUTTONS;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW__ACTIONS = VIEW__ACTIONS;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW__CONTENT = VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super View</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW__SUPER_VIEW = VIEW_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>For All Sections</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW__FOR_ALL_SECTIONS = VIEW_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW__SECTIONS = VIEW_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Sectioned View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.TableViewImpl <em>Table View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.TableViewImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getTableView()
   * @generated
   */
  int TABLE_VIEW = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__NAME = SECTIONED_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__TITLE = SECTIONED_VIEW__TITLE;

  /**
   * The feature id for the '<em><b>Buttons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__BUTTONS = SECTIONED_VIEW__BUTTONS;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__ACTIONS = SECTIONED_VIEW__ACTIONS;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__CONTENT = SECTIONED_VIEW__CONTENT;

  /**
   * The feature id for the '<em><b>Super View</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__SUPER_VIEW = SECTIONED_VIEW__SUPER_VIEW;

  /**
   * The feature id for the '<em><b>For All Sections</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__FOR_ALL_SECTIONS = SECTIONED_VIEW__FOR_ALL_SECTIONS;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__SECTIONS = SECTIONED_VIEW__SECTIONS;

  /**
   * The number of structural features of the '<em>Table View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW_FEATURE_COUNT = SECTIONED_VIEW_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.DetailsViewImpl <em>Details View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.DetailsViewImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getDetailsView()
   * @generated
   */
  int DETAILS_VIEW = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__NAME = SECTIONED_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__TITLE = SECTIONED_VIEW__TITLE;

  /**
   * The feature id for the '<em><b>Buttons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__BUTTONS = SECTIONED_VIEW__BUTTONS;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__ACTIONS = SECTIONED_VIEW__ACTIONS;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__CONTENT = SECTIONED_VIEW__CONTENT;

  /**
   * The feature id for the '<em><b>Super View</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__SUPER_VIEW = SECTIONED_VIEW__SUPER_VIEW;

  /**
   * The feature id for the '<em><b>For All Sections</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__FOR_ALL_SECTIONS = SECTIONED_VIEW__FOR_ALL_SECTIONS;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__SECTIONS = SECTIONED_VIEW__SECTIONS;

  /**
   * The feature id for the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__HEADER = SECTIONED_VIEW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Details View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW_FEATURE_COUNT = SECTIONED_VIEW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.WebViewImpl <em>Web View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.WebViewImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getWebView()
   * @generated
   */
  int WEB_VIEW = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_VIEW__NAME = VIEW__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_VIEW__TITLE = VIEW__TITLE;

  /**
   * The feature id for the '<em><b>Buttons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_VIEW__BUTTONS = VIEW__BUTTONS;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_VIEW__ACTIONS = VIEW__ACTIONS;

  /**
   * The feature id for the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_VIEW__HEADER = VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>For All Sections</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_VIEW__FOR_ALL_SECTIONS = VIEW_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_VIEW__SECTIONS = VIEW_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Web View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.CustomViewImpl <em>Custom View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.CustomViewImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getCustomView()
   * @generated
   */
  int CUSTOM_VIEW = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW__NAME = VIEW__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW__TITLE = VIEW__TITLE;

  /**
   * The feature id for the '<em><b>Buttons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW__BUTTONS = VIEW__BUTTONS;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW__ACTIONS = VIEW__ACTIONS;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW__CONTENT = VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Objclass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW__OBJCLASS = VIEW_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Custom View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ViewHeaderImpl <em>View Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ViewHeaderImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getViewHeader()
   * @generated
   */
  int VIEW_HEADER = 30;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_HEADER__TITLE = 0;

  /**
   * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_HEADER__SUBTITLE = 1;

  /**
   * The feature id for the '<em><b>Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_HEADER__DETAILS = 2;

  /**
   * The feature id for the '<em><b>Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_HEADER__IMAGE = 3;

  /**
   * The number of structural features of the '<em>View Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_HEADER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ViewSectionImpl <em>View Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ViewSectionImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getViewSection()
   * @generated
   */
  int VIEW_SECTION = 31;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_SECTION__TITLE = 0;

  /**
   * The feature id for the '<em><b>Cells</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_SECTION__CELLS = 1;

  /**
   * The number of structural features of the '<em>View Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ViewForAllSectionsImpl <em>View For All Sections</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ViewForAllSectionsImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getViewForAllSections()
   * @generated
   */
  int VIEW_FOR_ALL_SECTIONS = 32;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FOR_ALL_SECTIONS__TITLE = 0;

  /**
   * The feature id for the '<em><b>Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FOR_ALL_SECTIONS__PROVIDER = 1;

  /**
   * The feature id for the '<em><b>Cells</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FOR_ALL_SECTIONS__CELLS = 2;

  /**
   * The number of structural features of the '<em>View For All Sections</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FOR_ALL_SECTIONS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.SectionCellImpl <em>Section Cell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.SectionCellImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getSectionCell()
   * @generated
   */
  int SECTION_CELL = 33;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__TYPE = 0;

  /**
   * The feature id for the '<em><b>Iterator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__ITERATOR = 1;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__TEXT = 2;

  /**
   * The feature id for the '<em><b>Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__DETAILS = 3;

  /**
   * The feature id for the '<em><b>Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__IMAGE = 4;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__QUERY = 5;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__ACTION = 6;

  /**
   * The feature id for the '<em><b>Button Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__BUTTON_ACTION = 7;

  /**
   * The number of structural features of the '<em>Section Cell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.CollectionIteratorImpl <em>Collection Iterator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.CollectionIteratorImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionIterator()
   * @generated
   */
  int COLLECTION_ITERATOR = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_ITERATOR__NAME = VARIABLE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_ITERATOR__COLLECTION = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Collection Iterator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_ITERATOR_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ViewActionImpl <em>View Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ViewActionImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getViewAction()
   * @generated
   */
  int VIEW_ACTION = 35;

  /**
   * The number of structural features of the '<em>View Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ActionDelegateImpl <em>Action Delegate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ActionDelegateImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getActionDelegate()
   * @generated
   */
  int ACTION_DELEGATE = 36;

  /**
   * The number of structural features of the '<em>Action Delegate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DELEGATE_FEATURE_COUNT = VIEW_ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ExternalOpenImpl <em>External Open</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ExternalOpenImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getExternalOpen()
   * @generated
   */
  int EXTERNAL_OPEN = 37;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_OPEN__URL = VIEW_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>External Open</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_OPEN_FEATURE_COUNT = VIEW_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ViewCallImpl <em>View Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ViewCallImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getViewCall()
   * @generated
   */
  int VIEW_CALL = 38;

  /**
   * The feature id for the '<em><b>View</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CALL__VIEW = VIEW_ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CALL__PROVIDER = VIEW_ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CALL__ACTION = VIEW_ACTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>View Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CALL_FEATURE_COUNT = VIEW_ACTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.StringConcatImpl <em>String Concat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.StringConcatImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getStringConcat()
   * @generated
   */
  int STRING_CONCAT = 39;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONCAT__VALUES = STRING_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Concat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONCAT_FEATURE_COUNT = STRING_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.StringReplaceImpl <em>String Replace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.StringReplaceImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getStringReplace()
   * @generated
   */
  int STRING_REPLACE = 40;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REPLACE__VALUE = STRING_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Match</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REPLACE__MATCH = STRING_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REPLACE__REPLACEMENT = STRING_FUNCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>String Replace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REPLACE_FEATURE_COUNT = STRING_FUNCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.StringUrlConformImpl <em>String Url Conform</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.StringUrlConformImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getStringUrlConform()
   * @generated
   */
  int STRING_URL_CONFORM = 41;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_URL_CONFORM__VALUE = STRING_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Url Conform</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_URL_CONFORM_FEATURE_COUNT = STRING_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.StringSplitImpl <em>String Split</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.StringSplitImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getStringSplit()
   * @generated
   */
  int STRING_SPLIT = 42;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_SPLIT__VALUE = COLLECTION_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Delimiter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_SPLIT__DELIMITER = COLLECTION_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>String Split</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_SPLIT_FEATURE_COUNT = COLLECTION_FUNCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.impl.ConstantImpl
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 43;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = VARIABLE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Language</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__LANGUAGE = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VALUE = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.CellType <em>Cell Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.CellType
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getCellType()
   * @generated
   */
  int CELL_TYPE = 44;

  /**
   * The meta object id for the '{@link org.applause.lang.applauseDsl.Position <em>Position</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.lang.applauseDsl.Position
   * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getPosition()
   * @generated
   */
  int POSITION = 45;


  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.ApplauseModel <em>Applause Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Applause Model</em>'.
   * @see org.applause.lang.applauseDsl.ApplauseModel
   * @generated
   */
  EClass getApplauseModel();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ApplauseModel#getApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Application</em>'.
   * @see org.applause.lang.applauseDsl.ApplauseModel#getApplication()
   * @see #getApplauseModel()
   * @generated
   */
  EReference getApplauseModel_Application();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.ApplauseModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.applause.lang.applauseDsl.ApplauseModel#getElements()
   * @see #getApplauseModel()
   * @generated
   */
  EReference getApplauseModel_Elements();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Element</em>'.
   * @see org.applause.lang.applauseDsl.ModelElement
   * @generated
   */
  EClass getModelElement();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.NavigationBarItem <em>Navigation Bar Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Navigation Bar Item</em>'.
   * @see org.applause.lang.applauseDsl.NavigationBarItem
   * @generated
   */
  EClass getNavigationBarItem();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.NavigationBarItem#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Position</em>'.
   * @see org.applause.lang.applauseDsl.NavigationBarItem#getPosition()
   * @see #getNavigationBarItem()
   * @generated
   */
  EAttribute getNavigationBarItem_Position();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.NavigationBarItem#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Icon</em>'.
   * @see org.applause.lang.applauseDsl.NavigationBarItem#getIcon()
   * @see #getNavigationBarItem()
   * @generated
   */
  EReference getNavigationBarItem_Icon();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.NavigationBarItem#getTriggers <em>Triggers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Triggers</em>'.
   * @see org.applause.lang.applauseDsl.NavigationBarItem#getTriggers()
   * @see #getNavigationBarItem()
   * @generated
   */
  EReference getNavigationBarItem_Triggers();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see org.applause.lang.applauseDsl.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.VariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.lang.applauseDsl.VariableDeclaration#getName()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.TypeDescription <em>Type Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Description</em>'.
   * @see org.applause.lang.applauseDsl.TypeDescription
   * @generated
   */
  EClass getTypeDescription();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.TypeDescription#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.applause.lang.applauseDsl.TypeDescription#getType()
   * @see #getTypeDescription()
   * @generated
   */
  EReference getTypeDescription_Type();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.TypeDescription#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.applause.lang.applauseDsl.TypeDescription#isMany()
   * @see #getTypeDescription()
   * @generated
   */
  EAttribute getTypeDescription_Many();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.applause.lang.applauseDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.Parameter#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.applause.lang.applauseDsl.Parameter#getDescription()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Description();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.ObjectReference <em>Object Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Reference</em>'.
   * @see org.applause.lang.applauseDsl.ObjectReference
   * @generated
   */
  EClass getObjectReference();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.ObjectReference#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Object</em>'.
   * @see org.applause.lang.applauseDsl.ObjectReference#getObject()
   * @see #getObjectReference()
   * @generated
   */
  EReference getObjectReference_Object();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ObjectReference#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tail</em>'.
   * @see org.applause.lang.applauseDsl.ObjectReference#getTail()
   * @see #getObjectReference()
   * @generated
   */
  EReference getObjectReference_Tail();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.applause.lang.applauseDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.ScalarExpression <em>Scalar Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scalar Expression</em>'.
   * @see org.applause.lang.applauseDsl.ScalarExpression
   * @generated
   */
  EClass getScalarExpression();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.CollectionExpression <em>Collection Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Expression</em>'.
   * @see org.applause.lang.applauseDsl.CollectionExpression
   * @generated
   */
  EClass getCollectionExpression();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.applause.lang.applauseDsl.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.applause.lang.applauseDsl.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.PredefinedParameter <em>Predefined Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predefined Parameter</em>'.
   * @see org.applause.lang.applauseDsl.PredefinedParameter
   * @generated
   */
  EClass getPredefinedParameter();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.SectionId <em>Section Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section Id</em>'.
   * @see org.applause.lang.applauseDsl.SectionId
   * @generated
   */
  EClass getSectionId();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.StringFunction <em>String Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Function</em>'.
   * @see org.applause.lang.applauseDsl.StringFunction
   * @generated
   */
  EClass getStringFunction();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.CollectionLiteral <em>Collection Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Literal</em>'.
   * @see org.applause.lang.applauseDsl.CollectionLiteral
   * @generated
   */
  EClass getCollectionLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.CollectionLiteral#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.applause.lang.applauseDsl.CollectionLiteral#getItems()
   * @see #getCollectionLiteral()
   * @generated
   */
  EReference getCollectionLiteral_Items();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.CollectionFunction <em>Collection Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Function</em>'.
   * @see org.applause.lang.applauseDsl.CollectionFunction
   * @generated
   */
  EClass getCollectionFunction();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see org.applause.lang.applauseDsl.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.Application#isTabbarApplication <em>Tabbar Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tabbar Application</em>'.
   * @see org.applause.lang.applauseDsl.Application#isTabbarApplication()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_TabbarApplication();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.Application#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.lang.applauseDsl.Application#getName()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.Application#getAppicon <em>Appicon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Appicon</em>'.
   * @see org.applause.lang.applauseDsl.Application#getAppicon()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Appicon();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.Application#getSplash <em>Splash</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Splash</em>'.
   * @see org.applause.lang.applauseDsl.Application#getSplash()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Splash();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.Application#getMainview <em>Mainview</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mainview</em>'.
   * @see org.applause.lang.applauseDsl.Application#getMainview()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Mainview();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.Application#getButtons <em>Buttons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Buttons</em>'.
   * @see org.applause.lang.applauseDsl.Application#getButtons()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Buttons();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see org.applause.lang.applauseDsl.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.Button#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.applause.lang.applauseDsl.Button#getTitle()
   * @see #getButton()
   * @generated
   */
  EReference getButton_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.Button#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Icon</em>'.
   * @see org.applause.lang.applauseDsl.Button#getIcon()
   * @see #getButton()
   * @generated
   */
  EReference getButton_Icon();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.Button#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>View</em>'.
   * @see org.applause.lang.applauseDsl.Button#getView()
   * @see #getButton()
   * @generated
   */
  EReference getButton_View();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.Button#getHandler <em>Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Handler</em>'.
   * @see org.applause.lang.applauseDsl.Button#getHandler()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Handler();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.applause.lang.applauseDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.lang.applauseDsl.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.SimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Type</em>'.
   * @see org.applause.lang.applauseDsl.SimpleType
   * @generated
   */
  EClass getSimpleType();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.SimpleType#getPlatformType <em>Platform Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Platform Type</em>'.
   * @see org.applause.lang.applauseDsl.SimpleType#getPlatformType()
   * @see #getSimpleType()
   * @generated
   */
  EAttribute getSimpleType_PlatformType();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.applause.lang.applauseDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.Entity#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends</em>'.
   * @see org.applause.lang.applauseDsl.Entity#getExtends()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.Entity#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.applause.lang.applauseDsl.Entity#getProperties()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Properties();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.applause.lang.applauseDsl.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.Property#isDerived <em>Derived</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Derived</em>'.
   * @see org.applause.lang.applauseDsl.Property#isDerived()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Derived();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.Property#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.applause.lang.applauseDsl.Property#getDescription()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Description();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.ContentProvider <em>Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Provider</em>'.
   * @see org.applause.lang.applauseDsl.ContentProvider
   * @generated
   */
  EClass getContentProvider();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.ContentProvider#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.lang.applauseDsl.ContentProvider#getName()
   * @see #getContentProvider()
   * @generated
   */
  EAttribute getContentProvider_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ContentProvider#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see org.applause.lang.applauseDsl.ContentProvider#getParameter()
   * @see #getContentProvider()
   * @generated
   */
  EReference getContentProvider_Parameter();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.ContentProvider#isResolver <em>Resolver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resolver</em>'.
   * @see org.applause.lang.applauseDsl.ContentProvider#isResolver()
   * @see #getContentProvider()
   * @generated
   */
  EAttribute getContentProvider_Resolver();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.ContentProvider#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.applause.lang.applauseDsl.ContentProvider#getType()
   * @see #getContentProvider()
   * @generated
   */
  EReference getContentProvider_Type();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.ContentProvider#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.applause.lang.applauseDsl.ContentProvider#isMany()
   * @see #getContentProvider()
   * @generated
   */
  EAttribute getContentProvider_Many();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.ContentProvider#isXml <em>Xml</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Xml</em>'.
   * @see org.applause.lang.applauseDsl.ContentProvider#isXml()
   * @see #getContentProvider()
   * @generated
   */
  EAttribute getContentProvider_Xml();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.ContentProvider#isHtml <em>Html</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Html</em>'.
   * @see org.applause.lang.applauseDsl.ContentProvider#isHtml()
   * @see #getContentProvider()
   * @generated
   */
  EAttribute getContentProvider_Html();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ContentProvider#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Url</em>'.
   * @see org.applause.lang.applauseDsl.ContentProvider#getUrl()
   * @see #getContentProvider()
   * @generated
   */
  EReference getContentProvider_Url();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ContentProvider#getSelection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selection</em>'.
   * @see org.applause.lang.applauseDsl.ContentProvider#getSelection()
   * @see #getContentProvider()
   * @generated
   */
  EReference getContentProvider_Selection();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.ProviderConstruction <em>Provider Construction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provider Construction</em>'.
   * @see org.applause.lang.applauseDsl.ProviderConstruction
   * @generated
   */
  EClass getProviderConstruction();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.ProviderConstruction#getProvider <em>Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Provider</em>'.
   * @see org.applause.lang.applauseDsl.ProviderConstruction#getProvider()
   * @see #getProviderConstruction()
   * @generated
   */
  EReference getProviderConstruction_Provider();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ProviderConstruction#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see org.applause.lang.applauseDsl.ProviderConstruction#getArgument()
   * @see #getProviderConstruction()
   * @generated
   */
  EReference getProviderConstruction_Argument();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ProviderConstruction#getPredefinedParameter <em>Predefined Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predefined Parameter</em>'.
   * @see org.applause.lang.applauseDsl.ProviderConstruction#getPredefinedParameter()
   * @see #getProviderConstruction()
   * @generated
   */
  EReference getProviderConstruction_PredefinedParameter();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View</em>'.
   * @see org.applause.lang.applauseDsl.View
   * @generated
   */
  EClass getView();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.View#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.lang.applauseDsl.View#getName()
   * @see #getView()
   * @generated
   */
  EAttribute getView_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.View#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.applause.lang.applauseDsl.View#getTitle()
   * @see #getView()
   * @generated
   */
  EReference getView_Title();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.View#getButtons <em>Buttons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Buttons</em>'.
   * @see org.applause.lang.applauseDsl.View#getButtons()
   * @see #getView()
   * @generated
   */
  EReference getView_Buttons();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.View#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.applause.lang.applauseDsl.View#getActions()
   * @see #getView()
   * @generated
   */
  EReference getView_Actions();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.SectionedView <em>Sectioned View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sectioned View</em>'.
   * @see org.applause.lang.applauseDsl.SectionedView
   * @generated
   */
  EClass getSectionedView();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.SectionedView#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see org.applause.lang.applauseDsl.SectionedView#getContent()
   * @see #getSectionedView()
   * @generated
   */
  EReference getSectionedView_Content();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.SectionedView#getSuperView <em>Super View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super View</em>'.
   * @see org.applause.lang.applauseDsl.SectionedView#getSuperView()
   * @see #getSectionedView()
   * @generated
   */
  EReference getSectionedView_SuperView();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.SectionedView#getForAllSections <em>For All Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For All Sections</em>'.
   * @see org.applause.lang.applauseDsl.SectionedView#getForAllSections()
   * @see #getSectionedView()
   * @generated
   */
  EReference getSectionedView_ForAllSections();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.SectionedView#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see org.applause.lang.applauseDsl.SectionedView#getSections()
   * @see #getSectionedView()
   * @generated
   */
  EReference getSectionedView_Sections();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.TableView <em>Table View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table View</em>'.
   * @see org.applause.lang.applauseDsl.TableView
   * @generated
   */
  EClass getTableView();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.DetailsView <em>Details View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Details View</em>'.
   * @see org.applause.lang.applauseDsl.DetailsView
   * @generated
   */
  EClass getDetailsView();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.DetailsView#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Header</em>'.
   * @see org.applause.lang.applauseDsl.DetailsView#getHeader()
   * @see #getDetailsView()
   * @generated
   */
  EReference getDetailsView_Header();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.WebView <em>Web View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Web View</em>'.
   * @see org.applause.lang.applauseDsl.WebView
   * @generated
   */
  EClass getWebView();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.WebView#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Header</em>'.
   * @see org.applause.lang.applauseDsl.WebView#getHeader()
   * @see #getWebView()
   * @generated
   */
  EReference getWebView_Header();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.WebView#getForAllSections <em>For All Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For All Sections</em>'.
   * @see org.applause.lang.applauseDsl.WebView#getForAllSections()
   * @see #getWebView()
   * @generated
   */
  EReference getWebView_ForAllSections();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.WebView#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see org.applause.lang.applauseDsl.WebView#getSections()
   * @see #getWebView()
   * @generated
   */
  EReference getWebView_Sections();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.CustomView <em>Custom View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom View</em>'.
   * @see org.applause.lang.applauseDsl.CustomView
   * @generated
   */
  EClass getCustomView();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.CustomView#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see org.applause.lang.applauseDsl.CustomView#getContent()
   * @see #getCustomView()
   * @generated
   */
  EReference getCustomView_Content();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.CustomView#getObjclass <em>Objclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Objclass</em>'.
   * @see org.applause.lang.applauseDsl.CustomView#getObjclass()
   * @see #getCustomView()
   * @generated
   */
  EAttribute getCustomView_Objclass();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.ViewHeader <em>View Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Header</em>'.
   * @see org.applause.lang.applauseDsl.ViewHeader
   * @generated
   */
  EClass getViewHeader();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ViewHeader#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.applause.lang.applauseDsl.ViewHeader#getTitle()
   * @see #getViewHeader()
   * @generated
   */
  EReference getViewHeader_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ViewHeader#getSubtitle <em>Subtitle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subtitle</em>'.
   * @see org.applause.lang.applauseDsl.ViewHeader#getSubtitle()
   * @see #getViewHeader()
   * @generated
   */
  EReference getViewHeader_Subtitle();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ViewHeader#getDetails <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Details</em>'.
   * @see org.applause.lang.applauseDsl.ViewHeader#getDetails()
   * @see #getViewHeader()
   * @generated
   */
  EReference getViewHeader_Details();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ViewHeader#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Image</em>'.
   * @see org.applause.lang.applauseDsl.ViewHeader#getImage()
   * @see #getViewHeader()
   * @generated
   */
  EReference getViewHeader_Image();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.ViewSection <em>View Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Section</em>'.
   * @see org.applause.lang.applauseDsl.ViewSection
   * @generated
   */
  EClass getViewSection();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ViewSection#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.applause.lang.applauseDsl.ViewSection#getTitle()
   * @see #getViewSection()
   * @generated
   */
  EReference getViewSection_Title();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.ViewSection#getCells <em>Cells</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cells</em>'.
   * @see org.applause.lang.applauseDsl.ViewSection#getCells()
   * @see #getViewSection()
   * @generated
   */
  EReference getViewSection_Cells();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.ViewForAllSections <em>View For All Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View For All Sections</em>'.
   * @see org.applause.lang.applauseDsl.ViewForAllSections
   * @generated
   */
  EClass getViewForAllSections();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ViewForAllSections#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.applause.lang.applauseDsl.ViewForAllSections#getTitle()
   * @see #getViewForAllSections()
   * @generated
   */
  EReference getViewForAllSections_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ViewForAllSections#getProvider <em>Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Provider</em>'.
   * @see org.applause.lang.applauseDsl.ViewForAllSections#getProvider()
   * @see #getViewForAllSections()
   * @generated
   */
  EReference getViewForAllSections_Provider();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.ViewForAllSections#getCells <em>Cells</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cells</em>'.
   * @see org.applause.lang.applauseDsl.ViewForAllSections#getCells()
   * @see #getViewForAllSections()
   * @generated
   */
  EReference getViewForAllSections_Cells();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.SectionCell <em>Section Cell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section Cell</em>'.
   * @see org.applause.lang.applauseDsl.SectionCell
   * @generated
   */
  EClass getSectionCell();

  /**
   * Returns the meta object for the attribute '{@link org.applause.lang.applauseDsl.SectionCell#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.applause.lang.applauseDsl.SectionCell#getType()
   * @see #getSectionCell()
   * @generated
   */
  EAttribute getSectionCell_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.SectionCell#getIterator <em>Iterator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iterator</em>'.
   * @see org.applause.lang.applauseDsl.SectionCell#getIterator()
   * @see #getSectionCell()
   * @generated
   */
  EReference getSectionCell_Iterator();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.SectionCell#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see org.applause.lang.applauseDsl.SectionCell#getText()
   * @see #getSectionCell()
   * @generated
   */
  EReference getSectionCell_Text();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.SectionCell#getDetails <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Details</em>'.
   * @see org.applause.lang.applauseDsl.SectionCell#getDetails()
   * @see #getSectionCell()
   * @generated
   */
  EReference getSectionCell_Details();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.SectionCell#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Image</em>'.
   * @see org.applause.lang.applauseDsl.SectionCell#getImage()
   * @see #getSectionCell()
   * @generated
   */
  EReference getSectionCell_Image();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.SectionCell#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see org.applause.lang.applauseDsl.SectionCell#getQuery()
   * @see #getSectionCell()
   * @generated
   */
  EReference getSectionCell_Query();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.SectionCell#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.applause.lang.applauseDsl.SectionCell#getAction()
   * @see #getSectionCell()
   * @generated
   */
  EReference getSectionCell_Action();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.SectionCell#getButtonAction <em>Button Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Button Action</em>'.
   * @see org.applause.lang.applauseDsl.SectionCell#getButtonAction()
   * @see #getSectionCell()
   * @generated
   */
  EReference getSectionCell_ButtonAction();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.CollectionIterator <em>Collection Iterator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Iterator</em>'.
   * @see org.applause.lang.applauseDsl.CollectionIterator
   * @generated
   */
  EClass getCollectionIterator();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.CollectionIterator#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Collection</em>'.
   * @see org.applause.lang.applauseDsl.CollectionIterator#getCollection()
   * @see #getCollectionIterator()
   * @generated
   */
  EReference getCollectionIterator_Collection();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.ViewAction <em>View Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Action</em>'.
   * @see org.applause.lang.applauseDsl.ViewAction
   * @generated
   */
  EClass getViewAction();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.ActionDelegate <em>Action Delegate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Delegate</em>'.
   * @see org.applause.lang.applauseDsl.ActionDelegate
   * @generated
   */
  EClass getActionDelegate();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.ExternalOpen <em>External Open</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Open</em>'.
   * @see org.applause.lang.applauseDsl.ExternalOpen
   * @generated
   */
  EClass getExternalOpen();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ExternalOpen#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Url</em>'.
   * @see org.applause.lang.applauseDsl.ExternalOpen#getUrl()
   * @see #getExternalOpen()
   * @generated
   */
  EReference getExternalOpen_Url();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.ViewCall <em>View Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Call</em>'.
   * @see org.applause.lang.applauseDsl.ViewCall
   * @generated
   */
  EClass getViewCall();

  /**
   * Returns the meta object for the reference '{@link org.applause.lang.applauseDsl.ViewCall#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>View</em>'.
   * @see org.applause.lang.applauseDsl.ViewCall#getView()
   * @see #getViewCall()
   * @generated
   */
  EReference getViewCall_View();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ViewCall#getProvider <em>Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Provider</em>'.
   * @see org.applause.lang.applauseDsl.ViewCall#getProvider()
   * @see #getViewCall()
   * @generated
   */
  EReference getViewCall_Provider();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.ViewCall#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.applause.lang.applauseDsl.ViewCall#getAction()
   * @see #getViewCall()
   * @generated
   */
  EReference getViewCall_Action();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.StringConcat <em>String Concat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Concat</em>'.
   * @see org.applause.lang.applauseDsl.StringConcat
   * @generated
   */
  EClass getStringConcat();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.StringConcat#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.applause.lang.applauseDsl.StringConcat#getValues()
   * @see #getStringConcat()
   * @generated
   */
  EReference getStringConcat_Values();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.StringReplace <em>String Replace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Replace</em>'.
   * @see org.applause.lang.applauseDsl.StringReplace
   * @generated
   */
  EClass getStringReplace();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.StringReplace#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.applause.lang.applauseDsl.StringReplace#getValue()
   * @see #getStringReplace()
   * @generated
   */
  EReference getStringReplace_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.StringReplace#getMatch <em>Match</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Match</em>'.
   * @see org.applause.lang.applauseDsl.StringReplace#getMatch()
   * @see #getStringReplace()
   * @generated
   */
  EReference getStringReplace_Match();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.StringReplace#getReplacement <em>Replacement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Replacement</em>'.
   * @see org.applause.lang.applauseDsl.StringReplace#getReplacement()
   * @see #getStringReplace()
   * @generated
   */
  EReference getStringReplace_Replacement();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.StringUrlConform <em>String Url Conform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Url Conform</em>'.
   * @see org.applause.lang.applauseDsl.StringUrlConform
   * @generated
   */
  EClass getStringUrlConform();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.StringUrlConform#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.applause.lang.applauseDsl.StringUrlConform#getValue()
   * @see #getStringUrlConform()
   * @generated
   */
  EReference getStringUrlConform_Value();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.StringSplit <em>String Split</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Split</em>'.
   * @see org.applause.lang.applauseDsl.StringSplit
   * @generated
   */
  EClass getStringSplit();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.StringSplit#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.applause.lang.applauseDsl.StringSplit#getValue()
   * @see #getStringSplit()
   * @generated
   */
  EReference getStringSplit_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.lang.applauseDsl.StringSplit#getDelimiter <em>Delimiter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delimiter</em>'.
   * @see org.applause.lang.applauseDsl.StringSplit#getDelimiter()
   * @see #getStringSplit()
   * @generated
   */
  EReference getStringSplit_Delimiter();

  /**
   * Returns the meta object for class '{@link org.applause.lang.applauseDsl.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see org.applause.lang.applauseDsl.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the attribute list '{@link org.applause.lang.applauseDsl.Constant#getLanguage <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Language</em>'.
   * @see org.applause.lang.applauseDsl.Constant#getLanguage()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Language();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.lang.applauseDsl.Constant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see org.applause.lang.applauseDsl.Constant#getValue()
   * @see #getConstant()
   * @generated
   */
  EReference getConstant_Value();

  /**
   * Returns the meta object for enum '{@link org.applause.lang.applauseDsl.CellType <em>Cell Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cell Type</em>'.
   * @see org.applause.lang.applauseDsl.CellType
   * @generated
   */
  EEnum getCellType();

  /**
   * Returns the meta object for enum '{@link org.applause.lang.applauseDsl.Position <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Position</em>'.
   * @see org.applause.lang.applauseDsl.Position
   * @generated
   */
  EEnum getPosition();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ApplauseDslFactory getApplauseDslFactory();

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
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ApplauseModelImpl <em>Applause Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ApplauseModelImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getApplauseModel()
     * @generated
     */
    EClass APPLAUSE_MODEL = eINSTANCE.getApplauseModel();

    /**
     * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLAUSE_MODEL__APPLICATION = eINSTANCE.getApplauseModel_Application();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLAUSE_MODEL__ELEMENTS = eINSTANCE.getApplauseModel_Elements();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ModelElementImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getModelElement()
     * @generated
     */
    EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.NavigationBarItemImpl <em>Navigation Bar Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.NavigationBarItemImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getNavigationBarItem()
     * @generated
     */
    EClass NAVIGATION_BAR_ITEM = eINSTANCE.getNavigationBarItem();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAVIGATION_BAR_ITEM__POSITION = eINSTANCE.getNavigationBarItem_Position();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAVIGATION_BAR_ITEM__ICON = eINSTANCE.getNavigationBarItem_Icon();

    /**
     * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAVIGATION_BAR_ITEM__TRIGGERS = eINSTANCE.getNavigationBarItem_Triggers();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.VariableDeclarationImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.TypeDescriptionImpl <em>Type Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.TypeDescriptionImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getTypeDescription()
     * @generated
     */
    EClass TYPE_DESCRIPTION = eINSTANCE.getTypeDescription();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DESCRIPTION__TYPE = eINSTANCE.getTypeDescription_Type();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DESCRIPTION__MANY = eINSTANCE.getTypeDescription_Many();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ParameterImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ObjectReferenceImpl <em>Object Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ObjectReferenceImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getObjectReference()
     * @generated
     */
    EClass OBJECT_REFERENCE = eINSTANCE.getObjectReference();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_REFERENCE__OBJECT = eINSTANCE.getObjectReference_Object();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_REFERENCE__TAIL = eINSTANCE.getObjectReference_Tail();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ExpressionImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ScalarExpressionImpl <em>Scalar Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ScalarExpressionImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getScalarExpression()
     * @generated
     */
    EClass SCALAR_EXPRESSION = eINSTANCE.getScalarExpression();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.CollectionExpressionImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionExpression()
     * @generated
     */
    EClass COLLECTION_EXPRESSION = eINSTANCE.getCollectionExpression();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.StringLiteralImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.PredefinedParameterImpl <em>Predefined Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.PredefinedParameterImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getPredefinedParameter()
     * @generated
     */
    EClass PREDEFINED_PARAMETER = eINSTANCE.getPredefinedParameter();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.SectionIdImpl <em>Section Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.SectionIdImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getSectionId()
     * @generated
     */
    EClass SECTION_ID = eINSTANCE.getSectionId();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.StringFunctionImpl <em>String Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.StringFunctionImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getStringFunction()
     * @generated
     */
    EClass STRING_FUNCTION = eINSTANCE.getStringFunction();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.CollectionLiteralImpl <em>Collection Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.CollectionLiteralImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionLiteral()
     * @generated
     */
    EClass COLLECTION_LITERAL = eINSTANCE.getCollectionLiteral();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_LITERAL__ITEMS = eINSTANCE.getCollectionLiteral_Items();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.CollectionFunctionImpl <em>Collection Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.CollectionFunctionImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionFunction()
     * @generated
     */
    EClass COLLECTION_FUNCTION = eINSTANCE.getCollectionFunction();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ApplicationImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Tabbar Application</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__TABBAR_APPLICATION = eINSTANCE.getApplication_TabbarApplication();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

    /**
     * The meta object literal for the '<em><b>Appicon</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__APPICON = eINSTANCE.getApplication_Appicon();

    /**
     * The meta object literal for the '<em><b>Splash</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__SPLASH = eINSTANCE.getApplication_Splash();

    /**
     * The meta object literal for the '<em><b>Mainview</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__MAINVIEW = eINSTANCE.getApplication_Mainview();

    /**
     * The meta object literal for the '<em><b>Buttons</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__BUTTONS = eINSTANCE.getApplication_Buttons();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ButtonImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__TITLE = eINSTANCE.getButton_Title();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__ICON = eINSTANCE.getButton_Icon();

    /**
     * The meta object literal for the '<em><b>View</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__VIEW = eINSTANCE.getButton_View();

    /**
     * The meta object literal for the '<em><b>Handler</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__HANDLER = eINSTANCE.getButton_Handler();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.TypeImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.SimpleTypeImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getSimpleType()
     * @generated
     */
    EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

    /**
     * The meta object literal for the '<em><b>Platform Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_TYPE__PLATFORM_TYPE = eINSTANCE.getSimpleType_PlatformType();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.EntityImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__EXTENDS = eINSTANCE.getEntity_Extends();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__PROPERTIES = eINSTANCE.getEntity_Properties();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.PropertyImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DERIVED = eINSTANCE.getProperty_Derived();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ContentProviderImpl <em>Content Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ContentProviderImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getContentProvider()
     * @generated
     */
    EClass CONTENT_PROVIDER = eINSTANCE.getContentProvider();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_PROVIDER__NAME = eINSTANCE.getContentProvider_Name();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_PROVIDER__PARAMETER = eINSTANCE.getContentProvider_Parameter();

    /**
     * The meta object literal for the '<em><b>Resolver</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_PROVIDER__RESOLVER = eINSTANCE.getContentProvider_Resolver();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_PROVIDER__TYPE = eINSTANCE.getContentProvider_Type();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_PROVIDER__MANY = eINSTANCE.getContentProvider_Many();

    /**
     * The meta object literal for the '<em><b>Xml</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_PROVIDER__XML = eINSTANCE.getContentProvider_Xml();

    /**
     * The meta object literal for the '<em><b>Html</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_PROVIDER__HTML = eINSTANCE.getContentProvider_Html();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_PROVIDER__URL = eINSTANCE.getContentProvider_Url();

    /**
     * The meta object literal for the '<em><b>Selection</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_PROVIDER__SELECTION = eINSTANCE.getContentProvider_Selection();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ProviderConstructionImpl <em>Provider Construction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ProviderConstructionImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getProviderConstruction()
     * @generated
     */
    EClass PROVIDER_CONSTRUCTION = eINSTANCE.getProviderConstruction();

    /**
     * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDER_CONSTRUCTION__PROVIDER = eINSTANCE.getProviderConstruction_Provider();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDER_CONSTRUCTION__ARGUMENT = eINSTANCE.getProviderConstruction_Argument();

    /**
     * The meta object literal for the '<em><b>Predefined Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDER_CONSTRUCTION__PREDEFINED_PARAMETER = eINSTANCE.getProviderConstruction_PredefinedParameter();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ViewImpl <em>View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ViewImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getView()
     * @generated
     */
    EClass VIEW = eINSTANCE.getView();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW__NAME = eINSTANCE.getView_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__TITLE = eINSTANCE.getView_Title();

    /**
     * The meta object literal for the '<em><b>Buttons</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__BUTTONS = eINSTANCE.getView_Buttons();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__ACTIONS = eINSTANCE.getView_Actions();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.SectionedViewImpl <em>Sectioned View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.SectionedViewImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getSectionedView()
     * @generated
     */
    EClass SECTIONED_VIEW = eINSTANCE.getSectionedView();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTIONED_VIEW__CONTENT = eINSTANCE.getSectionedView_Content();

    /**
     * The meta object literal for the '<em><b>Super View</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTIONED_VIEW__SUPER_VIEW = eINSTANCE.getSectionedView_SuperView();

    /**
     * The meta object literal for the '<em><b>For All Sections</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTIONED_VIEW__FOR_ALL_SECTIONS = eINSTANCE.getSectionedView_ForAllSections();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTIONED_VIEW__SECTIONS = eINSTANCE.getSectionedView_Sections();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.TableViewImpl <em>Table View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.TableViewImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getTableView()
     * @generated
     */
    EClass TABLE_VIEW = eINSTANCE.getTableView();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.DetailsViewImpl <em>Details View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.DetailsViewImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getDetailsView()
     * @generated
     */
    EClass DETAILS_VIEW = eINSTANCE.getDetailsView();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DETAILS_VIEW__HEADER = eINSTANCE.getDetailsView_Header();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.WebViewImpl <em>Web View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.WebViewImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getWebView()
     * @generated
     */
    EClass WEB_VIEW = eINSTANCE.getWebView();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_VIEW__HEADER = eINSTANCE.getWebView_Header();

    /**
     * The meta object literal for the '<em><b>For All Sections</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_VIEW__FOR_ALL_SECTIONS = eINSTANCE.getWebView_ForAllSections();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_VIEW__SECTIONS = eINSTANCE.getWebView_Sections();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.CustomViewImpl <em>Custom View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.CustomViewImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getCustomView()
     * @generated
     */
    EClass CUSTOM_VIEW = eINSTANCE.getCustomView();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_VIEW__CONTENT = eINSTANCE.getCustomView_Content();

    /**
     * The meta object literal for the '<em><b>Objclass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_VIEW__OBJCLASS = eINSTANCE.getCustomView_Objclass();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ViewHeaderImpl <em>View Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ViewHeaderImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getViewHeader()
     * @generated
     */
    EClass VIEW_HEADER = eINSTANCE.getViewHeader();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_HEADER__TITLE = eINSTANCE.getViewHeader_Title();

    /**
     * The meta object literal for the '<em><b>Subtitle</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_HEADER__SUBTITLE = eINSTANCE.getViewHeader_Subtitle();

    /**
     * The meta object literal for the '<em><b>Details</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_HEADER__DETAILS = eINSTANCE.getViewHeader_Details();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_HEADER__IMAGE = eINSTANCE.getViewHeader_Image();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ViewSectionImpl <em>View Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ViewSectionImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getViewSection()
     * @generated
     */
    EClass VIEW_SECTION = eINSTANCE.getViewSection();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_SECTION__TITLE = eINSTANCE.getViewSection_Title();

    /**
     * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_SECTION__CELLS = eINSTANCE.getViewSection_Cells();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ViewForAllSectionsImpl <em>View For All Sections</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ViewForAllSectionsImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getViewForAllSections()
     * @generated
     */
    EClass VIEW_FOR_ALL_SECTIONS = eINSTANCE.getViewForAllSections();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_FOR_ALL_SECTIONS__TITLE = eINSTANCE.getViewForAllSections_Title();

    /**
     * The meta object literal for the '<em><b>Provider</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_FOR_ALL_SECTIONS__PROVIDER = eINSTANCE.getViewForAllSections_Provider();

    /**
     * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_FOR_ALL_SECTIONS__CELLS = eINSTANCE.getViewForAllSections_Cells();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.SectionCellImpl <em>Section Cell</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.SectionCellImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getSectionCell()
     * @generated
     */
    EClass SECTION_CELL = eINSTANCE.getSectionCell();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION_CELL__TYPE = eINSTANCE.getSectionCell_Type();

    /**
     * The meta object literal for the '<em><b>Iterator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_CELL__ITERATOR = eINSTANCE.getSectionCell_Iterator();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_CELL__TEXT = eINSTANCE.getSectionCell_Text();

    /**
     * The meta object literal for the '<em><b>Details</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_CELL__DETAILS = eINSTANCE.getSectionCell_Details();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_CELL__IMAGE = eINSTANCE.getSectionCell_Image();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_CELL__QUERY = eINSTANCE.getSectionCell_Query();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_CELL__ACTION = eINSTANCE.getSectionCell_Action();

    /**
     * The meta object literal for the '<em><b>Button Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_CELL__BUTTON_ACTION = eINSTANCE.getSectionCell_ButtonAction();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.CollectionIteratorImpl <em>Collection Iterator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.CollectionIteratorImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionIterator()
     * @generated
     */
    EClass COLLECTION_ITERATOR = eINSTANCE.getCollectionIterator();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_ITERATOR__COLLECTION = eINSTANCE.getCollectionIterator_Collection();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ViewActionImpl <em>View Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ViewActionImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getViewAction()
     * @generated
     */
    EClass VIEW_ACTION = eINSTANCE.getViewAction();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ActionDelegateImpl <em>Action Delegate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ActionDelegateImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getActionDelegate()
     * @generated
     */
    EClass ACTION_DELEGATE = eINSTANCE.getActionDelegate();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ExternalOpenImpl <em>External Open</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ExternalOpenImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getExternalOpen()
     * @generated
     */
    EClass EXTERNAL_OPEN = eINSTANCE.getExternalOpen();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_OPEN__URL = eINSTANCE.getExternalOpen_Url();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ViewCallImpl <em>View Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ViewCallImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getViewCall()
     * @generated
     */
    EClass VIEW_CALL = eINSTANCE.getViewCall();

    /**
     * The meta object literal for the '<em><b>View</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_CALL__VIEW = eINSTANCE.getViewCall_View();

    /**
     * The meta object literal for the '<em><b>Provider</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_CALL__PROVIDER = eINSTANCE.getViewCall_Provider();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_CALL__ACTION = eINSTANCE.getViewCall_Action();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.StringConcatImpl <em>String Concat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.StringConcatImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getStringConcat()
     * @generated
     */
    EClass STRING_CONCAT = eINSTANCE.getStringConcat();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_CONCAT__VALUES = eINSTANCE.getStringConcat_Values();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.StringReplaceImpl <em>String Replace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.StringReplaceImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getStringReplace()
     * @generated
     */
    EClass STRING_REPLACE = eINSTANCE.getStringReplace();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_REPLACE__VALUE = eINSTANCE.getStringReplace_Value();

    /**
     * The meta object literal for the '<em><b>Match</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_REPLACE__MATCH = eINSTANCE.getStringReplace_Match();

    /**
     * The meta object literal for the '<em><b>Replacement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_REPLACE__REPLACEMENT = eINSTANCE.getStringReplace_Replacement();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.StringUrlConformImpl <em>String Url Conform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.StringUrlConformImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getStringUrlConform()
     * @generated
     */
    EClass STRING_URL_CONFORM = eINSTANCE.getStringUrlConform();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_URL_CONFORM__VALUE = eINSTANCE.getStringUrlConform_Value();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.StringSplitImpl <em>String Split</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.StringSplitImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getStringSplit()
     * @generated
     */
    EClass STRING_SPLIT = eINSTANCE.getStringSplit();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_SPLIT__VALUE = eINSTANCE.getStringSplit_Value();

    /**
     * The meta object literal for the '<em><b>Delimiter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_SPLIT__DELIMITER = eINSTANCE.getStringSplit_Delimiter();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.impl.ConstantImpl
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Language</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__LANGUAGE = eINSTANCE.getConstant_Language();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT__VALUE = eINSTANCE.getConstant_Value();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.CellType <em>Cell Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.CellType
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getCellType()
     * @generated
     */
    EEnum CELL_TYPE = eINSTANCE.getCellType();

    /**
     * The meta object literal for the '{@link org.applause.lang.applauseDsl.Position <em>Position</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.lang.applauseDsl.Position
     * @see org.applause.lang.applauseDsl.impl.ApplauseDslPackageImpl#getPosition()
     * @generated
     */
    EEnum POSITION = eINSTANCE.getPosition();

  }

} //ApplauseDslPackage
