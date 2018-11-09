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

import placer.NameValue;
import placer.PlacerPackage;
import placer.SharedFunctionMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shared Function Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.SharedFunctionMappingImpl#getSharedImplem <em>Shared Implem</em>}</li>
 *   <li>{@link placer.impl.SharedFunctionMappingImpl#getNbInstance <em>Nb Instance</em>}</li>
 *   <li>{@link placer.impl.SharedFunctionMappingImpl#getHost <em>Host</em>}</li>
 *   <li>{@link placer.impl.SharedFunctionMappingImpl#getNameValues <em>Name Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SharedFunctionMappingImpl extends MinimalEObjectImpl.Container implements SharedFunctionMapping {
	/**
	 * The default value of the '{@link #getSharedImplem() <em>Shared Implem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedImplem()
	 * @generated
	 * @ordered
	 */
	protected static final String SHARED_IMPLEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSharedImplem() <em>Shared Implem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedImplem()
	 * @generated
	 * @ordered
	 */
	protected String sharedImplem = SHARED_IMPLEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbInstance() <em>Nb Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbInstance()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_INSTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbInstance() <em>Nb Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbInstance()
	 * @generated
	 * @ordered
	 */
	protected int nbInstance = NB_INSTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedFunctionMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.SHARED_FUNCTION_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSharedImplem() {
		return sharedImplem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedImplem(String newSharedImplem) {
		String oldSharedImplem = sharedImplem;
		sharedImplem = newSharedImplem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.SHARED_FUNCTION_MAPPING__SHARED_IMPLEM,
					oldSharedImplem, sharedImplem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbInstance() {
		return nbInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbInstance(int newNbInstance) {
		int oldNbInstance = nbInstance;
		nbInstance = newNbInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.SHARED_FUNCTION_MAPPING__NB_INSTANCE,
					oldNbInstance, nbInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.SHARED_FUNCTION_MAPPING__HOST, oldHost,
					host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameValue> getNameValues() {
		if (nameValues == null) {
			nameValues = new EObjectContainmentEList<NameValue>(NameValue.class, this,
					PlacerPackage.SHARED_FUNCTION_MAPPING__NAME_VALUES);
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
		case PlacerPackage.SHARED_FUNCTION_MAPPING__NAME_VALUES:
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
		case PlacerPackage.SHARED_FUNCTION_MAPPING__SHARED_IMPLEM:
			return getSharedImplem();
		case PlacerPackage.SHARED_FUNCTION_MAPPING__NB_INSTANCE:
			return getNbInstance();
		case PlacerPackage.SHARED_FUNCTION_MAPPING__HOST:
			return getHost();
		case PlacerPackage.SHARED_FUNCTION_MAPPING__NAME_VALUES:
			return getNameValues();
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
		case PlacerPackage.SHARED_FUNCTION_MAPPING__SHARED_IMPLEM:
			setSharedImplem((String) newValue);
			return;
		case PlacerPackage.SHARED_FUNCTION_MAPPING__NB_INSTANCE:
			setNbInstance((Integer) newValue);
			return;
		case PlacerPackage.SHARED_FUNCTION_MAPPING__HOST:
			setHost((String) newValue);
			return;
		case PlacerPackage.SHARED_FUNCTION_MAPPING__NAME_VALUES:
			getNameValues().clear();
			getNameValues().addAll((Collection<? extends NameValue>) newValue);
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
		case PlacerPackage.SHARED_FUNCTION_MAPPING__SHARED_IMPLEM:
			setSharedImplem(SHARED_IMPLEM_EDEFAULT);
			return;
		case PlacerPackage.SHARED_FUNCTION_MAPPING__NB_INSTANCE:
			setNbInstance(NB_INSTANCE_EDEFAULT);
			return;
		case PlacerPackage.SHARED_FUNCTION_MAPPING__HOST:
			setHost(HOST_EDEFAULT);
			return;
		case PlacerPackage.SHARED_FUNCTION_MAPPING__NAME_VALUES:
			getNameValues().clear();
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
		case PlacerPackage.SHARED_FUNCTION_MAPPING__SHARED_IMPLEM:
			return SHARED_IMPLEM_EDEFAULT == null ? sharedImplem != null : !SHARED_IMPLEM_EDEFAULT.equals(sharedImplem);
		case PlacerPackage.SHARED_FUNCTION_MAPPING__NB_INSTANCE:
			return nbInstance != NB_INSTANCE_EDEFAULT;
		case PlacerPackage.SHARED_FUNCTION_MAPPING__HOST:
			return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
		case PlacerPackage.SHARED_FUNCTION_MAPPING__NAME_VALUES:
			return nameValues != null && !nameValues.isEmpty();
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
		result.append(" (sharedImplem: ");
		result.append(sharedImplem);
		result.append(", nbInstance: ");
		result.append(nbInstance);
		result.append(", host: ");
		result.append(host);
		result.append(')');
		return result.toString();
	}

} //SharedFunctionMappingImpl
