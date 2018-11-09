/**
 */
package placer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.MappingGoal#getSimpleObjective <em>Simple Objective</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getMappingGoal()
 * @model abstract="true"
 * @generated
 */
public interface MappingGoal extends EObject {

	/**
	 * Returns the value of the '<em><b>Simple Objective</b></em>' attribute.
	 * The default value is <code>"minEnergy"</code>.
	 * The literals are from the enumeration {@link placer.SimpleGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Objective</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Objective</em>' attribute.
	 * @see placer.SimpleGoal
	 * @see #setSimpleObjective(SimpleGoal)
	 * @see placer.PlacerPackage#getMappingGoal_SimpleObjective()
	 * @model default="minEnergy" dataType="placer.SimpleGoal" required="true"
	 * @generated
	 */
	SimpleGoal getSimpleObjective();

	/**
	 * Sets the value of the '{@link placer.MappingGoal#getSimpleObjective <em>Simple Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Objective</em>' attribute.
	 * @see placer.SimpleGoal
	 * @see #getSimpleObjective()
	 * @generated
	 */
	void setSimpleObjective(SimpleGoal value);

} // MappingGoal
