/**
 */
package placer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see placer.PlacerPackage
 * @generated
 */
public interface PlacerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlacerFactory eINSTANCE = placer.impl.PlacerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Transmission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transmission</em>'.
	 * @generated
	 */
	Transmission createTransmission();

	/**
	 * Returns a new object of class '<em>Multi Task Permanent Tasks</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Task Permanent Tasks</em>'.
	 * @generated
	 */
	MultiTaskPermanentTasks createMultiTaskPermanentTasks();

	/**
	 * Returns a new object of class '<em>Switching Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switching Task</em>'.
	 * @generated
	 */
	SwitchingTask createSwitchingTask();

	/**
	 * Returns a new object of class '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus</em>'.
	 * @generated
	 */
	Bus createBus();

	/**
	 * Returns a new object of class '<em>Processing Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Element</em>'.
	 * @generated
	 */
	ProcessingElement createProcessingElement();

	/**
	 * Returns a new object of class '<em>Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation</em>'.
	 * @generated
	 */
	Implementation createImplementation();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Same PE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Same PE</em>'.
	 * @generated
	 */
	SamePE createSamePE();

	/**
	 * Returns a new object of class '<em>Energy Cap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Energy Cap</em>'.
	 * @generated
	 */
	EnergyCap createEnergyCap();

	/**
	 * Returns a new object of class '<em>Run On</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Run On</em>'.
	 * @generated
	 */
	RunOn createRunOn();

	/**
	 * Returns a new object of class '<em>Power Cap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Cap</em>'.
	 * @generated
	 */
	PowerCap createPowerCap();

	/**
	 * Returns a new object of class '<em>Symetric PE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symetric PE</em>'.
	 * @generated
	 */
	SymetricPE createSymetricPE();

	/**
	 * Returns a new object of class '<em>Must Be Used</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Must Be Used</em>'.
	 * @generated
	 */
	MustBeUsed createMustBeUsed();

	/**
	 * Returns a new object of class '<em>Global Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Information</em>'.
	 * @generated
	 */
	GlobalInformation createGlobalInformation();

	/**
	 * Returns a new object of class '<em>Multi Objective Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Objective Goal</em>'.
	 * @generated
	 */
	MultiObjectiveGoal createMultiObjectiveGoal();

	/**
	 * Returns a new object of class '<em>Simple Objective Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Objective Goal</em>'.
	 * @generated
	 */
	SimpleObjectiveGoal createSimpleObjectiveGoal();

	/**
	 * Returns a new object of class '<em>Task Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Group</em>'.
	 * @generated
	 */
	TaskGroup createTaskGroup();

	/**
	 * Returns a new object of class '<em>Global</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global</em>'.
	 * @generated
	 */
	Global createGlobal();

	/**
	 * Returns a new object of class '<em>Max Make Span</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Make Span</em>'.
	 * @generated
	 */
	MaxMakeSpan createMaxMakeSpan();

	/**
	 * Returns a new object of class '<em>Resources Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resources Definition</em>'.
	 * @generated
	 */
	ResourcesDefinition createResourcesDefinition();

	/**
	 * Returns a new object of class '<em>Properties Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties Definition</em>'.
	 * @generated
	 */
	PropertiesDefinition createPropertiesDefinition();

	/**
	 * Returns a new object of class '<em>Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameters</em>'.
	 * @generated
	 */
	Parameters createParameters();

	/**
	 * Returns a new object of class '<em>Resources Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resources Declaration</em>'.
	 * @generated
	 */
	ResourcesDeclaration createResourcesDeclaration();

	/**
	 * Returns a new object of class '<em>Properties Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties Declaration</em>'.
	 * @generated
	 */
	PropertiesDeclaration createPropertiesDeclaration();

	/**
	 * Returns a new object of class '<em>Resources Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resources Usage</em>'.
	 * @generated
	 */
	ResourcesUsage createResourcesUsage();

	/**
	 * Returns a new object of class '<em>Global Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Properties</em>'.
	 * @generated
	 */
	GlobalProperties createGlobalProperties();

	/**
	 * Returns a new object of class '<em>Task Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Mapping</em>'.
	 * @generated
	 */
	TaskMapping createTaskMapping();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns a new object of class '<em>Shared Function Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Function Mapping</em>'.
	 * @generated
	 */
	SharedFunctionMapping createSharedFunctionMapping();

	/**
	 * Returns a new object of class '<em>Name Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Value</em>'.
	 * @generated
	 */
	NameValue createNameValue();

	/**
	 * Returns a new object of class '<em>Main Placer Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main Placer Out</em>'.
	 * @generated
	 */
	MainPlacerOut createMainPlacerOut();

	/**
	 * Returns a new object of class '<em>Transmission Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transmission Mapping</em>'.
	 * @generated
	 */
	TransmissionMapping createTransmissionMapping();

	/**
	 * Returns a new object of class '<em>New EClass37</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New EClass37</em>'.
	 * @generated
	 */
	NewEClass37 createNewEClass37();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PlacerPackage getPlacerPackage();

} //PlacerFactory
