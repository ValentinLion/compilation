/**
 * generated by Xtext 2.13.0
 */
package esir.compilation.whdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esir.compilation.whdsl.Output#getVars <em>Vars</em>}</li>
 * </ul>
 *
 * @see esir.compilation.whdsl.WhdslPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends EObject
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
   * @see esir.compilation.whdsl.WhdslPackage#getOutput_Vars()
   * @model containment="true"
   * @generated
   */
  Vars getVars();

  /**
   * Sets the value of the '{@link esir.compilation.whdsl.Output#getVars <em>Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars</em>' containment reference.
   * @see #getVars()
   * @generated
   */
  void setVars(Vars value);

} // Output
