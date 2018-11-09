/**
 */
package placer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Function Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.SharedFunctionMapping#getSharedImplem <em>Shared Implem</em>}</li>
 *   <li>{@link placer.SharedFunctionMapping#getNbInstance <em>Nb Instance</em>}</li>
 *   <li>{@link placer.SharedFunctionMapping#getHost <em>Host</em>}</li>
 *   <li>{@link placer.SharedFunctionMapping#getNameValues <em>Name Values</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getSharedFunctionMapping()
 * @model
 * @generated
 */
public interface SharedFunctionMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Shared Implem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Implem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Implem</em>' attribute.
	 * @see #setSharedImplem(String)
	 * @see placer.PlacerPackage#getSharedFunctionMapping_SharedImplem()
	 * @model required="true"
	 * @generated
	 */
	String getSharedImplem();

	/**
	 * Sets the value of the '{@link placer.SharedFunctionMapping#getSharedImplem <em>Shared Implem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Implem</em>' attribute.
	 * @see #getSharedImplem()
	 * @generated
	 */
	void setSharedImplem(String value);

	/**
	 * Returns the value of the '<em><b>Nb Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Instance</em>' attribute.
	 * @see #setNbInstance(int)
	 * @see placer.PlacerPackage#getSharedFunctionMapping_NbInstance()
	 * @model required="true"
	 * @generated
	 */
	int getNbInstance();

	/**
	 * Sets the value of the '{@link placer.SharedFunctionMapping#getNbInstance <em>Nb Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Instance</em>' attribute.
	 * @see #getNbInstance()
	 * @generated
	 */
	void setNbInstance(int value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see placer.PlacerPackage#getSharedFunctionMapping_Host()
	 * @model required="true"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link placer.SharedFunctionMapping#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Name Values</b></em>' containment reference list.
	 * The list contents are of type {@link placer.NameValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Values</em>' containment reference list.
	 * @see placer.PlacerPackage#getSharedFunctionMapping_NameValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<NameValue> getNameValues();

} // SharedFunctionMapping
