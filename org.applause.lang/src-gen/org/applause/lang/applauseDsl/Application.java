/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.Application#isTabbarApplication <em>Tabbar Application</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.Application#getName <em>Name</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.Application#getAppicon <em>Appicon</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.Application#getSplash <em>Splash</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.Application#getMainview <em>Mainview</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.Application#getButtons <em>Buttons</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject
{
  /**
   * Returns the value of the '<em><b>Tabbar Application</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tabbar Application</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tabbar Application</em>' attribute.
   * @see #setTabbarApplication(boolean)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getApplication_TabbarApplication()
   * @model
   * @generated
   */
  boolean isTabbarApplication();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.Application#isTabbarApplication <em>Tabbar Application</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tabbar Application</em>' attribute.
   * @see #isTabbarApplication()
   * @generated
   */
  void setTabbarApplication(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getApplication_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.Application#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Appicon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Appicon</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Appicon</em>' containment reference.
   * @see #setAppicon(ScalarExpression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getApplication_Appicon()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getAppicon();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.Application#getAppicon <em>Appicon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Appicon</em>' containment reference.
   * @see #getAppicon()
   * @generated
   */
  void setAppicon(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Splash</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Splash</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Splash</em>' containment reference.
   * @see #setSplash(ScalarExpression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getApplication_Splash()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getSplash();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.Application#getSplash <em>Splash</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Splash</em>' containment reference.
   * @see #getSplash()
   * @generated
   */
  void setSplash(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Mainview</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mainview</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mainview</em>' containment reference.
   * @see #setMainview(ViewCall)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getApplication_Mainview()
   * @model containment="true"
   * @generated
   */
  ViewCall getMainview();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.Application#getMainview <em>Mainview</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mainview</em>' containment reference.
   * @see #getMainview()
   * @generated
   */
  void setMainview(ViewCall value);

  /**
   * Returns the value of the '<em><b>Buttons</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.lang.applauseDsl.Button}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Buttons</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Buttons</em>' containment reference list.
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getApplication_Buttons()
   * @model containment="true"
   * @generated
   */
  EList<Button> getButtons();

} // Application
