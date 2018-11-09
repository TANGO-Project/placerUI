/**
 */
package placer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.Mapping#getHardwareName <em>Hardware Name</em>}</li>
 *   <li>{@link placer.Mapping#getMakespan <em>Makespan</em>}</li>
 *   <li>{@link placer.Mapping#getEnergy <em>Energy</em>}</li>
 *   <li>{@link placer.Mapping#getTaskMappings <em>Task Mappings</em>}</li>
 *   <li>{@link placer.Mapping#getSharedFunctionMappings <em>Shared Function Mappings</em>}</li>
 *   <li>{@link placer.Mapping#getTransmissionMappings <em>Transmission Mappings</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Hardware Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Name</em>' attribute.
	 * @see #setHardwareName(String)
	 * @see placer.PlacerPackage#getMapping_HardwareName()
	 * @model required="true"
	 * @generated
	 */
	String getHardwareName();

	/**
	 * Sets the value of the '{@link placer.Mapping#getHardwareName <em>Hardware Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Name</em>' attribute.
	 * @see #getHardwareName()
	 * @generated
	 */
	void setHardwareName(String value);

	/**
	 * Returns the value of the '<em><b>Makespan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Makespan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Makespan</em>' attribute.
	 * @see #setMakespan(int)
	 * @see placer.PlacerPackage#getMapping_Makespan()
	 * @model required="true"
	 * @generated
	 */
	int getMakespan();

	/**
	 * Sets the value of the '{@link placer.Mapping#getMakespan <em>Makespan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Makespan</em>' attribute.
	 * @see #getMakespan()
	 * @generated
	 */
	void setMakespan(int value);

	/**
	 * Returns the value of the '<em><b>Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy</em>' attribute.
	 * @see #setEnergy(int)
	 * @see placer.PlacerPackage#getMapping_Energy()
	 * @model required="true"
	 * @generated
	 */
	int getEnergy();

	/**
	 * Sets the value of the '{@link placer.Mapping#getEnergy <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy</em>' attribute.
	 * @see #getEnergy()
	 * @generated
	 */
	void setEnergy(int value);

	/**
	 * Returns the value of the '<em><b>Task Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link placer.TaskMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Mappings</em>' containment reference list.
	 * @see placer.PlacerPackage#getMapping_TaskMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskMapping> getTaskMappings();

	/**
	 * Returns the value of the '<em><b>Shared Function Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link placer.SharedFunctionMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Function Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Function Mappings</em>' containment reference list.
	 * @see placer.PlacerPackage#getMapping_SharedFunctionMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SharedFunctionMapping> getSharedFunctionMappings();

	/**
	 * Returns the value of the '<em><b>Transmission Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link placer.TransmissionMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Mappings</em>' containment reference list.
	 * @see placer.PlacerPackage#getMapping_TransmissionMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransmissionMapping> getTransmissionMappings();

} // Mapping
