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

import placer.Mapping;
import placer.PlacerPackage;
import placer.SharedFunctionMapping;
import placer.TaskMapping;
import placer.TransmissionMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.MappingImpl#getHardwareName <em>Hardware Name</em>}</li>
 *   <li>{@link placer.impl.MappingImpl#getMakespan <em>Makespan</em>}</li>
 *   <li>{@link placer.impl.MappingImpl#getEnergy <em>Energy</em>}</li>
 *   <li>{@link placer.impl.MappingImpl#getTaskMappings <em>Task Mappings</em>}</li>
 *   <li>{@link placer.impl.MappingImpl#getSharedFunctionMappings <em>Shared Function Mappings</em>}</li>
 *   <li>{@link placer.impl.MappingImpl#getTransmissionMappings <em>Transmission Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping {
	/**
	 * The default value of the '{@link #getHardwareName() <em>Hardware Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareName()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDWARE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardwareName() <em>Hardware Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareName()
	 * @generated
	 * @ordered
	 */
	protected String hardwareName = HARDWARE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMakespan() <em>Makespan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMakespan()
	 * @generated
	 * @ordered
	 */
	protected static final int MAKESPAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMakespan() <em>Makespan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMakespan()
	 * @generated
	 * @ordered
	 */
	protected int makespan = MAKESPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnergy() <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergy()
	 * @generated
	 * @ordered
	 */
	protected static final int ENERGY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnergy() <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergy()
	 * @generated
	 * @ordered
	 */
	protected int energy = ENERGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaskMappings() <em>Task Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskMapping> taskMappings;

	/**
	 * The cached value of the '{@link #getSharedFunctionMappings() <em>Shared Function Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedFunctionMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedFunctionMapping> sharedFunctionMappings;

	/**
	 * The cached value of the '{@link #getTransmissionMappings() <em>Transmission Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionMapping> transmissionMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHardwareName() {
		return hardwareName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareName(String newHardwareName) {
		String oldHardwareName = hardwareName;
		hardwareName = newHardwareName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.MAPPING__HARDWARE_NAME, oldHardwareName,
					hardwareName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMakespan() {
		return makespan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMakespan(int newMakespan) {
		int oldMakespan = makespan;
		makespan = newMakespan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.MAPPING__MAKESPAN, oldMakespan,
					makespan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnergy() {
		return energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergy(int newEnergy) {
		int oldEnergy = energy;
		energy = newEnergy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.MAPPING__ENERGY, oldEnergy, energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskMapping> getTaskMappings() {
		if (taskMappings == null) {
			taskMappings = new EObjectContainmentEList<TaskMapping>(TaskMapping.class, this,
					PlacerPackage.MAPPING__TASK_MAPPINGS);
		}
		return taskMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedFunctionMapping> getSharedFunctionMappings() {
		if (sharedFunctionMappings == null) {
			sharedFunctionMappings = new EObjectContainmentEList<SharedFunctionMapping>(SharedFunctionMapping.class,
					this, PlacerPackage.MAPPING__SHARED_FUNCTION_MAPPINGS);
		}
		return sharedFunctionMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionMapping> getTransmissionMappings() {
		if (transmissionMappings == null) {
			transmissionMappings = new EObjectContainmentEList<TransmissionMapping>(TransmissionMapping.class, this,
					PlacerPackage.MAPPING__TRANSMISSION_MAPPINGS);
		}
		return transmissionMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PlacerPackage.MAPPING__TASK_MAPPINGS:
			return ((InternalEList<?>) getTaskMappings()).basicRemove(otherEnd, msgs);
		case PlacerPackage.MAPPING__SHARED_FUNCTION_MAPPINGS:
			return ((InternalEList<?>) getSharedFunctionMappings()).basicRemove(otherEnd, msgs);
		case PlacerPackage.MAPPING__TRANSMISSION_MAPPINGS:
			return ((InternalEList<?>) getTransmissionMappings()).basicRemove(otherEnd, msgs);
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
		case PlacerPackage.MAPPING__HARDWARE_NAME:
			return getHardwareName();
		case PlacerPackage.MAPPING__MAKESPAN:
			return getMakespan();
		case PlacerPackage.MAPPING__ENERGY:
			return getEnergy();
		case PlacerPackage.MAPPING__TASK_MAPPINGS:
			return getTaskMappings();
		case PlacerPackage.MAPPING__SHARED_FUNCTION_MAPPINGS:
			return getSharedFunctionMappings();
		case PlacerPackage.MAPPING__TRANSMISSION_MAPPINGS:
			return getTransmissionMappings();
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
		case PlacerPackage.MAPPING__HARDWARE_NAME:
			setHardwareName((String) newValue);
			return;
		case PlacerPackage.MAPPING__MAKESPAN:
			setMakespan((Integer) newValue);
			return;
		case PlacerPackage.MAPPING__ENERGY:
			setEnergy((Integer) newValue);
			return;
		case PlacerPackage.MAPPING__TASK_MAPPINGS:
			getTaskMappings().clear();
			getTaskMappings().addAll((Collection<? extends TaskMapping>) newValue);
			return;
		case PlacerPackage.MAPPING__SHARED_FUNCTION_MAPPINGS:
			getSharedFunctionMappings().clear();
			getSharedFunctionMappings().addAll((Collection<? extends SharedFunctionMapping>) newValue);
			return;
		case PlacerPackage.MAPPING__TRANSMISSION_MAPPINGS:
			getTransmissionMappings().clear();
			getTransmissionMappings().addAll((Collection<? extends TransmissionMapping>) newValue);
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
		case PlacerPackage.MAPPING__HARDWARE_NAME:
			setHardwareName(HARDWARE_NAME_EDEFAULT);
			return;
		case PlacerPackage.MAPPING__MAKESPAN:
			setMakespan(MAKESPAN_EDEFAULT);
			return;
		case PlacerPackage.MAPPING__ENERGY:
			setEnergy(ENERGY_EDEFAULT);
			return;
		case PlacerPackage.MAPPING__TASK_MAPPINGS:
			getTaskMappings().clear();
			return;
		case PlacerPackage.MAPPING__SHARED_FUNCTION_MAPPINGS:
			getSharedFunctionMappings().clear();
			return;
		case PlacerPackage.MAPPING__TRANSMISSION_MAPPINGS:
			getTransmissionMappings().clear();
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
		case PlacerPackage.MAPPING__HARDWARE_NAME:
			return HARDWARE_NAME_EDEFAULT == null ? hardwareName != null : !HARDWARE_NAME_EDEFAULT.equals(hardwareName);
		case PlacerPackage.MAPPING__MAKESPAN:
			return makespan != MAKESPAN_EDEFAULT;
		case PlacerPackage.MAPPING__ENERGY:
			return energy != ENERGY_EDEFAULT;
		case PlacerPackage.MAPPING__TASK_MAPPINGS:
			return taskMappings != null && !taskMappings.isEmpty();
		case PlacerPackage.MAPPING__SHARED_FUNCTION_MAPPINGS:
			return sharedFunctionMappings != null && !sharedFunctionMappings.isEmpty();
		case PlacerPackage.MAPPING__TRANSMISSION_MAPPINGS:
			return transmissionMappings != null && !transmissionMappings.isEmpty();
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
		result.append(" (hardwareName: ");
		result.append(hardwareName);
		result.append(", makespan: ");
		result.append(makespan);
		result.append(", energy: ");
		result.append(energy);
		result.append(')');
		return result.toString();
	}

} //MappingImpl
