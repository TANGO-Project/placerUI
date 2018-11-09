/**
 */
package placer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link placer.Global#getConstraintOrObjectives <em>Constraint Or Objectives</em>}</li>
 *   <li>{@link placer.Global#getPowerCap <em>Power Cap</em>}</li>
 *   <li>{@link placer.Global#getEnergyCap <em>Energy Cap</em>}</li>
 *   <li>{@link placer.Global#getGlobalInformations <em>Global Informations</em>}</li>
 *   <li>{@link placer.Global#getMappingGoals <em>Mapping Goals</em>}</li>
 *   <li>{@link placer.Global#getBusses <em>Busses</em>}</li>
 *   <li>{@link placer.Global#getProcessingElements <em>Processing Elements</em>}</li>
 *   <li>{@link placer.Global#getProcessingElementClasses <em>Processing Element Classes</em>}</li>
 *   <li>{@link placer.Global#getTasks <em>Tasks</em>}</li>
 *   <li>{@link placer.Global#getTaskGroups <em>Task Groups</em>}</li>
 *   <li>{@link placer.Global#getMaxMakeSpan <em>Max Make Span</em>}</li>
 *   <li>{@link placer.Global#getSoftwareClass <em>Software Class</em>}</li>
 *   <li>{@link placer.Global#getGlobalProperties <em>Global Properties</em>}</li>
 *   <li>{@link placer.Global#getCommandLineParameters <em>Command Line Parameters</em>}</li>
 *   <li>{@link placer.Global#getMainPlacerOut1 <em>Main Placer Out1</em>}</li>
 * </ul>
 *
 * @see placer.PlacerPackage#getGlobal()
 * @model
 * @generated
 */
public interface Global extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint Or Objectives</b></em>' containment reference list.
	 * The list contents are of type {@link placer.ConstraintOrObjective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Or Objectives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Or Objectives</em>' containment reference list.
	 * @see placer.PlacerPackage#getGlobal_ConstraintOrObjectives()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstraintOrObjective> getConstraintOrObjectives();

	/**
	 * Returns the value of the '<em><b>Power Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Cap</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Cap</em>' containment reference.
	 * @see #setPowerCap(PowerCap)
	 * @see placer.PlacerPackage#getGlobal_PowerCap()
	 * @model containment="true"
	 * @generated
	 */
	PowerCap getPowerCap();

	/**
	 * Sets the value of the '{@link placer.Global#getPowerCap <em>Power Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Cap</em>' containment reference.
	 * @see #getPowerCap()
	 * @generated
	 */
	void setPowerCap(PowerCap value);

	/**
	 * Returns the value of the '<em><b>Energy Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Cap</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Cap</em>' containment reference.
	 * @see #setEnergyCap(EnergyCap)
	 * @see placer.PlacerPackage#getGlobal_EnergyCap()
	 * @model containment="true"
	 * @generated
	 */
	EnergyCap getEnergyCap();

	/**
	 * Sets the value of the '{@link placer.Global#getEnergyCap <em>Energy Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Cap</em>' containment reference.
	 * @see #getEnergyCap()
	 * @generated
	 */
	void setEnergyCap(EnergyCap value);

	/**
	 * Returns the value of the '<em><b>Global Informations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Informations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Informations</em>' containment reference.
	 * @see #setGlobalInformations(GlobalInformation)
	 * @see placer.PlacerPackage#getGlobal_GlobalInformations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GlobalInformation getGlobalInformations();

	/**
	 * Sets the value of the '{@link placer.Global#getGlobalInformations <em>Global Informations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Informations</em>' containment reference.
	 * @see #getGlobalInformations()
	 * @generated
	 */
	void setGlobalInformations(GlobalInformation value);

	/**
	 * Returns the value of the '<em><b>Mapping Goals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Goals</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Goals</em>' containment reference.
	 * @see #setMappingGoals(MappingGoal)
	 * @see placer.PlacerPackage#getGlobal_MappingGoals()
	 * @model containment="true"
	 * @generated
	 */
	MappingGoal getMappingGoals();

	/**
	 * Sets the value of the '{@link placer.Global#getMappingGoals <em>Mapping Goals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Goals</em>' containment reference.
	 * @see #getMappingGoals()
	 * @generated
	 */
	void setMappingGoals(MappingGoal value);

	/**
	 * Returns the value of the '<em><b>Busses</b></em>' containment reference list.
	 * The list contents are of type {@link placer.Bus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Busses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busses</em>' containment reference list.
	 * @see placer.PlacerPackage#getGlobal_Busses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bus> getBusses();

	/**
	 * Returns the value of the '<em><b>Processing Elements</b></em>' containment reference list.
	 * The list contents are of type {@link placer.ProcessingElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Elements</em>' containment reference list.
	 * @see placer.PlacerPackage#getGlobal_ProcessingElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProcessingElement> getProcessingElements();

	/**
	 * Returns the value of the '<em><b>Processing Element Classes</b></em>' containment reference list.
	 * The list contents are of type {@link placer.ProcessingElementClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Element Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Element Classes</em>' containment reference list.
	 * @see placer.PlacerPackage#getGlobal_ProcessingElementClasses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProcessingElementClass> getProcessingElementClasses();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link placer.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see placer.PlacerPackage#getGlobal_Tasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Task Groups</b></em>' containment reference list.
	 * The list contents are of type {@link placer.TaskGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Groups</em>' containment reference list.
	 * @see placer.PlacerPackage#getGlobal_TaskGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskGroup> getTaskGroups();

	/**
	 * Returns the value of the '<em><b>Max Make Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Make Span</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Make Span</em>' containment reference.
	 * @see #setMaxMakeSpan(MaxMakeSpan)
	 * @see placer.PlacerPackage#getGlobal_MaxMakeSpan()
	 * @model containment="true"
	 * @generated
	 */
	MaxMakeSpan getMaxMakeSpan();

	/**
	 * Sets the value of the '{@link placer.Global#getMaxMakeSpan <em>Max Make Span</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Make Span</em>' containment reference.
	 * @see #getMaxMakeSpan()
	 * @generated
	 */
	void setMaxMakeSpan(MaxMakeSpan value);

	/**
	 * Returns the value of the '<em><b>Software Class</b></em>' attribute.
	 * The default value is <code>"oneShotSoftware"</code>.
	 * The literals are from the enumeration {@link placer.SoftwareClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Class</em>' attribute.
	 * @see placer.SoftwareClass
	 * @see #setSoftwareClass(SoftwareClass)
	 * @see placer.PlacerPackage#getGlobal_SoftwareClass()
	 * @model default="oneShotSoftware" dataType="placer.SoftwareClass"
	 * @generated
	 */
	SoftwareClass getSoftwareClass();

	/**
	 * Sets the value of the '{@link placer.Global#getSoftwareClass <em>Software Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Class</em>' attribute.
	 * @see placer.SoftwareClass
	 * @see #getSoftwareClass()
	 * @generated
	 */
	void setSoftwareClass(SoftwareClass value);

	/**
	 * Returns the value of the '<em><b>Global Properties</b></em>' containment reference list.
	 * The list contents are of type {@link placer.GlobalProperties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Properties</em>' containment reference list.
	 * @see placer.PlacerPackage#getGlobal_GlobalProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalProperties> getGlobalProperties();

	/**
	 * Returns the value of the '<em><b>Command Line Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command Line Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Line Parameters</em>' attribute.
	 * @see #setCommandLineParameters(String)
	 * @see placer.PlacerPackage#getGlobal_CommandLineParameters()
	 * @model
	 * @generated
	 */
	String getCommandLineParameters();

	/**
	 * Sets the value of the '{@link placer.Global#getCommandLineParameters <em>Command Line Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Line Parameters</em>' attribute.
	 * @see #getCommandLineParameters()
	 * @generated
	 */
	void setCommandLineParameters(String value);

	/**
	 * Returns the value of the '<em><b>Main Placer Out1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Placer Out1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Placer Out1</em>' containment reference.
	 * @see #setMainPlacerOut1(MainPlacerOut)
	 * @see placer.PlacerPackage#getGlobal_MainPlacerOut1()
	 * @model containment="true"
	 * @generated
	 */
	MainPlacerOut getMainPlacerOut1();

	/**
	 * Sets the value of the '{@link placer.Global#getMainPlacerOut1 <em>Main Placer Out1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Placer Out1</em>' containment reference.
	 * @see #getMainPlacerOut1()
	 * @generated
	 */
	void setMainPlacerOut1(MainPlacerOut value);

} // Global
