/**
 */
package placer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import placer.Bus;
import placer.PlacerPackage;
import placer.ProcessingElement;
import placer.TransmissionMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmission Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.TransmissionMappingImpl#getStart <em>Start</em>}</li>
 *   <li>{@link placer.impl.TransmissionMappingImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link placer.impl.TransmissionMappingImpl#getEnd <em>End</em>}</li>
 *   <li>{@link placer.impl.TransmissionMappingImpl#getBus <em>Bus</em>}</li>
 *   <li>{@link placer.impl.TransmissionMappingImpl#getTransmission <em>Transmission</em>}</li>
 *   <li>{@link placer.impl.TransmissionMappingImpl#getFromPE <em>From PE</em>}</li>
 *   <li>{@link placer.impl.TransmissionMappingImpl#getToPE <em>To PE</em>}</li>
 *   <li>{@link placer.impl.TransmissionMappingImpl#getFromTask <em>From Task</em>}</li>
 *   <li>{@link placer.impl.TransmissionMappingImpl#getToTask <em>To Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmissionMappingImpl extends MinimalEObjectImpl.Container implements TransmissionMapping {
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final int START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected int start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected int end = END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBus() <em>Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus()
	 * @generated
	 * @ordered
	 */
	protected Bus bus;

	/**
	 * The default value of the '{@link #getTransmission() <em>Transmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmission()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSMISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransmission() <em>Transmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmission()
	 * @generated
	 * @ordered
	 */
	protected String transmission = TRANSMISSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFromPE() <em>From PE</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPE()
	 * @generated
	 * @ordered
	 */
	protected ProcessingElement fromPE;

	/**
	 * The cached value of the '{@link #getToPE() <em>To PE</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPE()
	 * @generated
	 * @ordered
	 */
	protected ProcessingElement toPE;

	/**
	 * The default value of the '{@link #getFromTask() <em>From Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTask()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_TASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromTask() <em>From Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTask()
	 * @generated
	 * @ordered
	 */
	protected String fromTask = FROM_TASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getToTask() <em>To Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTask()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_TASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToTask() <em>To Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTask()
	 * @generated
	 * @ordered
	 */
	protected String toTask = TO_TASK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.TRANSMISSION_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransmission() {
		return transmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmission(String newTransmission) {
		String oldTransmission = transmission;
		transmission = newTransmission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.TRANSMISSION_MAPPING__TRANSMISSION,
					oldTransmission, transmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElement getFromPE() {
		if (fromPE != null && fromPE.eIsProxy()) {
			InternalEObject oldFromPE = (InternalEObject) fromPE;
			fromPE = (ProcessingElement) eResolveProxy(oldFromPE);
			if (fromPE != oldFromPE) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PlacerPackage.TRANSMISSION_MAPPING__FROM_PE, oldFromPE, fromPE));
			}
		}
		return fromPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElement basicGetFromPE() {
		return fromPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromPE(ProcessingElement newFromPE) {
		ProcessingElement oldFromPE = fromPE;
		fromPE = newFromPE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.TRANSMISSION_MAPPING__FROM_PE,
					oldFromPE, fromPE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElement getToPE() {
		if (toPE != null && toPE.eIsProxy()) {
			InternalEObject oldToPE = (InternalEObject) toPE;
			toPE = (ProcessingElement) eResolveProxy(oldToPE);
			if (toPE != oldToPE) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlacerPackage.TRANSMISSION_MAPPING__TO_PE,
							oldToPE, toPE));
			}
		}
		return toPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElement basicGetToPE() {
		return toPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToPE(ProcessingElement newToPE) {
		ProcessingElement oldToPE = toPE;
		toPE = newToPE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.TRANSMISSION_MAPPING__TO_PE, oldToPE,
					toPE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromTask() {
		return fromTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromTask(String newFromTask) {
		String oldFromTask = fromTask;
		fromTask = newFromTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.TRANSMISSION_MAPPING__FROM_TASK,
					oldFromTask, fromTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToTask() {
		return toTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToTask(String newToTask) {
		String oldToTask = toTask;
		toTask = newToTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.TRANSMISSION_MAPPING__TO_TASK,
					oldToTask, toTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus getBus() {
		if (bus != null && bus.eIsProxy()) {
			InternalEObject oldBus = (InternalEObject) bus;
			bus = (Bus) eResolveProxy(oldBus);
			if (bus != oldBus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlacerPackage.TRANSMISSION_MAPPING__BUS,
							oldBus, bus));
			}
		}
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus basicGetBus() {
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBus(Bus newBus) {
		Bus oldBus = bus;
		bus = newBus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.TRANSMISSION_MAPPING__BUS, oldBus,
					bus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(int newStart) {
		int oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.TRANSMISSION_MAPPING__START, oldStart,
					start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.TRANSMISSION_MAPPING__DURATION,
					oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(int newEnd) {
		int oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.TRANSMISSION_MAPPING__END, oldEnd,
					end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlacerPackage.TRANSMISSION_MAPPING__START:
			return getStart();
		case PlacerPackage.TRANSMISSION_MAPPING__DURATION:
			return getDuration();
		case PlacerPackage.TRANSMISSION_MAPPING__END:
			return getEnd();
		case PlacerPackage.TRANSMISSION_MAPPING__BUS:
			if (resolve)
				return getBus();
			return basicGetBus();
		case PlacerPackage.TRANSMISSION_MAPPING__TRANSMISSION:
			return getTransmission();
		case PlacerPackage.TRANSMISSION_MAPPING__FROM_PE:
			if (resolve)
				return getFromPE();
			return basicGetFromPE();
		case PlacerPackage.TRANSMISSION_MAPPING__TO_PE:
			if (resolve)
				return getToPE();
			return basicGetToPE();
		case PlacerPackage.TRANSMISSION_MAPPING__FROM_TASK:
			return getFromTask();
		case PlacerPackage.TRANSMISSION_MAPPING__TO_TASK:
			return getToTask();
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
		case PlacerPackage.TRANSMISSION_MAPPING__START:
			setStart((Integer) newValue);
			return;
		case PlacerPackage.TRANSMISSION_MAPPING__DURATION:
			setDuration((Integer) newValue);
			return;
		case PlacerPackage.TRANSMISSION_MAPPING__END:
			setEnd((Integer) newValue);
			return;
		case PlacerPackage.TRANSMISSION_MAPPING__BUS:
			setBus((Bus) newValue);
			return;
		case PlacerPackage.TRANSMISSION_MAPPING__TRANSMISSION:
			setTransmission((String) newValue);
			return;
		case PlacerPackage.TRANSMISSION_MAPPING__FROM_PE:
			setFromPE((ProcessingElement) newValue);
			return;
		case PlacerPackage.TRANSMISSION_MAPPING__TO_PE:
			setToPE((ProcessingElement) newValue);
			return;
		case PlacerPackage.TRANSMISSION_MAPPING__FROM_TASK:
			setFromTask((String) newValue);
			return;
		case PlacerPackage.TRANSMISSION_MAPPING__TO_TASK:
			setToTask((String) newValue);
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
		case PlacerPackage.TRANSMISSION_MAPPING__START:
			setStart(START_EDEFAULT);
			return;
		case PlacerPackage.TRANSMISSION_MAPPING__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case PlacerPackage.TRANSMISSION_MAPPING__END:
			setEnd(END_EDEFAULT);
			return;
		case PlacerPackage.TRANSMISSION_MAPPING__BUS:
			setBus((Bus) null);
			return;
		case PlacerPackage.TRANSMISSION_MAPPING__TRANSMISSION:
			setTransmission(TRANSMISSION_EDEFAULT);
			return;
		case PlacerPackage.TRANSMISSION_MAPPING__FROM_PE:
			setFromPE((ProcessingElement) null);
			return;
		case PlacerPackage.TRANSMISSION_MAPPING__TO_PE:
			setToPE((ProcessingElement) null);
			return;
		case PlacerPackage.TRANSMISSION_MAPPING__FROM_TASK:
			setFromTask(FROM_TASK_EDEFAULT);
			return;
		case PlacerPackage.TRANSMISSION_MAPPING__TO_TASK:
			setToTask(TO_TASK_EDEFAULT);
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
		case PlacerPackage.TRANSMISSION_MAPPING__START:
			return start != START_EDEFAULT;
		case PlacerPackage.TRANSMISSION_MAPPING__DURATION:
			return duration != DURATION_EDEFAULT;
		case PlacerPackage.TRANSMISSION_MAPPING__END:
			return end != END_EDEFAULT;
		case PlacerPackage.TRANSMISSION_MAPPING__BUS:
			return bus != null;
		case PlacerPackage.TRANSMISSION_MAPPING__TRANSMISSION:
			return TRANSMISSION_EDEFAULT == null ? transmission != null : !TRANSMISSION_EDEFAULT.equals(transmission);
		case PlacerPackage.TRANSMISSION_MAPPING__FROM_PE:
			return fromPE != null;
		case PlacerPackage.TRANSMISSION_MAPPING__TO_PE:
			return toPE != null;
		case PlacerPackage.TRANSMISSION_MAPPING__FROM_TASK:
			return FROM_TASK_EDEFAULT == null ? fromTask != null : !FROM_TASK_EDEFAULT.equals(fromTask);
		case PlacerPackage.TRANSMISSION_MAPPING__TO_TASK:
			return TO_TASK_EDEFAULT == null ? toTask != null : !TO_TASK_EDEFAULT.equals(toTask);
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
		result.append(" (start: ");
		result.append(start);
		result.append(", duration: ");
		result.append(duration);
		result.append(", end: ");
		result.append(end);
		result.append(", transmission: ");
		result.append(transmission);
		result.append(", fromTask: ");
		result.append(fromTask);
		result.append(", toTask: ");
		result.append(toTask);
		result.append(')');
		return result.toString();
	}

} //TransmissionMappingImpl
