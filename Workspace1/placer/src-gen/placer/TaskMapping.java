/**
 */
package placer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.TaskMapping#getStart <em>Start</em>}</li>
 *   <li>{@link placer.TaskMapping#getDuration <em>Duration</em>}</li>
 *   <li>{@link placer.TaskMapping#getEnd <em>End</em>}</li>
 *   <li>{@link placer.TaskMapping#getNameValues <em>Name Values</em>}</li>
 *   <li>{@link placer.TaskMapping#getProcessingElement <em>Processing Element</em>}</li>
 *   <li>{@link placer.TaskMapping#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link placer.TaskMapping#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getTaskMapping()
 * @model
 * @generated
 */
public interface TaskMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' attribute.
	 * @see #setTask(String)
	 * @see placer.PlacerPackage#getTaskMapping_Task()
	 * @model required="true"
	 * @generated
	 */
	String getTask();

	/**
	 * Sets the value of the '{@link placer.TaskMapping#getTask <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' attribute.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(String value);

	/**
	 * Returns the value of the '<em><b>Processing Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Element</em>' reference.
	 * @see #setProcessingElement(ProcessingElement)
	 * @see placer.PlacerPackage#getTaskMapping_ProcessingElement()
	 * @model required="true"
	 * @generated
	 */
	ProcessingElement getProcessingElement();

	/**
	 * Sets the value of the '{@link placer.TaskMapping#getProcessingElement <em>Processing Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Element</em>' reference.
	 * @see #getProcessingElement()
	 * @generated
	 */
	void setProcessingElement(ProcessingElement value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference.
	 * @see #setImplementation(Implementation)
	 * @see placer.PlacerPackage#getTaskMapping_Implementation()
	 * @model required="true"
	 * @generated
	 */
	Implementation getImplementation();

	/**
	 * Sets the value of the '{@link placer.TaskMapping#getImplementation <em>Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(Implementation value);

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
	 * @see placer.PlacerPackage#getTaskMapping_Start()
	 * @model required="true"
	 * @generated
	 */
	int getStart();

	/**
	 * Sets the value of the '{@link placer.TaskMapping#getStart <em>Start</em>}' attribute.
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
	 * @see placer.PlacerPackage#getTaskMapping_Duration()
	 * @model required="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link placer.TaskMapping#getDuration <em>Duration</em>}' attribute.
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
	 * @see placer.PlacerPackage#getTaskMapping_End()
	 * @model required="true"
	 * @generated
	 */
	int getEnd();

	/**
	 * Sets the value of the '{@link placer.TaskMapping#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(int value);

	/**
	 * Returns the value of the '<em><b>Name Values</b></em>' containment reference list.
	 * The list contents are of type {@link placer.NameValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Values</em>' containment reference list.
	 * @see placer.PlacerPackage#getTaskMapping_NameValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<NameValue> getNameValues();

} // TaskMapping
