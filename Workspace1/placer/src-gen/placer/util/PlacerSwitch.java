/**
 */
package placer.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import placer.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see placer.PlacerPackage
 * @generated
 */
public class PlacerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlacerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacerSwitch() {
		if (modelPackage == null) {
			modelPackage = PlacerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case PlacerPackage.TASK: {
			Task task = (Task) theEObject;
			T result = caseTask(task);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.TRANSMISSION: {
			Transmission transmission = (Transmission) theEObject;
			T result = caseTransmission(transmission);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.PROCESSING_ELEMENT_CLASS: {
			ProcessingElementClass processingElementClass = (ProcessingElementClass) theEObject;
			T result = caseProcessingElementClass(processingElementClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.MULTI_TASK_PERMANENT_TASKS: {
			MultiTaskPermanentTasks multiTaskPermanentTasks = (MultiTaskPermanentTasks) theEObject;
			T result = caseMultiTaskPermanentTasks(multiTaskPermanentTasks);
			if (result == null)
				result = caseProcessingElementClass(multiTaskPermanentTasks);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.SWITCHING_TASK: {
			SwitchingTask switchingTask = (SwitchingTask) theEObject;
			T result = caseSwitchingTask(switchingTask);
			if (result == null)
				result = caseProcessingElementClass(switchingTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.BUS: {
			Bus bus = (Bus) theEObject;
			T result = caseBus(bus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.PROCESSING_ELEMENT: {
			ProcessingElement processingElement = (ProcessingElement) theEObject;
			T result = caseProcessingElement(processingElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.IMPLEMENTATION: {
			Implementation implementation = (Implementation) theEObject;
			T result = caseImplementation(implementation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.CONNECTION: {
			Connection connection = (Connection) theEObject;
			T result = caseConnection(connection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.CONSTRAINT_OR_OBJECTIVE: {
			ConstraintOrObjective constraintOrObjective = (ConstraintOrObjective) theEObject;
			T result = caseConstraintOrObjective(constraintOrObjective);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.SAME_PE: {
			SamePE samePE = (SamePE) theEObject;
			T result = caseSamePE(samePE);
			if (result == null)
				result = caseConstraintOrObjective(samePE);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.ENERGY_CAP: {
			EnergyCap energyCap = (EnergyCap) theEObject;
			T result = caseEnergyCap(energyCap);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.RUN_ON: {
			RunOn runOn = (RunOn) theEObject;
			T result = caseRunOn(runOn);
			if (result == null)
				result = caseConstraintOrObjective(runOn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.POWER_CAP: {
			PowerCap powerCap = (PowerCap) theEObject;
			T result = casePowerCap(powerCap);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.SYMETRIC_PE: {
			SymetricPE symetricPE = (SymetricPE) theEObject;
			T result = caseSymetricPE(symetricPE);
			if (result == null)
				result = caseConstraintOrObjective(symetricPE);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.MUST_BE_USED: {
			MustBeUsed mustBeUsed = (MustBeUsed) theEObject;
			T result = caseMustBeUsed(mustBeUsed);
			if (result == null)
				result = caseConstraintOrObjective(mustBeUsed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.MAPPING_GOAL: {
			MappingGoal mappingGoal = (MappingGoal) theEObject;
			T result = caseMappingGoal(mappingGoal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.GLOBAL_INFORMATION: {
			GlobalInformation globalInformation = (GlobalInformation) theEObject;
			T result = caseGlobalInformation(globalInformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.MULTI_OBJECTIVE_GOAL: {
			MultiObjectiveGoal multiObjectiveGoal = (MultiObjectiveGoal) theEObject;
			T result = caseMultiObjectiveGoal(multiObjectiveGoal);
			if (result == null)
				result = caseMappingGoal(multiObjectiveGoal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.SIMPLE_OBJECTIVE_GOAL: {
			SimpleObjectiveGoal simpleObjectiveGoal = (SimpleObjectiveGoal) theEObject;
			T result = caseSimpleObjectiveGoal(simpleObjectiveGoal);
			if (result == null)
				result = caseMappingGoal(simpleObjectiveGoal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.TASK_GROUP: {
			TaskGroup taskGroup = (TaskGroup) theEObject;
			T result = caseTaskGroup(taskGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.GLOBAL: {
			Global global = (Global) theEObject;
			T result = caseGlobal(global);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.MAX_MAKE_SPAN: {
			MaxMakeSpan maxMakeSpan = (MaxMakeSpan) theEObject;
			T result = caseMaxMakeSpan(maxMakeSpan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.RESOURCES_DECLARATION: {
			ResourcesDeclaration resourcesDeclaration = (ResourcesDeclaration) theEObject;
			T result = caseResourcesDeclaration(resourcesDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.PROPERTIES_DECLARATION: {
			PropertiesDeclaration propertiesDeclaration = (PropertiesDeclaration) theEObject;
			T result = casePropertiesDeclaration(propertiesDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.PARAMETERS: {
			Parameters parameters = (Parameters) theEObject;
			T result = caseParameters(parameters);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.RESOURCES_DEFINITION: {
			ResourcesDefinition resourcesDefinition = (ResourcesDefinition) theEObject;
			T result = caseResourcesDefinition(resourcesDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.PROPERTIES_DEFINITION: {
			PropertiesDefinition propertiesDefinition = (PropertiesDefinition) theEObject;
			T result = casePropertiesDefinition(propertiesDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.RESOURCES_USAGE: {
			ResourcesUsage resourcesUsage = (ResourcesUsage) theEObject;
			T result = caseResourcesUsage(resourcesUsage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.GLOBAL_PROPERTIES: {
			GlobalProperties globalProperties = (GlobalProperties) theEObject;
			T result = caseGlobalProperties(globalProperties);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.TASK_MAPPING: {
			TaskMapping taskMapping = (TaskMapping) theEObject;
			T result = caseTaskMapping(taskMapping);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.MAPPING: {
			Mapping mapping = (Mapping) theEObject;
			T result = caseMapping(mapping);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.SHARED_FUNCTION_MAPPING: {
			SharedFunctionMapping sharedFunctionMapping = (SharedFunctionMapping) theEObject;
			T result = caseSharedFunctionMapping(sharedFunctionMapping);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.NAME_VALUE: {
			NameValue nameValue = (NameValue) theEObject;
			T result = caseNameValue(nameValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.MAIN_PLACER_OUT: {
			MainPlacerOut mainPlacerOut = (MainPlacerOut) theEObject;
			T result = caseMainPlacerOut(mainPlacerOut);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.TRANSMISSION_MAPPING: {
			TransmissionMapping transmissionMapping = (TransmissionMapping) theEObject;
			T result = caseTransmissionMapping(transmissionMapping);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PlacerPackage.NEW_ECLASS37: {
			NewEClass37 newEClass37 = (NewEClass37) theEObject;
			T result = caseNewEClass37(newEClass37);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmission(Transmission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Element Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Element Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingElementClass(ProcessingElementClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Task Permanent Tasks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Task Permanent Tasks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiTaskPermanentTasks(MultiTaskPermanentTasks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switching Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switching Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchingTask(SwitchingTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBus(Bus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingElement(ProcessingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementation(Implementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Or Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Or Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintOrObjective(ConstraintOrObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Same PE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Same PE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSamePE(SamePE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Cap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Cap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyCap(EnergyCap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Run On</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunOn(RunOn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Cap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Cap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerCap(PowerCap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symetric PE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symetric PE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymetricPE(SymetricPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Must Be Used</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Must Be Used</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMustBeUsed(MustBeUsed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingGoal(MappingGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalInformation(GlobalInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Objective Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Objective Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiObjectiveGoal(MultiObjectiveGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Objective Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Objective Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleObjectiveGoal(SimpleObjectiveGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskGroup(TaskGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobal(Global object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Make Span</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Make Span</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxMakeSpan(MaxMakeSpan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resources Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resources Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcesDefinition(ResourcesDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertiesDefinition(PropertiesDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameters(Parameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resources Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resources Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcesDeclaration(ResourcesDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertiesDeclaration(PropertiesDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resources Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resources Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcesUsage(ResourcesUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalProperties(GlobalProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskMapping(TaskMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Function Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Function Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedFunctionMapping(SharedFunctionMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameValue(NameValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Placer Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Placer Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainPlacerOut(MainPlacerOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionMapping(TransmissionMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New EClass37</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New EClass37</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewEClass37(NewEClass37 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PlacerSwitch
