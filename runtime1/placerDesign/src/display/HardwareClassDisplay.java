package display;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import placer.MultiTaskPermanentTasks;
import placer.ProcessingElementClass;
import placer.PropertiesDeclaration;
import placer.ResourcesDeclaration;
import placer.SwitchingTask;
import validation.AllValidation;
import placer.Global;

public class HardwareClassDisplay {
	
	/**
	 * This function allow to see if the object is a ResourcesDeclaration for a MultiTaskPermanentTasks
	 * @param multiTaskPermanentTasks
	 * @param element
	 * @return
	 */
	
	public Boolean dropResourcesDeclaration(MultiTaskPermanentTasks multiTaskPermanentTasks, EObject element) {
		return element.eClass().getName()=="ResourcesDeclaration";
	}
	
	/**
	 * This function allow to see if the object is a PropertiesDeclaration for a MultiTaskPermanentTasks
	 * @param multiTaskPermanentTasks
	 * @param element
	 * @return
	 */
	
	public Boolean dropPropertiesDeclaration(MultiTaskPermanentTasks multiTaskPermanentTasks, EObject element) {
		return element.eClass().getName()=="PropertiesDeclaration";
	}
	
	/**
	 * This function allow to see if the object is a ResourcesDeclaration for a SwitchingTask
	 * @param multiTaskPermanentTasks
	 * @param element
	 * @return
	 */
	
	public Boolean dropResourcesDeclaration(SwitchingTask switchingTask, EObject element) {
		return element.eClass().getName()=="ResourcesDeclaration";
	}
	
	/**
	 * This function allow to see if the object is a PropertiesDeclaration for a SwitchingTask
	 * @param multiTaskPermanentTasks
	 * @param element
	 * @return
	 */
	 
	public Boolean dropPropertiesDeclaration(SwitchingTask switchingTask, EObject element) {
		return element.eClass().getName()=="PropertiesDeclaration";
	}
	
	/**
	 * Creation condition for all the SwitchingTask Instance in the HardwareClass Model
	 * @param switchingTask
	 * @return
	 */
	
	public Boolean conditionCreationSwitchingTask(SwitchingTask switchingTask) {
		List<ProcessingElementClass> processingElementClasses = 
		((Global)((ProcessingElementClass)switchingTask).eContainer()).getProcessingElementClasses();
		switchingTask.setName(AllValidation.specialCharacters(switchingTask.getName()));
		if(switchingTask.getSwitchingDelay()<1) {
			processingElementClasses.remove((ProcessingElementClass)switchingTask);
			return false;
		}
		return true;
	}
	
	/**
	 * Creation condition for all the MultiTaskPermanentTasks Instance in the HardwareClass Model
	 * @param multiTaskPermanentTasks
	 * @return
	 */
	
	public Boolean conditionCreationMultiTaskPermanentTask(MultiTaskPermanentTasks multiTaskPermanentTasks) {
		multiTaskPermanentTasks.setName(AllValidation.specialCharacters(multiTaskPermanentTasks.getName()));
		return true;
	}
	
	/**
	 * Creation condition for all the ResourcesDeclaration Instance in the HardwareClass Model
	 * @param resourcesDeclaration
	 * @return
	 */
	
	public Boolean conditionCreationResourcesDeclaration(ResourcesDeclaration resourcesDeclaration) {
		resourcesDeclaration.setName(AllValidation.specialCharacters(resourcesDeclaration.getName()));
		return true;
	}
	
	/**
	 * Creation condition for all the PropertiesDeclaration Instance in the HardwareClass Model
	 * @param propertiesDeclaration
	 * @return
	 */
	
	public Boolean conditionCreationPropertiesDeclaration(PropertiesDeclaration propertiesDeclaration) {
		propertiesDeclaration.setName(AllValidation.specialCharacters(propertiesDeclaration.getName()));
		return true;
	}
}