/**
 * generated by Xtext 2.13.0
 */
package esir.compilation.whdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link esir.compilation.whdsl.Definition#getInput <em>Input</em>}</li>
 *   <li>{@link esir.compilation.whdsl.Definition#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see esir.compilation.whdsl.WhdslPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends EObject
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(Input)
   * @see esir.compilation.whdsl.WhdslPackage#getDefinition_Input()
   * @model containment="true"
   * @generated
   */
  Input getInput();

  /**
   * Sets the value of the '{@link esir.compilation.whdsl.Definition#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(Input value);

  /**
   * Returns the value of the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' containment reference.
   * @see #setOutput(Output)
   * @see esir.compilation.whdsl.WhdslPackage#getDefinition_Output()
   * @model containment="true"
   * @generated
   */
  Output getOutput();

  /**
   * Sets the value of the '{@link esir.compilation.whdsl.Definition#getOutput <em>Output</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' containment reference.
   * @see #getOutput()
   * @generated
   */
  void setOutput(Output value);

} // Definition
