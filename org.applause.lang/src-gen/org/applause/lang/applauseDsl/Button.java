/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.Button#getTitle <em>Title</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.Button#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.Button#getView <em>View</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.Button#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(ScalarExpression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getButton_Title()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getTitle();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.Button#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Icon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Icon</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Icon</em>' containment reference.
   * @see #setIcon(ScalarExpression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getButton_Icon()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getIcon();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.Button#getIcon <em>Icon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Icon</em>' containment reference.
   * @see #getIcon()
   * @generated
   */
  void setIcon(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>View</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View</em>' containment reference.
   * @see #setView(ViewCall)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getButton_View()
   * @model containment="true"
   * @generated
   */
  ViewCall getView();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.Button#getView <em>View</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View</em>' containment reference.
   * @see #getView()
   * @generated
   */
  void setView(ViewCall value);

  /**
   * Returns the value of the '<em><b>Handler</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Handler</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handler</em>' attribute.
   * @see #setHandler(String)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getButton_Handler()
   * @model
   * @generated
   */
  String getHandler();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.Button#getHandler <em>Handler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Handler</em>' attribute.
   * @see #getHandler()
   * @generated
   */
  void setHandler(String value);

} // Button
