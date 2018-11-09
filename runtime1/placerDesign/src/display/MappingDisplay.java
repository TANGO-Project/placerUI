package display;

import java.util.List;

import placer.ProcessingElement;
import placer.Global;
import placer.MainPlacerOut;
import placer.Mapping;
import placer.TaskMapping;

public class MappingDisplay {
	//filter
	public boolean displayMappingCondition(Mapping mapping) {
		List<ProcessingElement> processingElements = ((Global)((MainPlacerOut)mapping.eContainer()).eContainer()).getProcessingElements();
		List<TaskMapping> taskMappings = mapping.getTaskMappings();
		for(ProcessingElement processingElement : processingElements) {
			for(TaskMapping taskMapping : taskMappings) {
				if(processingElement == taskMapping.getProcessingElement()) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean displayProcessingElementCondition(ProcessingElement processingElement) {
		List<Mapping> mappings = ((Global)processingElement.eContainer()).getMainPlacerOut1().getMappings();
		for(Mapping mapping : mappings) {
			for(TaskMapping taskMapping : mapping.getTaskMappings()) {
				if(processingElement == taskMapping.getProcessingElement()) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean displayTaskMappingCondition(TaskMapping taskMapping) {
		List<ProcessingElement> processingElements = ((Global)((MainPlacerOut)((Mapping)taskMapping.eContainer()).eContainer()).eContainer())
		.getProcessingElements();
		for(ProcessingElement processingElement : processingElements) {
			if(processingElement == taskMapping.getProcessingElement()) {
				return true;
			}
		}
		return false;
	}

	public int end(TaskMapping taskMapping) {
		List<TaskMapping> taskMappings = ((Mapping) taskMapping.eContainer()).getTaskMappings();
		int maxEnd = 0;
		for(TaskMapping taskMappingElement : taskMappings) {
			if(taskMappingElement.getEnd()>maxEnd) {
				maxEnd = taskMappingElement.getEnd();
			}
		}
		return maxEnd;
	}
}