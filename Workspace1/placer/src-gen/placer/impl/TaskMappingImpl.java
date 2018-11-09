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

import placer.Implementation;
import placer.NameValue;
import placer.PlacerPackage;
import placer.ProcessingElement;
import placer.TaskMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.TaskMappingImpl#getStart <em>Start</em>}</li>
 *   <li>{@link placer.impl.TaskMappingImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link placer.impl.TaskMappingImpl#getEnd <em>End</em>}</li>
 *   <li>{@link placer.impl.TaskMappingImpl#getNameValues <em>Name Values</em>}</li>
 *   <li>{@link placer.impl.TaskMappingImpl#getProcessingElement <em>Processing Element</em>}</li>
 *   <li>{@link placer.impl.TaskMappingImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link placer.impl.TaskMappingImpl#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskMappingImpl extends MinimalEObjectImpl.Container implements TaskMapping {
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
	 * The cached value of the '{@link #getNameValues() <em>Name Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameValues()
	 * @generated
	 * @ordered
	 */
	protected EList<NameValue> nameValues;

	/**
	 * The cached value of the '{@link #getProcessingElement() <em>Processing Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingElement()
	 * @generated
	 * @ordered
	 */
	protected ProcessingElement processingElement;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected Implementation implementation;

	/**
	 * The default value of the '{@link #getTask() <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected String task = TASK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.TASK_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(String newTask) {
		String oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.TASK_MAPPING__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElement getProcessingElement() {
		if (processingElement != null && processingElement.eIsProxy()) {
			InternalEObject oldProcessingElement = (InternalEObject) processingElement;
			processingElement = (ProcessingElement) eResolveProxy(oldProcessingElement);
			if (processingElement != oldProcessingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PlacerPackage.TASK_MAPPING__PROCESSING_ELEMENT, oldProcessingElement, processingElement));
			}
		}
		return processingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElement basicGetProcessingElement() {
		return processingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingElement(ProcessingElement newProcessingElement) {
		ProcessingElement oldProcessingElement = processingElement;
		processingElement = newProcessingElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.TASK_MAPPING__PROCESSING_ELEMENT,
					oldProcessingElement, processingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation getImplementation() {
		if (implementation != null && implementation.eIsProxy()) {
			InternalEObject oldImplementation = (InternalEObject) implementation;
			implementation = (Implementation) eResolveProxy(oldImplementation);
			if (implementation != oldImplementation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PlacerPackage.TASK_MAPPING__IMPLEMENTATION, oldImplementation, implementation));
			}
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation basicGetImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(Implementation newImplementation) {
		Implementation oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.TASK_MAPPING__IMPLEMENTATION,
					oldImplementation, implementation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.TASK_MAPPING__START, oldStart, start));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.TASK_MAPPING__DURATION, oldDuration,
					duration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.TASK_MAPPING__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameValue> getNameValues() {
		if (nameValues == null) {
			nameValues = new EObjectContainmentEList<NameValue>(NameValue.class, this,
					PlacerPackage.TASK_MAPPING__NAME_VALUES);
		}
		return nameValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PlacerPackage.TASK_MAPPING__NAME_VALUES:
			return ((InternalEList<?>) getNameValues()).basicRemove(otherEnd, msgs);
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
		case PlacerPackage.TASK_MAPPING__START:
			return getStart();
		case PlacerPackage.TASK_MAPPING__DURATION:
			return getDuration();
		case PlacerPackage.TASK_MAPPING__END:
			return getEnd();
		case PlacerPackage.TASK_MAPPING__NAME_VALUES:
			return getNameValues();
		case PlacerPackage.TASK_MAPPING__PROCESSING_ELEMENT:
			if (resolve)
				return getProcessingElement();
			return basicGetProcessingElement();
		case PlacerPackage.TASK_MAPPING__IMPLEMENTATION:
			if (resolve)
				return getImplementation();
			return basicGetImplementation();
		case PlacerPackage.TASK_MAPPING__TASK:
			return getTask();
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
		case PlacerPackage.TASK_MAPPING__START:
			setStart((Integer) newValue);
			return;
		case PlacerPackage.TASK_MAPPING__DURATION:
			setDuration((Integer) newValue);
			return;
		case PlacerPackage.TASK_MAPPING__END:
			setEnd((Integer) newValue);
			return;
		case PlacerPackage.TASK_MAPPING__NAME_VALUES:
			getNameValues().clear();
			getNameValues().addAll((Collection<? extends NameValue>) newValue);
			return;
		case PlacerPackage.TASK_MAPPING__PROCESSING_ELEMENT:
			setProcessingElement((ProcessingElement) newValue);
			return;
		case PlacerPackage.TASK_MAPPING__IMPLEMENTATION:
			setImplementation((Implementation) newValue);
			return;
		case PlacerPackage.TASK_MAPPING__TASK:
			setTask((String) newValue);
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
		case PlacerPackage.TASK_MAPPING__START:
			setStart(START_EDEFAULT);
			return;
		case PlacerPackage.TASK_MAPPING__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case PlacerPackage.TASK_MAPPING__END:
			setEnd(END_EDEFAULT);
			return;
		case PlacerPackage.TASK_MAPPING__NAME_VALUES:
			getNameValues().clear();
			return;
		case PlacerPackage.TASK_MAPPING__PROCESSING_ELEMENT:
			setProcessingElement((ProcessingElement) null);
			return;
		case PlacerPackage.TASK_MAPPING__IMPLEMENTATION:
			setImplementation((Implementation) null);
			return;
		case PlacerPackage.TASK_MAPPING__TASK:
			setTask(TASK_EDEFAULT);
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
		case PlacerPackage.TASK_MAPPING__START:
			return start != START_EDEFAULT;
		case PlacerPackage.TASK_MAPPING__DURATION:
			return duration != DURATION_EDEFAULT;
		case PlacerPackage.TASK_MAPPING__END:
			return end != END_EDEFAULT;
		case PlacerPackage.TASK_MAPPING__NAME_VALUES:
			return nameValues != null && !nameValues.isEmpty();
		case PlacerPackage.TASK_MAPPING__PROCESSING_ELEMENT:
			return processingElement != null;
		case PlacerPackage.TASK_MAPPING__IMPLEMENTATION:
			return implementation != null;
		case PlacerPackage.TASK_MAPPING__TASK:
			return TASK_EDEFAULT == null ? task != null : !TASK_EDEFAULT.equals(task);
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
		result.append(", task: ");
		result.append(task);
		result.append(')');
		return result.toString();
	}

} //TaskMappingImpl
