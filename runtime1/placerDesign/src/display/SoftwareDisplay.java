package display;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import placer.Global;
import placer.Implementation;
import placer.Parameters;
import placer.ResourcesUsage;
import placer.Task;
import placer.TaskGroup;
import placer.Transmission;
import validation.AllValidation;

public class SoftwareDisplay {
	
	/**
	 * Function to verify if the transmissions are not empty in the Software Diagram
	 * @param task
	 */
	
	public void verificationTransmissionsAll(Task task) {
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
		for (int i = 0; i < allTasks.size(); i++) {
			for (int j = 0; j < allTasks.get(i).getTransmissions().size(); j++) {
				if (allTasks.get(i).getTransmissions().get(j).getTo() == task) {
					allTasks.get(i).getTransmissions().remove(j);
				}
			}
		}
		for (int i = 0; i < allTasksGroup.size(); i++) {
			for (int j = 0; j < allTasksGroup.get(i).getTaskTaskGroups().size(); j++) {
				for (int k = 0; k < allTasksGroup.get(i).getTaskTaskGroups().get(j).getTransmissions().size(); k++) {
					if (allTasksGroup.get(i).getTaskTaskGroups().get(j).getTransmissions().get(j).getTo() == task) {
						allTasksGroup.get(i).getTaskTaskGroups().get(j).getTransmissions().remove(j);
					}
				}
			}
		}
		if(task.eContainer().eClass().getName()=="TaskGroup") {
			for(int i=0; i<allTasksGroup.size(); i++) {
				allTasksGroup.get(i).getTaskTaskGroups().remove(task);
			}	
		}
		else {
			allTasks.remove(task);
		}
		
	}
	
	/**
	 * Display for all the Implementation Instance in the Software Diagram
	 * @param implementation
	 * @return
	 */

	public String displayImplementation(Implementation implementation) {
		if(implementation.getName() == "" || implementation.getName() == null) {
			return "";
		}
		if(implementation.getTarget() == null) {
			return " "+implementation.getName()+" (   ) ";
		}
		return " "+implementation.getName() + " (" + implementation.getTarget().getName() + ") ";
	}
	
	/**
	 * Display for all the ResourcesUsage Instance in the Software Diagram
	 * @param resourcesUsage
	 * @return
	 */
	
	public String displayResourcesUsage(ResourcesUsage resourcesUsage) {
		if(resourcesUsage.getName() == null) {
			return "null";
		}
		else if(resourcesUsage.getFormula() == null || resourcesUsage.getFormula() == "") {
			return resourcesUsage.getName().getName()+"()";
		}
		return resourcesUsage.getName().getName()+"("+resourcesUsage.getFormula()+")";
	}
	
	/**
	 * Display for all the Parameters Instance in the Software Diagram
	 * @param parameters
	 * @return
	 */
	
	public String displayParameters(Parameters parameters) {
		if(parameters.getName() == null || parameters.getName() == "") {
			return "null";
		}
		return parameters.getName();
	}
	
	/**
	 * Condition to know if you want to create a Task in Global or a Task in TaskGroup in Software Diagram
	 * @param element
	 * @return
	 */
	
	public Boolean conditionTaskGlobal(EObject element){
		return element.eClass().getName().equals("TaskGroup");
	}
	
	/**
	 * Condition to know if you drop a Task of a TaskGroup in Global or the opposite in Software Diagram
	 * @param taskGroup
	 * @param element
	 * @return
	 */
	
	public Boolean conditionTaskTaskGroup(EObject taskGroup, Task element){
		return element.eContainer().eClass().getName().equals("Global");
	}
	
	/**
	 * Creation condition for all the TaskGroup Instance in the Software Diagram
	 * @param taskGroup
	 * @return
	 */
	
	public Boolean conditionCreationTaskGroup(TaskGroup taskGroup) {
		List<TaskGroup> taskGroups = ((Global)taskGroup.eContainer()).getTaskGroups();
		if(taskGroup.getNbInstances()<1) {
			taskGroups.remove(taskGroup);
			return false;
		}
		return true;
	}
	
	/**
	 * Creation condition for all the Transmission Instance in the Software Diagram
	 * @param transmission
	 * @return
	 */
	
	public Boolean conditionCreationTransmission(Transmission transmission) {
		List<Transmission> transmissions = ((Task)transmission.eContainer()).getTransmissions();
		if(transmission.getAmount()<1) {
			transmissions.remove(transmission);
			return false;
		}
		return true;
	}
	
	/**
	 * Creation condition for all the Task Instance in the Software Diagram
	 * @param task
	 * @return
	 */
	
	public Boolean conditionCreationTask(Task task) {
		task.setName(AllValidation.specialCharacters(task.getName()));
		return true;
	}
	
	/**
	 * Creation condition for all the Implementation Instance in the Software Diagram
	 * @param implementation
	 * @return
	 */
	
	public Boolean conditionCreationImplementation(Implementation implementation) {
		implementation.setName(AllValidation.specialCharacters(implementation.getName()));
		implementation.setComputationMemory(AllValidation.specialCharacters(implementation.getComputationMemory()));
		implementation.setDuration(AllValidation.specialCharacters(implementation.getDuration()));
		return true;
	}
	
	/**
	 * Creation condition for all the Parameters Instance in the Software Diagram
	 * @param parameters
	 * @return
	 */
	
	public Boolean conditionCreationParamaters(Parameters parameters) {
		parameters.setName(AllValidation.specialCharacters(parameters.getName()));
		return true;
	}
	
	/**
	 * Creation condition for all the ResourcesUsage Instance in the Software Diagram
	 * @param resourcesUsage
	 * @return
	 */
	
	public Boolean conditionCreationResourcesUsages(ResourcesUsage resourcesUsage) {
		resourcesUsage.setFormula(AllValidation.specialCharacters(resourcesUsage.getFormula()));
		return true;
	}
}