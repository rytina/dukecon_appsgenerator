/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl.impl;

import java.util.Collection;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.Button;
import org.applause.lang.applauseDsl.ScalarExpression;
import org.applause.lang.applauseDsl.VariableDeclaration;
import org.applause.lang.applauseDsl.View;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ViewImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ViewImpl#getButtons <em>Buttons</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ViewImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends ModelElementImpl implements View
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
   * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected ScalarExpression title;

  /**
   * The cached value of the '{@link #getButtons() <em>Buttons</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getButtons()
   * @generated
   * @ordered
   */
  protected EList<Button> buttons;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclaration> actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewImpl()
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
    return ApplauseDslPackage.Literals.VIEW;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTitle(ScalarExpression newTitle, NotificationChain msgs)
  {
    ScalarExpression oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW__TITLE, oldTitle, newTitle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(ScalarExpression newTitle)
  {
    if (newTitle != title)
    {
      NotificationChain msgs = null;
      if (title != null)
        msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VIEW__TITLE, null, msgs);
      if (newTitle != null)
        msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.VIEW__TITLE, null, msgs);
      msgs = basicSetTitle(newTitle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.VIEW__TITLE, newTitle, newTitle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Button> getButtons()
  {
    if (buttons == null)
    {
      buttons = new EObjectContainmentEList<Button>(Button.class, this, ApplauseDslPackage.VIEW__BUTTONS);
    }
    return buttons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDeclaration> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, ApplauseDslPackage.VIEW__ACTIONS);
    }
    return actions;
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
      case ApplauseDslPackage.VIEW__TITLE:
        return basicSetTitle(null, msgs);
      case ApplauseDslPackage.VIEW__BUTTONS:
        return ((InternalEList<?>)getButtons()).basicRemove(otherEnd, msgs);
      case ApplauseDslPackage.VIEW__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
      case ApplauseDslPackage.VIEW__NAME:
        return getName();
      case ApplauseDslPackage.VIEW__TITLE:
        return getTitle();
      case ApplauseDslPackage.VIEW__BUTTONS:
        return getButtons();
      case ApplauseDslPackage.VIEW__ACTIONS:
        return getActions();
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
      case ApplauseDslPackage.VIEW__NAME:
        setName((String)newValue);
        return;
      case ApplauseDslPackage.VIEW__TITLE:
        setTitle((ScalarExpression)newValue);
        return;
      case ApplauseDslPackage.VIEW__BUTTONS:
        getButtons().clear();
        getButtons().addAll((Collection<? extends Button>)newValue);
        return;
      case ApplauseDslPackage.VIEW__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends VariableDeclaration>)newValue);
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
      case ApplauseDslPackage.VIEW__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ApplauseDslPackage.VIEW__TITLE:
        setTitle((ScalarExpression)null);
        return;
      case ApplauseDslPackage.VIEW__BUTTONS:
        getButtons().clear();
        return;
      case ApplauseDslPackage.VIEW__ACTIONS:
        getActions().clear();
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
      case ApplauseDslPackage.VIEW__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ApplauseDslPackage.VIEW__TITLE:
        return title != null;
      case ApplauseDslPackage.VIEW__BUTTONS:
        return buttons != null && !buttons.isEmpty();
      case ApplauseDslPackage.VIEW__ACTIONS:
        return actions != null && !actions.isEmpty();
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

} //ViewImpl
