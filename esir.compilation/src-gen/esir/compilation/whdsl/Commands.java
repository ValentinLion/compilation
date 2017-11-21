/**
 * generated by Xtext 2.13.0
 */
package esir.compilation.whdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commands</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esir.compilation.whdsl.Commands#getList <em>List</em>}</li>
 * </ul>
 *
 * @see esir.compilation.whdsl.WhdslPackage#getCommands()
 * @model
 * @generated
 */
public interface Commands extends EObject
{
  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference list.
   * The list contents are of type {@link esir.compilation.whdsl.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference list.
   * @see esir.compilation.whdsl.WhdslPackage#getCommands_List()
   * @model containment="true"
   * @generated
   */
  EList<Command> getList();

} // Commands
