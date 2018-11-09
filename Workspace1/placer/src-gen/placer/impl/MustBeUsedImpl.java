/**
 */
package placer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import placer.MustBeUsed;
import placer.PlacerPackage;
import placer.ProcessingElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Must Be Used</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.MustBeUsedImpl#getYes <em>Yes</em>}</li>
 *   <li>{@link placer.impl.MustBeUsedImpl#getProcessingElementMustBeUsed <em>Processing Element Must Be Used</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MustBeUsedImpl extends ConstraintOrObjectiveImpl implements MustBeUsed {
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
	 * The cached value of the '{@link #getProcessingElementMustBeUsed() <em>Processing Element Must Be Used</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingElementMustBeUsed()
	 * @generated
	 * @ordered
	 */
	protected ProcessingElement processingElementMustBeUsed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MustBeUsedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.MUST_BE_USED;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.MUST_BE_USED__YES, oldYes, yes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElement getProcessingElementMustBeUsed() {
		if (processingElementMustBeUsed != null && processingElementMustBeUsed.eIsProxy()) {
			InternalEObject oldProcessingElementMustBeUsed = (InternalEObject) processingElementMustBeUsed;
			processingElementMustBeUsed = (ProcessingElement) eResolveProxy(oldProcessingElementMustBeUsed);
			if (processingElementMustBeUsed != oldProcessingElementMustBeUsed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PlacerPackage.MUST_BE_USED__PROCESSING_ELEMENT_MUST_BE_USED, oldProcessingElementMustBeUsed,
							processingElementMustBeUsed));
			}
		}
		return processingElementMustBeUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElement basicGetProcessingElementMustBeUsed() {
		return processingElementMustBeUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingElementMustBeUsed(ProcessingElement newProcessingElementMustBeUsed) {
		ProcessingElement oldProcessingElementMustBeUsed = processingElementMustBeUsed;
		processingElementMustBeUsed = newProcessingElementMustBeUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PlacerPackage.MUST_BE_USED__PROCESSING_ELEMENT_MUST_BE_USED, oldProcessingElementMustBeUsed,
					processingElementMustBeUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlacerPackage.MUST_BE_USED__YES:
			return getYes();
		case PlacerPackage.MUST_BE_USED__PROCESSING_ELEMENT_MUST_BE_USED:
			if (resolve)
				return getProcessingElementMustBeUsed();
			return basicGetProcessingElementMustBeUsed();
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
		case PlacerPackage.MUST_BE_USED__YES:
			setYes((Boolean) newValue);
			return;
		case PlacerPackage.MUST_BE_USED__PROCESSING_ELEMENT_MUST_BE_USED:
			setProcessingElementMustBeUsed((ProcessingElement) newValue);
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
		case PlacerPackage.MUST_BE_USED__YES:
			setYes(YES_EDEFAULT);
			return;
		case PlacerPackage.MUST_BE_USED__PROCESSING_ELEMENT_MUST_BE_USED:
			setProcessingElementMustBeUsed((ProcessingElement) null);
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
		case PlacerPackage.MUST_BE_USED__YES:
			return YES_EDEFAULT == null ? yes != null : !YES_EDEFAULT.equals(yes);
		case PlacerPackage.MUST_BE_USED__PROCESSING_ELEMENT_MUST_BE_USED:
			return processingElementMustBeUsed != null;
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

} //MustBeUsedImpl
