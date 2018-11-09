/**
 */
package placer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Cap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.PowerCap#getPowerCap <em>Power Cap</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getPowerCap()
 * @model
 * @generated
 */
public interface PowerCap extends EObject {
	/**
	 * Returns the value of the '<em><b>Power Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Cap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Cap</em>' attribute.
	 * @see #setPowerCap(int)
	 * @see placer.PlacerPackage#getPowerCap_PowerCap()
	 * @model required="true"
	 * @generated
	 */
	int getPowerCap();

	/**
	 * Sets the value of the '{@link placer.PowerCap#getPowerCap <em>Power Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Cap</em>' attribute.
	 * @see #getPowerCap()
	 * @generated
	 */
	void setPowerCap(int value);

} // PowerCap
