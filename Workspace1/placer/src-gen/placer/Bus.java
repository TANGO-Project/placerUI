/**
 */
package placer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.Bus#getName <em>Name</em>}</li>
 *   <li>{@link placer.Bus#getTimeUnitPerDataUnit <em>Time Unit Per Data Unit</em>}</li>
 *   <li>{@link placer.Bus#getLatency <em>Latency</em>}</li>
 *   <li>{@link placer.Bus#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getBus()
 * @model
 * @generated
 */
public interface Bus extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see placer.PlacerPackage#getBus_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link placer.Bus#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Time Unit Per Data Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit Per Data Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit Per Data Unit</em>' attribute.
	 * @see #setTimeUnitPerDataUnit(int)
	 * @see placer.PlacerPackage#getBus_TimeUnitPerDataUnit()
	 * @model required="true"
	 * @generated
	 */
	int getTimeUnitPerDataUnit();

	/**
	 * Sets the value of the '{@link placer.Bus#getTimeUnitPerDataUnit <em>Time Unit Per Data Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit Per Data Unit</em>' attribute.
	 * @see #getTimeUnitPerDataUnit()
	 * @generated
	 */
	void setTimeUnitPerDataUnit(int value);

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' attribute.
	 * @see #setLatency(int)
	 * @see placer.PlacerPackage#getBus_Latency()
	 * @model required="true"
	 * @generated
	 */
	int getLatency();

	/**
	 * Sets the value of the '{@link placer.Bus#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' attribute.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(int value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link placer.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see placer.PlacerPackage#getBus_Connections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // Bus
