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

import placer.PlacerPackage;
import placer.Task;
import placer.TaskGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.TaskGroupImpl#getNbInstances <em>Nb Instances</em>}</li>
 *   <li>{@link placer.impl.TaskGroupImpl#getTaskTaskGroups <em>Task Task Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskGroupImpl extends MinimalEObjectImpl.Container implements TaskGroup {
	/**
	 * The default value of the '{@link #getNbInstances() <em>Nb Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbInstances()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_INSTANCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbInstances() <em>Nb Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbInstances()
	 * @generated
	 * @ordered
	 */
	protected int nbInstances = NB_INSTANCES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaskTaskGroups() <em>Task Task Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskTaskGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> taskTaskGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.TASK_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbInstances() {
		return nbInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbInstances(int newNbInstances) {
		int oldNbInstances = nbInstances;
		nbInstances = newNbInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.TASK_GROUP__NB_INSTANCES,
					oldNbInstances, nbInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTaskTaskGroups() {
		if (taskTaskGroups == null) {
			taskTaskGroups = new EObjectContainmentEList<Task>(Task.class, this,
					PlacerPackage.TASK_GROUP__TASK_TASK_GROUPS);
		}
		return taskTaskGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PlacerPackage.TASK_GROUP__TASK_TASK_GROUPS:
			return ((InternalEList<?>) getTaskTaskGroups()).basicRemove(otherEnd, msgs);
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
		case PlacerPackage.TASK_GROUP__NB_INSTANCES:
			return getNbInstances();
		case PlacerPackage.TASK_GROUP__TASK_TASK_GROUPS:
			return getTaskTaskGroups();
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
		case PlacerPackage.TASK_GROUP__NB_INSTANCES:
			setNbInstances((Integer) newValue);
			return;
		case PlacerPackage.TASK_GROUP__TASK_TASK_GROUPS:
			getTaskTaskGroups().clear();
			getTaskTaskGroups().addAll((Collection<? extends Task>) newValue);
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
		case PlacerPackage.TASK_GROUP__NB_INSTANCES:
			setNbInstances(NB_INSTANCES_EDEFAULT);
			return;
		case PlacerPackage.TASK_GROUP__TASK_TASK_GROUPS:
			getTaskTaskGroups().clear();
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
		case PlacerPackage.TASK_GROUP__NB_INSTANCES:
			return nbInstances != NB_INSTANCES_EDEFAULT;
		case PlacerPackage.TASK_GROUP__TASK_TASK_GROUPS:
			return taskTaskGroups != null && !taskTaskGroups.isEmpty();
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
		result.append(" (nbInstances: ");
		result.append(nbInstances);
		result.append(')');
		return result.toString();
	}

} //TaskGroupImpl
