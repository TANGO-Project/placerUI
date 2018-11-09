package validation;

import java.util.List;
import placer.Global;
import placer.Implementation;
import placer.ProcessingElement;
import placer.ProcessingElementClass;
import placer.PropertiesDeclaration;
import placer.PropertiesDefinition;
import placer.ResourcesDeclaration;
import placer.ResourcesDefinition;
import placer.ResourcesUsage;
import placer.SwitchingTask;

public class HardwareClassValidation {
	
	/**
	 * Validate the creation of 1 ProcessingElementClasss
	 * @param global
	 * @return
	 */
	
	public Boolean creationProcessingElementClass(Global global) {
		return global.getProcessingElementClasses().size()>0;
	}
	
	/**
	 * Validate all of the ProcessingElementClass created in the Software Diagram
	 * @param implementation
	 * @return
	 */
	
	public Boolean validationSoftwareProcessingElementClass(Implementation implementation) {
		if(implementation.getTarget().eClass().getName().equals("SwitchingTask")) {
			return (implementation.getTarget().getName() != null && implementation.getTarget().getName() != "" && 
				((SwitchingTask)implementation.getTarget()).getSwitchingDelay()>0);
		}
		return (implementation.getTarget().getName() != null && implementation.getTarget().getName() != "");
	}
	
	/**
	 * Validate all of the ProcessingElementClass created in the Hardware Diagram
	 * @param processingElement
	 * @return
	 */
	
	public Boolean validationHardwareProcessingElementClass(ProcessingElement processingElement) {
		if(processingElement.getClass_().eClass().getName().equals("SwitchingTask")) {
			return (processingElement.getClass_().getName() != null && processingElement.getClass_().getName() != "" && 
				((SwitchingTask)processingElement.getClass_()).getSwitchingDelay()>0);
		}
		return (processingElement.getClass_().getName() != null && processingElement.getClass_().getName() != "");
	}
	
	/**
	 * Verify if 2 ProcessingElementClass have the same name
	 * @param global
	 * @return
	 */
	
	public Boolean sameNameProcessingElementClass(Global global) {
		List<ProcessingElementClass> allProcessingElementClasses = global.getProcessingElementClasses();
		for(ProcessingElementClass processingElementClass1 : allProcessingElementClasses) {
			for(ProcessingElementClass processingElementClass2 : allProcessingElementClasses) {
				if(processingElementClass1.getName().equals(processingElementClass2.getName()) && 
					processingElementClass1.hashCode() != processingElementClass2.hashCode()) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Validate all of the ResourcesDeclaration in the Software Diagram
	 * @param resourcesUsage
	 * @return
	 */
	
	public Boolean validationSoftwareResourcesDeclaration(ResourcesUsage resourcesUsage) {
		return (resourcesUsage.getName().getName() != null && resourcesUsage.getName().getName() != "");
	}
	
	/**
	 * Validate all of the ResourcesDeclaration in the Hardware Diagram
	 * @param resourcesDefinition
	 * @return
	 */
	
	public Boolean validationHardwareResourcesDeclaration(ResourcesDefinition resourcesDefinition) {
		return (resourcesDefinition.getName().getName() != null && resourcesDefinition.getName().getName() != "");
	}
	
	/**
	 * Validate all of the PropertiesDeclaration in the Hardware Diagram
	 * @param propertiesDefinition
	 * @return
	 */
	
	public Boolean validationHardwarePropertiesDeclaration(PropertiesDefinition propertiesDefinition) {
		return (propertiesDefinition.getName().getName() != null && propertiesDefinition.getName().getName() != "");
	}
	
	/**
	 * Verify if the ResourcesDeclarations and PropertiesDeclarations have not the same declaration
	 * @param global
	 * @return
	 */
	
	public Boolean sameNameDeclaration(Global global) {
		List<ProcessingElementClass> processingElementClasses = global.getProcessingElementClasses();
		for(ProcessingElementClass processingElementClass : processingElementClasses) {
			for(ResourcesDeclaration list1 : processingElementClass.getResourcesDeclarations()) {
				for(ResourcesDeclaration list2 : processingElementClass.getResourcesDeclarations()) {
					if(list1.getName().equals(list2.getName()) && list1.hashCode() != list2.hashCode()) {
						return false;
					}
				}
			}
			for(ResourcesDeclaration list1 : processingElementClass.getResourcesDeclarations()) {
				for(PropertiesDeclaration list2 : processingElementClass.getPropertiesDeclarations()) {
					if(list1.getName().equals(list2.getName()) && list1.hashCode() != list2.hashCode()) {
						return false;
					}
				}
			}
			for(PropertiesDeclaration list1 : processingElementClass.getPropertiesDeclarations()) {
				for(PropertiesDeclaration list2 : processingElementClass.getPropertiesDeclarations()) {
					if(list1.getName().equals(list2.getName()) && list1.hashCode() != list2.hashCode()) {
						return false;
					}
				}
			}
		}
		return true;
	}
}