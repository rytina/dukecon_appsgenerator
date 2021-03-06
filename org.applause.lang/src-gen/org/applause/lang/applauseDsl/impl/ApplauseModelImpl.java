/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl.impl;

import java.util.Collection;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.ApplauseModel;
import org.applause.lang.applauseDsl.Application;
import org.applause.lang.applauseDsl.ModelElement;

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
 * An implementation of the model object '<em><b>Applause Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ApplauseModelImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.ApplauseModelImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplauseModelImpl extends MinimalEObjectImpl.Container implements ApplauseModel
{
  /**
   * The cached value of the '{@link #getApplication() <em>Application</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplication()
   * @generated
   * @ordered
   */
  protected Application application;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<ModelElement> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplauseModelImpl()
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
    return ApplauseDslPackage.Literals.APPLAUSE_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application getApplication()
  {
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs)
  {
    Application oldApplication = application;
    application = newApplication;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.APPLAUSE_MODEL__APPLICATION, oldApplication, newApplication);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApplication(Application newApplication)
  {
    if (newApplication != application)
    {
      NotificationChain msgs = null;
      if (application != null)
        msgs = ((InternalEObject)application).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.APPLAUSE_MODEL__APPLICATION, null, msgs);
      if (newApplication != null)
        msgs = ((InternalEObject)newApplication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.APPLAUSE_MODEL__APPLICATION, null, msgs);
      msgs = basicSetApplication(newApplication, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.APPLAUSE_MODEL__APPLICATION, newApplication, newApplication));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModelElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<ModelElement>(ModelElement.class, this, ApplauseDslPackage.APPLAUSE_MODEL__ELEMENTS);
    }
    return elements;
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
      case ApplauseDslPackage.APPLAUSE_MODEL__APPLICATION:
        return basicSetApplication(null, msgs);
      case ApplauseDslPackage.APPLAUSE_MODEL__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case ApplauseDslPackage.APPLAUSE_MODEL__APPLICATION:
        return getApplication();
      case ApplauseDslPackage.APPLAUSE_MODEL__ELEMENTS:
        return getElements();
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
      case ApplauseDslPackage.APPLAUSE_MODEL__APPLICATION:
        setApplication((Application)newValue);
        return;
      case ApplauseDslPackage.APPLAUSE_MODEL__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends ModelElement>)newValue);
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
      case ApplauseDslPackage.APPLAUSE_MODEL__APPLICATION:
        setApplication((Application)null);
        return;
      case ApplauseDslPackage.APPLAUSE_MODEL__ELEMENTS:
        getElements().clear();
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
      case ApplauseDslPackage.APPLAUSE_MODEL__APPLICATION:
        return application != null;
      case ApplauseDslPackage.APPLAUSE_MODEL__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ApplauseModelImpl
