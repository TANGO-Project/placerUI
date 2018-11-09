package display;

import java.util.List;

import placer.ConstraintOrObjective;
import placer.EnergyCap;
import placer.Global;
import placer.GlobalInformation;
import placer.MaxMakeSpan;
import placer.MustBeUsed;
import placer.PowerCap;
import placer.ProcessingElement;
import placer.RunOn;
import placer.SamePE;
import placer.SymetricPE;
import validation.AllValidation;
import placer.GlobalProperties;

public class ConstraintsAndObjectiveDisplay {
	
	/**
	 * Display for all the MustBeUsed Instance in the ConstraintsOrObjective Model
	 * @param mustBeUsed
	 * @return
	 */
	
	public String displayMustBeUsed(MustBeUsed mustBeUsed) {
		if(mustBeUsed.getInfo() != null && mustBeUsed.getInfo() != "") {
			if (mustBeUsed.getYes() == true) {
				return mustBeUsed.eClass().getName() + " " + mustBeUsed.getInfo();
			}
			return "MustNotBeUsed " + mustBeUsed.getInfo();
		}
		if (mustBeUsed.getYes() == true) {
			return mustBeUsed.eClass().getName();
		}
		return "MustNotBeUsed ";
	}
	
	/**
	 * Display for all the ProcessingElement Instance in the ConstraintsOrObjective Model
	 * @param processingElement
	 * @return
	 */

	public String displayProcessingElement(ProcessingElement processingElement) {
		if(processingElement.getName() == null || processingElement.getName() == "") {
			return processingElement.eClass().getName();
		}
		else if(processingElement.getClass_() == null) {
			return processingElement.eClass().getName() + " " + processingElement.getName() + " ( )"; 
		}
		return processingElement.eClass().getName() + " " + processingElement.getName() + " ("
			+ processingElement.getClass_().getName() + ")";
	}
	
	/**
	 * Display for all the SamePE Instance in the ConstraintsOrObjective Model
	 * @param samePE
	 * @return
	 */

	public String displaySamePE(SamePE samePE) {
		if(samePE.getInfo() != null && samePE.getInfo() != "") {
			if (samePE.getYes() == true) {
				return samePE.eClass().getName() + " " + samePE.getInfo();
			}
			return "NotSamePE " + samePE.getInfo();
		}
		if (samePE.getYes() == true) {
			return samePE.eClass().getName();
		}
		return "NotSamePE ";
	}
	
	/**
	 * Display for all the SymetricPE Instance in the ConstraintsOrObjective Model
	 * @param symetricPE
	 * @return
	 */
	
	public String displaySymetricPE(SymetricPE symetricPE) {
		if(symetricPE.getInfo() != null && symetricPE.getInfo() != "") {
			return symetricPE.eClass().getName()+" "+symetricPE.getInfo();
		}
		return symetricPE.eClass().getName();
	}
	
	/**
	 * Display for all the RunOn Instance in the ConstraintsOrObjective Model
	 * @param runOn
	 * @return
	 */

	public String displayRunOn(RunOn runOn) {
		if(runOn.getInfo() != null && runOn.getInfo() != "") {
			if (runOn.getYes() == true) {
				return runOn.eClass().getName()+" "+runOn.getInfo();
			}
			return "NotRunON "+runOn.getInfo();
		}
		if (runOn.getYes() == true) {
			return runOn.eClass().getName();
		}
		return "NotRunON ";
	}
	
	/**
	 * Creation condition for the MaxMakeSpan Instance in the ConstraintsOrObjective Model
	 * @param maxMakeSpan
	 * @return
	 */
	
	public Boolean conditionCreationMaxMakeSpan(MaxMakeSpan maxMakeSpan) {
		if(maxMakeSpan.getMaxMakeSpan()<1) {
			maxMakeSpan.setMaxMakeSpan(0);
			return false;
		}
		return true;
	}
	
	/**
	 * Creation condition for the EnergyCap Instance in the ConstraintsOrObjective Model
	 * @param energyCap
	 * @return
	 */
	
	public Boolean conditionCreationEnergyCap(EnergyCap energyCap) {
		if(energyCap.getEnergyCap()<1) {
			energyCap.setEnergyCap(0);
			return false;
		}
		return true;
	}
	
	/**
	 * Creation condition for the MaxMakeSpan Instance in the ConstraintsOrObjective Model
	 * @param powerCap
	 * @return
	 */
	
	public Boolean conditionCreationPowerCap(PowerCap powerCap) {
		if(powerCap.getPowerCap()<1) {
			powerCap.setPowerCap(0);
			return false;
		}
		return true;
	}
	
	/**
	 * Creation condition for all the GlobalProperties Instance in the ConstraintsOrObjective Model
	 * @param globalProperties
	 * @return
	 */
	
	public Boolean conditionCreationGlobalProperties(GlobalProperties globalProperties) {
		List<GlobalProperties> listGlobalProperties = ((Global)globalProperties.eContainer()).getGlobalProperties();
		globalProperties.setName(AllValidation.specialCharacters(globalProperties.getName()));
		if(globalProperties.getValue()<1) {
			listGlobalProperties.remove(globalProperties);
			return false;
		}
		return true;
	}
	
	/**
	 * Creation condition for all the ConstraintOrObjective Instance in the ConstraintsOrObjective Model
	 * @param constraintOrObjective
	 * @return
	 */
	
	public Boolean conditionCreationConstraintOrObjective(ConstraintOrObjective constraintOrObjective) {
		constraintOrObjective.setInfo(AllValidation.specialCharacters(constraintOrObjective.getInfo()));
		return true;
	}
	
	/**
	 * Creation condition for the GlobalInformation Instance in the ConstraintsOrObjective Model
	 * @param globalInformation
	 * @return
	 */
	
	public Boolean conditionCreationGlobalInformation(GlobalInformation globalInformation) {
		globalInformation.setInformation(AllValidation.specialCharacters(globalInformation.getInformation()));
		globalInformation.setTimeUnit(AllValidation.specialCharacters(globalInformation.getTimeUnit()));
		globalInformation.setDataUnit(AllValidation.specialCharacters(globalInformation.getDataUnit()));
		return true;
	}
}