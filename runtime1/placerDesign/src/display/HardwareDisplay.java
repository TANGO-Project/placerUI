package display;

import java.util.List;
import placer.Bus;
import placer.Global;
import placer.ProcessingElement;
import placer.PropertiesDefinition;
import placer.ResourcesDefinition;
import validation.AllValidation;

public class HardwareDisplay {
	
	/**
	 * Function to verify if the connections are not empty in the Hardware Diagram
	 * @param processingElement
	 */
	
	public void verificationConnections(ProcessingElement processingElement) {
		List<Bus> allBusses = ((Global) processingElement.eContainer()).getBusses();
		List<ProcessingElement> allProcessingElements = ((Global) processingElement.eContainer()).getProcessingElements();
		for (int i = 0; i < allBusses.size(); i++) {
			for (int j = 0; j < allBusses.get(i).getConnections().size(); j++) {
				if (allBusses.get(i).getConnections().get(j).getConnectionTo() == processingElement) {
					allBusses.get(i).getConnections().remove(j);
				}
			}
		}
		allProcessingElements.remove(processingElement);
	}
	
	/**
	 * Creation condition for all the ProcessingElement Instance in the Hardware Diagram
	 * @param processingElement
	 * @return
	 */
	
	public Boolean conditionCreationProcessingElement(ProcessingElement processingElement) {
		List<ProcessingElement> processingElements = ((Global)processingElement.eContainer()).getProcessingElements();
		processingElement.setName(AllValidation.specialCharacters(processingElement.getName()));
		processingElement.setPowerModel(AllValidation.specialCharacters(processingElement.getPowerModel()));
		if(processingElement.getMemory()<1) {
			processingElements.remove(processingElement);
			return false;
		}
		return true;
	}
	
	/**
	 * Creation condition for all the Bus Instance in the Hardware Diagram
	 * @param bus
	 * @return
	 */
	
	public Boolean conditionCreationBus(Bus bus) {
		List<Bus> busses = ((Global)bus.eContainer()).getBusses();
		bus.setName(AllValidation.specialCharacters(bus.getName()));
		if(bus.getLatency()<1 || bus.getTimeUnitPerDataUnit()<1) {
			busses.remove(bus);
			return false;
		}
		return true;
	}
	
	/**
	 * Creation condition for all the PropertiesDefinition Instance in the Hardware Diagram
	 * @param propertiesDefinition
	 * @return
	 */
	
	public Boolean conditionCreationPropertiesDefinition(PropertiesDefinition propertiesDefinition) {
		List<PropertiesDefinition> propertiesDefinitions = ((ProcessingElement)propertiesDefinition.eContainer()).getPropertiesDefinitions();
		if(propertiesDefinition.getValue()<1) {
			propertiesDefinitions.remove(propertiesDefinition);
			return false;
		}
		return true;
	}
	
	/**
	 * Creation condition for all the ResourcesDefinition Instance in the Hardware Diagram
	 * @param resourcesDefinition
	 * @return
	 */
	
	public Boolean conditionCreationResourcesDefinition(ResourcesDefinition resourcesDefinition) {
		List<ResourcesDefinition> resourcesDefinitions = ((ProcessingElement)resourcesDefinition.eContainer()).getResourcesDefinitions();
		if(resourcesDefinition.getValue()<1) {
			resourcesDefinitions.remove(resourcesDefinition);
			return false;
		}
		return true;
	}
}