/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl.impl;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.Button;
import org.applause.lang.applauseDsl.ScalarExpression;
import org.applause.lang.applauseDsl.ViewCall;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ButtonImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ButtonImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ButtonImpl#getView <em>View</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ButtonImpl#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ButtonImpl extends MinimalEObjectImpl.Container implements Button
{
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
   * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected ScalarExpression icon;

  /**
   * The cached value of the '{@link #getView() <em>View</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getView()
   * @generated
   * @ordered
   */
  protected ViewCall view;

  /**
   * The default value of the '{@link #getHandler() <em>Handler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandler()
   * @generated
   * @ordered
   */
  protected static final String HANDLER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHandler() <em>Handler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandler()
   * @generated
   * @ordered
   */
  protected String handler = HANDLER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ButtonImpl()
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
    return ApplauseDslPackage.Literals.BUTTON;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.BUTTON__TITLE, oldTitle, newTitle);
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
        msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.BUTTON__TITLE, null, msgs);
      if (newTitle != null)
        msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.BUTTON__TITLE, null, msgs);
      msgs = basicSetTitle(newTitle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.BUTTON__TITLE, newTitle, newTitle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getIcon()
  {
    return icon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIcon(ScalarExpression newIcon, NotificationChain msgs)
  {
    ScalarExpression oldIcon = icon;
    icon = newIcon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.BUTTON__ICON, oldIcon, newIcon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIcon(ScalarExpression newIcon)
  {
    if (newIcon != icon)
    {
      NotificationChain msgs = null;
      if (icon != null)
        msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.BUTTON__ICON, null, msgs);
      if (newIcon != null)
        msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.BUTTON__ICON, null, msgs);
      msgs = basicSetIcon(newIcon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.BUTTON__ICON, newIcon, newIcon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewCall getView()
  {
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetView(ViewCall newView, NotificationChain msgs)
  {
    ViewCall oldView = view;
    view = newView;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.BUTTON__VIEW, oldView, newView);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setView(ViewCall newView)
  {
    if (newView != view)
    {
      NotificationChain msgs = null;
      if (view != null)
        msgs = ((InternalEObject)view).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.BUTTON__VIEW, null, msgs);
      if (newView != null)
        msgs = ((InternalEObject)newView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.BUTTON__VIEW, null, msgs);
      msgs = basicSetView(newView, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.BUTTON__VIEW, newView, newView));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHandler()
  {
    return handler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHandler(String newHandler)
  {
    String oldHandler = handler;
    handler = newHandler;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.BUTTON__HANDLER, oldHandler, handler));
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
      case ApplauseDslPackage.BUTTON__TITLE:
        return basicSetTitle(null, msgs);
      case ApplauseDslPackage.BUTTON__ICON:
        return basicSetIcon(null, msgs);
      case ApplauseDslPackage.BUTTON__VIEW:
        return basicSetView(null, msgs);
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
      case ApplauseDslPackage.BUTTON__TITLE:
        return getTitle();
      case ApplauseDslPackage.BUTTON__ICON:
        return getIcon();
      case ApplauseDslPackage.BUTTON__VIEW:
        return getView();
      case ApplauseDslPackage.BUTTON__HANDLER:
        return getHandler();
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
      case ApplauseDslPackage.BUTTON__TITLE:
        setTitle((ScalarExpression)newValue);
        return;
      case ApplauseDslPackage.BUTTON__ICON:
        setIcon((ScalarExpression)newValue);
        return;
      case ApplauseDslPackage.BUTTON__VIEW:
        setView((ViewCall)newValue);
        return;
      case ApplauseDslPackage.BUTTON__HANDLER:
        setHandler((String)newValue);
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
      case ApplauseDslPackage.BUTTON__TITLE:
        setTitle((ScalarExpression)null);
        return;
      case ApplauseDslPackage.BUTTON__ICON:
        setIcon((ScalarExpression)null);
        return;
      case ApplauseDslPackage.BUTTON__VIEW:
        setView((ViewCall)null);
        return;
      case ApplauseDslPackage.BUTTON__HANDLER:
        setHandler(HANDLER_EDEFAULT);
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
      case ApplauseDslPackage.BUTTON__TITLE:
        return title != null;
      case ApplauseDslPackage.BUTTON__ICON:
        return icon != null;
      case ApplauseDslPackage.BUTTON__VIEW:
        return view != null;
      case ApplauseDslPackage.BUTTON__HANDLER:
        return HANDLER_EDEFAULT == null ? handler != null : !HANDLER_EDEFAULT.equals(handler);
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
    result.append(" (handler: ");
    result.append(handler);
    result.append(')');
    return result.toString();
  }

} //ButtonImpl
