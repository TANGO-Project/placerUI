package validation;

import java.util.List;
import placer.Global;
import placer.Implementation;
import placer.Parameters;
import placer.ProcessingElementClass;
import placer.ResourcesUsage;
import placer.Task;
import placer.TaskGroup;
import placer.Transmission;

public class SoftwareValidation {
	
	/**
	 * Verify if there is at least one task created in the Software Diagram
	 * @param global
	 * @return
	 */
	
	public Boolean creationTask(Global global) {
		List<TaskGroup> taskGroup = global.getTaskGroups();
		for(TaskGroup group : taskGroup) {
			if(group.getTaskTaskGroups().size()!=0) {
				return true;
			}
		}
		return global.getTasks().size()!=0;
	}
	
	/**
	 * Verify if there is at least one Implementation created in the Software Diagram
	 * @param task
	 * @return
	 */
	
	public Boolean creationImplementation(Task task) {
		return task.getImplementations().size() > 0;
	}
	
	/**
	 * Validate the good creation of all TaskGroup in the Software Diagram
	 * @param taskGroup
	 * @return
	 */
	
	public Boolean validationTaskGroup(TaskGroup taskGroup) {
		return taskGroup.getNbInstances()>0;
	}
	
	/**
	 * Validate the good creation of all Task in the Software Diagram
	 * @param task
	 * @return
	 */
	
	public Boolean validationTask(Task task) {
		for (int i = 0; i < task.getTransmissions().size(); i++) {
			if (task.getTransmissions().get(i).getFrom() == null || task.getTransmissions().get(i).getTo() == null) {
				task.getTransmissions().remove(i);
			}
		}
		return (task.getName() != null && task.getName() != "");
	}
	
	/**
	 * Validate the good creation of all Transmission in the Software Diagram
	 * @param transmission
	 * @return
	 */
	
	public Boolean validationTransmission(Transmission transmission) {
		return  transmission.getAmount() > 0;
	}
	
	/**
	 * Validate the good creation of all Implementation in the Software Diagram
	 * @param implementation
	 * @return
	 */
	
	public Boolean validationImplementation(Implementation implementation) {
		return (implementation.getName() != null && implementation.getName() != "" && implementation.getDuration() != null 
			&& implementation.getDuration() != "" && implementation.getComputationMemory() != null && implementation.getComputationMemory() != ""
			&& implementation.getTarget() != null);
	}
	
	/**
	 * Validate the good creation of all ResourcesUsage in the Software Diagram
	 * @param resourcesUsage
	 * @return
	 */
	
	public Boolean validationResourcesUsage(ResourcesUsage resourcesUsage) {
		return (resourcesUsage.getName() != null && resourcesUsage.getFormula() != null || resourcesUsage.getFormula() != "");
	}
	
	/**
	 * Validate the good creation of all Parmeters in the Software Diagram
	 * @param parameters
	 * @return
	 */
	
	public Boolean validationParameters(Parameters parameters) {
		return (parameters.getName() != null && parameters.getName() != "" && parameters.getValue().size() != 0);
	}
	
	/**
	 * Verify if 2 Task have not the same name in the Software Diagram
	 * @param task
	 * @return
	 */
		
