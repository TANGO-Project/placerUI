/**
 */
package placer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Same PE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.SamePE#getYes <em>Yes</em>}</li>
 *   <li>{@link placer.SamePE#getTaskSamePE <em>Task Same PE</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getSamePE()
 * @model
 * @generated
 */
public interface SamePE extends ConstraintOrObjective {
	/**
	 * Returns the value of the '<em><b>Yes</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yes</em>' attribute.
	 * @see #setYes(Boolean)
	 * @see placer.PlacerPackage#getSamePE_Yes()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject" required="true"
	 * @generated
	 */
	Boolean getYes();

	/**
	 * Sets the value of the '{@link placer.SamePE#getYes <em>Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yes</em>' attribute.
	 * @see #getYes()
	 * @generated
	 */
	void setYes(Boolean value);

	/**
	 * Returns the value of the '<em><b>Task Same PE</b></em>' reference list.
	 * The list contents are of type {@link placer.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Same PE</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Same PE</em>' reference list.
	 * @see placer.PlacerPackage#getSamePE_TaskSamePE()
	 * @model lower="2"
	 * @generated
	 */
	EList<Task> getTaskSamePE();

} // SamePE
