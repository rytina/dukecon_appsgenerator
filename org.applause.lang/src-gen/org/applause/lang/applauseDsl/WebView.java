/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.WebView#getHeader <em>Header</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.WebView#getForAllSections <em>For All Sections</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.WebView#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getWebView()
 * @model
 * @generated
 */
public interface WebView extends View
{
  /**
   * Returns the value of the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header</em>' containment reference.
   * @see #setHeader(ViewHeader)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getWebView_Header()
   * @model containment="true"
   * @generated
   */
  ViewHeader getHeader();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.WebView#getHeader <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' containment reference.
   * @see #getHeader()
   * @generated
   */
  void setHeader(ViewHeader value);

  /**
   * Returns the value of the '<em><b>For All Sections</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For All Sections</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For All Sections</em>' containment reference.
   * @see #setForAllSections(ViewForAllSections)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getWebView_ForAllSections()
   * @model containment="true"
   * @generated
   */
  ViewForAllSections getForAllSections();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.WebView#getForAllSections <em>For All Sections</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For All Sections</em>' containment reference.
   * @see #getForAllSections()
   * @generated
   */
  void setForAllSections(ViewForAllSections value);

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link org.applause.lang.applauseDsl.ViewSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getWebView_Sections()
   * @model containment="true"
   * @generated
   */
  EList<ViewSection> getSections();

} // WebView
