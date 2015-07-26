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
 * A representation of the model object '<em><b>Applause Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.ApplauseModel#getApplication <em>Application</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ApplauseModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getApplauseModel()
 * @model
 * @generated
 */
public interface ApplauseModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Application</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Application</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application</em>' containment reference.
   * @see #setApplication(Application)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getApplauseModel_Application()
   * @model containment="true"
   * @generated
   */
  Application getApplication();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ApplauseModel#getApplication <em>Application</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application</em>' containment reference.
   * @see #getApplication()
   * @generated
   */
  void setApplication(Application value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.lang.applauseDsl.ModelElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getApplauseModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ModelElement> getElements();

} // ApplauseModel
