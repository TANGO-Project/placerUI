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
import placer.ProcessingElementClass;
import placer.PropertiesDeclaration;
import placer.ResourcesDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Element Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.ProcessingElementClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link placer.impl.ProcessingElementClassImpl#getResourcesDeclarations <em>Resources Declarations</em>}</li>
 *   <li>{@link placer.impl.ProcessingElementClassImpl#getPropertiesDeclarations <em>Properties Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProcessingElementClassImpl extends MinimalEObjectImpl.Container
		implements ProcessingElementClass {
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
	 * The cached value of the '{@link #getResourcesDeclarations() <em>Resources Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcesDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourcesDeclaration> resourcesDeclarations;

	/**
	 * The cached value of the '{@link #getPropertiesDeclarations() <em>Properties Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertiesDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertiesDeclaration> propertiesDeclarations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingElementClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.PROCESSING_ELEMENT_CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.PROCESSING_ELEMENT_CLASS__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourcesDeclaration> getResourcesDeclarations() {
		if (resourcesDeclarations == null) {
			resourcesDeclarations = new EObjectContainmentEList<ResourcesDeclaration>(ResourcesDeclaration.class, this,
					PlacerPackage.PROCESSING_ELEMENT_CLASS__RESOURCES_DECLARATIONS);
		}
		return resourcesDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertiesDeclaration> getPropertiesDeclarations() {
		if (propertiesDeclarations == null) {
			propertiesDeclarations = new EObjectContainmentEList<PropertiesDeclaration>(PropertiesDeclaration.class,
					this, PlacerPackage.PROCESSING_ELEMENT_CLASS__PROPERTIES_DECLARATIONS);
		}
		return propertiesDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PlacerPackage.PROCESSING_ELEMENT_CLASS__RESOURCES_DECLARATIONS:
			return ((InternalEList<?>) getResourcesDeclarations()).basicRemove(otherEnd, msgs);
		case PlacerPackage.PROCESSING_ELEMENT_CLASS__PROPERTIES_DECLARATIONS:
			return ((InternalEList<?>) getPropertiesDeclarations()).basicRemove(otherEnd, msgs);
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
		case PlacerPackage.PROCESSING_ELEMENT_CLASS__NAME:
			return getName();
		case PlacerPackage.PROCESSING_ELEMENT_CLASS__RESOURCES_DECLARATIONS:
			return getResourcesDeclarations();
		case PlacerPackage.PROCESSING_ELEMENT_CLASS__PROPERTIES_DECLARATIONS:
			return getPropertiesDeclarations();
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
		case PlacerPackage.PROCESSING_ELEMENT_CLASS__NAME:
			setName((String) newValue);
			return;
		case PlacerPackage.PROCESSING_ELEMENT_CLASS__RESOURCES_DECLARATIONS:
			getResourcesDeclarations().clear();
			getResourcesDeclarations().addAll((Collection<? extends ResourcesDeclaration>) newValue);
			return;
		case PlacerPackage.PROCESSING_ELEMENT_CLASS__PROPERTIES_DECLARATIONS:
			getPropertiesDeclarations().clear();
			getPropertiesDeclarations().addAll((Collection<? extends PropertiesDeclaration>) newValue);
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
		case PlacerPackage.PROCESSING_ELEMENT_CLASS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PlacerPackage.PROCESSING_ELEMENT_CLASS__RESOURCES_DECLARATIONS:
			getResourcesDeclarations().clear();
			return;
		case PlacerPackage.PROCESSING_ELEMENT_CLASS__PROPERTIES_DECLARATIONS:
			getPropertiesDeclarations().clear();
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
		case PlacerPackage.PROCESSING_ELEMENT_CLASS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PlacerPackage.PROCESSING_ELEMENT_CLASS__RESOURCES_DECLARATIONS:
			return resourcesDeclarations != null && !resourcesDeclarations.isEmpty();
		case PlacerPackage.PROCESSING_ELEMENT_CLASS__PROPERTIES_DECLARATIONS:
			return propertiesDeclarations != null && !propertiesDeclarations.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ProcessingElementClassImpl
