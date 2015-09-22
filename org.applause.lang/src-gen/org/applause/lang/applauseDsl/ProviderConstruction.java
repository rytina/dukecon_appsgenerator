/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider Construction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.ProviderConstruction#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ProviderConstruction#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ProviderConstruction#getPredefinedParameter <em>Predefined Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getProviderConstruction()
 * @model
 * @generated
 */
public interface ProviderConstruction extends EObject
{
  /**
   * Returns the value of the '<em><b>Provider</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provider</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provider</em>' reference.
   * @see #setProvider(ContentProvider)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getProviderConstruction_Provider()
   * @model
   * @generated
   */
  ContentProvider getProvider();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ProviderConstruction#getProvider <em>Provider</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Provider</em>' reference.
   * @see #getProvider()
   * @generated
   */
  void setProvider(ContentProvider value);

  /**
   * Returns the value of the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' containment reference.
   * @see #setArgument(Expression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getProviderConstruction_Argument()
   * @model containment="true"
   * @generated
   */
  Expression getArgument();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ProviderConstruction#getArgument <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' containment reference.
   * @see #getArgument()
   * @generated
   */
  void setArgument(Expression value);

  /**
   * Returns the value of the '<em><b>Predefined Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predefined Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predefined Parameter</em>' containment reference.
   * @see #setPredefinedParameter(PredefinedParameter)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getProviderConstruction_PredefinedParameter()
   * @model containment="true"
   * @generated
   */
  PredefinedParameter getPredefinedParameter();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ProviderConstruction#getPredefinedParameter <em>Predefined Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predefined Parameter</em>' containment reference.
   * @see #getPredefinedParameter()
   * @generated
   */
  void setPredefinedParameter(PredefinedParameter value);

} // ProviderConstruction
