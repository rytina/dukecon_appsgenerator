/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.lang.applauseDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Position</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.applause.lang.applauseDsl.ApplauseDslPackage#getPosition()
 * @model
 * @generated
 */
public enum Position implements Enumerator
{
  /**
   * The '<em><b>Default</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEFAULT_VALUE
   * @generated
   * @ordered
   */
  DEFAULT(0, "default", "left"),

  /**
   * The '<em><b>Center</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CENTER_VALUE
   * @generated
   * @ordered
   */
  CENTER(1, "center", "center"),

  /**
   * The '<em><b>Right</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RIGHT_VALUE
   * @generated
   * @ordered
   */
  RIGHT(2, "right", "right");

  /**
   * The '<em><b>Default</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEFAULT
   * @model name="default" literal="left"
   * @generated
   * @ordered
   */
  public static final int DEFAULT_VALUE = 0;

  /**
   * The '<em><b>Center</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Center</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CENTER
   * @model name="center"
   * @generated
   * @ordered
   */
  public static final int CENTER_VALUE = 1;

  /**
   * The '<em><b>Right</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Right</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RIGHT
   * @model name="right"
   * @generated
   * @ordered
   */
  public static final int RIGHT_VALUE = 2;

  /**
   * An array of all the '<em><b>Position</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Position[] VALUES_ARRAY =
    new Position[]
    {
      DEFAULT,
      CENTER,
      RIGHT,
    };

  /**
   * A public read-only list of all the '<em><b>Position</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Position> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Position</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Position get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Position result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Position</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Position getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Position result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Position</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Position get(int value)
  {
    switch (value)
    {
      case DEFAULT_VALUE: return DEFAULT;
      case CENTER_VALUE: return CENTER;
      case RIGHT_VALUE: return RIGHT;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Position(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Position
