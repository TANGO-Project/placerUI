/**
 */
package placer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.Implementation#getName <em>Name</em>}</li>
 *   <li>{@link placer.Implementation#getDuration <em>Duration</em>}</li>
 *   <li>{@link placer.Implementation#getTarget <em>Target</em>}</li>
 *   <li>{@link placer.Implementation#getComputationMemory <em>Computation Memory</em>}</li>
 *   <li>{@link placer.Implementation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link placer.Implementation#getResourcesUsages <em>Resources Usages</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getImplementation()
 * @model
 * @generated
 */
public interface Implementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see placer.PlacerPackage#getImplementation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link placer.Implementation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see placer.PlacerPackage#getImplementation_Duration()
	 * @model required="true"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link placer.Implementation#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link placer.Parameters}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see placer.PlacerPackage#getImplementation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameters> getParameters();

	/**
	 * Returns the value of the '<em><b>Resources Usages</b></em>' containment reference list.
	 * The list contents are of type {@link placer.ResourcesUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources Usages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources Usages</em>' containment reference list.
	 * @see placer.PlacerPackage#getImplementation_ResourcesUsages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourcesUsage> getResourcesUsages();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ProcessingElementClass)
	 * @see placer.PlacerPackage#getImplementation_Target()
	 * @model required="true"
	 * @generated
	 */
	ProcessingElementClass getTarget();

	/**
	 * Sets the value of the '{@link placer.Implementation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ProcessingElementClass value);

	/**
	 * Returns the value of the '<em><b>Computation Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computation Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computation Memory</em>' attribute.
	 * @see #setComputationMemory(String)
	 * @see placer.PlacerPackage#getImplementation_ComputationMemory()
	 * @model required="true"
	 * @generated
	 */
	String getComputationMemory();

	/**
	 * Sets the value of the '{@link placer.Implementation#getComputationMemory <em>Computation Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computation Memory</em>' attribute.
	 * @see #getComputationMemory()
	 * @generated
	 */
	void setComputationMemory(String value);

} // Implementation
