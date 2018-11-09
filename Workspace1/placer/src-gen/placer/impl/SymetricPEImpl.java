/**
 */
package placer.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import placer.PlacerPackage;
import placer.ProcessingElement;
import placer.SymetricPE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symetric PE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.SymetricPEImpl#getProcessingElementSymetricPE <em>Processing Element Symetric PE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymetricPEImpl extends ConstraintOrObjectiveImpl implements SymetricPE {
	/**
	 * The cached value of the '{@link #getProcessingElementSymetricPE() <em>Processing Element Symetric PE</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingElementSymetricPE()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingElement> processingElementSymetricPE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymetricPEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.SYMETRIC_PE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessingElement> getProcessingElementSymetricPE() {
		if (processingElementSymetricPE == null) {
			processingElementSymetricPE = new EObjectResolvingEList<ProcessingElement>(ProcessingElement.class, this,
					PlacerPackage.SYMETRIC_PE__PROCESSING_ELEMENT_SYMETRIC_PE);
		}
		return processingElementSymetricPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlacerPackage.SYMETRIC_PE__PROCESSING_ELEMENT_SYMETRIC_PE:
			return getProcessingElementSymetricPE();
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
		case PlacerPackage.SYMETRIC_PE__PROCESSING_ELEMENT_SYMETRIC_PE:
			getProcessingElementSymetricPE().clear();
			getProcessingElementSymetricPE().addAll((Collection<? extends ProcessingElement>) newValue);
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
		case PlacerPackage.SYMETRIC_PE__PROCESSING_ELEMENT_SYMETRIC_PE:
			getProcessingElementSymetricPE().clear();
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
		case PlacerPackage.SYMETRIC_PE__PROCESSING_ELEMENT_SYMETRIC_PE:
			return processingElementSymetricPE != null && !processingElementSymetricPE.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SymetricPEImpl
