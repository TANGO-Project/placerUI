/**
 */
package placer.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import placer.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see placer.PlacerPackage
 * @generated
 */
public class PlacerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlacerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PlacerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlacerSwitch<Adapter> modelSwitch = new PlacerSwitch<Adapter>() {
		@Override
		public Adapter caseTask(Task object) {
			return createTaskAdapter();
		}

		@Override
		public Adapter caseTransmission(Transmission object) {
			return createTransmissionAdapter();
		}

		@Override
		public Adapter caseProcessingElementClass(ProcessingElementClass object) {
			return createProcessingElementClassAdapter();
		}

		@Override
		public Adapter caseMultiTaskPermanentTasks(MultiTaskPermanentTasks object) {
			return createMultiTaskPermanentTasksAdapter();
		}

		@Override
		public Adapter caseSwitchingTask(SwitchingTask object) {
			return createSwitchingTaskAdapter();
		}

		@Override
		public Adapter caseBus(Bus object) {
			return createBusAdapter();
		}

		@Override
		public Adapter caseProcessingElement(ProcessingElement object) {
			return createProcessingElementAdapter();
		}

		@Override
		public Adapter caseImplementation(Implementation object) {
			return createImplementationAdapter();
		}

		@Override
		public Adapter caseConnection(Connection object) {
			return createConnectionAdapter();
		}

		@Override
		public Adapter caseConstraintOrObjective(ConstraintOrObjective object) {
			return createConstraintOrObjectiveAdapter();
		}

		@Override
		public Adapter caseSamePE(SamePE object) {
			return createSamePEAdapter();
		}

		@Override
		public Adapter caseEnergyCap(EnergyCap object) {
			return createEnergyCapAdapter();
		}

		@Override
		public Adapter caseRunOn(RunOn object) {
			return createRunOnAdapter();
		}

		@Override
		public Adapter casePowerCap(PowerCap object) {
			return createPowerCapAdapter();
		}

		@Override
		public Adapter caseSymetricPE(SymetricPE object) {
			return createSymetricPEAdapter();
		}

		@Override
		public Adapter caseMustBeUsed(MustBeUsed object) {
			return createMustBeUsedAdapter();
		}

		@Override
		public Adapter caseMappingGoal(MappingGoal object) {
			return createMappingGoalAdapter();
		}

		@Override
		public Adapter caseGlobalInformation(GlobalInformation object) {
			return createGlobalInformationAdapter();
		}

		@Override
		public Adapter caseMultiObjectiveGoal(MultiObjectiveGoal object) {
			return createMultiObjectiveGoalAdapter();
		}

		@Override
		public Adapter caseSimpleObjectiveGoal(SimpleObjectiveGoal object) {
			return createSimpleObjectiveGoalAdapter();
		}

		@Override
		public Adapter caseTaskGroup(TaskGroup object) {
			return createTaskGroupAdapter();
		}

		@Override
		public Adapter caseGlobal(Global object) {
			return createGlobalAdapter();
		}

		@Override
		public Adapter caseMaxMakeSpan(MaxMakeSpan object) {
			return createMaxMakeSpanAdapter();
		}

		@Override
		public Adapter caseResourcesDeclaration(ResourcesDeclaration object) {
			return createResourcesDeclarationAdapter();
		}

		@Override
		public Adapter casePropertiesDeclaration(PropertiesDeclaration object) {
			return createPropertiesDeclarationAdapter();
		}

		@Override
		public Adapter caseParameters(Parameters object) {
			return createParametersAdapter();
		}

		@Override
		public Adapter caseResourcesDefinition(ResourcesDefinition object) {
			return createResourcesDefinitionAdapter();
		}

		@Override
		public Adapter casePropertiesDefinition(PropertiesDefinition object) {
			return createPropertiesDefinitionAdapter();
		}

		@Override
		public Adapter caseResourcesUsage(ResourcesUsage object) {
			return createResourcesUsageAdapter();
		}

		@Override
		public Adapter caseGlobalProperties(GlobalProperties object) {
			return createGlobalPropertiesAdapter();
		}

		@Override
		public Adapter caseTaskMapping(TaskMapping object) {
			return createTaskMappingAdapter();
		}

		@Override
		public Adapter caseMapping(Mapping object) {
			return createMappingAdapter();
		}

		@Override
		public Adapter caseSharedFunctionMapping(SharedFunctionMapping object) {
			return createSharedFunctionMappingAdapter();
		}

		@Override
		public Adapter caseNameValue(NameValue object) {
			return createNameValueAdapter();
		}

