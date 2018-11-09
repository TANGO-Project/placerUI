/**
 */
package placer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import placer.PlacerPackage;
import placer.SamePE;
import placer.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Same PE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.SamePEImpl#getYes <em>Yes</em>}</li>
 *   <li>{@link placer.impl.SamePEImpl#getTaskSamePE <em>Task Same PE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SamePEImpl extends ConstraintOrObjectiveImpl implements SamePE {
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
	 * The cached value of the '{@link #getTaskSamePE() <em>Task Same PE</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskSamePE()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> taskSamePE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SamePEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.SAME_PE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.SAME_PE__YES, oldYes, yes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTaskSamePE() {
		if (taskSamePE == null) {
			taskSamePE = new EObjectResolvingEList<Task>(Task.class, this, PlacerPackage.SAME_PE__TASK_SAME_PE);
		}
		return taskSamePE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlacerPackage.SAME_PE__YES:
			return getYes();
		case PlacerPackage.SAME_PE__TASK_SAME_PE:
			return getTaskSamePE();
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
		case PlacerPackage.SAME_PE__YES:
			setYes((Boolean) newValue);
			return;
		case PlacerPackage.SAME_PE__TASK_SAME_PE:
			getTaskSamePE().clear();
			getTaskSamePE().addAll((Collection<? extends Task>) newValue);
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
		case PlacerPackage.SAME_PE__YES:
			setYes(YES_EDEFAULT);
			return;
		case PlacerPackage.SAME_PE__TASK_SAME_PE:
			getTaskSamePE().clear();
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
		case PlacerPackage.SAME_PE__YES:
			return YES_EDEFAULT == null ? yes != null : !YES_EDEFAULT.equals(yes);
		case PlacerPackage.SAME_PE__TASK_SAME_PE:
			return taskSamePE != null && !taskSamePE.isEmpty();
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

} //SamePEImpl
