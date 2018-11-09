/**
 */
package placer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Cap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.EnergyCap#getEnergyCap <em>Energy Cap</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getEnergyCap()
 * @model
 * @generated
 */
public interface EnergyCap extends EObject {
	/**
	 * Returns the value of the '<em><b>Energy Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Cap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Cap</em>' attribute.
	 * @see #setEnergyCap(int)
	 * @see placer.PlacerPackage#getEnergyCap_EnergyCap()
	 * @model required="true"
	 * @generated
	 */
	int getEnergyCap();

	/**
	 * Sets the value of the '{@link placer.EnergyCap#getEnergyCap <em>Energy Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Cap</em>' attribute.
	 * @see #getEnergyCap()
	 * @generated
	 */
	void setEnergyCap(int value);

} // EnergyCap