		@Override
		public Adapter caseMainPlacerOut(MainPlacerOut object) {
			return createMainPlacerOutAdapter();
		}

		@Override
		public Adapter caseTransmissionMapping(TransmissionMapping object) {
			return createTransmissionMappingAdapter();
		}

		@Override
		public Adapter caseNewEClass37(NewEClass37 object) {
			return createNewEClass37Adapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.Transmission <em>Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.Transmission
	 * @generated
	 */
	public Adapter createTransmissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.ProcessingElementClass <em>Processing Element Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.ProcessingElementClass
	 * @generated
	 */
	public Adapter createProcessingElementClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.MultiTaskPermanentTasks <em>Multi Task Permanent Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.MultiTaskPermanentTasks
	 * @generated
	 */
	public Adapter createMultiTaskPermanentTasksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.SwitchingTask <em>Switching Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.SwitchingTask
	 * @generated
	 */
	public Adapter createSwitchingTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.Bus
	 * @generated
	 */
	public Adapter createBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.ProcessingElement <em>Processing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.ProcessingElement
	 * @generated
	 */
	public Adapter createProcessingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.Implementation
	 * @generated
	 */
	public Adapter createImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.ConstraintOrObjective <em>Constraint Or Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.ConstraintOrObjective
	 * @generated
	 */
	public Adapter createConstraintOrObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.SamePE <em>Same PE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.SamePE
	 * @generated
	 */
	public Adapter createSamePEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.EnergyCap <em>Energy Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.EnergyCap
	 * @generated
	 */
	public Adapter createEnergyCapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.RunOn <em>Run On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.RunOn
	 * @generated
	 */
	public Adapter createRunOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.PowerCap <em>Power Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.PowerCap
	 * @generated
	 */
	public Adapter createPowerCapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.SymetricPE <em>Symetric PE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.SymetricPE
	 * @generated
	 */
	public Adapter createSymetricPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.MustBeUsed <em>Must Be Used</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.MustBeUsed
	 * @generated
	 */
	public Adapter createMustBeUsedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.MappingGoal <em>Mapping Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.MappingGoal
	 * @generated
	 */
	public Adapter createMappingGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.GlobalInformation <em>Global Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.GlobalInformation
	 * @generated
	 */
	public Adapter createGlobalInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.MultiObjectiveGoal <em>Multi Objective Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.MultiObjectiveGoal
	 * @generated
	 */
	public Adapter createMultiObjectiveGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.SimpleObjectiveGoal <em>Simple Objective Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.SimpleObjectiveGoal
	 * @generated
	 */
	public Adapter createSimpleObjectiveGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.TaskGroup <em>Task Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.TaskGroup
	 * @generated
	 */
	public Adapter createTaskGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.Global <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.Global
	 * @generated
	 */
	public Adapter createGlobalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.MaxMakeSpan <em>Max Make Span</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.MaxMakeSpan
	 * @generated
	 */
	public Adapter createMaxMakeSpanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.ResourcesDefinition <em>Resources Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.ResourcesDefinition
	 * @generated
	 */
	public Adapter createResourcesDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.PropertiesDefinition <em>Properties Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.PropertiesDefinition
	 * @generated
	 */
	public Adapter createPropertiesDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.Parameters
	 * @generated
	 */
	public Adapter createParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.ResourcesDeclaration <em>Resources Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.ResourcesDeclaration
	 * @generated
	 */
	public Adapter createResourcesDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.PropertiesDeclaration <em>Properties Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.PropertiesDeclaration
	 * @generated
	 */
	public Adapter createPropertiesDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.ResourcesUsage <em>Resources Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.ResourcesUsage
	 * @generated
	 */
	public Adapter createResourcesUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.GlobalProperties <em>Global Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.GlobalProperties
	 * @generated
	 */
	public Adapter createGlobalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.TaskMapping <em>Task Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.TaskMapping
	 * @generated
	 */
	public Adapter createTaskMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.SharedFunctionMapping <em>Shared Function Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.SharedFunctionMapping
	 * @generated
	 */
	public Adapter createSharedFunctionMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.NameValue <em>Name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.NameValue
	 * @generated
	 */
	public Adapter createNameValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.MainPlacerOut <em>Main Placer Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.MainPlacerOut
	 * @generated
	 */
	public Adapter createMainPlacerOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.TransmissionMapping <em>Transmission Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.TransmissionMapping
	 * @generated
	 */
	public Adapter createTransmissionMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placer.NewEClass37 <em>New EClass37</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placer.NewEClass37
	 * @generated
	 */
	public Adapter createNewEClass37Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PlacerAdapterFactory
