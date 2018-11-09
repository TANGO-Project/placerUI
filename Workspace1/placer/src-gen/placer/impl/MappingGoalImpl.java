/**
 */
package placer.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import placer.MappingGoal;
import placer.PlacerPackage;
import placer.SimpleGoal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.MappingGoalImpl#getSimpleObjective <em>Simple Objective</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MappingGoalImpl extends MinimalEObjectImpl.Container implements MappingGoal {
	/**
	 * The default value of the '{@link #getSimpleObjective() <em>Simple Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleObjective()
	 * @generated
	 * @ordered
	 */
	protected static final SimpleGoal SIMPLE_OBJECTIVE_EDEFAULT = SimpleGoal.MIN_ENERGY;
	/**
	 * The cached value of the '{@link #getSimpleObjective() <em>Simple Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleObjective()
	 * @generated
	 * @ordered
	 */
	protected SimpleGoal simpleObjective = SIMPLE_OBJECTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.MAPPING_GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleGoal getSimpleObjective() {
		return simpleObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleObjective(SimpleGoal newSimpleObjective) {
		SimpleGoal oldSimpleObjective = simpleObjective;
		simpleObjective = newSimpleObjective == null ? SIMPLE_OBJECTIVE_EDEFAULT : newSimpleObjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.MAPPING_GOAL__SIMPLE_OBJECTIVE,
					oldSimpleObjective, simpleObjective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlacerPackage.MAPPING_GOAL__SIMPLE_OBJECTIVE:
			return getSimpleObjective();
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
		case PlacerPackage.MAPPING_GOAL__SIMPLE_OBJECTIVE:
			setSimpleObjective((SimpleGoal) newValue);
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
		case PlacerPackage.MAPPING_GOAL__SIMPLE_OBJECTIVE:
			setSimpleObjective(SIMPLE_OBJECTIVE_EDEFAULT);
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
		case PlacerPackage.MAPPING_GOAL__SIMPLE_OBJECTIVE:
			return simpleObjective != SIMPLE_OBJECTIVE_EDEFAULT;
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
		result.append(" (simpleObjective: ");
		result.append(simpleObjective);
		result.append(')');
		return result.toString();
	}

} //MappingGoalImpl
