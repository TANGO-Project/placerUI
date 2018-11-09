/**
 */
package placer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import placer.PlacerPackage;
import placer.SwitchingTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switching Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.SwitchingTaskImpl#getSwitchingDelay <em>Switching Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchingTaskImpl extends ProcessingElementClassImpl implements SwitchingTask {
	/**
	 * The default value of the '{@link #getSwitchingDelay() <em>Switching Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingDelay()
	 * @generated
	 * @ordered
	 */
	protected static final int SWITCHING_DELAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSwitchingDelay() <em>Switching Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingDelay()
	 * @generated
	 * @ordered
	 */
	protected int switchingDelay = SWITCHING_DELAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchingTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.SWITCHING_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSwitchingDelay() {
		return switchingDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchingDelay(int newSwitchingDelay) {
		int oldSwitchingDelay = switchingDelay;
		switchingDelay = newSwitchingDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.SWITCHING_TASK__SWITCHING_DELAY,
					oldSwitchingDelay, switchingDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlacerPackage.SWITCHING_TASK__SWITCHING_DELAY:
			return getSwitchingDelay();
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
		case PlacerPackage.SWITCHING_TASK__SWITCHING_DELAY:
			setSwitchingDelay((Integer) newValue);
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
		case PlacerPackage.SWITCHING_TASK__SWITCHING_DELAY:
			setSwitchingDelay(SWITCHING_DELAY_EDEFAULT);
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
		case PlacerPackage.SWITCHING_TASK__SWITCHING_DELAY:
			return switchingDelay != SWITCHING_DELAY_EDEFAULT;
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
		result.append(" (switchingDelay: ");
		result.append(switchingDelay);
		result.append(')');
		return result.toString();
	}

} //SwitchingTaskImpl
