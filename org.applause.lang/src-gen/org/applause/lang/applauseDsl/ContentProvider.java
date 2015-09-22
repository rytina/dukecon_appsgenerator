/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.lang.applauseDsl.ContentProvider#getName <em>Name</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ContentProvider#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ContentProvider#isResolver <em>Resolver</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ContentProvider#getType <em>Type</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ContentProvider#isMany <em>Many</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ContentProvider#isXml <em>Xml</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ContentProvider#isHtml <em>Html</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ContentProvider#getUrl <em>Url</em>}</li>
 *   <li>{@link org.applause.lang.applauseDsl.ContentProvider#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getContentProvider()
 * @model
 * @generated
 */
public interface ContentProvider extends ModelElement
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
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getContentProvider_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ContentProvider#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(Parameter)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getContentProvider_Parameter()
   * @model containment="true"
   * @generated
   */
  Parameter getParameter();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ContentProvider#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Parameter value);

  /**
   * Returns the value of the '<em><b>Resolver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resolver</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resolver</em>' attribute.
   * @see #setResolver(boolean)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getContentProvider_Resolver()
   * @model
   * @generated
   */
  boolean isResolver();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ContentProvider#isResolver <em>Resolver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resolver</em>' attribute.
   * @see #isResolver()
   * @generated
   */
  void setResolver(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getContentProvider_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ContentProvider#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many</em>' attribute.
   * @see #setMany(boolean)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getContentProvider_Many()
   * @model
   * @generated
   */
  boolean isMany();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ContentProvider#isMany <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Many</em>' attribute.
   * @see #isMany()
   * @generated
   */
  void setMany(boolean value);

  /**
   * Returns the value of the '<em><b>Xml</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xml</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xml</em>' attribute.
   * @see #setXml(boolean)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getContentProvider_Xml()
   * @model
   * @generated
   */
  boolean isXml();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ContentProvider#isXml <em>Xml</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xml</em>' attribute.
   * @see #isXml()
   * @generated
   */
  void setXml(boolean value);

  /**
   * Returns the value of the '<em><b>Html</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Html</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Html</em>' attribute.
   * @see #setHtml(boolean)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getContentProvider_Html()
   * @model
   * @generated
   */
  boolean isHtml();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ContentProvider#isHtml <em>Html</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Html</em>' attribute.
   * @see #isHtml()
   * @generated
   */
  void setHtml(boolean value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' containment reference.
   * @see #setUrl(ScalarExpression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getContentProvider_Url()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getUrl();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ContentProvider#getUrl <em>Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' containment reference.
   * @see #getUrl()
   * @generated
   */
  void setUrl(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Selection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selection</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection</em>' containment reference.
   * @see #setSelection(ScalarExpression)
   * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getContentProvider_Selection()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getSelection();

  /**
   * Sets the value of the '{@link org.applause.lang.applauseDsl.ContentProvider#getSelection <em>Selection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection</em>' containment reference.
   * @see #getSelection()
   * @generated
   */
  void setSelection(ScalarExpression value);

} // ContentProvider
