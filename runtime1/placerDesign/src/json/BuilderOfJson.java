package json;

import placer.*;

public class BuilderOfJson {
	StringBuilder json = new StringBuilder();
	
	/**
	 * function which create the json file in input of placer
	 *(possible to optimize this function)
	 * @param global
	 */

	public void building(Global global) {
		global.getGlobalProperties();
		final String placerVersion = "PlacerBeta5";
		final String nameHardwareModel = "Hardware1";
		json.append("{\n");
		json.append("	\"timeUnit\":\"" + global.getGlobalInformations().getTimeUnit() + "\",\n");
		json.append("	\"dataUnit\":\"" + global.getGlobalInformations().getDataUnit() + "\",\n");
		json.append("	\"jsonFormat\":\"" + placerVersion + "\",\n");
		json.append("	\"info\":\"" + global.getGlobalInformations().getInformation() + "\",\n");

		/////////////////////////////////////////// HardwareClass SW/////////////////////////

		json.append("	\"processingElementClasses\":[\n");
		for (ProcessingElementClass processingElementClass : global.getProcessingElementClasses()) {
			if (processingElementClass.eClass().getName().equals("SwitchingTask")) {
				json.append("		{\n");
				json.append("			\"switchingTask\":{\n");
				json.append("				\"name\":\"" + processingElementClass.getName() + "\",\n");
				if (processingElementClass.getResourcesDeclarations().size() > 0) {
					json.append("				\"resources\":[\n		 			\""+processingElementClass.getResourcesDeclarations().get(0).getName() + "\"");
					for (int i = 1; i < processingElementClass.getResourcesDeclarations().size(); i++) {
						json.append(",\n"+processingElementClass.getResourcesDeclarations().get(i).getName() + "\"");
					}
					json.append("\n			 	],\n");
				} else {
					json.append("				\"resources\":[],\n");
				}
				if (processingElementClass.getPropertiesDeclarations().size() > 0) {
					json.append("				\"properties\":[\n		 			\""+processingElementClass.getPropertiesDeclarations().get(0).getName() + "\"");
					for (int i = 1; i < processingElementClass.getPropertiesDeclarations().size(); i++) {
						json.append(",\n		 			\""+processingElementClass.getPropertiesDeclarations().get(i).getName() + "\"");
					}
					json.append("\n		 		],\n");
				} else {
					json.append("				\"properties\":[],\n");
				}
				json.append("				\"switchingDelay\":"+((SwitchingTask) processingElementClass).getSwitchingDelay() + "\n");
				json.append("			}\n");
				json.append("		},\n");
			}
		}

		/////////////////////////////////////////// HardwareClass MTPT////////////////////

		for (ProcessingElementClass processingElementClass : global.getProcessingElementClasses()) {
			if (processingElementClass.eClass().getName().equals("MultiTaskPermanentTasks")) {
				json.append("		{\n");
				json.append("			\"multiTaskPermanentTasks\":{\n");
				json.append("				\"name\":\"" + processingElementClass.getName() + "\",\n");
				if (processingElementClass.getResourcesDeclarations().size() > 0) {
					json.append("				\"resources\":[\n		 			\""+processingElementClass.getResourcesDeclarations().get(0).getName() + "\"");
					for (int i = 1; i < processingElementClass.getResourcesDeclarations().size(); i++) {
						json.append(",\n		 			\""+processingElementClass.getResourcesDeclarations().get(i).getName() + "\"");
					}
					json.append("\n			 	],\n");
				} else {
					json.append("				\"resources\":[],\n");
				}
				if (processingElementClass.getPropertiesDeclarations().size() > 0) {
					json.append("				\"properties\":[\n		 			\""+processingElementClass.getPropertiesDeclarations().get(0).getName() + "\"");
					for (int i = 1; i < processingElementClass.getPropertiesDeclarations().size(); i++) {
						json.append(",\n		 			\""+processingElementClass.getPropertiesDeclarations().get(i).getName() + "\"");
					}
					json.append("\n		 		]\n");
				} else {
					json.append("				\"properties\":[]\n");
				}
				json.append("			}\n");
				json.append("		},\n");
			}
		}
		json.replace(json.length() - 2, json.length(), "\n");
		json.append("	],\n");
		

		//////////////////////////////////////////////////// Processing Element /////////////////////////////////////////////////////

		json.append("	\"hardwareModel\":{\n");
		json.append("		\"name\":\"" + nameHardwareModel + "\",\n");
		json.append("		\"processingElements\":[\n");
		for (ProcessingElement processingElement : global.getProcessingElements()) {
			json.append("			{\n");
			json.append("				\"processorClass\":\"" + processingElement.getClass_().getName() + "\",\n");
			json.append("				\"name\":\"" + processingElement.getName() + "\",\n");
			json.append("				\"memSize\":" + processingElement.getMemory() + ",\n");
			if (processingElement.getResourcesDefinitions().size() > 0) {
				json.append("				\"resources\":[\n");
				for (ResourcesDefinition resourcesDefinition : processingElement.getResourcesDefinitions()) {
					json.append("					{\n");
					json.append("						\"name\":\"" + resourcesDefinition.getName().getName() + "\",\n");
					json.append("		 				\"value\":" + resourcesDefinition.getValue() + "\n");
					json.append("					},\n");
				}
				json.replace(json.length() - 2, json.length(), "\n");
				json.append("				],\n");
			} else {
				json.append("				\"resources\":[],\n");
			}
			if (processingElement.getPropertiesDefinitions().size() > 0) {
				json.append("				\"properties\":[\n");
				for (PropertiesDefinition propertiesDefinition : processingElement.getPropertiesDefinitions()) {
					json.append("					{\n");
					json.append("						\"name\":\"" + propertiesDefinition.getName().getName() + "\",\n");
					json.append("		 				\"value\":" + propertiesDefinition.getValue() + "\n");
					json.append("					},\n");
				}
				json.replace(json.length() - 2, json.length(), "\n");
				json.append("				],\n");
			} else {
				json.append("				\"properties\":[],\n");
			}
			json.append("				\"powerModel\":\"" + processingElement.getPowerModel() + "\"\n");
			json.append("			},\n");
		}
		json.replace(json.length() - 2, json.length(), "\n");
		json.append("		],\n");

		//////////////////////////////////// Bus /////////////////////////////////////////////////

		json.append("		\"busses\":[\n");
		for (Bus bus : global.getBusses()) {
			json.append("			{\n");
			json.append("				\"halfDuplexBus\":{\n");
			json.append("					\"name\":\"" + bus.getName() + "\",\n");
			json.append("					\"relatedProcessors\":[\n");
			json.append("						\"" + bus.getConnections().get(0).getConnectionTo().getName() + "\"");
			for (int j = 1; j < bus.getConnections().size(); j++) {
				json.append(",\n						\"" + bus.getConnections().get(j).getConnectionTo().getName()+  "\"");
			}
			json.append("\n");
			json.append("					],\n");
			json.append("					\"timeUnitPerDataUnit\":" + bus.getTimeUnitPerDataUnit() + ",\n");
			json.append("					\"latency\":" + bus.getLatency() + "\n");
			json.append("				}\n");
			json.append("			},\n");
		}
		json.replace(json.length() - 2, json.length(), "\n");
		json.append("		],\n");
		if (global.getGlobalProperties().size() == 0) {
			json.append("		\"properties\":[]\n");
		} else {
			json.append("		\"properties\":[\n");
			for (GlobalProperties globalProperties : global.getGlobalProperties()) {
				json.append("			{\n");
				json.append("				\"name\":\"" + globalProperties.getName() + "\",\n");
				json.append("				\"value\":" + globalProperties.getValue() + "\n");
				json.append("			},\n");
			}
			json.replace(json.length() - 2, json.length(), "\n");
			json.append("		]\n");
		}
		json.append("	},\n");

		/////////////////////////////////////////////// SoftwareModel ///////////////////////////////////////////////

		json.append("	\"softwareModel\":{\n");
		json.append("		\"tasks\":[\n");
		for (Task task : global.getTasks()) {
			json.append("			{\n");
			json.append("				\"name\":\"" + task.getName() + "\",\n");
			json.append("				\"implementations\":[\n");
			for (Implementation implementation : task.getImplementations()) {
				json.append("					{\n");
				json.append("						\"name\":\"" + implementation.getName() + "\",\n");
				json.append("						\"target\":\"" + implementation.getTarget().getName() + "\",\n");
				if (implementation.getParameters().size() != 0) {
					json.append("						\"parameters\":[\n");
					for (Parameters parameters : implementation.getParameters()) {
						json.append("							{\n");
						json.append("								\"name\":\"" + parameters.getName() + "\",\n");
						json.append("		 						\"values\":[\n" + "									" 
							+ parameters.getValue().get(0));
						for (int l = 1; l < parameters.getValue().size(); l++) {
							json.append(",\n		 							" + parameters.getValue().get(l));
						}
						json.append("\n");
						json.append("		 						]\n");
						json.append("							},\n");
					}
					json.replace(json.length() - 2, json.length(), "\n");
					json.append("						],\n");
				} else {
					json.append("						\"parameters\":[],\n");
				}
				if (implementation.getResourcesUsages().size() != 0) {
					json.append("						\"resourceUsage\":[\n");
					for (ResourcesUsage resourcesUsage : implementation.getResourcesUsages()) {
						json.append("							{\n");
						json.append("								\"name\":\"" + resourcesUsage.getName().getName() + "\",\n");
						json.append("		 						\"formula\":\"" + resourcesUsage.getFormula() + "\"\n");
						json.append("							},\n");
					}
					json.replace(json.length() - 2, json.length(), "\n");
					json.append("						],\n");
				} else {
					json.append("						\"resourceUsage\":[],\n");
				}
				json.append("						\"computationMemory\":\"" + implementation.getComputationMemory() + "\",\n");
				json.append("						\"duration\":\"" + implementation.getDuration() + "\"\n");
				json.append("					},\n");
			}
			json.replace(json.length() - 2, json.length(), "\n");
			json.append("				]\n");
			json.append("			},\n");
		}
		
		for (TaskGroup taskGroup : global.getTaskGroups()) {
			for (int inst = 1; inst < taskGroup.getNbInstances()+1; inst++) {
				for (Task task : taskGroup.getTaskTaskGroups()) {
					json.append("			{\n");
					json.append("				\"name\":\"" + task.getName() + "[" +inst + "]\",\n");
					json.append("				\"implementations\":[\n");
					for (Implementation implementation : task.getImplementations()) {
						json.append("					{\n");
						json.append("						\"name\":\"" + implementation.getName() + "\",\n");
						json.append("						\"target\":\"" + implementation.getTarget().getName()+ "\",\n");
						if (implementation.getParameters().size() > 0) {
							json.append("						\"parameters\":[\n");
							for (Parameters parameters : implementation.getParameters()) {
								json.append("							{\n");
								json.append("								\"name\":\"" + parameters.getName() + "\",\n");
								json.append("		 						\"value\":[\n" + "									" 
									+ parameters.getValue().get(0));
								for (int l = 1; l < parameters.getValue().size(); l++) {
									json.append(",\n		 							" + parameters.getValue().get(l));
								}
								json.append("\n");
								json.append("		 						]\n");
								json.append("							},\n");
							}
							json.replace(json.length() - 2, json.length(), "\n");
							json.append("						],\n");
						} else {
							json.append("						\"parameters\":[],\n");
						}
						if (implementation.getResourcesUsages().size() > 0) {
							json.append("						\"resourceUsage\":[\n");
							for (ResourcesUsage resourcesUsage : implementation.getResourcesUsages()) {
								json.append("							{\n");
								json.append("								\"name\":\"" + resourcesUsage.getName().getName()+ "\",\n");
								json.append("		 						\"formula\":\""+ resourcesUsage.getFormula() + "\"\n");
								json.append("							},\n");
							}
							json.replace(json.length() - 2, json.length(), "\n");
							json.append("						],\n");
						} else {
							json.append("						\"resourceUsage\":[],\n");
						}
						json.append("						\"computationMemory\":\"" + implementation.getComputationMemory() + "\",\n");
						json.append("						\"duration\":\"" + implementation.getDuration() + "\"\n");
						json.append("					},\n");
					}
					json.replace(json.length() - 2, json.length(), "\n");
					json.append("				]\n");
					json.append("			},\n");
				}
			}
		}
		json.replace(json.length() - 2, json.length(), "\n");
		json.append("		],\n");

		///////////////////////////////////////////////////////// Transmission ///////////////////////////////////////////////////

		json.append("		\"transmissions\":[\n");
		for (Task task : global.getTasks()) {
			for (Transmission transmission : task.getTransmissions()) {
				if (global.getTaskGroups().size() == 0 || transmission.getTo().eContainer().eClass().getName().equals("Global")) {
					json.append("			{\n");
					json.append("				\"name\":\"" + transmission.getFrom().getName() + "TO" + transmission.getTo().getName() 
						+ transmission.hashCode()+"\",\n");
					json.append("				\"source\":\"" + transmission.getFrom().getName() + "\",\n");
					json.append("				\"target\":\"" + transmission.getTo().getName() + "\",\n");
					json.append("				\"size\":" + transmission.getAmount() + ",\n");
					json.append("				\"timing\":\"" + transmission.getTiming() + "\"\n");
					json.append("			},\n");
				} else {
					int instance = ((TaskGroup) transmission.getTo().eContainer()).getNbInstances()+1;
					for (int k = 1; k < instance; k++) {
						json.append("			{\n");
						json.append("				\"name\":\"" + transmission.getFrom().getName() + "TO" + transmission.getTo().getName() 
							+ "["+k +"]"+transmission.hashCode()+"\",\n");
						json.append("				\"source\":\"" + transmission.getFrom().getName() + "\",\n");
						json.append("				\"target\":\"" + transmission.getTo().getName() + "["+k +"]\",\n");
						json.append("				\"size\":" + transmission.getAmount() + ",\n");
						json.append("				\"timing\":\"" + transmission.getTiming().getLiteral() + "\"\n");
						json.append("			},\n");
					}
				}
			}
		}
		for (TaskGroup taskGroup : global.getTaskGroups()) {
			for (int inst = 1; inst < taskGroup.getNbInstances()+1; inst++) {
				for (Task task : taskGroup.getTaskTaskGroups()) {
					for (Transmission transmission : task.getTransmissions()) {
						json.append("			{\n");
						if (transmission.getTo().eContainer().eClass().getName().equals("Global")) {
							json.append("				\"name\":\""+ transmission.getFrom().getName() +"["+inst+"]TO" 
								+ transmission.getTo().getName()+transmission.hashCode()+"\",\n");
							json.append("				\"source\":\"" + transmission.getFrom().getName() + "["+inst + "]\",\n");
							json.append("				\"target\":\"" + transmission.getTo().getName() + "\",\n");
						} else {
							json.append("				\"name\":\""+transmission.getFrom().getName()+"["+inst + "]TO"
								+transmission.getTo().getName()+"["+inst+"]"+transmission.hashCode()+"\",\n");
							json.append("				\"source\":\"" + transmission.getFrom().getName() + "["+inst + "]\",\n");
							json.append("				\"target\":\"" + transmission.getTo().getName() + "["+inst+"]\",\n");
						}
						json.append("				\"size\":" + transmission.getAmount() + ",\n");
						json.append("				\"timing\":\"" + transmission.getTiming().getLiteral() + "\"\n");
						json.append("			},\n");
					}
				}
			}
		}
		json.replace(json.length() - 2, json.length(), "\n");
		json.append("		],\n");
		json.append("	\"softwareClass\":\"" + global.getSoftwareClass() + "\"\n");
		json.append("	},\n");

		//////////////////////////////////////////////// CO ///////////////////////////////////////////////////////////////

		json.append("	\"constraintsAndObjectives\":[\n");
		for(ConstraintOrObjective constraintOrObjective : global.getConstraintOrObjectives()) {
			json.append("		{\n");
			
			switch(constraintOrObjective.eClass().getName()) {
				case "MustBeUsed": 
					json.append(((MustBeUsed)constraintOrObjective).getYes()?
							"			\"mustbeused\":\"" + ((MustBeUsed)constraintOrObjective).getProcessingElementMustBeUsed().getName() + "\"\n":
							"			\"mustnotbeused\":\"" + ((MustBeUsed)constraintOrObjective).getProcessingElementMustBeUsed().getName() + "\"\n"); break;
				case "SymetricPE": 
					json.append("			\"symetricpe\":{\n				\""+((SymetricPE)constraintOrObjective).getProcessingElementSymetricPE().get(0).getName() + "\"");
					for(int i=1; i<((SymetricPE)constraintOrObjective).getProcessingElementSymetricPE().size(); i++) {
						json.append(",\n				\"" + ((SymetricPE)constraintOrObjective).getProcessingElementSymetricPE().get(i).getName() + "\"");
					}
					json.append("\n			}\n");; break;
				case "RunOn":
					if(((RunOn)constraintOrObjective).getTaskRunOn().eContainer().eClass().getName().equals("TaskGroup")) {
						int instance = ((TaskGroup)((RunOn)constraintOrObjective).getTaskRunOn().eContainer()).getNbInstances();
							for(int i=1; i<instance+1;i++) {
								if(((RunOn)constraintOrObjective).getYes()) {
									json.append("			\"runon\":{\n");
								}
								else{
									json.append("			\"notrunon\":{\n");
								}
								json.append("				\"pe\":\"" + ((RunOn)constraintOrObjective).getProcessingElementRunOn().getName() + "\",\n");
								json.append("				\"task\":\"" + ((RunOn)constraintOrObjective).getTaskRunOn().getName() + "["+i+"]\"\n");
								json.append("			},\n");
								if(i!=instance) {
									json.append("		},\n");
									json.append("		{\n");
								}
							}
						}
					else {
						if(((RunOn)constraintOrObjective).getYes()) {
							json.append("			\"runon\":{\n");
						}else {
							json.append("			\"notrunon\":{\n");
						}
						json.append("				\"pe\":\"" + ((RunOn)constraintOrObjective).getProcessingElementRunOn().getName() + "\",\n");
						json.append("				\"task\":\"" + ((RunOn)constraintOrObjective).getTaskRunOn().getName() + "\"\n");
						json.append("			},\n");
					}; break;
				default: //SamePE
					if(((SamePE)constraintOrObjective).getYes()) {
						json.append("			\"samepe\":{\n				\"");
					}else {
						json.append("			\"notsamepe\":{\n				\"");
					}
					if(((SamePE)constraintOrObjective).getTaskSamePE().get(0).eContainer().eClass().getName().equals("TaskGroup")) {
						int instance = ((TaskGroup)((SamePE)constraintOrObjective).getTaskSamePE().get(0).eContainer()).getNbInstances()+1;
						json.append(((SamePE)constraintOrObjective).getTaskSamePE().get(0).getName() + "[1]\"");
						for(int i=1; i<instance; i++) {
							json.append(",\n				\"" + ((SamePE)constraintOrObjective).getTaskSamePE().get(0).getName() + "["+i+"]\"");
						}
					}
					else {
						json.append(((SamePE)constraintOrObjective).getTaskSamePE().get(0).getName() + "\"");
					}
					for(int i=1; i<((SamePE)constraintOrObjective).getTaskSamePE().size(); i++) {
						if(((SamePE)constraintOrObjective).getTaskSamePE().get(i).eContainer().eClass().getName().equals("TaskGroup")) {
							int instance = ((TaskGroup)((SamePE)constraintOrObjective).getTaskSamePE().get(i).eContainer()).getNbInstances()+1;
							json.append(",\n				\"" +((SamePE)constraintOrObjective).getTaskSamePE().get(i).getName() + "[1]\"");
							for(int j=2; j<instance; j++) {
								json.append(",\n				\"" + ((SamePE)constraintOrObjective).getTaskSamePE().get(i).getName() + "["+j+"]\"");
							}
						}
						else {
							json.append(",\n				\"" + ((SamePE)constraintOrObjective).getTaskSamePE().get(i).getName() + "\"");
						}
					}
					json.append("\n			}\n");; break;
			}
			json.append("		},\n");
		}
		if (global.getMappingGoals() != null) {
			json.append("		{\n");
			if (global.getMappingGoals().eClass().getName().equals("MultiObjectiveGoal")) {
				json.append("			\"multiObjective\":{\n");
				json.append("				\"a\": \"" + global.getMappingGoals().getSimpleObjective() + "\"");
				json.append(",\n				\"b\": \"" + ((MultiObjectiveGoal) global.getMappingGoals()).getSimpleObjective2() + "\"");
				json.append("\n			}\n");
			}
			else {
				json.append("			\"simpleObjective\": \"" + global.getMappingGoals().getSimpleObjective() + "\"");
			}
			json.append("		},\n");
		}
		if (global.getPowerCap() != null) {
			json.append("		{\n");
			json.append("			\"powerCap\":" + global.getPowerCap().getPowerCap() + "\n");
			json.append("		},\n");
		}
		if (global.getEnergyCap() != null) {
			json.append("		{\n");
			json.append("			\"energyCap\":" + global.getEnergyCap().getEnergyCap() + "\n");
			json.append("		},\n");
		}
		if (global.getMaxMakeSpan() != null) {
			json.append("		{\n");
			json.append("			\"maxMakespan\":" + global.getMaxMakeSpan().getMaxMakeSpan() + "\n");
			json.append("		},\n");
		}
		json.replace(json.length() - 2, json.length(), "\n");
		json.append("	]\n");
		json.append("}");
		
		CreationOfFolder.actionOnComputeur(json, global);
	}
}