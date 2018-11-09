/**
 */
package placer.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import placer.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlacerFactoryImpl extends EFactoryImpl implements PlacerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlacerFactory init() {
		try {
			PlacerFactory thePlacerFactory = (PlacerFactory) EPackage.Registry.INSTANCE
					.getEFactory(PlacerPackage.eNS_URI);
			if (thePlacerFactory != null) {
				return thePlacerFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlacerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PlacerPackage.TASK:
			return createTask();
		case PlacerPackage.TRANSMISSION:
			return createTransmission();
		case PlacerPackage.MULTI_TASK_PERMANENT_TASKS:
			return createMultiTaskPermanentTasks();
		case PlacerPackage.SWITCHING_TASK:
			return createSwitchingTask();
		case PlacerPackage.BUS:
			return createBus();
		case PlacerPackage.PROCESSING_ELEMENT:
			return createProcessingElement();
		case PlacerPackage.IMPLEMENTATION:
			return createImplementation();
		case PlacerPackage.CONNECTION:
			return createConnection();
		case PlacerPackage.SAME_PE:
			return createSamePE();
		case PlacerPackage.ENERGY_CAP:
			return createEnergyCap();
		case PlacerPackage.RUN_ON:
			return createRunOn();
		case PlacerPackage.POWER_CAP:
			return createPowerCap();
		case PlacerPackage.SYMETRIC_PE:
			return createSymetricPE();
		case PlacerPackage.MUST_BE_USED:
			return createMustBeUsed();
		case PlacerPackage.GLOBAL_INFORMATION:
			return createGlobalInformation();
		case PlacerPackage.MULTI_OBJECTIVE_GOAL:
			return createMultiObjectiveGoal();
		case PlacerPackage.SIMPLE_OBJECTIVE_GOAL:
			return createSimpleObjectiveGoal();
		case PlacerPackage.TASK_GROUP:
			return createTaskGroup();
		case PlacerPackage.GLOBAL:
			return createGlobal();
		case PlacerPackage.MAX_MAKE_SPAN:
			return createMaxMakeSpan();
		case PlacerPackage.RESOURCES_DECLARATION:
			return createResourcesDeclaration();
		case PlacerPackage.PROPERTIES_DECLARATION:
			return createPropertiesDeclaration();
		case PlacerPackage.PARAMETERS:
			return createParameters();
		case PlacerPackage.RESOURCES_DEFINITION:
			return createResourcesDefinition();
		case PlacerPackage.PROPERTIES_DEFINITION:
			return createPropertiesDefinition();
		case PlacerPackage.RESOURCES_USAGE:
			return createResourcesUsage();
		case PlacerPackage.GLOBAL_PROPERTIES:
			return createGlobalProperties();
		case PlacerPackage.TASK_MAPPING:
			return createTaskMapping();
		case PlacerPackage.MAPPING:
			return (EObject) createMapping();
		case PlacerPackage.SHARED_FUNCTION_MAPPING:
			return createSharedFunctionMapping();
		case PlacerPackage.NAME_VALUE:
			return createNameValue();
		case PlacerPackage.MAIN_PLACER_OUT:
			return createMainPlacerOut();
		case PlacerPackage.TRANSMISSION_MAPPING:
			return createTransmissionMapping();
		case PlacerPackage.NEW_ECLASS37:
			return createNewEClass37();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case PlacerPackage.TIMING_OBJECT:
			return createTimingObjectFromString(eDataType, initialValue);
		case PlacerPackage.SIMPLE_GOAL:
			return createSimpleGoalFromString(eDataType, initialValue);
		case PlacerPackage.SOFTWARE_CLASS:
			return createSoftwareClassFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case PlacerPackage.TIMING_OBJECT:
			return convertTimingObjectToString(eDataType, instanceValue);
		case PlacerPackage.SIMPLE_GOAL:
			return convertSimpleGoalToString(eDataType, instanceValue);
		case PlacerPackage.SOFTWARE_CLASS:
			return convertSoftwareClassToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transmission createTransmission() {
		TransmissionImpl transmission = new TransmissionImpl();
		return transmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiTaskPermanentTasks createMultiTaskPermanentTasks() {
		MultiTaskPermanentTasksImpl multiTaskPermanentTasks = new MultiTaskPermanentTasksImpl();
		return multiTaskPermanentTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingTask createSwitchingTask() {
		SwitchingTaskImpl switchingTask = new SwitchingTaskImpl();
		return switchingTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus createBus() {
		BusImpl bus = new BusImpl();
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElement createProcessingElement() {
		ProcessingElementImpl processingElement = new ProcessingElementImpl();
		return processingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation createImplementation() {
		ImplementationImpl implementation = new ImplementationImpl();
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamePE createSamePE() {
		SamePEImpl samePE = new SamePEImpl();
		return samePE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyCap createEnergyCap() {
		EnergyCapImpl energyCap = new EnergyCapImpl();
		return energyCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunOn createRunOn() {
		RunOnImpl runOn = new RunOnImpl();
		return runOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerCap createPowerCap() {
		PowerCapImpl powerCap = new PowerCapImpl();
		return powerCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymetricPE createSymetricPE() {
		SymetricPEImpl symetricPE = new SymetricPEImpl();
		return symetricPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MustBeUsed createMustBeUsed() {
		MustBeUsedImpl mustBeUsed = new MustBeUsedImpl();
		return mustBeUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalInformation createGlobalInformation() {
		GlobalInformationImpl globalInformation = new GlobalInformationImpl();
		return globalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiObjectiveGoal createMultiObjectiveGoal() {
		MultiObjectiveGoalImpl multiObjectiveGoal = new MultiObjectiveGoalImpl();
		return multiObjectiveGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleObjectiveGoal createSimpleObjectiveGoal() {
		SimpleObjectiveGoalImpl simpleObjectiveGoal = new SimpleObjectiveGoalImpl();
		return simpleObjectiveGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskGroup createTaskGroup() {
		TaskGroupImpl taskGroup = new TaskGroupImpl();
		return taskGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Global createGlobal() {
		GlobalImpl global = new GlobalImpl();
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxMakeSpan createMaxMakeSpan() {
		MaxMakeSpanImpl maxMakeSpan = new MaxMakeSpanImpl();
		return maxMakeSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesDefinition createResourcesDefinition() {
		ResourcesDefinitionImpl resourcesDefinition = new ResourcesDefinitionImpl();
		return resourcesDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesDefinition createPropertiesDefinition() {
		PropertiesDefinitionImpl propertiesDefinition = new PropertiesDefinitionImpl();
		return propertiesDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters createParameters() {
		ParametersImpl parameters = new ParametersImpl();
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesDeclaration createResourcesDeclaration() {
		ResourcesDeclarationImpl resourcesDeclaration = new ResourcesDeclarationImpl();
		return resourcesDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesDeclaration createPropertiesDeclaration() {
		PropertiesDeclarationImpl propertiesDeclaration = new PropertiesDeclarationImpl();
		return propertiesDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesUsage createResourcesUsage() {
		ResourcesUsageImpl resourcesUsage = new ResourcesUsageImpl();
		return resourcesUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalProperties createGlobalProperties() {
		GlobalPropertiesImpl globalProperties = new GlobalPropertiesImpl();
		return globalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskMapping createTaskMapping() {
		TaskMappingImpl taskMapping = new TaskMappingImpl();
		return taskMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedFunctionMapping createSharedFunctionMapping() {
		SharedFunctionMappingImpl sharedFunctionMapping = new SharedFunctionMappingImpl();
		return sharedFunctionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameValue createNameValue() {
		NameValueImpl nameValue = new NameValueImpl();
		return nameValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainPlacerOut createMainPlacerOut() {
		MainPlacerOutImpl mainPlacerOut = new MainPlacerOutImpl();
		return mainPlacerOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionMapping createTransmissionMapping() {
		TransmissionMappingImpl transmissionMapping = new TransmissionMappingImpl();
		return transmissionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewEClass37 createNewEClass37() {
		NewEClass37Impl newEClass37 = new NewEClass37Impl();
		return newEClass37;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingObject createTimingObjectFromString(EDataType eDataType, String initialValue) {
		TimingObject result = TimingObject.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimingObjectToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleGoal createSimpleGoalFromString(EDataType eDataType, String initialValue) {
		SimpleGoal result = SimpleGoal.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleGoalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareClass createSoftwareClassFromString(EDataType eDataType, String initialValue) {
		SoftwareClass result = SoftwareClass.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSoftwareClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacerPackage getPlacerPackage() {
		return (PlacerPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlacerPackage getPackage() {
		return PlacerPackage.eINSTANCE;
	}

} //PlacerFactoryImpl
