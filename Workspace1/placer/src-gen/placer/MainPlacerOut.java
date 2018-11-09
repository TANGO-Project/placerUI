/**
 */
package placer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Placer Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.MainPlacerOut#getInfo <em>Info</em>}</li>
 *   <li>{@link placer.MainPlacerOut#getJsonFormat <em>Json Format</em>}</li>
 *   <li>{@link placer.MainPlacerOut#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link placer.MainPlacerOut#getDataUnit <em>Data Unit</em>}</li>
 *   <li>{@link placer.MainPlacerOut#getMappings <em>Mappings</em>}</li>
 *   <li>{@link placer.MainPlacerOut#getFilePath <em>File Path</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getMainPlacerOut()
 * @model
 * @generated
 */
public interface MainPlacerOut extends EObject {
	/**
	 * Returns the value of the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' attribute.
	 * @see #setInfo(String)
	 * @see placer.PlacerPackage#getMainPlacerOut_Info()
	 * @model required="true"
	 * @generated
	 */
	String getInfo();

	/**
	 * Sets the value of the '{@link placer.MainPlacerOut#getInfo <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' attribute.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(String value);

	/**
	 * Returns the value of the '<em><b>Json Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Format</em>' attribute.
	 * @see #setJsonFormat(String)
	 * @see placer.PlacerPackage#getMainPlacerOut_JsonFormat()
	 * @model required="true"
	 * @generated
	 */
	String getJsonFormat();

	/**
	 * Sets the value of the '{@link placer.MainPlacerOut#getJsonFormat <em>Json Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Format</em>' attribute.
	 * @see #getJsonFormat()
	 * @generated
	 */
	void setJsonFormat(String value);

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
	 * @see placer.PlacerPackage#getMainPlacerOut_TimeUnit()
	 * @model required="true"
	 * @generated
	 */
	String getTimeUnit();

	/**
	 * Sets the value of the '{@link placer.MainPlacerOut#getTimeUnit <em>Time Unit</em>}' attribute.
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
	 * @see placer.PlacerPackage#getMainPlacerOut_DataUnit()
	 * @model required="true"
	 * @generated
	 */
	String getDataUnit();

	/**
	 * Sets the value of the '{@link placer.MainPlacerOut#getDataUnit <em>Data Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Unit</em>' attribute.
	 * @see #getDataUnit()
	 * @generated
	 */
	void setDataUnit(String value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link Mapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see placer.PlacerPackage#getMainPlacerOut_Mappings()
	 * @model type="placer.Mapping" containment="true" required="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' attribute.
	 * @see #setFilePath(String)
	 * @see placer.PlacerPackage#getMainPlacerOut_FilePath()
	 * @model required="true"
	 * @generated
	 */
	String getFilePath();

	/**
	 * Sets the value of the '{@link placer.MainPlacerOut#getFilePath <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' attribute.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(String value);

} // MainPlacerOut
