package validation;

import java.util.List;
import placer.Bus;
import placer.Global;
import placer.ProcessingElement;
import placer.ProcessingElementClass;
import placer.PropertiesDefinition;
import placer.ResourcesDefinition;

public class HardwareValidation {
	
	/**
	 * Validate if there is at least 1 ProcessingElement in the Hardware Diagram
	 * @param global
	 * @return
	 */
	
	public Boolean validationAtLeastOneProcessingElement(Global global) {
		return global.getProcessingElements().size()>0;
	}
	
	/**
	 * Validate if there is at least 1 Connection for each Bus in the Hardware Diagram
	 * @param bus
	 * @return
	 */
	
	public Boolean validationAtLeastOneConnectionForEachBus(Bus bus) {
		return bus.getConnections().size()>0;
	}
	
	/**
	 * Validate the good creation of all of the ProcessingElement in the Hardware Diagram
	 * @param processingElement
	 * @return
	 */
	
	public Boolean validationProcessingElement(ProcessingElement processingElement) {
		return (processingElement.getName() != null && processingElement.getName() != "" && processingElement.getMemory()>0 
			&& processingElement.getPowerModel() != null && processingElement.getPowerModel() != "" && processingElement.getClass_() != null);
	}
	
	/**
	 * Validate the good creation of all of the Bus in the Hardware Diagram
	 * @param bus
	 * @return
	 */
	
	public Boolean validationBus(Bus bus) {
		for (int j = 0; j < bus.getConnections().size(); j++) {
			if (bus.getConnections().get(j).getConnectionFrom() == null || bus.getConnections().get(j).getConnectionTo() == null) {
				bus.getConnections().remove(j);
			}
		}
		return (bus.getName() != null && bus.getName() != "" && bus.getTimeUnitPerDataUnit() > 0 && bus.getLatency() > 0);
	}
	
	/**
	 * Validate the good creation of all of the ResourcesDefinition in the Hardware Diagram
	 * @param resourcesDefinition
	 * @return
	 */
	
	public Boolean validationResourcesDefinition(ResourcesDefinition resourcesDefinition) {
		return (resourcesDefinition.getName() != null && resourcesDefinition.getValue() != 0);
	}
	
	/**
	 * Validate the good creation of all of the PropertiesDefinition in the Hardware Diagram
	 * @param propertiesDefinition
	 * @return
	 */
	
	public Boolean validationPropertiesDefinition(PropertiesDefinition propertiesDefinition) {
		return (propertiesDefinition.getName() != null && propertiesDefinition.getValue() != 0);
	}
	
	/**
	 * Verify if 2 ProcessingElement have the same name in the Hardware Diagram
	 * @param processingElement
	 * @return
	 */
	
	public Boolean sameNameProcessingElement(ProcessingElement processingElement) {
		List<ProcessingElement> allProcessingElement = ((Global)processingElement.eContainer()).getProcessingElements();
		for(ProcessingElement processingElements : allProcessingElement) {
			if(processingElements.getName().equals(processingElement.getName()) && processingElements.hashCode() != processingElement.hashCode()) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Verify if 2 Bus have the same name in the Hardware Diagram
	 * @param bus
	 * @return
	 */
	
	public Boolean sameNameBus(Bus bus) {
		List<Bus> allBusses = ((Global)bus.eContainer()).getBusses();
		for(Bus busses : allBusses) {
			if(busses.getName().equals(bus.getName()) && busses.hashCode() != bus.hashCode()) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Verify if 2 Resources/Properties Definition have the same name in the Hardware Diagram
	 * @param processingElement
	 * @return
	 */
	
	public Boolean sameNameDefinition(ProcessingElement processingElement) {
		List<PropertiesDefinition> allPropertiesDefinitions = processingElement.getPropertiesDefinitions();
		List<ResourcesDefinition> allResourcesDefinitions = processingElement.getResourcesDefinitions();
		for(PropertiesDefinition list1 : allPropertiesDefinitions) {
			for(PropertiesDefinition list2 : allPropertiesDefinitions) {
				if(list1.getName().equals(list2.getName()) && list1.hashCode() != list2.hashCode()) {
					return false;
				}
			}
		}
		for(PropertiesDefinition list1 : allPropertiesDefinitions) {
			for(ResourcesDefinition list2 : allResourcesDefinitions) {
				if(list1.getName().getName().equals(list2.getName().getName()) && list1.hashCode() != list2.hashCode()) {
					return false;
				}
			}
		}
		for(ResourcesDefinition list1 : allResourcesDefinitions) {
			for(ResourcesDefinition list2 : allResourcesDefinitions) {
				if(list1.getName().equals(list2.getName()) && list1.hashCode() != list2.hashCode()) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Verify all ProcessingElement if all the Resources/Properties Definition are used for the class of this ProcessingElement in the Hardware Diagram
	 * @param processingElement
	 * @return
	 */
	
	public Boolean validationProcessingElementResourcesProperties(ProcessingElement processingElement) {
		for(ResourcesDefinition resourcesDefinition : processingElement.getResourcesDefinitions()) {
			if(!((ProcessingElementClass)resourcesDefinition.getName().eContainer()).equals(processingElement.getClass_())) {
				return false;
			}
		}
		for(PropertiesDefinition propertiesDefinition : processingElement.getPropertiesDefinitions()) {
			if(!((ProcessingElementClass)propertiesDefinition.getName().eContainer()).equals(processingElement.getClass_())) {
				return false;
			}
		}
		return true;
	}
}