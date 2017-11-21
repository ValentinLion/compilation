/**
 * generated by Xtext 2.13.0
 */
package esir.compilation.whdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esir.compilation.whdsl.Affect#getVars <em>Vars</em>}</li>
 *   <li>{@link esir.compilation.whdsl.Affect#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see esir.compilation.whdsl.WhdslPackage#getAffect()
 * @model
 * @generated
 */
public interface Affect extends EObject
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference.
   * @see #setVars(Vars)
   * @see esir.compilation.whdsl.WhdslPackage#getAffect_Vars()
   * @model containment="true"
   * @generated
   */
  Vars getVars();

  /**
   * Sets the value of the '{@link esir.compilation.whdsl.Affect#getVars <em>Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars</em>' containment reference.
   * @see #getVars()
   * @generated
   */
  void setVars(Vars value);

  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference.
   * @see #setExprs(Exprs)
   * @see esir.compilation.whdsl.WhdslPackage#getAffect_Exprs()
   * @model containment="true"
   * @generated
   */
  Exprs getExprs();

  /**
   * Sets the value of the '{@link esir.compilation.whdsl.Affect#getExprs <em>Exprs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exprs</em>' containment reference.
   * @see #getExprs()
   * @generated
   */
  void setExprs(Exprs value);

} // Affect
