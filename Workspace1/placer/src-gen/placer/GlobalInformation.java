/**
 */
package placer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.GlobalInformation#getInformation <em>Information</em>}</li>
 *   <li>{@link placer.GlobalInformation#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link placer.GlobalInformation#getDataUnit <em>Data Unit</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getGlobalInformation()
 * @model
 * @generated
 */
public interface GlobalInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' attribute.
	 * @see #setInformation(String)
	 * @see placer.PlacerPackage#getGlobalInformation_Information()
	 * @model required="true"
	 * @generated
	 */
	String getInformation();

	/**
	 * Sets the value of the '{@link placer.GlobalInformation#getInformation <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' attribute.
	 * @see #getInformation()
	 * @generated
	 */
	void setInformation(String value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see #setTimeUnit(String)
	 * @see placer.PlacerPackage#getGlobalInformation_TimeUnit()
	 * @model required="true"
	 * @generated
	 */
	String getTimeUnit();

	/**
	 * Sets the value of the '{@link placer.GlobalInformation#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(String value);

	/**
	 * Returns the value of the '<em><b>Data Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Unit</em>' attribute.
	 * @see #setDataUnit(String)
	 * @see placer.PlacerPackage#getGlobalInformation_DataUnit()
	 * @model required="true"
	 * @generated
	 */
	String getDataUnit();

	/**
	 * Sets the value of the '{@link placer.GlobalInformation#getDataUnit <em>Data Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Unit</em>' attribute.
	 * @see #getDataUnit()
	 * @generated
	 */
	void setDataUnit(String value);

} // GlobalInformation
