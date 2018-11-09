/**
 */
package placer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.TransmissionMapping#getStart <em>Start</em>}</li>
 *   <li>{@link placer.TransmissionMapping#getDuration <em>Duration</em>}</li>
 *   <li>{@link placer.TransmissionMapping#getEnd <em>End</em>}</li>
 *   <li>{@link placer.TransmissionMapping#getBus <em>Bus</em>}</li>
 *   <li>{@link placer.TransmissionMapping#getTransmission <em>Transmission</em>}</li>
 *   <li>{@link placer.TransmissionMapping#getFromPE <em>From PE</em>}</li>
 *   <li>{@link placer.TransmissionMapping#getToPE <em>To PE</em>}</li>
 *   <li>{@link placer.TransmissionMapping#getFromTask <em>From Task</em>}</li>
 *   <li>{@link placer.TransmissionMapping#getToTask <em>To Task</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getTransmissionMapping()
 * @model
 * @generated
 */
public interface TransmissionMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Transmission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission</em>' attribute.
	 * @see #setTransmission(String)
	 * @see placer.PlacerPackage#getTransmissionMapping_Transmission()
	 * @model required="true"
	 * @generated
	 */
	String getTransmission();

	/**
	 * Sets the value of the '{@link placer.TransmissionMapping#getTransmission <em>Transmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission</em>' attribute.
	 * @see #getTransmission()
	 * @generated
	 */
	void setTransmission(String value);

	/**
	 * Returns the value of the '<em><b>From PE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From PE</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From PE</em>' reference.
	 * @see #setFromPE(ProcessingElement)
	 * @see placer.PlacerPackage#getTransmissionMapping_FromPE()
	 * @model required="true"
	 * @generated
	 */
	ProcessingElement getFromPE();

	/**
	 * Sets the value of the '{@link placer.TransmissionMapping#getFromPE <em>From PE</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From PE</em>' reference.
	 * @see #getFromPE()
	 * @generated
	 */
	void setFromPE(ProcessingElement value);

	/**
	 * Returns the value of the '<em><b>To PE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To PE</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To PE</em>' reference.
	 * @see #setToPE(ProcessingElement)
	 * @see placer.PlacerPackage#getTransmissionMapping_ToPE()
	 * @model required="true"
	 * @generated
	 */
	ProcessingElement getToPE();

	/**
	 * Sets the value of the '{@link placer.TransmissionMapping#getToPE <em>To PE</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To PE</em>' reference.
	 * @see #getToPE()
	 * @generated
	 */
	void setToPE(ProcessingElement value);

	/**
	 * Returns the value of the '<em><b>From Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Task</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Task</em>' attribute.
	 * @see #setFromTask(String)
	 * @see placer.PlacerPackage#getTransmissionMapping_FromTask()
	 * @model required="true"
	 * @generated
	 */
	String getFromTask();

	/**
	 * Sets the value of the '{@link placer.TransmissionMapping#getFromTask <em>From Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Task</em>' attribute.
	 * @see #getFromTask()
	 * @generated
	 */
	void setFromTask(String value);

	/**
	 * Returns the value of the '<em><b>To Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Task</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Task</em>' attribute.
	 * @see #setToTask(String)
	 * @see placer.PlacerPackage#getTransmissionMapping_ToTask()
	 * @model required="true"
	 * @generated
	 */
	String getToTask();

	/**
	 * Sets the value of the '{@link placer.TransmissionMapping#getToTask <em>To Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Task</em>' attribute.
	 * @see #getToTask()
	 * @generated
	 */
	void setToTask(String value);

	/**
	 * Returns the value of the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' reference.
	 * @see #setBus(Bus)
	 * @see placer.PlacerPackage#getTransmissionMapping_Bus()
	 * @model required="true"
	 * @generated
	 */
	Bus getBus();

	/**
	 * Sets the value of the '{@link placer.TransmissionMapping#getBus <em>Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus</em>' reference.
	 * @see #getBus()
	 * @generated
	 */
	void setBus(Bus value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(int)
	 * @see placer.PlacerPackage#getTransmissionMapping_Start()
	 * @model required="true"
	 * @generated
	 */
	int getStart();

	/**
	 * Sets the value of the '{@link placer.TransmissionMapping#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(int value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see placer.PlacerPackage#getTransmissionMapping_Duration()
	 * @model required="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link placer.TransmissionMapping#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(int)
	 * @see placer.PlacerPackage#getTransmissionMapping_End()
	 * @model required="true"
	 * @generated
	 */
	int getEnd();

	/**
	 * Sets the value of the '{@link placer.TransmissionMapping#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(int value);

} // TransmissionMapping
