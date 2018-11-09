/**
 */
package placer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import placer.Bus;
import placer.Connection;
import placer.PlacerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.BusImpl#getName <em>Name</em>}</li>
 *   <li>{@link placer.impl.BusImpl#getTimeUnitPerDataUnit <em>Time Unit Per Data Unit</em>}</li>
 *   <li>{@link placer.impl.BusImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link placer.impl.BusImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusImpl extends MinimalEObjectImpl.Container implements Bus {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeUnitPerDataUnit() <em>Time Unit Per Data Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnitPerDataUnit()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_UNIT_PER_DATA_UNIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeUnitPerDataUnit() <em>Time Unit Per Data Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnitPerDataUnit()
	 * @generated
	 * @ordered
	 */
	protected int timeUnitPerDataUnit = TIME_UNIT_PER_DATA_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected static final int LATENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected int latency = LATENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.BUS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeUnitPerDataUnit() {
		return timeUnitPerDataUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUnitPerDataUnit(int newTimeUnitPerDataUnit) {
		int oldTimeUnitPerDataUnit = timeUnitPerDataUnit;
		timeUnitPerDataUnit = newTimeUnitPerDataUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.BUS__TIME_UNIT_PER_DATA_UNIT,
					oldTimeUnitPerDataUnit, timeUnitPerDataUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(int newLatency) {
		int oldLatency = latency;
		latency = newLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.BUS__LATENCY, oldLatency, latency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this,
					PlacerPackage.BUS__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PlacerPackage.BUS__CONNECTIONS:
			return ((InternalEList<?>) getConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlacerPackage.BUS__NAME:
			return getName();
		case PlacerPackage.BUS__TIME_UNIT_PER_DATA_UNIT:
			return getTimeUnitPerDataUnit();
		case PlacerPackage.BUS__LATENCY:
			return getLatency();
		case PlacerPackage.BUS__CONNECTIONS:
			return getConnections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PlacerPackage.BUS__NAME:
			setName((String) newValue);
			return;
		case PlacerPackage.BUS__TIME_UNIT_PER_DATA_UNIT:
			setTimeUnitPerDataUnit((Integer) newValue);
			return;
		case PlacerPackage.BUS__LATENCY:
			setLatency((Integer) newValue);
			return;
		case PlacerPackage.BUS__CONNECTIONS:
			getConnections().clear();
			getConnections().addAll((Collection<? extends Connection>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PlacerPackage.BUS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PlacerPackage.BUS__TIME_UNIT_PER_DATA_UNIT:
			setTimeUnitPerDataUnit(TIME_UNIT_PER_DATA_UNIT_EDEFAULT);
			return;
		case PlacerPackage.BUS__LATENCY:
			setLatency(LATENCY_EDEFAULT);
			return;
		case PlacerPackage.BUS__CONNECTIONS:
			getConnections().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PlacerPackage.BUS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PlacerPackage.BUS__TIME_UNIT_PER_DATA_UNIT:
			return timeUnitPerDataUnit != TIME_UNIT_PER_DATA_UNIT_EDEFAULT;
		case PlacerPackage.BUS__LATENCY:
			return latency != LATENCY_EDEFAULT;
		case PlacerPackage.BUS__CONNECTIONS:
			return connections != null && !connections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", timeUnitPerDataUnit: ");
		result.append(timeUnitPerDataUnit);
		result.append(", latency: ");
		result.append(latency);
		result.append(')');
		return result.toString();
	}

} //BusImpl
