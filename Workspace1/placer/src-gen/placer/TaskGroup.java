/**
 */
package placer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.TaskGroup#getNbInstances <em>Nb Instances</em>}</li>
 *   <li>{@link placer.TaskGroup#getTaskTaskGroups <em>Task Task Groups</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getTaskGroup()
 * @model
 * @generated
 */
public interface TaskGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Instances</em>' attribute.
	 * @see #setNbInstances(int)
	 * @see placer.PlacerPackage#getTaskGroup_NbInstances()
	 * @model required="true"
	 * @generated
	 */
	int getNbInstances();

	/**
	 * Sets the value of the '{@link placer.TaskGroup#getNbInstances <em>Nb Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Instances</em>' attribute.
	 * @see #getNbInstances()
	 * @generated
	 */
	void setNbInstances(int value);

	/**
	 * Returns the value of the '<em><b>Task Task Groups</b></em>' containment reference list.
	 * The list contents are of type {@link placer.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Task Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Task Groups</em>' containment reference list.
	 * @see placer.PlacerPackage#getTaskGroup_TaskTaskGroups()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getTaskTaskGroups();

} // TaskGroup
