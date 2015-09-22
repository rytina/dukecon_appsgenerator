/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl.impl;

import java.util.Collection;

import org.applause.lang.applauseDsl.ApplauseDslPackage;
import org.applause.lang.applauseDsl.NavigationBarItem;
import org.applause.lang.applauseDsl.Position;
import org.applause.lang.applauseDsl.ScalarExpression;

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
 * An implementation of the model object '<em><b>Navigation Bar Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.impl.NavigationBarItemImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.NavigationBarItemImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.impl.NavigationBarItemImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NavigationBarItemImpl extends ModelElementImpl implements NavigationBarItem
{
  /**
   * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected static final Position POSITION_EDEFAULT = Position.DEFAULT;

  /**
   * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected Position position = POSITION_EDEFAULT;

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
   * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggers()
   * @generated
   * @ordered
   */
  protected EList<ScalarExpression> triggers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NavigationBarItemImpl()
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
    return ApplauseDslPackage.Literals.NAVIGATION_BAR_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Position getPosition()
  {
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosition(Position newPosition)
  {
    Position oldPosition = position;
    position = newPosition == null ? POSITION_EDEFAULT : newPosition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.NAVIGATION_BAR_ITEM__POSITION, oldPosition, position));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.NAVIGATION_BAR_ITEM__ICON, oldIcon, newIcon);
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
        msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.NAVIGATION_BAR_ITEM__ICON, null, msgs);
      if (newIcon != null)
        msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.NAVIGATION_BAR_ITEM__ICON, null, msgs);
      msgs = basicSetIcon(newIcon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.NAVIGATION_BAR_ITEM__ICON, newIcon, newIcon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ScalarExpression> getTriggers()
  {
    if (triggers == null)
    {
      triggers = new EObjectContainmentEList<ScalarExpression>(ScalarExpression.class, this, ApplauseDslPackage.NAVIGATION_BAR_ITEM__TRIGGERS);
    }
    return triggers;
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
      case ApplauseDslPackage.NAVIGATION_BAR_ITEM__ICON:
        return basicSetIcon(null, msgs);
      case ApplauseDslPackage.NAVIGATION_BAR_ITEM__TRIGGERS:
        return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
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
      case ApplauseDslPackage.NAVIGATION_BAR_ITEM__POSITION:
        return getPosition();
      case ApplauseDslPackage.NAVIGATION_BAR_ITEM__ICON:
        return getIcon();
      case ApplauseDslPackage.NAVIGATION_BAR_ITEM__TRIGGERS:
        return getTriggers();
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
      case ApplauseDslPackage.NAVIGATION_BAR_ITEM__POSITION:
        setPosition((Position)newValue);
        return;
      case ApplauseDslPackage.NAVIGATION_BAR_ITEM__ICON:
        setIcon((ScalarExpression)newValue);
        return;
      case ApplauseDslPackage.NAVIGATION_BAR_ITEM__TRIGGERS:
        getTriggers().clear();
        getTriggers().addAll((Collection<? extends ScalarExpression>)newValue);
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
      case ApplauseDslPackage.NAVIGATION_BAR_ITEM__POSITION:
        setPosition(POSITION_EDEFAULT);
        return;
      case ApplauseDslPackage.NAVIGATION_BAR_ITEM__ICON:
        setIcon((ScalarExpression)null);
        return;
      case ApplauseDslPackage.NAVIGATION_BAR_ITEM__TRIGGERS:
        getTriggers().clear();
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
      case ApplauseDslPackage.NAVIGATION_BAR_ITEM__POSITION:
        return position != POSITION_EDEFAULT;
      case ApplauseDslPackage.NAVIGATION_BAR_ITEM__ICON:
        return icon != null;
      case ApplauseDslPackage.NAVIGATION_BAR_ITEM__TRIGGERS:
        return triggers != null && !triggers.isEmpty();
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
    result.append(" (position: ");
    result.append(position);
    result.append(')');
    return result.toString();
  }

} //NavigationBarItemImpl
