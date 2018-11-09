/**
 */
package placer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Objective Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.MultiObjectiveGoal#getSimpleObjective2 <em>Simple Objective2</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getMultiObjectiveGoal()
 * @model
 * @generated
 */
public interface MultiObjectiveGoal extends MappingGoal {
	/**
	 * Returns the value of the '<em><b>Simple Objective2</b></em>' attribute.
	 * The default value is <code>"minMakespan"</code>.
	 * The literals are from the enumeration {@link placer.SimpleGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Objective2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Objective2</em>' attribute.
	 * @see placer.SimpleGoal
	 * @see #setSimpleObjective2(SimpleGoal)
	 * @see placer.PlacerPackage#getMultiObjectiveGoal_SimpleObjective2()
	 * @model default="minMakespan" dataType="placer.SimpleGoal" required="true"
	 * @generated
	 */
	SimpleGoal getSimpleObjective2();

	/**
	 * Sets the value of the '{@link placer.MultiObjectiveGoal#getSimpleObjective2 <em>Simple Objective2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Objective2</em>' attribute.
	 * @see placer.SimpleGoal
	 * @see #getSimpleObjective2()
	 * @generated
	 */
	void setSimpleObjective2(SimpleGoal value);

} // MultiObjectiveGoal
