/**
 */
package placer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import placer.PlacerPackage;
import placer.ProcessingElement;
import placer.RunOn;
import placer.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run On</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.RunOnImpl#getYes <em>Yes</em>}</li>
 *   <li>{@link placer.impl.RunOnImpl#getProcessingElementRunOn <em>Processing Element Run On</em>}</li>
 *   <li>{@link placer.impl.RunOnImpl#getTaskRunOn <em>Task Run On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunOnImpl extends ConstraintOrObjectiveImpl implements RunOn {
	/**
	 * The default value of the '{@link #getYes() <em>Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYes()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean YES_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getYes() <em>Yes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYes()
	 * @generated
	 * @ordered
	 */
	protected Boolean yes = YES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessingElementRunOn() <em>Processing Element Run On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingElementRunOn()
	 * @generated
	 * @ordered
	 */
	protected ProcessingElement processingElementRunOn;

	/**
	 * The cached value of the '{@link #getTaskRunOn() <em>Task Run On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskRunOn()
	 * @generated
	 * @ordered
	 */
	protected Task taskRunOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunOnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.RUN_ON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getYes() {
		return yes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYes(Boolean newYes) {
		Boolean oldYes = yes;
		yes = newYes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.RUN_ON__YES, oldYes, yes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElement getProcessingElementRunOn() {
		if (processingElementRunOn != null && processingElementRunOn.eIsProxy()) {
			InternalEObject oldProcessingElementRunOn = (InternalEObject) processingElementRunOn;
			processingElementRunOn = (ProcessingElement) eResolveProxy(oldProcessingElementRunOn);
			if (processingElementRunOn != oldProcessingElementRunOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PlacerPackage.RUN_ON__PROCESSING_ELEMENT_RUN_ON, oldProcessingElementRunOn,
							processingElementRunOn));
			}
		}
		return processingElementRunOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElement basicGetProcessingElementRunOn() {
		return processingElementRunOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingElementRunOn(ProcessingElement newProcessingElementRunOn) {
		ProcessingElement oldProcessingElementRunOn = processingElementRunOn;
		processingElementRunOn = newProcessingElementRunOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.RUN_ON__PROCESSING_ELEMENT_RUN_ON,
					oldProcessingElementRunOn, processingElementRunOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTaskRunOn() {
		if (taskRunOn != null && taskRunOn.eIsProxy()) {
			InternalEObject oldTaskRunOn = (InternalEObject) taskRunOn;
			taskRunOn = (Task) eResolveProxy(oldTaskRunOn);
			if (taskRunOn != oldTaskRunOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlacerPackage.RUN_ON__TASK_RUN_ON,
							oldTaskRunOn, taskRunOn));
			}
		}
		return taskRunOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTaskRunOn() {
		return taskRunOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskRunOn(Task newTaskRunOn) {
		Task oldTaskRunOn = taskRunOn;
		taskRunOn = newTaskRunOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.RUN_ON__TASK_RUN_ON, oldTaskRunOn,
					taskRunOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlacerPackage.RUN_ON__YES:
			return getYes();
		case PlacerPackage.RUN_ON__PROCESSING_ELEMENT_RUN_ON:
			if (resolve)
				return getProcessingElementRunOn();
			return basicGetProcessingElementRunOn();
		case PlacerPackage.RUN_ON__TASK_RUN_ON:
			if (resolve)
				return getTaskRunOn();
			return basicGetTaskRunOn();
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
		case PlacerPackage.RUN_ON__YES:
			setYes((Boolean) newValue);
			return;
		case PlacerPackage.RUN_ON__PROCESSING_ELEMENT_RUN_ON:
			setProcessingElementRunOn((ProcessingElement) newValue);
			return;
		case PlacerPackage.RUN_ON__TASK_RUN_ON:
			setTaskRunOn((Task) newValue);
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
		case PlacerPackage.RUN_ON__YES:
			setYes(YES_EDEFAULT);
			return;
		case PlacerPackage.RUN_ON__PROCESSING_ELEMENT_RUN_ON:
			setProcessingElementRunOn((ProcessingElement) null);
			return;
		case PlacerPackage.RUN_ON__TASK_RUN_ON:
			setTaskRunOn((Task) null);
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
		case PlacerPackage.RUN_ON__YES:
			return YES_EDEFAULT == null ? yes != null : !YES_EDEFAULT.equals(yes);
		case PlacerPackage.RUN_ON__PROCESSING_ELEMENT_RUN_ON:
			return processingElementRunOn != null;
		case PlacerPackage.RUN_ON__TASK_RUN_ON:
			return taskRunOn != null;
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
		result.append(" (yes: ");
		result.append(yes);
		result.append(')');
		return result.toString();
	}

} //RunOnImpl
