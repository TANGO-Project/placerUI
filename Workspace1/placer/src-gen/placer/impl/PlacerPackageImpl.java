/**
 */
package placer.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import placer.Bus;
import placer.Connection;
import placer.ConstraintOrObjective;
import placer.EnergyCap;
import placer.Global;
import placer.GlobalInformation;
import placer.GlobalProperties;
import placer.Implementation;
import placer.MainPlacerOut;
import placer.Mapping;
import placer.MappingGoal;
import placer.MaxMakeSpan;
import placer.MultiObjectiveGoal;
import placer.MultiTaskPermanentTasks;
import placer.MustBeUsed;
import placer.NameValue;
import placer.NewEClass37;
import placer.Parameters;
import placer.PlacerFactory;
import placer.PlacerPackage;
import placer.PowerCap;
import placer.ProcessingElement;
import placer.ProcessingElementClass;
import placer.PropertiesDeclaration;
import placer.PropertiesDefinition;
import placer.ResourcesDeclaration;
import placer.ResourcesDefinition;
import placer.ResourcesUsage;
import placer.RunOn;
import placer.SamePE;
import placer.SharedFunctionMapping;
import placer.SimpleGoal;
import placer.SimpleObjectiveGoal;
import placer.SoftwareClass;
import placer.SwitchingTask;
import placer.SymetricPE;
import placer.Task;
import placer.TaskGroup;
import placer.TaskMapping;
import placer.TimingObject;
import placer.Transmission;
import placer.TransmissionMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlacerPackageImpl extends EPackageImpl implements PlacerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transmissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingElementClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiTaskPermanentTasksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchingTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintOrObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass samePEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energyCapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runOnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerCapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symetricPEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mustBeUsedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiObjectiveGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleObjectiveGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxMakeSpanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcesDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcesDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcesUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedFunctionMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainPlacerOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transmissionMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newEClass37EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timingObjectEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum simpleGoalEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum softwareClassEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see placer.PlacerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlacerPackageImpl() {
		super(eNS_URI, PlacerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PlacerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlacerPackage init() {
		if (isInited)
			return (PlacerPackage) EPackage.Registry.INSTANCE.getEPackage(PlacerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPlacerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PlacerPackageImpl thePlacerPackage = registeredPlacerPackage instanceof PlacerPackageImpl
				? (PlacerPackageImpl) registeredPlacerPackage
				: new PlacerPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePlacerPackage.createPackageContents();

		// Initialize created meta-data
		thePlacerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePlacerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlacerPackage.eNS_URI, thePlacerPackage);
		return thePlacerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Transmissions() {
		return (EReference) taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Implementations() {
		return (EReference) taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransmission() {
		return transmissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_From() {
		return (EReference) transmissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_To() {
		return (EReference) transmissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransmission_Amount() {
		return (EAttribute) transmissionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransmission_Timing() {
		return (EAttribute) transmissionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingElementClass() {
		return processingElementClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingElementClass_Name() {
		return (EAttribute) processingElementClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingElementClass_ResourcesDeclarations() {
		return (EReference) processingElementClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingElementClass_PropertiesDeclarations() {
		return (EReference) processingElementClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiTaskPermanentTasks() {
		return multiTaskPermanentTasksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchingTask() {
		return switchingTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchingTask_SwitchingDelay() {
		return (EAttribute) switchingTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBus() {
		return busEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBus_Name() {
		return (EAttribute) busEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBus_TimeUnitPerDataUnit() {
		return (EAttribute) busEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBus_Latency() {
		return (EAttribute) busEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_Connections() {
		return (EReference) busEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingElement() {
		return processingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingElement_Name() {
		return (EAttribute) processingElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingElement_Memory() {
		return (EAttribute) processingElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingElement_PowerModel() {
		return (EAttribute) processingElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingElement_Class() {
		return (EReference) processingElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingElement_ResourcesDefinitions() {
		return (EReference) processingElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingElement_PropertiesDefinitions() {
		return (EReference) processingElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementation() {
		return implementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementation_Name() {
		return (EAttribute) implementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementation_Duration() {
		return (EAttribute) implementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_Parameters() {
		return (EReference) implementationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_ResourcesUsages() {
		return (EReference) implementationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_Target() {
		return (EReference) implementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementation_ComputationMemory() {
		return (EAttribute) implementationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_ConnectionTo() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_ConnectionFrom() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintOrObjective() {
		return constraintOrObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintOrObjective_Info() {
		return (EAttribute) constraintOrObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSamePE() {
		return samePEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSamePE_Yes() {
		return (EAttribute) samePEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSamePE_TaskSamePE() {
		return (EReference) samePEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergyCap() {
		return energyCapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergyCap_EnergyCap() {
		return (EAttribute) energyCapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunOn() {
		return runOnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunOn_Yes() {
		return (EAttribute) runOnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunOn_ProcessingElementRunOn() {
		return (EReference) runOnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunOn_TaskRunOn() {
		return (EReference) runOnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerCap() {
		return powerCapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerCap_PowerCap() {
		return (EAttribute) powerCapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymetricPE() {
		return symetricPEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymetricPE_ProcessingElementSymetricPE() {
		return (EReference) symetricPEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMustBeUsed() {
		return mustBeUsedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMustBeUsed_Yes() {
		return (EAttribute) mustBeUsedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMustBeUsed_ProcessingElementMustBeUsed() {
		return (EReference) mustBeUsedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingGoal() {
		return mappingGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingGoal_SimpleObjective() {
		return (EAttribute) mappingGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalInformation() {
		return globalInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalInformation_Information() {
		return (EAttribute) globalInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalInformation_TimeUnit() {
		return (EAttribute) globalInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalInformation_DataUnit() {
		return (EAttribute) globalInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiObjectiveGoal() {
		return multiObjectiveGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiObjectiveGoal_SimpleObjective2() {
		return (EAttribute) multiObjectiveGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleObjectiveGoal() {
		return simpleObjectiveGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskGroup() {
		return taskGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskGroup_NbInstances() {
		return (EAttribute) taskGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskGroup_TaskTaskGroups() {
		return (EReference) taskGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobal() {
		return globalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobal_ConstraintOrObjectives() {
		return (EReference) globalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobal_PowerCap() {
		return (EReference) globalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobal_EnergyCap() {
		return (EReference) globalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobal_GlobalInformations() {
		return (EReference) globalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobal_MappingGoals() {
		return (EReference) globalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobal_Busses() {
		return (EReference) globalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobal_ProcessingElements() {
		return (EReference) globalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobal_ProcessingElementClasses() {
		return (EReference) globalEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobal_Tasks() {
		return (EReference) globalEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobal_TaskGroups() {
		return (EReference) globalEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobal_MaxMakeSpan() {
		return (EReference) globalEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobal_SoftwareClass() {
		return (EAttribute) globalEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobal_GlobalProperties() {
		return (EReference) globalEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobal_CommandLineParameters() {
		return (EAttribute) globalEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobal_MainPlacerOut1() {
		return (EReference) globalEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxMakeSpan() {
		return maxMakeSpanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxMakeSpan_MaxMakeSpan() {
		return (EAttribute) maxMakeSpanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcesDefinition() {
		return resourcesDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcesDefinition_Name() {
		return (EReference) resourcesDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcesDefinition_Value() {
		return (EAttribute) resourcesDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesDefinition() {
		return propertiesDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertiesDefinition_Name() {
		return (EReference) propertiesDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesDefinition_Value() {
		return (EAttribute) propertiesDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameters() {
		return parametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameters_Name() {
		return (EAttribute) parametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameters_Value() {
		return (EAttribute) parametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcesDeclaration() {
		return resourcesDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcesDeclaration_Name() {
		return (EAttribute) resourcesDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesDeclaration() {
		return propertiesDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesDeclaration_Name() {
		return (EAttribute) propertiesDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcesUsage() {
		return resourcesUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcesUsage_Name() {
		return (EReference) resourcesUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcesUsage_Formula() {
		return (EAttribute) resourcesUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalProperties() {
		return globalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalProperties_Name() {
		return (EAttribute) globalPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalProperties_Value() {
		return (EAttribute) globalPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskMapping() {
		return taskMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskMapping_Task() {
		return (EAttribute) taskMappingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskMapping_ProcessingElement() {
		return (EReference) taskMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskMapping_Implementation() {
		return (EReference) taskMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskMapping_Start() {
		return (EAttribute) taskMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskMapping_Duration() {
		return (EAttribute) taskMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskMapping_End() {
		return (EAttribute) taskMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskMapping_NameValues() {
		return (EReference) taskMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_HardwareName() {
		return (EAttribute) mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_Makespan() {
		return (EAttribute) mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_Energy() {
		return (EAttribute) mappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_TaskMappings() {
		return (EReference) mappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_SharedFunctionMappings() {
		return (EReference) mappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_TransmissionMappings() {
		return (EReference) mappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedFunctionMapping() {
		return sharedFunctionMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedFunctionMapping_SharedImplem() {
		return (EAttribute) sharedFunctionMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedFunctionMapping_NbInstance() {
		return (EAttribute) sharedFunctionMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedFunctionMapping_Host() {
		return (EAttribute) sharedFunctionMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedFunctionMapping_NameValues() {
		return (EReference) sharedFunctionMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameValue() {
		return nameValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameValue_Name() {
		return (EAttribute) nameValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameValue_Value() {
		return (EAttribute) nameValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainPlacerOut() {
		return mainPlacerOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainPlacerOut_Info() {
		return (EAttribute) mainPlacerOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainPlacerOut_JsonFormat() {
		return (EAttribute) mainPlacerOutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainPlacerOut_TimeUnit() {
		return (EAttribute) mainPlacerOutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainPlacerOut_DataUnit() {
		return (EAttribute) mainPlacerOutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainPlacerOut_Mappings() {
		return (EReference) mainPlacerOutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainPlacerOut_FilePath() {
		return (EAttribute) mainPlacerOutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransmissionMapping() {
		return transmissionMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransmissionMapping_Transmission() {
		return (EAttribute) transmissionMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmissionMapping_FromPE() {
		return (EReference) transmissionMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmissionMapping_ToPE() {
		return (EReference) transmissionMappingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransmissionMapping_FromTask() {
		return (EAttribute) transmissionMappingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransmissionMapping_ToTask() {
		return (EAttribute) transmissionMappingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewEClass37() {
		return newEClass37EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmissionMapping_Bus() {
		return (EReference) transmissionMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransmissionMapping_Start() {
		return (EAttribute) transmissionMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransmissionMapping_Duration() {
		return (EAttribute) transmissionMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransmissionMapping_End() {
		return (EAttribute) transmissionMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimingObject() {
		return timingObjectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSimpleGoal() {
		return simpleGoalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSoftwareClass() {
		return softwareClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacerFactory getPlacerFactory() {
		return (PlacerFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__NAME);
		createEReference(taskEClass, TASK__TRANSMISSIONS);
		createEReference(taskEClass, TASK__IMPLEMENTATIONS);

		transmissionEClass = createEClass(TRANSMISSION);
		createEReference(transmissionEClass, TRANSMISSION__FROM);
		createEReference(transmissionEClass, TRANSMISSION__TO);
		createEAttribute(transmissionEClass, TRANSMISSION__AMOUNT);
		createEAttribute(transmissionEClass, TRANSMISSION__TIMING);

		processingElementClassEClass = createEClass(PROCESSING_ELEMENT_CLASS);
		createEAttribute(processingElementClassEClass, PROCESSING_ELEMENT_CLASS__NAME);
		createEReference(processingElementClassEClass, PROCESSING_ELEMENT_CLASS__RESOURCES_DECLARATIONS);
		createEReference(processingElementClassEClass, PROCESSING_ELEMENT_CLASS__PROPERTIES_DECLARATIONS);

		multiTaskPermanentTasksEClass = createEClass(MULTI_TASK_PERMANENT_TASKS);

		switchingTaskEClass = createEClass(SWITCHING_TASK);
		createEAttribute(switchingTaskEClass, SWITCHING_TASK__SWITCHING_DELAY);

		busEClass = createEClass(BUS);
		createEAttribute(busEClass, BUS__NAME);
		createEAttribute(busEClass, BUS__TIME_UNIT_PER_DATA_UNIT);
		createEAttribute(busEClass, BUS__LATENCY);
		createEReference(busEClass, BUS__CONNECTIONS);

		processingElementEClass = createEClass(PROCESSING_ELEMENT);
		createEAttribute(processingElementEClass, PROCESSING_ELEMENT__NAME);
		createEAttribute(processingElementEClass, PROCESSING_ELEMENT__MEMORY);
		createEAttribute(processingElementEClass, PROCESSING_ELEMENT__POWER_MODEL);
		createEReference(processingElementEClass, PROCESSING_ELEMENT__CLASS);
		createEReference(processingElementEClass, PROCESSING_ELEMENT__RESOURCES_DEFINITIONS);
		createEReference(processingElementEClass, PROCESSING_ELEMENT__PROPERTIES_DEFINITIONS);

		implementationEClass = createEClass(IMPLEMENTATION);
		createEAttribute(implementationEClass, IMPLEMENTATION__NAME);
		createEAttribute(implementationEClass, IMPLEMENTATION__DURATION);
		createEReference(implementationEClass, IMPLEMENTATION__TARGET);
		createEAttribute(implementationEClass, IMPLEMENTATION__COMPUTATION_MEMORY);
		createEReference(implementationEClass, IMPLEMENTATION__PARAMETERS);
		createEReference(implementationEClass, IMPLEMENTATION__RESOURCES_USAGES);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__CONNECTION_TO);
		createEReference(connectionEClass, CONNECTION__CONNECTION_FROM);

		constraintOrObjectiveEClass = createEClass(CONSTRAINT_OR_OBJECTIVE);
		createEAttribute(constraintOrObjectiveEClass, CONSTRAINT_OR_OBJECTIVE__INFO);

		samePEEClass = createEClass(SAME_PE);
		createEAttribute(samePEEClass, SAME_PE__YES);
		createEReference(samePEEClass, SAME_PE__TASK_SAME_PE);

		energyCapEClass = createEClass(ENERGY_CAP);
		createEAttribute(energyCapEClass, ENERGY_CAP__ENERGY_CAP);

		runOnEClass = createEClass(RUN_ON);
		createEAttribute(runOnEClass, RUN_ON__YES);
		createEReference(runOnEClass, RUN_ON__PROCESSING_ELEMENT_RUN_ON);
		createEReference(runOnEClass, RUN_ON__TASK_RUN_ON);

		powerCapEClass = createEClass(POWER_CAP);
		createEAttribute(powerCapEClass, POWER_CAP__POWER_CAP);

		symetricPEEClass = createEClass(SYMETRIC_PE);
		createEReference(symetricPEEClass, SYMETRIC_PE__PROCESSING_ELEMENT_SYMETRIC_PE);

		mustBeUsedEClass = createEClass(MUST_BE_USED);
		createEAttribute(mustBeUsedEClass, MUST_BE_USED__YES);
		createEReference(mustBeUsedEClass, MUST_BE_USED__PROCESSING_ELEMENT_MUST_BE_USED);

		mappingGoalEClass = createEClass(MAPPING_GOAL);
		createEAttribute(mappingGoalEClass, MAPPING_GOAL__SIMPLE_OBJECTIVE);

		globalInformationEClass = createEClass(GLOBAL_INFORMATION);
		createEAttribute(globalInformationEClass, GLOBAL_INFORMATION__INFORMATION);
		createEAttribute(globalInformationEClass, GLOBAL_INFORMATION__TIME_UNIT);
		createEAttribute(globalInformationEClass, GLOBAL_INFORMATION__DATA_UNIT);

		multiObjectiveGoalEClass = createEClass(MULTI_OBJECTIVE_GOAL);
		createEAttribute(multiObjectiveGoalEClass, MULTI_OBJECTIVE_GOAL__SIMPLE_OBJECTIVE2);

		simpleObjectiveGoalEClass = createEClass(SIMPLE_OBJECTIVE_GOAL);

		taskGroupEClass = createEClass(TASK_GROUP);
		createEAttribute(taskGroupEClass, TASK_GROUP__NB_INSTANCES);
		createEReference(taskGroupEClass, TASK_GROUP__TASK_TASK_GROUPS);

		globalEClass = createEClass(GLOBAL);
		createEReference(globalEClass, GLOBAL__CONSTRAINT_OR_OBJECTIVES);
		createEReference(globalEClass, GLOBAL__POWER_CAP);
		createEReference(globalEClass, GLOBAL__ENERGY_CAP);
		createEReference(globalEClass, GLOBAL__GLOBAL_INFORMATIONS);
		createEReference(globalEClass, GLOBAL__MAPPING_GOALS);
		createEReference(globalEClass, GLOBAL__BUSSES);
		createEReference(globalEClass, GLOBAL__PROCESSING_ELEMENTS);
		createEReference(globalEClass, GLOBAL__PROCESSING_ELEMENT_CLASSES);
		createEReference(globalEClass, GLOBAL__TASKS);
		createEReference(globalEClass, GLOBAL__TASK_GROUPS);
		createEReference(globalEClass, GLOBAL__MAX_MAKE_SPAN);
		createEAttribute(globalEClass, GLOBAL__SOFTWARE_CLASS);
		createEReference(globalEClass, GLOBAL__GLOBAL_PROPERTIES);
		createEAttribute(globalEClass, GLOBAL__COMMAND_LINE_PARAMETERS);
		createEReference(globalEClass, GLOBAL__MAIN_PLACER_OUT1);

		maxMakeSpanEClass = createEClass(MAX_MAKE_SPAN);
		createEAttribute(maxMakeSpanEClass, MAX_MAKE_SPAN__MAX_MAKE_SPAN);

		resourcesDeclarationEClass = createEClass(RESOURCES_DECLARATION);
		createEAttribute(resourcesDeclarationEClass, RESOURCES_DECLARATION__NAME);

		propertiesDeclarationEClass = createEClass(PROPERTIES_DECLARATION);
		createEAttribute(propertiesDeclarationEClass, PROPERTIES_DECLARATION__NAME);

		parametersEClass = createEClass(PARAMETERS);
		createEAttribute(parametersEClass, PARAMETERS__NAME);
		createEAttribute(parametersEClass, PARAMETERS__VALUE);

		resourcesDefinitionEClass = createEClass(RESOURCES_DEFINITION);
		createEReference(resourcesDefinitionEClass, RESOURCES_DEFINITION__NAME);
		createEAttribute(resourcesDefinitionEClass, RESOURCES_DEFINITION__VALUE);

		propertiesDefinitionEClass = createEClass(PROPERTIES_DEFINITION);
		createEReference(propertiesDefinitionEClass, PROPERTIES_DEFINITION__NAME);
		createEAttribute(propertiesDefinitionEClass, PROPERTIES_DEFINITION__VALUE);

		resourcesUsageEClass = createEClass(RESOURCES_USAGE);
		createEReference(resourcesUsageEClass, RESOURCES_USAGE__NAME);
		createEAttribute(resourcesUsageEClass, RESOURCES_USAGE__FORMULA);

		globalPropertiesEClass = createEClass(GLOBAL_PROPERTIES);
		createEAttribute(globalPropertiesEClass, GLOBAL_PROPERTIES__NAME);
		createEAttribute(globalPropertiesEClass, GLOBAL_PROPERTIES__VALUE);

		taskMappingEClass = createEClass(TASK_MAPPING);
		createEAttribute(taskMappingEClass, TASK_MAPPING__START);
		createEAttribute(taskMappingEClass, TASK_MAPPING__DURATION);
		createEAttribute(taskMappingEClass, TASK_MAPPING__END);
		createEReference(taskMappingEClass, TASK_MAPPING__NAME_VALUES);
		createEReference(taskMappingEClass, TASK_MAPPING__PROCESSING_ELEMENT);
		createEReference(taskMappingEClass, TASK_MAPPING__IMPLEMENTATION);
		createEAttribute(taskMappingEClass, TASK_MAPPING__TASK);

		mappingEClass = createEClass(MAPPING);
		createEAttribute(mappingEClass, MAPPING__HARDWARE_NAME);
		createEAttribute(mappingEClass, MAPPING__MAKESPAN);
		createEAttribute(mappingEClass, MAPPING__ENERGY);
		createEReference(mappingEClass, MAPPING__TASK_MAPPINGS);
		createEReference(mappingEClass, MAPPING__SHARED_FUNCTION_MAPPINGS);
		createEReference(mappingEClass, MAPPING__TRANSMISSION_MAPPINGS);

		sharedFunctionMappingEClass = createEClass(SHARED_FUNCTION_MAPPING);
		createEAttribute(sharedFunctionMappingEClass, SHARED_FUNCTION_MAPPING__SHARED_IMPLEM);
		createEAttribute(sharedFunctionMappingEClass, SHARED_FUNCTION_MAPPING__NB_INSTANCE);
		createEAttribute(sharedFunctionMappingEClass, SHARED_FUNCTION_MAPPING__HOST);
		createEReference(sharedFunctionMappingEClass, SHARED_FUNCTION_MAPPING__NAME_VALUES);

		nameValueEClass = createEClass(NAME_VALUE);
		createEAttribute(nameValueEClass, NAME_VALUE__NAME);
		createEAttribute(nameValueEClass, NAME_VALUE__VALUE);

		mainPlacerOutEClass = createEClass(MAIN_PLACER_OUT);
		createEAttribute(mainPlacerOutEClass, MAIN_PLACER_OUT__INFO);
		createEAttribute(mainPlacerOutEClass, MAIN_PLACER_OUT__JSON_FORMAT);
		createEAttribute(mainPlacerOutEClass, MAIN_PLACER_OUT__TIME_UNIT);
		createEAttribute(mainPlacerOutEClass, MAIN_PLACER_OUT__DATA_UNIT);
		createEReference(mainPlacerOutEClass, MAIN_PLACER_OUT__MAPPINGS);
		createEAttribute(mainPlacerOutEClass, MAIN_PLACER_OUT__FILE_PATH);

		transmissionMappingEClass = createEClass(TRANSMISSION_MAPPING);
		createEAttribute(transmissionMappingEClass, TRANSMISSION_MAPPING__START);
		createEAttribute(transmissionMappingEClass, TRANSMISSION_MAPPING__DURATION);
		createEAttribute(transmissionMappingEClass, TRANSMISSION_MAPPING__END);
		createEReference(transmissionMappingEClass, TRANSMISSION_MAPPING__BUS);
		createEAttribute(transmissionMappingEClass, TRANSMISSION_MAPPING__TRANSMISSION);
		createEReference(transmissionMappingEClass, TRANSMISSION_MAPPING__FROM_PE);
		createEReference(transmissionMappingEClass, TRANSMISSION_MAPPING__TO_PE);
		createEAttribute(transmissionMappingEClass, TRANSMISSION_MAPPING__FROM_TASK);
		createEAttribute(transmissionMappingEClass, TRANSMISSION_MAPPING__TO_TASK);

		newEClass37EClass = createEClass(NEW_ECLASS37);

		// Create enums
		timingObjectEEnum = createEEnum(TIMING_OBJECT);
		simpleGoalEEnum = createEEnum(SIMPLE_GOAL);
		softwareClassEEnum = createEEnum(SOFTWARE_CLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		multiTaskPermanentTasksEClass.getESuperTypes().add(this.getProcessingElementClass());
		switchingTaskEClass.getESuperTypes().add(this.getProcessingElementClass());
		samePEEClass.getESuperTypes().add(this.getConstraintOrObjective());
		runOnEClass.getESuperTypes().add(this.getConstraintOrObjective());
		symetricPEEClass.getESuperTypes().add(this.getConstraintOrObjective());
		mustBeUsedEClass.getESuperTypes().add(this.getConstraintOrObjective());
		multiObjectiveGoalEClass.getESuperTypes().add(this.getMappingGoal());
		simpleObjectiveGoalEClass.getESuperTypes().add(this.getMappingGoal());

		// Initialize classes, features, and operations; add parameters
		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 1, 1, Task.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Transmissions(), this.getTransmission(), null, "transmissions", null, 0, -1, Task.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Implementations(), this.getImplementation(), null, "implementations", null, 1, -1,
				Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transmissionEClass, Transmission.class, "Transmission", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransmission_From(), this.getTask(), null, "from", null, 1, 1, Transmission.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransmission_To(), this.getTask(), null, "to", null, 1, 1, Transmission.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTransmission_Amount(), ecorePackage.getEInt(), "amount", null, 1, 1, Transmission.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransmission_Timing(), this.getTimingObject(), "timing", "Sticky", 1, 1, Transmission.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingElementClassEClass, ProcessingElementClass.class, "ProcessingElementClass", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessingElementClass_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ProcessingElementClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingElementClass_ResourcesDeclarations(), this.getResourcesDeclaration(), null,
				"resourcesDeclarations", null, 0, -1, ProcessingElementClass.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingElementClass_PropertiesDeclarations(), this.getPropertiesDeclaration(), null,
				"propertiesDeclarations", null, 0, -1, ProcessingElementClass.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiTaskPermanentTasksEClass, MultiTaskPermanentTasks.class, "MultiTaskPermanentTasks",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(switchingTaskEClass, SwitchingTask.class, "SwitchingTask", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitchingTask_SwitchingDelay(), ecorePackage.getEInt(), "switchingDelay", null, 1, 1,
				SwitchingTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(busEClass, Bus.class, "Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBus_Name(), ecorePackage.getEString(), "name", null, 1, 1, Bus.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBus_TimeUnitPerDataUnit(), ecorePackage.getEInt(), "timeUnitPerDataUnit", null, 1, 1,
				Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getBus_Latency(), ecorePackage.getEInt(), "latency", null, 1, 1, Bus.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBus_Connections(), this.getConnection(), null, "connections", null, 1, -1, Bus.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingElementEClass, ProcessingElement.class, "ProcessingElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessingElement_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ProcessingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingElement_Memory(), ecorePackage.getEInt(), "memory", null, 1, 1,
				ProcessingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingElement_PowerModel(), ecorePackage.getEString(), "powerModel", null, 1, 1,
				ProcessingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingElement_Class(), this.getProcessingElementClass(), null, "class", null, 1, 1,
				ProcessingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingElement_ResourcesDefinitions(), this.getResourcesDefinition(), null,
				"resourcesDefinitions", null, 0, -1, ProcessingElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingElement_PropertiesDefinitions(), this.getPropertiesDefinition(), null,
				"propertiesDefinitions", null, 0, -1, ProcessingElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationEClass, Implementation.class, "Implementation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Implementation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementation_Duration(), ecorePackage.getEString(), "duration", null, 1, 1,
				Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_Target(), this.getProcessingElementClass(), null, "target", null, 1, 1,
				Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementation_ComputationMemory(), ecorePackage.getEString(), "computationMemory", null, 1,
				1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_Parameters(), this.getParameters(), null, "parameters", null, 0, -1,
				Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_ResourcesUsages(), this.getResourcesUsage(), null, "resourcesUsages", null, 0,
				-1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_ConnectionTo(), this.getProcessingElement(), null, "connectionTo", null, 1, 1,
				Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_ConnectionFrom(), this.getBus(), null, "connectionFrom", null, 1, 1,
				Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintOrObjectiveEClass, ConstraintOrObjective.class, "ConstraintOrObjective", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraintOrObjective_Info(), ecorePackage.getEString(), "info", null, 0, 1,
				ConstraintOrObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(samePEEClass, SamePE.class, "SamePE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSamePE_Yes(), theXMLTypePackage.getBooleanObject(), "yes", "false", 1, 1, SamePE.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSamePE_TaskSamePE(), this.getTask(), null, "taskSamePE", null, 2, -1, SamePE.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(energyCapEClass, EnergyCap.class, "EnergyCap", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnergyCap_EnergyCap(), ecorePackage.getEInt(), "energyCap", null, 1, 1, EnergyCap.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runOnEClass, RunOn.class, "RunOn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRunOn_Yes(), theXMLTypePackage.getBooleanObject(), "yes", "false", 1, 1, RunOn.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunOn_ProcessingElementRunOn(), this.getProcessingElement(), null, "processingElementRunOn",
				null, 1, 1, RunOn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunOn_TaskRunOn(), this.getTask(), null, "taskRunOn", null, 1, 1, RunOn.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(powerCapEClass, PowerCap.class, "PowerCap", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPowerCap_PowerCap(), ecorePackage.getEInt(), "powerCap", null, 1, 1, PowerCap.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symetricPEEClass, SymetricPE.class, "SymetricPE", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymetricPE_ProcessingElementSymetricPE(), this.getProcessingElement(), null,
				"processingElementSymetricPE", null, 2, -1, SymetricPE.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mustBeUsedEClass, MustBeUsed.class, "MustBeUsed", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMustBeUsed_Yes(), theXMLTypePackage.getBooleanObject(), "yes", "false", 1, 1,
				MustBeUsed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMustBeUsed_ProcessingElementMustBeUsed(), this.getProcessingElement(), null,
				"processingElementMustBeUsed", null, 1, 1, MustBeUsed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingGoalEClass, MappingGoal.class, "MappingGoal", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappingGoal_SimpleObjective(), this.getSimpleGoal(), "simpleObjective", "minEnergy", 1, 1,
				MappingGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(globalInformationEClass, GlobalInformation.class, "GlobalInformation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalInformation_Information(), ecorePackage.getEString(), "information", null, 1, 1,
				GlobalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalInformation_TimeUnit(), ecorePackage.getEString(), "timeUnit", null, 1, 1,
				GlobalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalInformation_DataUnit(), ecorePackage.getEString(), "dataUnit", null, 1, 1,
				GlobalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(multiObjectiveGoalEClass, MultiObjectiveGoal.class, "MultiObjectiveGoal", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiObjectiveGoal_SimpleObjective2(), this.getSimpleGoal(), "simpleObjective2",
				"minMakespan", 1, 1, MultiObjectiveGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleObjectiveGoalEClass, SimpleObjectiveGoal.class, "SimpleObjectiveGoal", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskGroupEClass, TaskGroup.class, "TaskGroup", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskGroup_NbInstances(), ecorePackage.getEInt(), "nbInstances", null, 1, 1, TaskGroup.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskGroup_TaskTaskGroups(), this.getTask(), null, "taskTaskGroups", null, 1, -1,
				TaskGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalEClass, Global.class, "Global", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobal_ConstraintOrObjectives(), this.getConstraintOrObjective(), null,
				"constraintOrObjectives", null, 0, -1, Global.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobal_PowerCap(), this.getPowerCap(), null, "powerCap", null, 0, 1, Global.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobal_EnergyCap(), this.getEnergyCap(), null, "energyCap", null, 0, 1, Global.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobal_GlobalInformations(), this.getGlobalInformation(), null, "globalInformations", null, 1,
				1, Global.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobal_MappingGoals(), this.getMappingGoal(), null, "mappingGoals", null, 0, 1, Global.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobal_Busses(), this.getBus(), null, "busses", null, 0, -1, Global.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGlobal_ProcessingElements(), this.getProcessingElement(), null, "processingElements", null, 1,
				-1, Global.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobal_ProcessingElementClasses(), this.getProcessingElementClass(), null,
				"processingElementClasses", null, 1, -1, Global.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobal_Tasks(), this.getTask(), null, "tasks", null, 1, -1, Global.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGlobal_TaskGroups(), this.getTaskGroup(), null, "taskGroups", null, 0, -1, Global.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobal_MaxMakeSpan(), this.getMaxMakeSpan(), null, "maxMakeSpan", null, 0, 1, Global.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobal_SoftwareClass(), this.getSoftwareClass(), "softwareClass", "oneShotSoftware", 0, 1,
				Global.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getGlobal_GlobalProperties(), this.getGlobalProperties(), null, "globalProperties", null, 0, -1,
				Global.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobal_CommandLineParameters(), ecorePackage.getEString(), "commandLineParameters", null, 0,
				1, Global.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getGlobal_MainPlacerOut1(), this.getMainPlacerOut(), null, "mainPlacerOut1", null, 0, 1,
				Global.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxMakeSpanEClass, MaxMakeSpan.class, "MaxMakeSpan", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxMakeSpan_MaxMakeSpan(), ecorePackage.getEInt(), "maxMakeSpan", null, 1, 1,
				MaxMakeSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(resourcesDeclarationEClass, ResourcesDeclaration.class, "ResourcesDeclaration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourcesDeclaration_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ResourcesDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesDeclarationEClass, PropertiesDeclaration.class, "PropertiesDeclaration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertiesDeclaration_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				PropertiesDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametersEClass, Parameters.class, "Parameters", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameters_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameters.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameters_Value(), ecorePackage.getEInt(), "value", null, 1, -1, Parameters.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcesDefinitionEClass, ResourcesDefinition.class, "ResourcesDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourcesDefinition_Name(), this.getResourcesDeclaration(), null, "name", null, 1, 1,
				ResourcesDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcesDefinition_Value(), ecorePackage.getEInt(), "value", null, 1, 1,
				ResourcesDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesDefinitionEClass, PropertiesDefinition.class, "PropertiesDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertiesDefinition_Name(), this.getPropertiesDeclaration(), null, "name", null, 1, 1,
				PropertiesDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertiesDefinition_Value(), ecorePackage.getEInt(), "value", null, 1, 1,
				PropertiesDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcesUsageEClass, ResourcesUsage.class, "ResourcesUsage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourcesUsage_Name(), this.getResourcesDeclaration(), null, "name", null, 1, 1,
				ResourcesUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcesUsage_Formula(), ecorePackage.getEString(), "formula", null, 1, 1,
				ResourcesUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(globalPropertiesEClass, GlobalProperties.class, "GlobalProperties", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalProperties_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				GlobalProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalProperties_Value(), ecorePackage.getEInt(), "value", null, 1, 1, GlobalProperties.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskMappingEClass, TaskMapping.class, "TaskMapping", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskMapping_Start(), ecorePackage.getEInt(), "start", null, 1, 1, TaskMapping.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskMapping_Duration(), ecorePackage.getEInt(), "duration", null, 1, 1, TaskMapping.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskMapping_End(), ecorePackage.getEInt(), "end", null, 1, 1, TaskMapping.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskMapping_NameValues(), this.getNameValue(), null, "nameValues", null, 0, -1,
				TaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskMapping_ProcessingElement(), this.getProcessingElement(), null, "processingElement", null,
				1, 1, TaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskMapping_Implementation(), this.getImplementation(), null, "implementation", null, 1, 1,
				TaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskMapping_Task(), ecorePackage.getEString(), "task", null, 1, 1, TaskMapping.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapping_HardwareName(), ecorePackage.getEString(), "hardwareName", null, 1, 1, Mapping.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapping_Makespan(), ecorePackage.getEInt(), "makespan", null, 1, 1, Mapping.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapping_Energy(), ecorePackage.getEInt(), "energy", null, 1, 1, Mapping.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_TaskMappings(), this.getTaskMapping(), null, "taskMappings", null, 0, -1,
				Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_SharedFunctionMappings(), this.getSharedFunctionMapping(), null,
				"sharedFunctionMappings", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_TransmissionMappings(), this.getTransmissionMapping(), null, "transmissionMappings",
				null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedFunctionMappingEClass, SharedFunctionMapping.class, "SharedFunctionMapping", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSharedFunctionMapping_SharedImplem(), ecorePackage.getEString(), "sharedImplem", null, 1, 1,
				SharedFunctionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedFunctionMapping_NbInstance(), ecorePackage.getEInt(), "nbInstance", null, 1, 1,
				SharedFunctionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedFunctionMapping_Host(), ecorePackage.getEString(), "host", null, 1, 1,
				SharedFunctionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedFunctionMapping_NameValues(), this.getNameValue(), null, "nameValues", null, 0, -1,
				SharedFunctionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameValueEClass, NameValue.class, "NameValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameValue_Name(), ecorePackage.getEString(), "name", null, 1, 1, NameValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, NameValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainPlacerOutEClass, MainPlacerOut.class, "MainPlacerOut", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMainPlacerOut_Info(), ecorePackage.getEString(), "info", null, 1, 1, MainPlacerOut.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMainPlacerOut_JsonFormat(), ecorePackage.getEString(), "jsonFormat", null, 1, 1,
				MainPlacerOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMainPlacerOut_TimeUnit(), ecorePackage.getEString(), "timeUnit", null, 1, 1,
				MainPlacerOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMainPlacerOut_DataUnit(), ecorePackage.getEString(), "dataUnit", null, 1, 1,
				MainPlacerOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMainPlacerOut_Mappings(), this.getMapping(), null, "mappings", null, 1, -1,
				MainPlacerOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMainPlacerOut_FilePath(), ecorePackage.getEString(), "filePath", null, 1, 1,
				MainPlacerOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(transmissionMappingEClass, TransmissionMapping.class, "TransmissionMapping", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransmissionMapping_Start(), ecorePackage.getEInt(), "start", null, 1, 1,
				TransmissionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransmissionMapping_Duration(), ecorePackage.getEInt(), "duration", null, 1, 1,
				TransmissionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransmissionMapping_End(), ecorePackage.getEInt(), "end", null, 1, 1,
				TransmissionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransmissionMapping_Bus(), this.getBus(), null, "bus", null, 1, 1, TransmissionMapping.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransmissionMapping_Transmission(), ecorePackage.getEString(), "transmission", null, 1, 1,
				TransmissionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransmissionMapping_FromPE(), this.getProcessingElement(), null, "fromPE", null, 1, 1,
				TransmissionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransmissionMapping_ToPE(), this.getProcessingElement(), null, "toPE", null, 1, 1,
				TransmissionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransmissionMapping_FromTask(), ecorePackage.getEString(), "fromTask", null, 1, 1,
				TransmissionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransmissionMapping_ToTask(), ecorePackage.getEString(), "toTask", null, 1, 1,
				TransmissionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newEClass37EClass, NewEClass37.class, "NewEClass37", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(timingObjectEEnum, TimingObject.class, "TimingObject");
		addEEnumLiteral(timingObjectEEnum, TimingObject.ASAP);
		addEEnumLiteral(timingObjectEEnum, TimingObject.ALAP);
		addEEnumLiteral(timingObjectEEnum, TimingObject.STICKY);
		addEEnumLiteral(timingObjectEEnum, TimingObject.FREE);

		initEEnum(simpleGoalEEnum, SimpleGoal.class, "SimpleGoal");
		addEEnumLiteral(simpleGoalEEnum, SimpleGoal.MIN_MAKESPAN);
		addEEnumLiteral(simpleGoalEEnum, SimpleGoal.MIN_ENERGY);
		addEEnumLiteral(simpleGoalEEnum, SimpleGoal.MIN_FRAME);

		initEEnum(softwareClassEEnum, SoftwareClass.class, "SoftwareClass");
		addEEnumLiteral(softwareClassEEnum, SoftwareClass.ONE_SHOT_SOFTWARE);
		addEEnumLiteral(softwareClassEEnum, SoftwareClass.ITERATIVE);

		// Create resource
		createResource(eNS_URI);
	}

} //PlacerPackageImpl
