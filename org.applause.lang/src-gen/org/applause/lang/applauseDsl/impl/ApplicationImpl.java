/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl.impl;

import java.util.Collection;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.Application;
import org.applause.lang.applauseDsl.Button;
import org.applause.lang.applauseDsl.ScalarExpression;
import org.applause.lang.applauseDsl.ViewCall;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ApplicationImpl#isTabbarApplication <em>Tabbar Application</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ApplicationImpl#getAppicon <em>Appicon</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ApplicationImpl#getSplash <em>Splash</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ApplicationImpl#getMainview <em>Mainview</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ApplicationImpl#getButtons <em>Buttons</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application
{
  /**
   * The default value of the '{@link #isTabbarApplication() <em>Tabbar Application</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTabbarApplication()
   * @generated
   * @ordered
   */
  protected static final boolean TABBAR_APPLICATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTabbarApplication() <em>Tabbar Application</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTabbarApplication()
   * @generated
   * @ordered
   */
  protected boolean tabbarApplication = TABBAR_APPLICATION_EDEFAULT;

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
   * The cached value of the '{@link #getAppicon() <em>Appicon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppicon()
   * @generated
   * @ordered
   */
  protected ScalarExpression appicon;

  /**
   * The cached value of the '{@link #getSplash() <em>Splash</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSplash()
   * @generated
   * @ordered
   */
  protected ScalarExpression splash;

  /**
   * The cached value of the '{@link #getMainview() <em>Mainview</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainview()
   * @generated
   * @ordered
   */
  protected ViewCall mainview;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationImpl()
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
    return ApplauseDslPackage.Literals.APPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTabbarApplication()
  {
    return tabbarApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTabbarApplication(boolean newTabbarApplication)
  {
    boolean oldTabbarApplication = tabbarApplication;
    tabbarApplication = newTabbarApplication;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.APPLICATION__TABBAR_APPLICATION, oldTabbarApplication, tabbarApplication));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.APPLICATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getAppicon()
  {
    return appicon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAppicon(ScalarExpression newAppicon, NotificationChain msgs)
  {
    ScalarExpression oldAppicon = appicon;
    appicon = newAppicon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.APPLICATION__APPICON, oldAppicon, newAppicon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAppicon(ScalarExpression newAppicon)
  {
    if (newAppicon != appicon)
    {
      NotificationChain msgs = null;
      if (appicon != null)
        msgs = ((InternalEObject)appicon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.APPLICATION__APPICON, null, msgs);
      if (newAppicon != null)
        msgs = ((InternalEObject)newAppicon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.APPLICATION__APPICON, null, msgs);
      msgs = basicSetAppicon(newAppicon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.APPLICATION__APPICON, newAppicon, newAppicon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getSplash()
  {
    return splash;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSplash(ScalarExpression newSplash, NotificationChain msgs)
  {
    ScalarExpression oldSplash = splash;
    splash = newSplash;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.APPLICATION__SPLASH, oldSplash, newSplash);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSplash(ScalarExpression newSplash)
  {
    if (newSplash != splash)
    {
      NotificationChain msgs = null;
      if (splash != null)
        msgs = ((InternalEObject)splash).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.APPLICATION__SPLASH, null, msgs);
      if (newSplash != null)
        msgs = ((InternalEObject)newSplash).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.APPLICATION__SPLASH, null, msgs);
      msgs = basicSetSplash(newSplash, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.APPLICATION__SPLASH, newSplash, newSplash));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewCall getMainview()
  {
    return mainview;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMainview(ViewCall newMainview, NotificationChain msgs)
  {
    ViewCall oldMainview = mainview;
    mainview = newMainview;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.APPLICATION__MAINVIEW, oldMainview, newMainview);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainview(ViewCall newMainview)
  {
    if (newMainview != mainview)
    {
      NotificationChain msgs = null;
      if (mainview != null)
        msgs = ((InternalEObject)mainview).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.APPLICATION__MAINVIEW, null, msgs);
      if (newMainview != null)
        msgs = ((InternalEObject)newMainview).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.APPLICATION__MAINVIEW, null, msgs);
      msgs = basicSetMainview(newMainview, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.APPLICATION__MAINVIEW, newMainview, newMainview));
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
      buttons = new EObjectContainmentEList<Button>(Button.class, this, ApplauseDslPackage.APPLICATION__BUTTONS);
    }
    return buttons;
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
      case ApplauseDslPackage.APPLICATION__APPICON:
        return basicSetAppicon(null, msgs);
      case ApplauseDslPackage.APPLICATION__SPLASH:
        return basicSetSplash(null, msgs);
      case ApplauseDslPackage.APPLICATION__MAINVIEW:
        return basicSetMainview(null, msgs);
      case ApplauseDslPackage.APPLICATION__BUTTONS:
        return ((InternalEList<?>)getButtons()).basicRemove(otherEnd, msgs);
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
      case ApplauseDslPackage.APPLICATION__TABBAR_APPLICATION:
        return isTabbarApplication();
      case ApplauseDslPackage.APPLICATION__NAME:
        return getName();
      case ApplauseDslPackage.APPLICATION__APPICON:
        return getAppicon();
      case ApplauseDslPackage.APPLICATION__SPLASH:
        return getSplash();
      case ApplauseDslPackage.APPLICATION__MAINVIEW:
        return getMainview();
      case ApplauseDslPackage.APPLICATION__BUTTONS:
        return getButtons();
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
      case ApplauseDslPackage.APPLICATION__TABBAR_APPLICATION:
        setTabbarApplication((Boolean)newValue);
        return;
      case ApplauseDslPackage.APPLICATION__NAME:
        setName((String)newValue);
        return;
      case ApplauseDslPackage.APPLICATION__APPICON:
        setAppicon((ScalarExpression)newValue);
        return;
      case ApplauseDslPackage.APPLICATION__SPLASH:
        setSplash((ScalarExpression)newValue);
        return;
      case ApplauseDslPackage.APPLICATION__MAINVIEW:
        setMainview((ViewCall)newValue);
        return;
      case ApplauseDslPackage.APPLICATION__BUTTONS:
        getButtons().clear();
        getButtons().addAll((Collection<? extends Button>)newValue);
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
      case ApplauseDslPackage.APPLICATION__TABBAR_APPLICATION:
        setTabbarApplication(TABBAR_APPLICATION_EDEFAULT);
        return;
      case ApplauseDslPackage.APPLICATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ApplauseDslPackage.APPLICATION__APPICON:
        setAppicon((ScalarExpression)null);
        return;
      case ApplauseDslPackage.APPLICATION__SPLASH:
        setSplash((ScalarExpression)null);
        return;
      case ApplauseDslPackage.APPLICATION__MAINVIEW:
        setMainview((ViewCall)null);
        return;
      case ApplauseDslPackage.APPLICATION__BUTTONS:
        getButtons().clear();
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
      case ApplauseDslPackage.APPLICATION__TABBAR_APPLICATION:
        return tabbarApplication != TABBAR_APPLICATION_EDEFAULT;
      case ApplauseDslPackage.APPLICATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ApplauseDslPackage.APPLICATION__APPICON:
        return appicon != null;
      case ApplauseDslPackage.APPLICATION__SPLASH:
        return splash != null;
      case ApplauseDslPackage.APPLICATION__MAINVIEW:
        return mainview != null;
      case ApplauseDslPackage.APPLICATION__BUTTONS:
        return buttons != null && !buttons.isEmpty();
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
    result.append(" (tabbarApplication: ");
    result.append(tabbarApplication);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ApplicationImpl
