package validation;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import placer.*;

public class AllValidation {
	
	/**
	 * function which allow some character in the variable of the project
	 * @param string
	 * @return
	 */
	
	public static String specialCharacters(String string) {
		string = string.replaceAll(" ", "_");
		String regex = "[^a-zA-Z0-9-_/+*()]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
		if(!matcher.matches()) {
			string = string.replaceAll(regex, "");
		}
		return string;
	}
	
	/**
	 * function which validate all the project created by the user and allow the Placer input creation 
	 * @param global
	 * @return
	 */
	
	public Boolean json(Global global) {
		ConstraintsAndObjectiveValidation constraintsAndObjectiveValidation = new ConstraintsAndObjectiveValidation();
		HardwareClassValidation hardwareClassValidation = new HardwareClassValidation();
		HardwareValidation hardwareValidation = new HardwareValidation();
		SoftwareValidation softwareValidation = new SoftwareValidation();
		List<Boolean> condition = new ArrayList<Boolean>();
		
		condition.add(hardwareClassValidation.creationProcessingElementClass(global));
		condition.add(hardwareClassValidation.sameNameProcessingElementClass(global));
		condition.add(hardwareClassValidation.sameNameDeclaration(global));
		condition.add(softwareValidation.creationTask(global));
		condition.add(hardwareValidation.validationAtLeastOneProcessingElement(global));
		condition.add(constraintsAndObjectiveValidation.creationGlobalInformation(global));
		condition.add(constraintsAndObjectiveValidation.validationMustBeUsed(global));
		condition.add(constraintsAndObjectiveValidation.validationSamePE(global));
		condition.add(constraintsAndObjectiveValidation.validationSymetricPE(global));
		condition.add(constraintsAndObjectiveValidation.validationRunOn(global));
		condition.add(constraintsAndObjectiveValidation.validationPowerCap(global));
		condition.add(constraintsAndObjectiveValidation.validationEnergyCap(global));
		condition.add(constraintsAndObjectiveValidation.validationMaxMakeSpan(global));
		condition.add(constraintsAndObjectiveValidation.validationGlobalInformation(global));
		condition.add(constraintsAndObjectiveValidation.validationGlobalProperties(global));
		condition.add(constraintsAndObjectiveValidation.sameNameGlobalProperties(global));
		condition.add(constraintsAndObjectiveValidation.sameUseMustBeUsed(global));
		condition.add(constraintsAndObjectiveValidation.sameUseRunOn(global));
		for(TaskGroup taskGroup : global.getTaskGroups()) {
			condition.add(softwareValidation.validationTaskGroup(taskGroup));
			for(Task task : taskGroup.getTaskTaskGroups()) {
				condition.add(softwareValidation.creationImplementation(task));
				condition.add(softwareValidation.validationTask(task));
				condition.add(softwareValidation.sameNameTask(task));
				condition.add(softwareValidation.loopTask(task));
				for(Implementation implementation : task.getImplementations()) {
					condition.add(hardwareClassValidation.validationSoftwareProcessingElementClass(implementation));
					condition.add(softwareValidation.validationImplementation(implementation));
					condition.add(softwareValidation.sameNameImplementation(implementation));
					condition.add(softwareValidation.sameNameResourcesUsageParameters(implementation));
					for(ResourcesUsage resourcesUsage : implementation.getResourcesUsages()) {
						condition.add(hardwareClassValidation.validationSoftwareResourcesDeclaration(resourcesUsage));
						condition.add(softwareValidation.validationResourcesUsage(resourcesUsage));
					}
					for(Parameters parameters : implementation.getParameters()) {
						condition.add(softwareValidation.validationParameters(parameters));
					}
				}
				for(Transmission transmission : task.getTransmissions()) {
					condition.add(softwareValidation.validationTransmission(transmission));
					condition.add(softwareValidation.conditionAsap(transmission));
					condition.add(softwareValidation.conditionAlap(transmission));
				}
			}
		}
		for(Task task : global.getTasks()) {
			condition.add(softwareValidation.creationImplementation(task));
			condition.add(softwareValidation.validationTask(task));
			condition.add(softwareValidation.sameNameTask(task));
			condition.add(softwareValidation.loopTask(task));
			for(Implementation implementation : task.getImplementations()) {
				condition.add(hardwareClassValidation.validationSoftwareProcessingElementClass(implementation));
				condition.add(softwareValidation.validationImplementation(implementation));
				condition.add(softwareValidation.sameNameImplementation(implementation));
				condition.add(softwareValidation.sameNameResourcesUsageParameters(implementation));
				for(ResourcesUsage resourcesUsage : implementation.getResourcesUsages()) {
					condition.add(hardwareClassValidation.validationSoftwareResourcesDeclaration(resourcesUsage));
					condition.add(softwareValidation.validationResourcesUsage(resourcesUsage));
				}
				for(Parameters parameters : implementation.getParameters()) {
					condition.add(softwareValidation.validationParameters(parameters));
				}
			}
			for(Transmission transmission : task.getTransmissions()) {
				condition.add(softwareValidation.validationTransmission(transmission));
				condition.add(softwareValidation.conditionAsap(transmission));
				condition.add(softwareValidation.conditionAlap(transmission));
			}
		}
		for(ProcessingElement processingElement : global.getProcessingElements()) {
			condition.add(hardwareClassValidation.validationHardwareProcessingElementClass(processingElement));
			condition.add(hardwareValidation.validationProcessingElement(processingElement));
			condition.add(hardwareValidation.sameNameProcessingElement(processingElement));
			condition.add(hardwareValidation.sameNameDefinition(processingElement));
			for(PropertiesDefinition propertiesDefinition : processingElement.getPropertiesDefinitions()) {
				condition.add(hardwareClassValidation.validationHardwarePropertiesDeclaration(propertiesDefinition));
				condition.add(hardwareValidation.validationPropertiesDefinition(propertiesDefinition));
			}
			for(ResourcesDefinition resourcesDefinition : processingElement.getResourcesDefinitions()) {
				condition.add(hardwareClassValidation.validationHardwareResourcesDeclaration(resourcesDefinition));
				condition.add(hardwareValidation.validationResourcesDefinition(resourcesDefinition));
			}
		}
		for(Bus bus : global.getBusses()) {
			condition.add(hardwareValidation.validationAtLeastOneConnectionForEachBus(bus));
			condition.add(hardwareValidation.validationBus(bus));
			condition.add(hardwareValidation.sameNameBus(bus));
		}
		for(Boolean element : condition) {
			if(element == false) {
				return false;
			}
		}
		return true;
	}
}