	public Boolean sameNameTask(Task task) {
		List<Task> allTasks;
		List<TaskGroup> allTasksGroup;
		if(task.eContainer().eClass().getName()=="TaskGroup") {
			allTasks = ((Global) ((TaskGroup)task.eContainer()).eContainer()).getTasks();
			allTasksGroup = ((Global) ((TaskGroup)task.eContainer()).eContainer()).getTaskGroups();
		}
		else {
			allTasks = ((Global) task.eContainer()).getTasks();
			allTasksGroup = ((Global) task.eContainer()).getTaskGroups();
		}
		for(Task tasks : allTasks) {
			if(tasks.getName().equals(task.getName()) && tasks.hashCode() != task.hashCode()) {
				return false;
			}
		}
		for(TaskGroup taskGroup : allTasksGroup) {
			for(Task tasks : taskGroup.getTaskTaskGroups()) {
				if(tasks.getName().equals(task.getName()) && tasks.hashCode() != task.hashCode()) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Verify if 2 Implementation have not the same name in the Software Diagram
	 * @param implementation
	 * @return
	 */
	
	public Boolean sameNameImplementation(Implementation implementation) {
		List<Implementation> allImplementation = ((Task)implementation.eContainer()).getImplementations();
		for(Implementation implementations : allImplementation) {
			if(implementations.getName().equals(implementation.getName()) && implementations.hashCode() != implementation.hashCode()) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Verify if 2 ResourcesUsage/Parameters have not the same name in the Software Diagram
	 * @param implementation
	 * @return
	 */
	
	public Boolean sameNameResourcesUsageParameters(Implementation implementation) {
		List<ResourcesUsage> allResourcesUsages = implementation.getResourcesUsages();
		List<Parameters> allParameters = implementation.getParameters();
		for(ResourcesUsage list1 : allResourcesUsages) {
			for(ResourcesUsage list2 : allResourcesUsages) {
				if(list1.getName().getName().equals(list2.getName().getName()) && list1.hashCode() != list2.hashCode()) {
					return false;
				}
			}
		}
		for(ResourcesUsage list1 : allResourcesUsages) {
			for(Parameters list2 : allParameters) {
				if(list1.getName().getName().equals(list2.getName()) && list1.hashCode() != list2.hashCode()) {
					return false;
				}
			}
		}
		for(Parameters list1 : allParameters) {
			for(Parameters list2 : allParameters) {
				if(list1.getName().equals(list2.getName()) && list1.hashCode() != list2.hashCode()) {
				}
			}
		}
		return true;
	}
	
	/**
	 * Verify if a Task have not a return on itself in the Software Diagram
	 * @param task
	 * @return
	 */
	
	public Boolean loopTask(Task task) {
		Global global = null;
		if(task.eContainer().eClass().getName()=="TaskGroup") {
			global = ((Global) ((TaskGroup)task.eContainer()).eContainer());
		}
		else {
			global = ((Global) task.eContainer());
		}
		int maxIteration = 0;
		for(TaskGroup taskGroup : global.getTaskGroups()) {
			maxIteration += taskGroup.getTaskTaskGroups().size();
		}
		maxIteration += global.getTasks().size();
		return recursivityTask(task, task, 0, maxIteration);
	}

	public Boolean recursivityTask(Task memoryTask, Task toTask, int count, int maxIteration) {
		if (count < maxIteration) {
			for (int i = 0; i < toTask.getTransmissions().size(); i++) {
				if (toTask.getTransmissions().get(i).getTo() == memoryTask) {
					return false;
				}
				if (!recursivityTask(memoryTask, toTask.getTransmissions().get(i).getTo(), count + 1, maxIteration)) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * 2 transmission Alap can not have the same target
	 * @param transmission
	 * @return
	 */
	
	public Boolean conditionAlap(Transmission transmission) {
		if(transmission.getTiming().getLiteral().equals("Alap")) {
			List<Task> tasks = null;
			List<TaskGroup> taskGroups = null;
			if(((Task)transmission.eContainer()).eContainer().eClass().getName().equals("Global")) {
				tasks = ((Global)((Task)transmission.eContainer()).eContainer()).getTasks();
				taskGroups = ((Global)((Task)transmission.eContainer()).eContainer()).getTaskGroups();
			}
			else {
				tasks = ((Global)((TaskGroup)((Task)transmission.eContainer()).eContainer()).eContainer()).getTasks();
				taskGroups = ((Global)((TaskGroup)((Task)transmission.eContainer()).eContainer()).eContainer()).getTaskGroups();
			}
			for(Task task : tasks) {
				for(Transmission transmissions : task.getTransmissions()) {
					if(transmissions.getTo().equals(transmission.getTo()) && transmissions.getTiming().equals(transmission.getTiming()) 
					&& transmissions.hashCode() != transmission.hashCode()) {
						return false;
					}
				}
			}
			for(TaskGroup taskGroup : taskGroups) {
				for(Task task : taskGroup.getTaskTaskGroups()) {
					for(Transmission transmissions : task.getTransmissions()) {
						if(transmissions.getTo().equals(transmission.getTo()) && transmissions.getTiming().equals(transmission.getTiming()) 
						&& transmissions.hashCode() != transmission.hashCode()) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}
	
	/**
	 * 2 transmission Asap can not have the same input
	 * @param transmission
	 * @return
	 */
	
	public Boolean conditionAsap(Transmission transmission) {
		if(transmission.getTiming().getLiteral().equals("Asap")) {
			List<Transmission> transmissions = ((Task)transmission.eContainer()).getTransmissions();
			for(Transmission transmissionElement : transmissions) {
				if(transmissionElement.getFrom().equals(transmission.getFrom()) && transmissionElement.getTiming().equals(transmission.getTiming()) 
				&& transmissionElement.hashCode() != transmission.hashCode()) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Validate for each Implementation that all ResourcesDefinition are used with the good Implementation class 
	 * @param implementation
	 * @return
	 */
	
	public Boolean validationImplementationResourcesProperties(Implementation implementation) {
		for(ResourcesUsage resourcesUsage : implementation.getResourcesUsages()) {
			if(!((ProcessingElementClass)resourcesUsage.getName().eContainer()).equals(implementation.getTarget())) {
				return false;
			}
		}
		return true;
	}
}