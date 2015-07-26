/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl.impl;

import java.util.Collection;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.Parameter;
import org.applause.lang.applauseDsl.SectionedView;
import org.applause.lang.applauseDsl.ViewForAllSections;
import org.applause.lang.applauseDsl.ViewSection;

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
 * An implementation of the model object '<em><b>Sectioned View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.SectionedViewImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.SectionedViewImpl#getSuperView <em>Super View</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.SectionedViewImpl#getForAllSections <em>For All Sections</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.SectionedViewImpl#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionedViewImpl extends ViewImpl implements SectionedView
{
  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected Parameter content;

  /**
   * The cached value of the '{@link #getSuperView() <em>Super View</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperView()
   * @generated
   * @ordered
   */
  protected SectionedView superView;

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
  protected SectionedViewImpl()
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
    return ApplauseDslPackage.Literals.SECTIONED_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContent(Parameter newContent, NotificationChain msgs)
  {
    Parameter oldContent = content;
    content = newContent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.SECTIONED_VIEW__CONTENT, oldContent, newContent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(Parameter newContent)
  {
    if (newContent != content)
    {
      NotificationChain msgs = null;
      if (content != null)
        msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.SECTIONED_VIEW__CONTENT, null, msgs);
      if (newContent != null)
        msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.SECTIONED_VIEW__CONTENT, null, msgs);
      msgs = basicSetContent(newContent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.SECTIONED_VIEW__CONTENT, newContent, newContent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SectionedView getSuperView()
  {
    if (superView != null && superView.eIsProxy())
    {
      InternalEObject oldSuperView = (InternalEObject)superView;
      superView = (SectionedView)eResolveProxy(oldSuperView);
      if (superView != oldSuperView)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplauseDslPackage.SECTIONED_VIEW__SUPER_VIEW, oldSuperView, superView));
      }
    }
    return superView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SectionedView basicGetSuperView()
  {
    return superView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperView(SectionedView newSuperView)
  {
    SectionedView oldSuperView = superView;
    superView = newSuperView;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.SECTIONED_VIEW__SUPER_VIEW, oldSuperView, superView));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.SECTIONED_VIEW__FOR_ALL_SECTIONS, oldForAllSections, newForAllSections);
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
        msgs = ((InternalEObject)forAllSections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.SECTIONED_VIEW__FOR_ALL_SECTIONS, null, msgs);
      if (newForAllSections != null)
        msgs = ((InternalEObject)newForAllSections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.SECTIONED_VIEW__FOR_ALL_SECTIONS, null, msgs);
      msgs = basicSetForAllSections(newForAllSections, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.SECTIONED_VIEW__FOR_ALL_SECTIONS, newForAllSections, newForAllSections));
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
      sections = new EObjectContainmentEList<ViewSection>(ViewSection.class, this, ApplauseDslPackage.SECTIONED_VIEW__SECTIONS);
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
      case ApplauseDslPackage.SECTIONED_VIEW__CONTENT:
        return basicSetContent(null, msgs);
      case ApplauseDslPackage.SECTIONED_VIEW__FOR_ALL_SECTIONS:
        return basicSetForAllSections(null, msgs);
      case ApplauseDslPackage.SECTIONED_VIEW__SECTIONS:
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
      case ApplauseDslPackage.SECTIONED_VIEW__CONTENT:
        return getContent();
      case ApplauseDslPackage.SECTIONED_VIEW__SUPER_VIEW:
        if (resolve) return getSuperView();
        return basicGetSuperView();
      case ApplauseDslPackage.SECTIONED_VIEW__FOR_ALL_SECTIONS:
        return getForAllSections();
      case ApplauseDslPackage.SECTIONED_VIEW__SECTIONS:
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
      case ApplauseDslPackage.SECTIONED_VIEW__CONTENT:
        setContent((Parameter)newValue);
        return;
      case ApplauseDslPackage.SECTIONED_VIEW__SUPER_VIEW:
        setSuperView((SectionedView)newValue);
        return;
      case ApplauseDslPackage.SECTIONED_VIEW__FOR_ALL_SECTIONS:
        setForAllSections((ViewForAllSections)newValue);
        return;
      case ApplauseDslPackage.SECTIONED_VIEW__SECTIONS:
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
      case ApplauseDslPackage.SECTIONED_VIEW__CONTENT:
        setContent((Parameter)null);
        return;
      case ApplauseDslPackage.SECTIONED_VIEW__SUPER_VIEW:
        setSuperView((SectionedView)null);
        return;
      case ApplauseDslPackage.SECTIONED_VIEW__FOR_ALL_SECTIONS:
        setForAllSections((ViewForAllSections)null);
        return;
      case ApplauseDslPackage.SECTIONED_VIEW__SECTIONS:
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
      case ApplauseDslPackage.SECTIONED_VIEW__CONTENT:
        return content != null;
      case ApplauseDslPackage.SECTIONED_VIEW__SUPER_VIEW:
        return superView != null;
      case ApplauseDslPackage.SECTIONED_VIEW__FOR_ALL_SECTIONS:
        return forAllSections != null;
      case ApplauseDslPackage.SECTIONED_VIEW__SECTIONS:
        return sections != null && !sections.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SectionedViewImpl
