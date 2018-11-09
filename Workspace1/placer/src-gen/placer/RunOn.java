/**
 */
package placer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.RunOn#getYes <em>Yes</em>}</li>
 *   <li>{@link placer.RunOn#getProcessingElementRunOn <em>Processing Element Run On</em>}</li>
 *   <li>{@link placer.RunOn#getTaskRunOn <em>Task Run On</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getRunOn()
 * @model
 * @generated
 */
public interface RunOn extends ConstraintOrObjective {
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
	 * @see placer.PlacerPackage#getRunOn_Yes()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject" required="true"
	 * @generated
	 */
	Boolean getYes();

	/**
	 * Sets the value of the '{@link placer.RunOn#getYes <em>Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yes</em>' attribute.
	 * @see #getYes()
	 * @generated
	 */
	void setYes(Boolean value);

	/**
	 * Returns the value of the '<em><b>Processing Element Run On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Element Run On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Element Run On</em>' reference.
	 * @see #setProcessingElementRunOn(ProcessingElement)
	 * @see placer.PlacerPackage#getRunOn_ProcessingElementRunOn()
	 * @model required="true"
	 * @generated
	 */
	ProcessingElement getProcessingElementRunOn();

	/**
	 * Sets the value of the '{@link placer.RunOn#getProcessingElementRunOn <em>Processing Element Run On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Element Run On</em>' reference.
	 * @see #getProcessingElementRunOn()
	 * @generated
	 */
	void setProcessingElementRunOn(ProcessingElement value);

	/**
	 * Returns the value of the '<em><b>Task Run On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Run On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Run On</em>' reference.
	 * @see #setTaskRunOn(Task)
	 * @see placer.PlacerPackage#getRunOn_TaskRunOn()
	 * @model required="true"
	 * @generated
	 */
	Task getTaskRunOn();

	/**
	 * Sets the value of the '{@link placer.RunOn#getTaskRunOn <em>Task Run On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Run On</em>' reference.
	 * @see #getTaskRunOn()
	 * @generated
	 */
	void setTaskRunOn(Task value);

} // RunOn
