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

import placer.MainPlacerOut;
import placer.Mapping;
import placer.PlacerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Placer Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.MainPlacerOutImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link placer.impl.MainPlacerOutImpl#getJsonFormat <em>Json Format</em>}</li>
 *   <li>{@link placer.impl.MainPlacerOutImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link placer.impl.MainPlacerOutImpl#getDataUnit <em>Data Unit</em>}</li>
 *   <li>{@link placer.impl.MainPlacerOutImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link placer.impl.MainPlacerOutImpl#getFilePath <em>File Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainPlacerOutImpl extends MinimalEObjectImpl.Container implements MainPlacerOut {
	/**
	 * The default value of the '{@link #getInfo() <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected String info = INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getJsonFormat() <em>Json Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String JSON_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJsonFormat() <em>Json Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonFormat()
	 * @generated
	 * @ordered
	 */
	protected String jsonFormat = JSON_FORMAT_EDEFAULT;

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
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mappings;

	/**
	 * The default value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected String filePath = FILE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainPlacerOutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.MAIN_PLACER_OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(String newInfo) {
		String oldInfo = info;
		info = newInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.MAIN_PLACER_OUT__INFO, oldInfo, info));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJsonFormat() {
		return jsonFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsonFormat(String newJsonFormat) {
		String oldJsonFormat = jsonFormat;
		jsonFormat = newJsonFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.MAIN_PLACER_OUT__JSON_FORMAT,
					oldJsonFormat, jsonFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.MAIN_PLACER_OUT__TIME_UNIT, oldTimeUnit,
					timeUnit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.MAIN_PLACER_OUT__DATA_UNIT, oldDataUnit,
					dataUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<Mapping>(Mapping.class, this,
					PlacerPackage.MAIN_PLACER_OUT__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilePath(String newFilePath) {
		String oldFilePath = filePath;
		filePath = newFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.MAIN_PLACER_OUT__FILE_PATH, oldFilePath,
					filePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PlacerPackage.MAIN_PLACER_OUT__MAPPINGS:
			return ((InternalEList<?>) getMappings()).basicRemove(otherEnd, msgs);
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
		case PlacerPackage.MAIN_PLACER_OUT__INFO:
			return getInfo();
		case PlacerPackage.MAIN_PLACER_OUT__JSON_FORMAT:
			return getJsonFormat();
		case PlacerPackage.MAIN_PLACER_OUT__TIME_UNIT:
			return getTimeUnit();
		case PlacerPackage.MAIN_PLACER_OUT__DATA_UNIT:
			return getDataUnit();
		case PlacerPackage.MAIN_PLACER_OUT__MAPPINGS:
			return getMappings();
		case PlacerPackage.MAIN_PLACER_OUT__FILE_PATH:
			return getFilePath();
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
		case PlacerPackage.MAIN_PLACER_OUT__INFO:
			setInfo((String) newValue);
			return;
		case PlacerPackage.MAIN_PLACER_OUT__JSON_FORMAT:
			setJsonFormat((String) newValue);
			return;
		case PlacerPackage.MAIN_PLACER_OUT__TIME_UNIT:
			setTimeUnit((String) newValue);
			return;
		case PlacerPackage.MAIN_PLACER_OUT__DATA_UNIT:
			setDataUnit((String) newValue);
			return;
		case PlacerPackage.MAIN_PLACER_OUT__MAPPINGS:
			getMappings().clear();
			getMappings().addAll((Collection<? extends Mapping>) newValue);
			return;
		case PlacerPackage.MAIN_PLACER_OUT__FILE_PATH:
			setFilePath((String) newValue);
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
		case PlacerPackage.MAIN_PLACER_OUT__INFO:
			setInfo(INFO_EDEFAULT);
			return;
		case PlacerPackage.MAIN_PLACER_OUT__JSON_FORMAT:
			setJsonFormat(JSON_FORMAT_EDEFAULT);
			return;
		case PlacerPackage.MAIN_PLACER_OUT__TIME_UNIT:
			setTimeUnit(TIME_UNIT_EDEFAULT);
			return;
		case PlacerPackage.MAIN_PLACER_OUT__DATA_UNIT:
			setDataUnit(DATA_UNIT_EDEFAULT);
			return;
		case PlacerPackage.MAIN_PLACER_OUT__MAPPINGS:
			getMappings().clear();
			return;
		case PlacerPackage.MAIN_PLACER_OUT__FILE_PATH:
			setFilePath(FILE_PATH_EDEFAULT);
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
		case PlacerPackage.MAIN_PLACER_OUT__INFO:
			return INFO_EDEFAULT == null ? info != null : !INFO_EDEFAULT.equals(info);
		case PlacerPackage.MAIN_PLACER_OUT__JSON_FORMAT:
			return JSON_FORMAT_EDEFAULT == null ? jsonFormat != null : !JSON_FORMAT_EDEFAULT.equals(jsonFormat);
		case PlacerPackage.MAIN_PLACER_OUT__TIME_UNIT:
			return TIME_UNIT_EDEFAULT == null ? timeUnit != null : !TIME_UNIT_EDEFAULT.equals(timeUnit);
		case PlacerPackage.MAIN_PLACER_OUT__DATA_UNIT:
			return DATA_UNIT_EDEFAULT == null ? dataUnit != null : !DATA_UNIT_EDEFAULT.equals(dataUnit);
		case PlacerPackage.MAIN_PLACER_OUT__MAPPINGS:
			return mappings != null && !mappings.isEmpty();
		case PlacerPackage.MAIN_PLACER_OUT__FILE_PATH:
			return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
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
		result.append(" (info: ");
		result.append(info);
		result.append(", jsonFormat: ");
		result.append(jsonFormat);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(", dataUnit: ");
		result.append(dataUnit);
		result.append(", filePath: ");
		result.append(filePath);
		result.append(')');
		return result.toString();
	}

} //MainPlacerOutImpl
