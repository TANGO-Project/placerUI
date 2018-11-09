/**
 */
package placer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import placer.MultiObjectiveGoal;
import placer.PlacerPackage;
import placer.SimpleGoal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Objective Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.MultiObjectiveGoalImpl#getSimpleObjective2 <em>Simple Objective2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiObjectiveGoalImpl extends MappingGoalImpl implements MultiObjectiveGoal {
	/**
	 * The default value of the '{@link #getSimpleObjective2() <em>Simple Objective2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleObjective2()
	 * @generated
	 * @ordered
	 */
	protected static final SimpleGoal SIMPLE_OBJECTIVE2_EDEFAULT = SimpleGoal.MIN_MAKESPAN;

	/**
	 * The cached value of the '{@link #getSimpleObjective2() <em>Simple Objective2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleObjective2()
	 * @generated
	 * @ordered
	 */
	protected SimpleGoal simpleObjective2 = SIMPLE_OBJECTIVE2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiObjectiveGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.MULTI_OBJECTIVE_GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleGoal getSimpleObjective2() {
		return simpleObjective2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleObjective2(SimpleGoal newSimpleObjective2) {
		SimpleGoal oldSimpleObjective2 = simpleObjective2;
		simpleObjective2 = newSimpleObjective2 == null ? SIMPLE_OBJECTIVE2_EDEFAULT : newSimpleObjective2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.MULTI_OBJECTIVE_GOAL__SIMPLE_OBJECTIVE2,
					oldSimpleObjective2, simpleObjective2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlacerPackage.MULTI_OBJECTIVE_GOAL__SIMPLE_OBJECTIVE2:
			return getSimpleObjective2();
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
		case PlacerPackage.MULTI_OBJECTIVE_GOAL__SIMPLE_OBJECTIVE2:
			setSimpleObjective2((SimpleGoal) newValue);
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
		case PlacerPackage.MULTI_OBJECTIVE_GOAL__SIMPLE_OBJECTIVE2:
			setSimpleObjective2(SIMPLE_OBJECTIVE2_EDEFAULT);
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
		case PlacerPackage.MULTI_OBJECTIVE_GOAL__SIMPLE_OBJECTIVE2:
			return simpleObjective2 != SIMPLE_OBJECTIVE2_EDEFAULT;
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
		result.append(" (simpleObjective2: ");
		result.append(simpleObjective2);
		result.append(')');
		return result.toString();
	}

} //MultiObjectiveGoalImpl
