/**
 */
package placer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Must Be Used</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.MustBeUsed#getYes <em>Yes</em>}</li>
 *   <li>{@link placer.MustBeUsed#getProcessingElementMustBeUsed <em>Processing Element Must Be Used</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getMustBeUsed()
 * @model
 * @generated
 */
public interface MustBeUsed extends ConstraintOrObjective {
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
	 * @see placer.PlacerPackage#getMustBeUsed_Yes()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject" required="true"
	 * @generated
	 */
	Boolean getYes();

	/**
	 * Sets the value of the '{@link placer.MustBeUsed#getYes <em>Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yes</em>' attribute.
	 * @see #getYes()
	 * @generated
	 */
	void setYes(Boolean value);

	/**
	 * Returns the value of the '<em><b>Processing Element Must Be Used</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Element Must Be Used</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Element Must Be Used</em>' reference.
	 * @see #setProcessingElementMustBeUsed(ProcessingElement)
	 * @see placer.PlacerPackage#getMustBeUsed_ProcessingElementMustBeUsed()
	 * @model required="true"
	 * @generated
	 */
	ProcessingElement getProcessingElementMustBeUsed();

	/**
	 * Sets the value of the '{@link placer.MustBeUsed#getProcessingElementMustBeUsed <em>Processing Element Must Be Used</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Element Must Be Used</em>' reference.
	 * @see #getProcessingElementMustBeUsed()
	 * @generated
	 */
	void setProcessingElementMustBeUsed(ProcessingElement value);

} // MustBeUsed
