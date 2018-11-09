/**
 */
package placer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import placer.EnergyCap;
import placer.PlacerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy Cap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.EnergyCapImpl#getEnergyCap <em>Energy Cap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergyCapImpl extends MinimalEObjectImpl.Container implements EnergyCap {
	/**
	 * The default value of the '{@link #getEnergyCap() <em>Energy Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyCap()
	 * @generated
	 * @ordered
	 */
	protected static final int ENERGY_CAP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnergyCap() <em>Energy Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyCap()
	 * @generated
	 * @ordered
	 */
	protected int energyCap = ENERGY_CAP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyCapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.ENERGY_CAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnergyCap() {
		return energyCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyCap(int newEnergyCap) {
		int oldEnergyCap = energyCap;
		energyCap = newEnergyCap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.ENERGY_CAP__ENERGY_CAP, oldEnergyCap,
					energyCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlacerPackage.ENERGY_CAP__ENERGY_CAP:
			return getEnergyCap();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PlacerPackage.ENERGY_CAP__ENERGY_CAP:
			setEnergyCap((Integer) newValue);
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
		case PlacerPackage.ENERGY_CAP__ENERGY_CAP:
			setEnergyCap(ENERGY_CAP_EDEFAULT);
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
		case PlacerPackage.ENERGY_CAP__ENERGY_CAP:
			return energyCap != ENERGY_CAP_EDEFAULT;
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
		result.append(" (energyCap: ");
		result.append(energyCap);
		result.append(')');
		return result.toString();
	}

} //EnergyCapImpl
