package validation;

import java.util.ArrayList;
import java.util.List;
import placer.ConstraintOrObjective;
import placer.Global;
import placer.GlobalInformation;
import placer.MustBeUsed;
import placer.RunOn;
import placer.SamePE;
import placer.SymetricPE;
import placer.GlobalProperties;

public class ConstraintsAndObjectiveValidation {
	
	/**
	 * Verify that there is at least 1 GlobalInformation
	 * @param global
	 * @return
	 */
	
	public Boolean creationGlobalInformation(Global global) {
		return global.getGlobalInformations() != null;
	}
	
	/**
	 * Validate the good creation of MustBeUsed Instance 
	 * @param global
	 * @return
	 */
	
	public Boolean validationMustBeUsed(Global global) {
		List<ConstraintOrObjective> constraintOrObjectiveList  = global.getConstraintOrObjectives();
		for(ConstraintOrObjective constraintOrObjective : constraintOrObjectiveList) {
			if(constraintOrObjective.eClass().getName().equals("MustBeUsed")) {
				return ((MustBeUsed)constraintOrObjective).getProcessingElementMustBeUsed() != null;
			}
		}
		return true;
	}
	
	/**
	 * Validate the good creation of SamePE Instance
	 * @param global
	 * @return
	 */
		
	public Boolean validationSamePE(Global global) {
		List<ConstraintOrObjective> constraintOrObjectiveList  = global.getConstraintOrObjectives();
		for(ConstraintOrObjective constraintOrObjective : constraintOrObjectiveList) {
			if(constraintOrObjective.eClass().getName().equals("SamePE")) {
				return ((SamePE)constraintOrObjective).getTaskSamePE().size()>1;
			}
		}
		return true;
	}
	
/**
 * Validate the good creation of SymetricPE Instance
 * @param global
 * @return
 */
	
	public Boolean validationSymetricPE(Global global) {
		List<ConstraintOrObjective> constraintOrObjectiveList  = global.getConstraintOrObjectives();
		for(ConstraintOrObjective constraintOrObjective : constraintOrObjectiveList) {
			if(constraintOrObjective.eClass().getName().equals("SymetricPE")) {
				return ((SymetricPE)constraintOrObjective).getProcessingElementSymetricPE().size()>1;
			}
		}
		return true;
	}
	
	/**
	 * Validate the good creation of RunOn Instance
	 * @param global
	 * @return
	 */
	
	public Boolean validationRunOn(Global global) {
		List<ConstraintOrObjective> constraintOrObjectiveList  = global.getConstraintOrObjectives();
		for(ConstraintOrObjective constraintOrObjective : constraintOrObjectiveList) {
			if(constraintOrObjective.eClass().getName().equals("RunOn")) {
				return ((RunOn)constraintOrObjective).getProcessingElementRunOn() != null && ((RunOn)constraintOrObjective).getTaskRunOn() != null;
			}
		}
		return true;
	}
	
	/**
	 * Validate the good creation of PowerCap Instance
	 * @param global
	 * @return
	 */
	
	public Boolean validationPowerCap(Global global) {
		if(global.getPowerCap() != null) {
			return global.getPowerCap().getPowerCap()>0;
		}
		return true;
	}
	
	/**
	 * Validate the good creation of EnergyCap Instance
	 * @param global
	 * @return
	 */
	
	public Boolean validationEnergyCap(Global global) {
		if(global.getEnergyCap() != null) {
			return global.getEnergyCap().getEnergyCap()>0;
		}
		return true;
	}
	
	/**
	 * Validate the good creation of MaxMakeSpan Instance
	 * @param global
	 * @return
	 */
	
	public Boolean validationMaxMakeSpan(Global global) {
		if(global.getMaxMakeSpan() != null) {
			return global.getMaxMakeSpan().getMaxMakeSpan()>0;
		}
		return true;
	}
	
	/**
	 * Validate the good creation of GlobalInformation Instance
	 * @param global
	 * @return
	 */
	
	public Boolean validationGlobalInformation(Global global) {
		GlobalInformation globalInformation = global.getGlobalInformations();
		return (globalInformation.getInformation() != null && globalInformation.getInformation() != "" &&
			globalInformation.getTimeUnit() != null && globalInformation.getTimeUnit() != "" &&
			globalInformation.getDataUnit() != null && globalInformation.getDataUnit() != "");
	}
	
	/**
	 * Validate the good creation of GlobalProperties Instance
	 * @param global
	 * @return
	 */
	
	public Boolean validationGlobalProperties(Global global) {
		List<GlobalProperties> globalProperties = global.getGlobalProperties();
		for(GlobalProperties globalPropertiesList : globalProperties) {
			if(globalPropertiesList.getName() == null || globalPropertiesList.getName() == "" || globalPropertiesList.getValue()<1) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Verify that 2 GlobalProperties do not have the same name
	 * @param global
	 * @return
	 */
	
	public Boolean sameNameGlobalProperties(Global global) {
		List<GlobalProperties> globalPropertiesList = global.getGlobalProperties();
		for(GlobalProperties globalProperties1 : globalPropertiesList) {
			for(GlobalProperties globalProperties2 : globalPropertiesList) {
				if(globalProperties1.getName().equals(globalProperties2.getName()) && globalProperties1.hashCode() != globalProperties2.hashCode()) {
					return false;
				}
			}
			
		}
		return true;
	}
	
	/**
	 * Verify that 2 MustBeUsed do not have the same ProcessingElement
	 * @param global
	 * @return
	 */
	
	public Boolean sameUseMustBeUsed(Global global) {
		List<ConstraintOrObjective> constraintOrObjectiveList  = global.getConstraintOrObjectives();
		List<MustBeUsed> mustBeUsed = new ArrayList<MustBeUsed>();
		for(ConstraintOrObjective constraintOrObjective : constraintOrObjectiveList) {
			if(constraintOrObjective.eClass().getName().equals("MustBeUsed")) {
				mustBeUsed.add(((MustBeUsed)constraintOrObjective));
			}
		}
		for(MustBeUsed mustBeUsed1 : mustBeUsed) {
			for(MustBeUsed mustBeUsed2 : mustBeUsed) {
				if(mustBeUsed1.getProcessingElementMustBeUsed().equals(mustBeUsed2.getProcessingElementMustBeUsed())
					&& mustBeUsed1.getProcessingElementMustBeUsed().hashCode() != mustBeUsed2.getProcessingElementMustBeUsed().hashCode()	) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Verify that 2 RunOn do not have the same ProcessingElement or the same Task
	 * @param global
	 * @return
	 */
	
	public Boolean sameUseRunOn(Global global) {
		List<ConstraintOrObjective> constraintOrObjectiveList  = global.getConstraintOrObjectives();
		List<RunOn> runOn = new ArrayList<RunOn>();
		for(ConstraintOrObjective constraintOrObjective : constraintOrObjectiveList) {
			if(constraintOrObjective.eClass().getName().equals("RunOn")) {
				runOn.add(((RunOn)constraintOrObjective));
			}
		}
		for(RunOn runOn1 : runOn) {
			for(RunOn runOn2 : runOn) {
				if(runOn1.getTaskRunOn().getName().equals(runOn2.getTaskRunOn().getName()) 
					&& runOn1.getTaskRunOn().hashCode() != runOn2.getTaskRunOn().hashCode() 
					&& runOn1.getProcessingElementRunOn().getName().equals(runOn2.getProcessingElementRunOn().getName())
					&& runOn1.getProcessingElementRunOn().hashCode() != runOn2.getProcessingElementRunOn().hashCode()) {
					return false;
				}
			}
		}
		return true;
	}
}