/**
 */
package placer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import placer.Bus;
import placer.Connection;
import placer.PlacerPackage;
import placer.ProcessingElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.ConnectionImpl#getConnectionTo <em>Connection To</em>}</li>
 *   <li>{@link placer.impl.ConnectionImpl#getConnectionFrom <em>Connection From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The cached value of the '{@link #getConnectionTo() <em>Connection To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTo()
	 * @generated
	 * @ordered
	 */
	protected ProcessingElement connectionTo;

	/**
	 * The cached value of the '{@link #getConnectionFrom() <em>Connection From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionFrom()
	 * @generated
	 * @ordered
	 */
	protected Bus connectionFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElement getConnectionTo() {
		if (connectionTo != null && connectionTo.eIsProxy()) {
			InternalEObject oldConnectionTo = (InternalEObject) connectionTo;
			connectionTo = (ProcessingElement) eResolveProxy(oldConnectionTo);
			if (connectionTo != oldConnectionTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlacerPackage.CONNECTION__CONNECTION_TO,
							oldConnectionTo, connectionTo));
			}
		}
		return connectionTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElement basicGetConnectionTo() {
		return connectionTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionTo(ProcessingElement newConnectionTo) {
		ProcessingElement oldConnectionTo = connectionTo;
		connectionTo = newConnectionTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.CONNECTION__CONNECTION_TO,
					oldConnectionTo, connectionTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus getConnectionFrom() {
		if (connectionFrom != null && connectionFrom.eIsProxy()) {
			InternalEObject oldConnectionFrom = (InternalEObject) connectionFrom;
			connectionFrom = (Bus) eResolveProxy(oldConnectionFrom);
			if (connectionFrom != oldConnectionFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlacerPackage.CONNECTION__CONNECTION_FROM,
							oldConnectionFrom, connectionFrom));
			}
		}
		return connectionFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus basicGetConnectionFrom() {
		return connectionFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionFrom(Bus newConnectionFrom) {
		Bus oldConnectionFrom = connectionFrom;
		connectionFrom = newConnectionFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.CONNECTION__CONNECTION_FROM,
					oldConnectionFrom, connectionFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlacerPackage.CONNECTION__CONNECTION_TO:
			if (resolve)
				return getConnectionTo();
			return basicGetConnectionTo();
		case PlacerPackage.CONNECTION__CONNECTION_FROM:
			if (resolve)
				return getConnectionFrom();
			return basicGetConnectionFrom();
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
		case PlacerPackage.CONNECTION__CONNECTION_TO:
			setConnectionTo((ProcessingElement) newValue);
			return;
		case PlacerPackage.CONNECTION__CONNECTION_FROM:
			setConnectionFrom((Bus) newValue);
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
		case PlacerPackage.CONNECTION__CONNECTION_TO:
			setConnectionTo((ProcessingElement) null);
			return;
		case PlacerPackage.CONNECTION__CONNECTION_FROM:
			setConnectionFrom((Bus) null);
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
		case PlacerPackage.CONNECTION__CONNECTION_TO:
			return connectionTo != null;
		case PlacerPackage.CONNECTION__CONNECTION_FROM:
			return connectionFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
