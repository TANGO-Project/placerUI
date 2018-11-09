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
import placer.Parameters;
import placer.PlacerPackage;
import placer.ProcessingElementClass;
import placer.ResourcesUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.ImplementationImpl#getName <em>Name</em>}</li>
 *   <li>{@link placer.impl.ImplementationImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link placer.impl.ImplementationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link placer.impl.ImplementationImpl#getComputationMemory <em>Computation Memory</em>}</li>
 *   <li>{@link placer.impl.ImplementationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link placer.impl.ImplementationImpl#getResourcesUsages <em>Resources Usages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationImpl extends MinimalEObjectImpl.Container implements Implementation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ProcessingElementClass target;

	/**
	 * The default value of the '{@link #getComputationMemory() <em>Computation Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputationMemory()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPUTATION_MEMORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComputationMemory() <em>Computation Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputationMemory()
	 * @generated
	 * @ordered
	 */
	protected String computationMemory = COMPUTATION_MEMORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameters> parameters;

	/**
	 * The cached value of the '{@link #getResourcesUsages() <em>Resources Usages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcesUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourcesUsage> resourcesUsages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.IMPLEMENTATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.IMPLEMENTATION__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameters> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameters>(Parameters.class, this,
					PlacerPackage.IMPLEMENTATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourcesUsage> getResourcesUsages() {
		if (resourcesUsages == null) {
			resourcesUsages = new EObjectContainmentEList<ResourcesUsage>(ResourcesUsage.class, this,
					PlacerPackage.IMPLEMENTATION__RESOURCES_USAGES);
		}
		return resourcesUsages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PlacerPackage.IMPLEMENTATION__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case PlacerPackage.IMPLEMENTATION__RESOURCES_USAGES:
			return ((InternalEList<?>) getResourcesUsages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElementClass getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (ProcessingElementClass) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlacerPackage.IMPLEMENTATION__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElementClass basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ProcessingElementClass newTarget) {
		ProcessingElementClass oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.IMPLEMENTATION__TARGET, oldTarget,
					target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComputationMemory() {
		return computationMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputationMemory(String newComputationMemory) {
		String oldComputationMemory = computationMemory;
		computationMemory = newComputationMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.IMPLEMENTATION__COMPUTATION_MEMORY,
					oldComputationMemory, computationMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlacerPackage.IMPLEMENTATION__NAME:
			return getName();
		case PlacerPackage.IMPLEMENTATION__DURATION:
			return getDuration();
		case PlacerPackage.IMPLEMENTATION__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case PlacerPackage.IMPLEMENTATION__COMPUTATION_MEMORY:
			return getComputationMemory();
		case PlacerPackage.IMPLEMENTATION__PARAMETERS:
			return getParameters();
		case PlacerPackage.IMPLEMENTATION__RESOURCES_USAGES:
			return getResourcesUsages();
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
		case PlacerPackage.IMPLEMENTATION__NAME:
			setName((String) newValue);
			return;
		case PlacerPackage.IMPLEMENTATION__DURATION:
			setDuration((String) newValue);
			return;
		case PlacerPackage.IMPLEMENTATION__TARGET:
			setTarget((ProcessingElementClass) newValue);
			return;
		case PlacerPackage.IMPLEMENTATION__COMPUTATION_MEMORY:
			setComputationMemory((String) newValue);
			return;
		case PlacerPackage.IMPLEMENTATION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameters>) newValue);
			return;
		case PlacerPackage.IMPLEMENTATION__RESOURCES_USAGES:
			getResourcesUsages().clear();
			getResourcesUsages().addAll((Collection<? extends ResourcesUsage>) newValue);
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
		case PlacerPackage.IMPLEMENTATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PlacerPackage.IMPLEMENTATION__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case PlacerPackage.IMPLEMENTATION__TARGET:
			setTarget((ProcessingElementClass) null);
			return;
		case PlacerPackage.IMPLEMENTATION__COMPUTATION_MEMORY:
			setComputationMemory(COMPUTATION_MEMORY_EDEFAULT);
			return;
		case PlacerPackage.IMPLEMENTATION__PARAMETERS:
			getParameters().clear();
			return;
		case PlacerPackage.IMPLEMENTATION__RESOURCES_USAGES:
			getResourcesUsages().clear();
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
		case PlacerPackage.IMPLEMENTATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PlacerPackage.IMPLEMENTATION__DURATION:
			return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
		case PlacerPackage.IMPLEMENTATION__TARGET:
			return target != null;
		case PlacerPackage.IMPLEMENTATION__COMPUTATION_MEMORY:
			return COMPUTATION_MEMORY_EDEFAULT == null ? computationMemory != null
					: !COMPUTATION_MEMORY_EDEFAULT.equals(computationMemory);
		case PlacerPackage.IMPLEMENTATION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case PlacerPackage.IMPLEMENTATION__RESOURCES_USAGES:
			return resourcesUsages != null && !resourcesUsages.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", duration: ");
		result.append(duration);
		result.append(", computationMemory: ");
		result.append(computationMemory);
		result.append(')');
		return result.toString();
	}

} //ImplementationImpl
