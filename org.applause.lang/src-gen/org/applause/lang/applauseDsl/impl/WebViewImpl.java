/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl.impl;

import java.util.Collection;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.ViewForAllSections;
import org.applause.lang.applauseDsl.ViewHeader;
import org.applause.lang.applauseDsl.ViewSection;
import org.applause.lang.applauseDsl.WebView;

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
 * An implementation of the model object '<em><b>Web View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.WebViewImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.WebViewImpl#getForAllSections <em>For All Sections</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.WebViewImpl#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebViewImpl extends ViewImpl implements WebView
{
  /**
   * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected ViewHeader header;

  /**
   * The cached value of the '{@link #getForAllSections() <em>For All Sections</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForAllSections()
   * @generated
   * @ordered
   */
  protected ViewForAllSections forAllSections;

  /**
   * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSections()
   * @generated
   * @ordered
   */
  protected EList<ViewSection> sections;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WebViewImpl()
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
    return ApplauseDslPackage.Literals.WEB_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewHeader getHeader()
  {
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeader(ViewHeader newHeader, NotificationChain msgs)
  {
    ViewHeader oldHeader = header;
    header = newHeader;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.WEB_VIEW__HEADER, oldHeader, newHeader);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeader(ViewHeader newHeader)
  {
    if (newHeader != header)
    {
      NotificationChain msgs = null;
      if (header != null)
        msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.WEB_VIEW__HEADER, null, msgs);
      if (newHeader != null)
        msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.WEB_VIEW__HEADER, null, msgs);
      msgs = basicSetHeader(newHeader, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.WEB_VIEW__HEADER, newHeader, newHeader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewForAllSections getForAllSections()
  {
    return forAllSections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForAllSections(ViewForAllSections newForAllSections, NotificationChain msgs)
  {
    ViewForAllSections oldForAllSections = forAllSections;
    forAllSections = newForAllSections;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.WEB_VIEW__FOR_ALL_SECTIONS, oldForAllSections, newForAllSections);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForAllSections(ViewForAllSections newForAllSections)
  {
    if (newForAllSections != forAllSections)
    {
      NotificationChain msgs = null;
      if (forAllSections != null)
        msgs = ((InternalEObject)forAllSections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.WEB_VIEW__FOR_ALL_SECTIONS, null, msgs);
      if (newForAllSections != null)
        msgs = ((InternalEObject)newForAllSections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.WEB_VIEW__FOR_ALL_SECTIONS, null, msgs);
      msgs = basicSetForAllSections(newForAllSections, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.WEB_VIEW__FOR_ALL_SECTIONS, newForAllSections, newForAllSections));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ViewSection> getSections()
  {
    if (sections == null)
    {
      sections = new EObjectContainmentEList<ViewSection>(ViewSection.class, this, ApplauseDslPackage.WEB_VIEW__SECTIONS);
    }
    return sections;
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
      case ApplauseDslPackage.WEB_VIEW__HEADER:
        return basicSetHeader(null, msgs);
      case ApplauseDslPackage.WEB_VIEW__FOR_ALL_SECTIONS:
        return basicSetForAllSections(null, msgs);
      case ApplauseDslPackage.WEB_VIEW__SECTIONS:
        return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
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
      case ApplauseDslPackage.WEB_VIEW__HEADER:
        return getHeader();
      case ApplauseDslPackage.WEB_VIEW__FOR_ALL_SECTIONS:
        return getForAllSections();
      case ApplauseDslPackage.WEB_VIEW__SECTIONS:
        return getSections();
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
      case ApplauseDslPackage.WEB_VIEW__HEADER:
        setHeader((ViewHeader)newValue);
        return;
      case ApplauseDslPackage.WEB_VIEW__FOR_ALL_SECTIONS:
        setForAllSections((ViewForAllSections)newValue);
        return;
      case ApplauseDslPackage.WEB_VIEW__SECTIONS:
        getSections().clear();
        getSections().addAll((Collection<? extends ViewSection>)newValue);
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
      case ApplauseDslPackage.WEB_VIEW__HEADER:
        setHeader((ViewHeader)null);
        return;
      case ApplauseDslPackage.WEB_VIEW__FOR_ALL_SECTIONS:
        setForAllSections((ViewForAllSections)null);
        return;
      case ApplauseDslPackage.WEB_VIEW__SECTIONS:
        getSections().clear();
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
      case ApplauseDslPackage.WEB_VIEW__HEADER:
        return header != null;
      case ApplauseDslPackage.WEB_VIEW__FOR_ALL_SECTIONS:
        return forAllSections != null;
      case ApplauseDslPackage.WEB_VIEW__SECTIONS:
        return sections != null && !sections.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WebViewImpl
