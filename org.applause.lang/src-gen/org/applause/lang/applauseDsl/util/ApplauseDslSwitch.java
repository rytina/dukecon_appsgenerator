/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl.util;

import java.util.List;

import org.applause.lang.applauseDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage
 * @generated
 */
public class ApplauseDslSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ApplauseDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplauseDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ApplauseDslPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ApplauseDslPackage.APPLAUSE_MODEL:
      {
        ApplauseModel applauseModel = (ApplauseModel)theEObject;
        T result = caseApplauseModel(applauseModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.MODEL_ELEMENT:
      {
        ModelElement modelElement = (ModelElement)theEObject;
        T result = caseModelElement(modelElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.NAVIGATION_BAR_ITEM:
      {
        NavigationBarItem navigationBarItem = (NavigationBarItem)theEObject;
        T result = caseNavigationBarItem(navigationBarItem);
        if (result == null) result = caseModelElement(navigationBarItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = caseModelElement(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.TYPE_DESCRIPTION:
      {
        TypeDescription typeDescription = (TypeDescription)theEObject;
        T result = caseTypeDescription(typeDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseVariableDeclaration(parameter);
        if (result == null) result = caseModelElement(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.OBJECT_REFERENCE:
      {
        ObjectReference objectReference = (ObjectReference)theEObject;
        T result = caseObjectReference(objectReference);
        if (result == null) result = caseExpression(objectReference);
        if (result == null) result = caseScalarExpression(objectReference);
        if (result == null) result = caseCollectionExpression(objectReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.SCALAR_EXPRESSION:
      {
        ScalarExpression scalarExpression = (ScalarExpression)theEObject;
        T result = caseScalarExpression(scalarExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.COLLECTION_EXPRESSION:
      {
        CollectionExpression collectionExpression = (CollectionExpression)theEObject;
        T result = caseCollectionExpression(collectionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseExpression(stringLiteral);
        if (result == null) result = caseScalarExpression(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.PREDEFINED_PARAMETER:
      {
        PredefinedParameter predefinedParameter = (PredefinedParameter)theEObject;
        T result = casePredefinedParameter(predefinedParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.SECTION_ID:
      {
        SectionId sectionId = (SectionId)theEObject;
        T result = caseSectionId(sectionId);
        if (result == null) result = casePredefinedParameter(sectionId);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.STRING_FUNCTION:
      {
        StringFunction stringFunction = (StringFunction)theEObject;
        T result = caseStringFunction(stringFunction);
        if (result == null) result = caseExpression(stringFunction);
        if (result == null) result = caseScalarExpression(stringFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.COLLECTION_LITERAL:
      {
        CollectionLiteral collectionLiteral = (CollectionLiteral)theEObject;
        T result = caseCollectionLiteral(collectionLiteral);
        if (result == null) result = caseExpression(collectionLiteral);
        if (result == null) result = caseCollectionExpression(collectionLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.COLLECTION_FUNCTION:
      {
        CollectionFunction collectionFunction = (CollectionFunction)theEObject;
        T result = caseCollectionFunction(collectionFunction);
        if (result == null) result = caseExpression(collectionFunction);
        if (result == null) result = caseCollectionExpression(collectionFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.APPLICATION:
      {
        Application application = (Application)theEObject;
        T result = caseApplication(application);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T result = caseButton(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseModelElement(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.SIMPLE_TYPE:
      {
        SimpleType simpleType = (SimpleType)theEObject;
        T result = caseSimpleType(simpleType);
        if (result == null) result = caseType(simpleType);
        if (result == null) result = caseModelElement(simpleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = caseType(entity);
        if (result == null) result = caseModelElement(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = caseVariableDeclaration(property);
        if (result == null) result = caseModelElement(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.CONTENT_PROVIDER:
      {
        ContentProvider contentProvider = (ContentProvider)theEObject;
        T result = caseContentProvider(contentProvider);
        if (result == null) result = caseModelElement(contentProvider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.PROVIDER_CONSTRUCTION:
      {
        ProviderConstruction providerConstruction = (ProviderConstruction)theEObject;
        T result = caseProviderConstruction(providerConstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.VIEW:
      {
        View view = (View)theEObject;
        T result = caseView(view);
        if (result == null) result = caseModelElement(view);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.SECTIONED_VIEW:
      {
        SectionedView sectionedView = (SectionedView)theEObject;
        T result = caseSectionedView(sectionedView);
        if (result == null) result = caseView(sectionedView);
        if (result == null) result = caseModelElement(sectionedView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.TABLE_VIEW:
      {
        TableView tableView = (TableView)theEObject;
        T result = caseTableView(tableView);
        if (result == null) result = caseSectionedView(tableView);
        if (result == null) result = caseView(tableView);
        if (result == null) result = caseModelElement(tableView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.DETAILS_VIEW:
      {
        DetailsView detailsView = (DetailsView)theEObject;
        T result = caseDetailsView(detailsView);
        if (result == null) result = caseSectionedView(detailsView);
        if (result == null) result = caseView(detailsView);
        if (result == null) result = caseModelElement(detailsView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.WEB_VIEW:
      {
        WebView webView = (WebView)theEObject;
        T result = caseWebView(webView);
        if (result == null) result = caseView(webView);
        if (result == null) result = caseModelElement(webView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.CUSTOM_VIEW:
      {
        CustomView customView = (CustomView)theEObject;
        T result = caseCustomView(customView);
        if (result == null) result = caseView(customView);
        if (result == null) result = caseModelElement(customView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.VIEW_HEADER:
      {
        ViewHeader viewHeader = (ViewHeader)theEObject;
        T result = caseViewHeader(viewHeader);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.VIEW_SECTION:
      {
        ViewSection viewSection = (ViewSection)theEObject;
        T result = caseViewSection(viewSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.VIEW_FOR_ALL_SECTIONS:
      {
        ViewForAllSections viewForAllSections = (ViewForAllSections)theEObject;
        T result = caseViewForAllSections(viewForAllSections);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.SECTION_CELL:
      {
        SectionCell sectionCell = (SectionCell)theEObject;
        T result = caseSectionCell(sectionCell);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.COLLECTION_ITERATOR:
      {
        CollectionIterator collectionIterator = (CollectionIterator)theEObject;
        T result = caseCollectionIterator(collectionIterator);
        if (result == null) result = caseVariableDeclaration(collectionIterator);
        if (result == null) result = caseModelElement(collectionIterator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.VIEW_ACTION:
      {
        ViewAction viewAction = (ViewAction)theEObject;
        T result = caseViewAction(viewAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.ACTION_DELEGATE:
      {
        ActionDelegate actionDelegate = (ActionDelegate)theEObject;
        T result = caseActionDelegate(actionDelegate);
        if (result == null) result = caseViewAction(actionDelegate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.EXTERNAL_OPEN:
      {
        ExternalOpen externalOpen = (ExternalOpen)theEObject;
        T result = caseExternalOpen(externalOpen);
        if (result == null) result = caseViewAction(externalOpen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.VIEW_CALL:
      {
        ViewCall viewCall = (ViewCall)theEObject;
        T result = caseViewCall(viewCall);
        if (result == null) result = caseViewAction(viewCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.STRING_CONCAT:
      {
        StringConcat stringConcat = (StringConcat)theEObject;
        T result = caseStringConcat(stringConcat);
        if (result == null) result = caseStringFunction(stringConcat);
        if (result == null) result = caseExpression(stringConcat);
        if (result == null) result = caseScalarExpression(stringConcat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.STRING_REPLACE:
      {
        StringReplace stringReplace = (StringReplace)theEObject;
        T result = caseStringReplace(stringReplace);
        if (result == null) result = caseStringFunction(stringReplace);
        if (result == null) result = caseExpression(stringReplace);
        if (result == null) result = caseScalarExpression(stringReplace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.STRING_URL_CONFORM:
      {
        StringUrlConform stringUrlConform = (StringUrlConform)theEObject;
        T result = caseStringUrlConform(stringUrlConform);
        if (result == null) result = caseStringFunction(stringUrlConform);
        if (result == null) result = caseExpression(stringUrlConform);
        if (result == null) result = caseScalarExpression(stringUrlConform);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.STRING_SPLIT:
      {
        StringSplit stringSplit = (StringSplit)theEObject;
        T result = caseStringSplit(stringSplit);
        if (result == null) result = caseCollectionFunction(stringSplit);
        if (result == null) result = caseExpression(stringSplit);
        if (result == null) result = caseCollectionExpression(stringSplit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApplauseDslPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = caseVariableDeclaration(constant);
        if (result == null) result = caseModelElement(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Applause Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Applause Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplauseModel(ApplauseModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelElement(ModelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Navigation Bar Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Navigation Bar Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNavigationBarItem(NavigationBarItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDescription(TypeDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectReference(ObjectReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scalar Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scalar Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScalarExpression(ScalarExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionExpression(CollectionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predefined Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predefined Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredefinedParameter(PredefinedParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Section Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSectionId(SectionId object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringFunction(StringFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionLiteral(CollectionLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionFunction(CollectionFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplication(Application object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButton(Button object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleType(SimpleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Content Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Content Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContentProvider(ContentProvider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provider Construction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provider Construction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProviderConstruction(ProviderConstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseView(View object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sectioned View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sectioned View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSectionedView(SectionedView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableView(TableView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Details View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Details View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDetailsView(DetailsView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Web View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Web View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWebView(WebView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomView(CustomView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Header</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Header</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewHeader(ViewHeader object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewSection(ViewSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View For All Sections</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View For All Sections</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewForAllSections(ViewForAllSections object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Section Cell</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section Cell</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSectionCell(SectionCell object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection Iterator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Iterator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionIterator(CollectionIterator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewAction(ViewAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Delegate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Delegate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionDelegate(ActionDelegate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Open</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Open</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalOpen(ExternalOpen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewCall(ViewCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Concat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Concat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringConcat(StringConcat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Replace</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Replace</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringReplace(StringReplace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Url Conform</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Url Conform</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringUrlConform(StringUrlConform object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Split</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Split</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringSplit(StringSplit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ApplauseDslSwitch
