/**
 */
package placer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.Transmission#getFrom <em>From</em>}</li>
 *   <li>{@link placer.Transmission#getTo <em>To</em>}</li>
 *   <li>{@link placer.Transmission#getAmount <em>Amount</em>}</li>
 *   <li>{@link placer.Transmission#getTiming <em>Timing</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getTransmission()
 * @model
 * @generated
 */
public interface Transmission extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Task)
	 * @see placer.PlacerPackage#getTransmission_From()
	 * @model required="true"
	 * @generated
	 */
	Task getFrom();

	/**
	 * Sets the value of the '{@link placer.Transmission#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Task value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Task)
	 * @see placer.PlacerPackage#getTransmission_To()
	 * @model required="true"
	 * @generated
	 */
	Task getTo();

	/**
	 * Sets the value of the '{@link placer.Transmission#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Task value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(int)
	 * @see placer.PlacerPackage#getTransmission_Amount()
	 * @model required="true"
	 * @generated
	 */
	int getAmount();

	/**
	 * Sets the value of the '{@link placer.Transmission#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(int value);

	/**
	 * Returns the value of the '<em><b>Timing</b></em>' attribute.
	 * The default value is <code>"Sticky"</code>.
	 * The literals are from the enumeration {@link placer.TimingObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing</em>' attribute.
	 * @see placer.TimingObject
	 * @see #setTiming(TimingObject)
	 * @see placer.PlacerPackage#getTransmission_Timing()
	 * @model default="Sticky" dataType="placer.TimingObject" required="true"
	 * @generated
	 */
	TimingObject getTiming();

	/**
	 * Sets the value of the '{@link placer.Transmission#getTiming <em>Timing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing</em>' attribute.
	 * @see placer.TimingObject
	 * @see #getTiming()
	 * @generated
	 */
	void setTiming(TimingObject value);

} // Transmission
