/**
 */
package placer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import placer.MaxMakeSpan;
import placer.PlacerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Make Span</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.MaxMakeSpanImpl#getMaxMakeSpan <em>Max Make Span</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaxMakeSpanImpl extends MinimalEObjectImpl.Container implements MaxMakeSpan {
	/**
	 * The default value of the '{@link #getMaxMakeSpan() <em>Max Make Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMakeSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_MAKE_SPAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxMakeSpan() <em>Max Make Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMakeSpan()
	 * @generated
	 * @ordered
	 */
	protected int maxMakeSpan = MAX_MAKE_SPAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaxMakeSpanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.MAX_MAKE_SPAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxMakeSpan() {
		return maxMakeSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxMakeSpan(int newMaxMakeSpan) {
		int oldMaxMakeSpan = maxMakeSpan;
		maxMakeSpan = newMaxMakeSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.MAX_MAKE_SPAN__MAX_MAKE_SPAN,
					oldMaxMakeSpan, maxMakeSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlacerPackage.MAX_MAKE_SPAN__MAX_MAKE_SPAN:
			return getMaxMakeSpan();
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
		case PlacerPackage.MAX_MAKE_SPAN__MAX_MAKE_SPAN:
			setMaxMakeSpan((Integer) newValue);
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
		case PlacerPackage.MAX_MAKE_SPAN__MAX_MAKE_SPAN:
			setMaxMakeSpan(MAX_MAKE_SPAN_EDEFAULT);
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
		case PlacerPackage.MAX_MAKE_SPAN__MAX_MAKE_SPAN:
			return maxMakeSpan != MAX_MAKE_SPAN_EDEFAULT;
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
		result.append(" (maxMakeSpan: ");
		result.append(maxMakeSpan);
		result.append(')');
		return result.toString();
	}

} //MaxMakeSpanImpl
