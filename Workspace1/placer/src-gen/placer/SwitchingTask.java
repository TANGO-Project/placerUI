/**
 */
package placer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switching Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.SwitchingTask#getSwitchingDelay <em>Switching Delay</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getSwitchingTask()
 * @model
 * @generated
 */
public interface SwitchingTask extends ProcessingElementClass {
	/**
	 * Returns the value of the '<em><b>Switching Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switching Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switching Delay</em>' attribute.
	 * @see #setSwitchingDelay(int)
	 * @see placer.PlacerPackage#getSwitchingTask_SwitchingDelay()
	 * @model required="true"
	 * @generated
	 */
	int getSwitchingDelay();

	/**
	 * Sets the value of the '{@link placer.SwitchingTask#getSwitchingDelay <em>Switching Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switching Delay</em>' attribute.
	 * @see #getSwitchingDelay()
	 * @generated
	 */
	void setSwitchingDelay(int value);

} // SwitchingTask
