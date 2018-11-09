/**
 */
package placer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.Connection#getConnectionTo <em>Connection To</em>}</li>
 *   <li>{@link placer.Connection#getConnectionFrom <em>Connection From</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection To</em>' reference.
	 * @see #setConnectionTo(ProcessingElement)
	 * @see placer.PlacerPackage#getConnection_ConnectionTo()
	 * @model required="true"
	 * @generated
	 */
	ProcessingElement getConnectionTo();

	/**
	 * Sets the value of the '{@link placer.Connection#getConnectionTo <em>Connection To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection To</em>' reference.
	 * @see #getConnectionTo()
	 * @generated
	 */
	void setConnectionTo(ProcessingElement value);

	/**
	 * Returns the value of the '<em><b>Connection From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection From</em>' reference.
	 * @see #setConnectionFrom(Bus)
	 * @see placer.PlacerPackage#getConnection_ConnectionFrom()
	 * @model required="true"
	 * @generated
	 */
	Bus getConnectionFrom();

	/**
	 * Sets the value of the '{@link placer.Connection#getConnectionFrom <em>Connection From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection From</em>' reference.
	 * @see #getConnectionFrom()
	 * @generated
	 */
	void setConnectionFrom(Bus value);

} // Connection
