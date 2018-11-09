/**
 */
package placer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symetric PE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.SymetricPE#getProcessingElementSymetricPE <em>Processing Element Symetric PE</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getSymetricPE()
 * @model
 * @generated
 */
public interface SymetricPE extends ConstraintOrObjective {
	/**
	 * Returns the value of the '<em><b>Processing Element Symetric PE</b></em>' reference list.
	 * The list contents are of type {@link placer.ProcessingElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Element Symetric PE</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Element Symetric PE</em>' reference list.
	 * @see placer.PlacerPackage#getSymetricPE_ProcessingElementSymetricPE()
	 * @model lower="2"
	 * @generated
	 */
	EList<ProcessingElement> getProcessingElementSymetricPE();

} // SymetricPE
