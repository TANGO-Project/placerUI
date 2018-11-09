/**
 */
package placer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import placer.GlobalInformation;
import placer.PlacerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.GlobalInformationImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link placer.impl.GlobalInformationImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link placer.impl.GlobalInformationImpl#getDataUnit <em>Data Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalInformationImpl extends MinimalEObjectImpl.Container implements GlobalInformation {
	/**
	 * The default value of the '{@link #getInformation() <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected String information = INFORMATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected String timeUnit = TIME_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataUnit() <em>Data Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataUnit() <em>Data Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataUnit()
	 * @generated
	 * @ordered
	 */
	protected String dataUnit = DATA_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.GLOBAL_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInformation() {
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformation(String newInformation) {
		String oldInformation = information;
		information = newInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.GLOBAL_INFORMATION__INFORMATION,
					oldInformation, information));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeUnit() {
		return timeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUnit(String newTimeUnit) {
		String oldTimeUnit = timeUnit;
		timeUnit = newTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.GLOBAL_INFORMATION__TIME_UNIT,
					oldTimeUnit, timeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataUnit() {
		return dataUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataUnit(String newDataUnit) {
		String oldDataUnit = dataUnit;
		dataUnit = newDataUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.GLOBAL_INFORMATION__DATA_UNIT,
					oldDataUnit, dataUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlacerPackage.GLOBAL_INFORMATION__INFORMATION:
			return getInformation();
		case PlacerPackage.GLOBAL_INFORMATION__TIME_UNIT:
			return getTimeUnit();
		case PlacerPackage.GLOBAL_INFORMATION__DATA_UNIT:
			return getDataUnit();
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
		case PlacerPackage.GLOBAL_INFORMATION__INFORMATION:
			setInformation((String) newValue);
			return;
		case PlacerPackage.GLOBAL_INFORMATION__TIME_UNIT:
			setTimeUnit((String) newValue);
			return;
		case PlacerPackage.GLOBAL_INFORMATION__DATA_UNIT:
			setDataUnit((String) newValue);
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
		case PlacerPackage.GLOBAL_INFORMATION__INFORMATION:
			setInformation(INFORMATION_EDEFAULT);
			return;
		case PlacerPackage.GLOBAL_INFORMATION__TIME_UNIT:
			setTimeUnit(TIME_UNIT_EDEFAULT);
			return;
		case PlacerPackage.GLOBAL_INFORMATION__DATA_UNIT:
			setDataUnit(DATA_UNIT_EDEFAULT);
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
		case PlacerPackage.GLOBAL_INFORMATION__INFORMATION:
			return INFORMATION_EDEFAULT == null ? information != null : !INFORMATION_EDEFAULT.equals(information);
		case PlacerPackage.GLOBAL_INFORMATION__TIME_UNIT:
			return TIME_UNIT_EDEFAULT == null ? timeUnit != null : !TIME_UNIT_EDEFAULT.equals(timeUnit);
		case PlacerPackage.GLOBAL_INFORMATION__DATA_UNIT:
			return DATA_UNIT_EDEFAULT == null ? dataUnit != null : !DATA_UNIT_EDEFAULT.equals(dataUnit);
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
		result.append(" (information: ");
		result.append(information);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(", dataUnit: ");
		result.append(dataUnit);
		result.append(')');
		return result.toString();
	}

} //GlobalInformationImpl
