/**
 */
package placer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Element Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.ProcessingElementClass#getName <em>Name</em>}</li>
 *   <li>{@link placer.ProcessingElementClass#getResourcesDeclarations <em>Resources Declarations</em>}</li>
 *   <li>{@link placer.ProcessingElementClass#getPropertiesDeclarations <em>Properties Declarations</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getProcessingElementClass()
 * @model abstract="true"
 * @generated
 */
public interface ProcessingElementClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see placer.PlacerPackage#getProcessingElementClass_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link placer.ProcessingElementClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resources Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link placer.ResourcesDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources Declarations</em>' containment reference list.
	 * @see placer.PlacerPackage#getProcessingElementClass_ResourcesDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourcesDeclaration> getResourcesDeclarations();

	/**
	 * Returns the value of the '<em><b>Properties Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link placer.PropertiesDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties Declarations</em>' containment reference list.
	 * @see placer.PlacerPackage#getProcessingElementClass_PropertiesDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertiesDeclaration> getPropertiesDeclarations();

} // ProcessingElementClass
