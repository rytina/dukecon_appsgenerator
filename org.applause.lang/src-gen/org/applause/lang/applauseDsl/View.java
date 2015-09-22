/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.View#getName <em>Name</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.View#getTitle <em>Title</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.View#getButtons <em>Buttons</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.View#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getView()
 * @model
 * @generated
 */
public interface View extends ModelElement
{
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
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getView_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.View#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getView_Title()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getTitle();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.View#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(ScalarExpression value);

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
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getView_Buttons()
   * @model containment="true"
   * @generated
   */
  EList<Button> getButtons();

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.lang.applauseDsl.VariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getView_Actions()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclaration> getActions();

} // View
