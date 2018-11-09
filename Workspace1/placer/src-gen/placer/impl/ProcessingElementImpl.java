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
import placer.ProcessingElement;
import placer.ProcessingElementClass;
import placer.PropertiesDefinition;
import placer.ResourcesDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.ProcessingElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link placer.impl.ProcessingElementImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link placer.impl.ProcessingElementImpl#getPowerModel <em>Power Model</em>}</li>
 *   <li>{@link placer.impl.ProcessingElementImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link placer.impl.ProcessingElementImpl#getResourcesDefinitions <em>Resources Definitions</em>}</li>
 *   <li>{@link placer.impl.ProcessingElementImpl#getPropertiesDefinitions <em>Properties Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessingElementImpl extends MinimalEObjectImpl.Container implements ProcessingElement {
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
	 * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected int memory = MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerModel() <em>Power Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerModel()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerModel() <em>Power Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerModel()
	 * @generated
	 * @ordered
	 */
	protected String powerModel = POWER_MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected ProcessingElementClass class_;

	/**
	 * The cached value of the '{@link #getResourcesDefinitions() <em>Resources Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcesDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourcesDefinition> resourcesDefinitions;

	/**
	 * The cached value of the '{@link #getPropertiesDefinitions() <em>Properties Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertiesDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertiesDefinition> propertiesDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.PROCESSING_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.PROCESSING_ELEMENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(int newMemory) {
		int oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.PROCESSING_ELEMENT__MEMORY, oldMemory,
					memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPowerModel() {
		return powerModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerModel(String newPowerModel) {
		String oldPowerModel = powerModel;
		powerModel = newPowerModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.PROCESSING_ELEMENT__POWER_MODEL,
					oldPowerModel, powerModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElementClass getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject) class_;
			class_ = (ProcessingElementClass) eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlacerPackage.PROCESSING_ELEMENT__CLASS,
							oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElementClass basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(ProcessingElementClass newClass) {
		ProcessingElementClass oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.PROCESSING_ELEMENT__CLASS, oldClass,
					class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourcesDefinition> getResourcesDefinitions() {
		if (resourcesDefinitions == null) {
			resourcesDefinitions = new EObjectContainmentEList<ResourcesDefinition>(ResourcesDefinition.class, this,
					PlacerPackage.PROCESSING_ELEMENT__RESOURCES_DEFINITIONS);
		}
		return resourcesDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertiesDefinition> getPropertiesDefinitions() {
		if (propertiesDefinitions == null) {
			propertiesDefinitions = new EObjectContainmentEList<PropertiesDefinition>(PropertiesDefinition.class, this,
					PlacerPackage.PROCESSING_ELEMENT__PROPERTIES_DEFINITIONS);
		}
		return propertiesDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PlacerPackage.PROCESSING_ELEMENT__RESOURCES_DEFINITIONS:
			return ((InternalEList<?>) getResourcesDefinitions()).basicRemove(otherEnd, msgs);
		case PlacerPackage.PROCESSING_ELEMENT__PROPERTIES_DEFINITIONS:
			return ((InternalEList<?>) getPropertiesDefinitions()).basicRemove(otherEnd, msgs);
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
		case PlacerPackage.PROCESSING_ELEMENT__NAME:
			return getName();
		case PlacerPackage.PROCESSING_ELEMENT__MEMORY:
			return getMemory();
		case PlacerPackage.PROCESSING_ELEMENT__POWER_MODEL:
			return getPowerModel();
		case PlacerPackage.PROCESSING_ELEMENT__CLASS:
			if (resolve)
				return getClass_();
			return basicGetClass();
		case PlacerPackage.PROCESSING_ELEMENT__RESOURCES_DEFINITIONS:
			return getResourcesDefinitions();
		case PlacerPackage.PROCESSING_ELEMENT__PROPERTIES_DEFINITIONS:
			return getPropertiesDefinitions();
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
		case PlacerPackage.PROCESSING_ELEMENT__NAME:
			setName((String) newValue);
			return;
		case PlacerPackage.PROCESSING_ELEMENT__MEMORY:
			setMemory((Integer) newValue);
			return;
		case PlacerPackage.PROCESSING_ELEMENT__POWER_MODEL:
			setPowerModel((String) newValue);
			return;
		case PlacerPackage.PROCESSING_ELEMENT__CLASS:
			setClass((ProcessingElementClass) newValue);
			return;
		case PlacerPackage.PROCESSING_ELEMENT__RESOURCES_DEFINITIONS:
			getResourcesDefinitions().clear();
			getResourcesDefinitions().addAll((Collection<? extends ResourcesDefinition>) newValue);
			return;
		case PlacerPackage.PROCESSING_ELEMENT__PROPERTIES_DEFINITIONS:
			getPropertiesDefinitions().clear();
			getPropertiesDefinitions().addAll((Collection<? extends PropertiesDefinition>) newValue);
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
		case PlacerPackage.PROCESSING_ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PlacerPackage.PROCESSING_ELEMENT__MEMORY:
			setMemory(MEMORY_EDEFAULT);
			return;
		case PlacerPackage.PROCESSING_ELEMENT__POWER_MODEL:
			setPowerModel(POWER_MODEL_EDEFAULT);
			return;
		case PlacerPackage.PROCESSING_ELEMENT__CLASS:
			setClass((ProcessingElementClass) null);
			return;
		case PlacerPackage.PROCESSING_ELEMENT__RESOURCES_DEFINITIONS:
			getResourcesDefinitions().clear();
			return;
		case PlacerPackage.PROCESSING_ELEMENT__PROPERTIES_DEFINITIONS:
			getPropertiesDefinitions().clear();
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
		case PlacerPackage.PROCESSING_ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PlacerPackage.PROCESSING_ELEMENT__MEMORY:
			return memory != MEMORY_EDEFAULT;
		case PlacerPackage.PROCESSING_ELEMENT__POWER_MODEL:
			return POWER_MODEL_EDEFAULT == null ? powerModel != null : !POWER_MODEL_EDEFAULT.equals(powerModel);
		case PlacerPackage.PROCESSING_ELEMENT__CLASS:
			return class_ != null;
		case PlacerPackage.PROCESSING_ELEMENT__RESOURCES_DEFINITIONS:
			return resourcesDefinitions != null && !resourcesDefinitions.isEmpty();
		case PlacerPackage.PROCESSING_ELEMENT__PROPERTIES_DEFINITIONS:
			return propertiesDefinitions != null && !propertiesDefinitions.isEmpty();
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
		result.append(", memory: ");
		result.append(memory);
		result.append(", powerModel: ");
		result.append(powerModel);
		result.append(')');
		return result.toString();
	}

} //ProcessingElementImpl
