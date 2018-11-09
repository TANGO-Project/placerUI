/**
 */
package placer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.ProcessingElement#getName <em>Name</em>}</li>
 *   <li>{@link placer.ProcessingElement#getMemory <em>Memory</em>}</li>
 *   <li>{@link placer.ProcessingElement#getPowerModel <em>Power Model</em>}</li>
 *   <li>{@link placer.ProcessingElement#getClass_ <em>Class</em>}</li>
 *   <li>{@link placer.ProcessingElement#getResourcesDefinitions <em>Resources Definitions</em>}</li>
 *   <li>{@link placer.ProcessingElement#getPropertiesDefinitions <em>Properties Definitions</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getProcessingElement()
 * @model
 * @generated
 */
public interface ProcessingElement extends EObject {
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
	 * @see placer.PlacerPackage#getProcessingElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link placer.ProcessingElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' attribute.
	 * @see #setMemory(int)
	 * @see placer.PlacerPackage#getProcessingElement_Memory()
	 * @model required="true"
	 * @generated
	 */
	int getMemory();

	/**
	 * Sets the value of the '{@link placer.ProcessingElement#getMemory <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' attribute.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(int value);

	/**
	 * Returns the value of the '<em><b>Power Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Model</em>' attribute.
	 * @see #setPowerModel(String)
	 * @see placer.PlacerPackage#getProcessingElement_PowerModel()
	 * @model required="true"
	 * @generated
	 */
	String getPowerModel();

	/**
	 * Sets the value of the '{@link placer.ProcessingElement#getPowerModel <em>Power Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Model</em>' attribute.
	 * @see #getPowerModel()
	 * @generated
	 */
	void setPowerModel(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(ProcessingElementClass)
	 * @see placer.PlacerPackage#getProcessingElement_Class()
	 * @model required="true"
	 * @generated
	 */
	ProcessingElementClass getClass_();

	/**
	 * Sets the value of the '{@link placer.ProcessingElement#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(ProcessingElementClass value);

	/**
	 * Returns the value of the '<em><b>Resources Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link placer.ResourcesDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources Definitions</em>' containment reference list.
	 * @see placer.PlacerPackage#getProcessingElement_ResourcesDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourcesDefinition> getResourcesDefinitions();

	/**
	 * Returns the value of the '<em><b>Properties Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link placer.PropertiesDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties Definitions</em>' containment reference list.
	 * @see placer.PlacerPackage#getProcessingElement_PropertiesDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertiesDefinition> getPropertiesDefinitions();

} // ProcessingElement
