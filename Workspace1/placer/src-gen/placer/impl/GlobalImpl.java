/**
 */
package placer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import placer.Bus;
import placer.ConstraintOrObjective;
import placer.EnergyCap;
import placer.Global;
import placer.GlobalInformation;
import placer.GlobalProperties;
import placer.MainPlacerOut;
import placer.MappingGoal;
import placer.MaxMakeSpan;
import placer.PlacerPackage;
import placer.PowerCap;
import placer.ProcessingElement;
import placer.ProcessingElementClass;
import placer.SoftwareClass;
import placer.Task;
import placer.TaskGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placer.impl.GlobalImpl#getConstraintOrObjectives <em>Constraint Or Objectives</em>}</li>
 *   <li>{@link placer.impl.GlobalImpl#getPowerCap <em>Power Cap</em>}</li>
 *   <li>{@link placer.impl.GlobalImpl#getEnergyCap <em>Energy Cap</em>}</li>
 *   <li>{@link placer.impl.GlobalImpl#getGlobalInformations <em>Global Informations</em>}</li>
 *   <li>{@link placer.impl.GlobalImpl#getMappingGoals <em>Mapping Goals</em>}</li>
 *   <li>{@link placer.impl.GlobalImpl#getBusses <em>Busses</em>}</li>
 *   <li>{@link placer.impl.GlobalImpl#getProcessingElements <em>Processing Elements</em>}</li>
 *   <li>{@link placer.impl.GlobalImpl#getProcessingElementClasses <em>Processing Element Classes</em>}</li>
 *   <li>{@link placer.impl.GlobalImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link placer.impl.GlobalImpl#getTaskGroups <em>Task Groups</em>}</li>
 *   <li>{@link placer.impl.GlobalImpl#getMaxMakeSpan <em>Max Make Span</em>}</li>
 *   <li>{@link placer.impl.GlobalImpl#getSoftwareClass <em>Software Class</em>}</li>
 *   <li>{@link placer.impl.GlobalImpl#getGlobalProperties <em>Global Properties</em>}</li>
 *   <li>{@link placer.impl.GlobalImpl#getCommandLineParameters <em>Command Line Parameters</em>}</li>
 *   <li>{@link placer.impl.GlobalImpl#getMainPlacerOut1 <em>Main Placer Out1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalImpl extends MinimalEObjectImpl.Container implements Global {
	/**
	 * The cached value of the '{@link #getConstraintOrObjectives() <em>Constraint Or Objectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintOrObjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintOrObjective> constraintOrObjectives;

	/**
	 * The cached value of the '{@link #getPowerCap() <em>Power Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerCap()
	 * @generated
	 * @ordered
	 */
	protected PowerCap powerCap;

	/**
	 * The cached value of the '{@link #getEnergyCap() <em>Energy Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyCap()
	 * @generated
	 * @ordered
	 */
	protected EnergyCap energyCap;

	/**
	 * The cached value of the '{@link #getGlobalInformations() <em>Global Informations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalInformations()
	 * @generated
	 * @ordered
	 */
	protected GlobalInformation globalInformations;

	/**
	 * The cached value of the '{@link #getMappingGoals() <em>Mapping Goals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingGoals()
	 * @generated
	 * @ordered
	 */
	protected MappingGoal mappingGoals;

	/**
	 * The cached value of the '{@link #getBusses() <em>Busses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusses()
	 * @generated
	 * @ordered
	 */
	protected EList<Bus> busses;

	/**
	 * The cached value of the '{@link #getProcessingElements() <em>Processing Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingElement> processingElements;

	/**
	 * The cached value of the '{@link #getProcessingElementClasses() <em>Processing Element Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingElementClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingElementClass> processingElementClasses;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getTaskGroups() <em>Task Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskGroup> taskGroups;

	/**
	 * The cached value of the '{@link #getMaxMakeSpan() <em>Max Make Span</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMakeSpan()
	 * @generated
	 * @ordered
	 */
	protected MaxMakeSpan maxMakeSpan;

	/**
	 * The default value of the '{@link #getSoftwareClass() <em>Software Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareClass()
	 * @generated
	 * @ordered
	 */
	protected static final SoftwareClass SOFTWARE_CLASS_EDEFAULT = SoftwareClass.ONE_SHOT_SOFTWARE;

	/**
	 * The cached value of the '{@link #getSoftwareClass() <em>Software Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareClass()
	 * @generated
	 * @ordered
	 */
	protected SoftwareClass softwareClass = SOFTWARE_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGlobalProperties() <em>Global Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalProperties> globalProperties;

	/**
	 * The default value of the '{@link #getCommandLineParameters() <em>Command Line Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandLineParameters()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_LINE_PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandLineParameters() <em>Command Line Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandLineParameters()
	 * @generated
	 * @ordered
	 */
	protected String commandLineParameters = COMMAND_LINE_PARAMETERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMainPlacerOut1() <em>Main Placer Out1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainPlacerOut1()
	 * @generated
	 * @ordered
	 */
	protected MainPlacerOut mainPlacerOut1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacerPackage.Literals.GLOBAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintOrObjective> getConstraintOrObjectives() {
		if (constraintOrObjectives == null) {
			constraintOrObjectives = new EObjectContainmentEList<ConstraintOrObjective>(ConstraintOrObjective.class,
					this, PlacerPackage.GLOBAL__CONSTRAINT_OR_OBJECTIVES);
		}
		return constraintOrObjectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerCap getPowerCap() {
		return powerCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerCap(PowerCap newPowerCap, NotificationChain msgs) {
		PowerCap oldPowerCap = powerCap;
		powerCap = newPowerCap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PlacerPackage.GLOBAL__POWER_CAP, oldPowerCap, newPowerCap);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerCap(PowerCap newPowerCap) {
		if (newPowerCap != powerCap) {
			NotificationChain msgs = null;
			if (powerCap != null)
				msgs = ((InternalEObject) powerCap).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PlacerPackage.GLOBAL__POWER_CAP, null, msgs);
			if (newPowerCap != null)
				msgs = ((InternalEObject) newPowerCap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PlacerPackage.GLOBAL__POWER_CAP, null, msgs);
			msgs = basicSetPowerCap(newPowerCap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.GLOBAL__POWER_CAP, newPowerCap,
					newPowerCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyCap getEnergyCap() {
		return energyCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergyCap(EnergyCap newEnergyCap, NotificationChain msgs) {
		EnergyCap oldEnergyCap = energyCap;
		energyCap = newEnergyCap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PlacerPackage.GLOBAL__ENERGY_CAP, oldEnergyCap, newEnergyCap);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyCap(EnergyCap newEnergyCap) {
		if (newEnergyCap != energyCap) {
			NotificationChain msgs = null;
			if (energyCap != null)
				msgs = ((InternalEObject) energyCap).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PlacerPackage.GLOBAL__ENERGY_CAP, null, msgs);
			if (newEnergyCap != null)
				msgs = ((InternalEObject) newEnergyCap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PlacerPackage.GLOBAL__ENERGY_CAP, null, msgs);
			msgs = basicSetEnergyCap(newEnergyCap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.GLOBAL__ENERGY_CAP, newEnergyCap,
					newEnergyCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalInformation getGlobalInformations() {
		return globalInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalInformations(GlobalInformation newGlobalInformations,
			NotificationChain msgs) {
		GlobalInformation oldGlobalInformations = globalInformations;
		globalInformations = newGlobalInformations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PlacerPackage.GLOBAL__GLOBAL_INFORMATIONS, oldGlobalInformations, newGlobalInformations);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalInformations(GlobalInformation newGlobalInformations) {
		if (newGlobalInformations != globalInformations) {
			NotificationChain msgs = null;
			if (globalInformations != null)
				msgs = ((InternalEObject) globalInformations).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PlacerPackage.GLOBAL__GLOBAL_INFORMATIONS, null, msgs);
			if (newGlobalInformations != null)
				msgs = ((InternalEObject) newGlobalInformations).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PlacerPackage.GLOBAL__GLOBAL_INFORMATIONS, null, msgs);
			msgs = basicSetGlobalInformations(newGlobalInformations, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.GLOBAL__GLOBAL_INFORMATIONS,
					newGlobalInformations, newGlobalInformations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingGoal getMappingGoals() {
		return mappingGoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingGoals(MappingGoal newMappingGoals, NotificationChain msgs) {
		MappingGoal oldMappingGoals = mappingGoals;
		mappingGoals = newMappingGoals;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PlacerPackage.GLOBAL__MAPPING_GOALS, oldMappingGoals, newMappingGoals);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingGoals(MappingGoal newMappingGoals) {
		if (newMappingGoals != mappingGoals) {
			NotificationChain msgs = null;
			if (mappingGoals != null)
				msgs = ((InternalEObject) mappingGoals).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PlacerPackage.GLOBAL__MAPPING_GOALS, null, msgs);
			if (newMappingGoals != null)
				msgs = ((InternalEObject) newMappingGoals).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PlacerPackage.GLOBAL__MAPPING_GOALS, null, msgs);
			msgs = basicSetMappingGoals(newMappingGoals, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.GLOBAL__MAPPING_GOALS, newMappingGoals,
					newMappingGoals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bus> getBusses() {
		if (busses == null) {
			busses = new EObjectContainmentEList<Bus>(Bus.class, this, PlacerPackage.GLOBAL__BUSSES);
		}
		return busses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessingElement> getProcessingElements() {
		if (processingElements == null) {
			processingElements = new EObjectContainmentEList<ProcessingElement>(ProcessingElement.class, this,
					PlacerPackage.GLOBAL__PROCESSING_ELEMENTS);
		}
		return processingElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessingElementClass> getProcessingElementClasses() {
		if (processingElementClasses == null) {
			processingElementClasses = new EObjectContainmentEList<ProcessingElementClass>(ProcessingElementClass.class,
					this, PlacerPackage.GLOBAL__PROCESSING_ELEMENT_CLASSES);
		}
		return processingElementClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, PlacerPackage.GLOBAL__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskGroup> getTaskGroups() {
		if (taskGroups == null) {
			taskGroups = new EObjectContainmentEList<TaskGroup>(TaskGroup.class, this,
					PlacerPackage.GLOBAL__TASK_GROUPS);
		}
		return taskGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxMakeSpan getMaxMakeSpan() {
		return maxMakeSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxMakeSpan(MaxMakeSpan newMaxMakeSpan, NotificationChain msgs) {
		MaxMakeSpan oldMaxMakeSpan = maxMakeSpan;
		maxMakeSpan = newMaxMakeSpan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PlacerPackage.GLOBAL__MAX_MAKE_SPAN, oldMaxMakeSpan, newMaxMakeSpan);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxMakeSpan(MaxMakeSpan newMaxMakeSpan) {
		if (newMaxMakeSpan != maxMakeSpan) {
			NotificationChain msgs = null;
			if (maxMakeSpan != null)
				msgs = ((InternalEObject) maxMakeSpan).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PlacerPackage.GLOBAL__MAX_MAKE_SPAN, null, msgs);
			if (newMaxMakeSpan != null)
				msgs = ((InternalEObject) newMaxMakeSpan).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PlacerPackage.GLOBAL__MAX_MAKE_SPAN, null, msgs);
			msgs = basicSetMaxMakeSpan(newMaxMakeSpan, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.GLOBAL__MAX_MAKE_SPAN, newMaxMakeSpan,
					newMaxMakeSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareClass getSoftwareClass() {
		return softwareClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareClass(SoftwareClass newSoftwareClass) {
		SoftwareClass oldSoftwareClass = softwareClass;
		softwareClass = newSoftwareClass == null ? SOFTWARE_CLASS_EDEFAULT : newSoftwareClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.GLOBAL__SOFTWARE_CLASS,
					oldSoftwareClass, softwareClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalProperties> getGlobalProperties() {
		if (globalProperties == null) {
			globalProperties = new EObjectContainmentEList<GlobalProperties>(GlobalProperties.class, this,
					PlacerPackage.GLOBAL__GLOBAL_PROPERTIES);
		}
		return globalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommandLineParameters() {
		return commandLineParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandLineParameters(String newCommandLineParameters) {
		String oldCommandLineParameters = commandLineParameters;
		commandLineParameters = newCommandLineParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.GLOBAL__COMMAND_LINE_PARAMETERS,
					oldCommandLineParameters, commandLineParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainPlacerOut getMainPlacerOut1() {
		return mainPlacerOut1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainPlacerOut1(MainPlacerOut newMainPlacerOut1, NotificationChain msgs) {
		MainPlacerOut oldMainPlacerOut1 = mainPlacerOut1;
		mainPlacerOut1 = newMainPlacerOut1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PlacerPackage.GLOBAL__MAIN_PLACER_OUT1, oldMainPlacerOut1, newMainPlacerOut1);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainPlacerOut1(MainPlacerOut newMainPlacerOut1) {
		if (newMainPlacerOut1 != mainPlacerOut1) {
			NotificationChain msgs = null;
			if (mainPlacerOut1 != null)
				msgs = ((InternalEObject) mainPlacerOut1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PlacerPackage.GLOBAL__MAIN_PLACER_OUT1, null, msgs);
			if (newMainPlacerOut1 != null)
				msgs = ((InternalEObject) newMainPlacerOut1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PlacerPackage.GLOBAL__MAIN_PLACER_OUT1, null, msgs);
			msgs = basicSetMainPlacerOut1(newMainPlacerOut1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacerPackage.GLOBAL__MAIN_PLACER_OUT1,
					newMainPlacerOut1, newMainPlacerOut1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PlacerPackage.GLOBAL__CONSTRAINT_OR_OBJECTIVES:
			return ((InternalEList<?>) getConstraintOrObjectives()).basicRemove(otherEnd, msgs);
		case PlacerPackage.GLOBAL__POWER_CAP:
			return basicSetPowerCap(null, msgs);
		case PlacerPackage.GLOBAL__ENERGY_CAP:
			return basicSetEnergyCap(null, msgs);
		case PlacerPackage.GLOBAL__GLOBAL_INFORMATIONS:
			return basicSetGlobalInformations(null, msgs);
		case PlacerPackage.GLOBAL__MAPPING_GOALS:
			return basicSetMappingGoals(null, msgs);
		case PlacerPackage.GLOBAL__BUSSES:
			return ((InternalEList<?>) getBusses()).basicRemove(otherEnd, msgs);
		case PlacerPackage.GLOBAL__PROCESSING_ELEMENTS:
			return ((InternalEList<?>) getProcessingElements()).basicRemove(otherEnd, msgs);
		case PlacerPackage.GLOBAL__PROCESSING_ELEMENT_CLASSES:
			return ((InternalEList<?>) getProcessingElementClasses()).basicRemove(otherEnd, msgs);
		case PlacerPackage.GLOBAL__TASKS:
			return ((InternalEList<?>) getTasks()).basicRemove(otherEnd, msgs);
		case PlacerPackage.GLOBAL__TASK_GROUPS:
			return ((InternalEList<?>) getTaskGroups()).basicRemove(otherEnd, msgs);
		case PlacerPackage.GLOBAL__MAX_MAKE_SPAN:
			return basicSetMaxMakeSpan(null, msgs);
		case PlacerPackage.GLOBAL__GLOBAL_PROPERTIES:
			return ((InternalEList<?>) getGlobalProperties()).basicRemove(otherEnd, msgs);
		case PlacerPackage.GLOBAL__MAIN_PLACER_OUT1:
			return basicSetMainPlacerOut1(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlacerPackage.GLOBAL__CONSTRAINT_OR_OBJECTIVES:
			return getConstraintOrObjectives();
		case PlacerPackage.GLOBAL__POWER_CAP:
			return getPowerCap();
		case PlacerPackage.GLOBAL__ENERGY_CAP:
			return getEnergyCap();
		case PlacerPackage.GLOBAL__GLOBAL_INFORMATIONS:
			return getGlobalInformations();
		case PlacerPackage.GLOBAL__MAPPING_GOALS:
			return getMappingGoals();
		case PlacerPackage.GLOBAL__BUSSES:
			return getBusses();
		case PlacerPackage.GLOBAL__PROCESSING_ELEMENTS:
			return getProcessingElements();
		case PlacerPackage.GLOBAL__PROCESSING_ELEMENT_CLASSES:
			return getProcessingElementClasses();
		case PlacerPackage.GLOBAL__TASKS:
			return getTasks();
		case PlacerPackage.GLOBAL__TASK_GROUPS:
			return getTaskGroups();
		case PlacerPackage.GLOBAL__MAX_MAKE_SPAN:
			return getMaxMakeSpan();
		case PlacerPackage.GLOBAL__SOFTWARE_CLASS:
			return getSoftwareClass();
		case PlacerPackage.GLOBAL__GLOBAL_PROPERTIES:
			return getGlobalProperties();
		case PlacerPackage.GLOBAL__COMMAND_LINE_PARAMETERS:
			return getCommandLineParameters();
		case PlacerPackage.GLOBAL__MAIN_PLACER_OUT1:
			return getMainPlacerOut1();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PlacerPackage.GLOBAL__CONSTRAINT_OR_OBJECTIVES:
			getConstraintOrObjectives().clear();
			getConstraintOrObjectives().addAll((Collection<? extends ConstraintOrObjective>) newValue);
			return;
		case PlacerPackage.GLOBAL__POWER_CAP:
			setPowerCap((PowerCap) newValue);
			return;
		case PlacerPackage.GLOBAL__ENERGY_CAP:
			setEnergyCap((EnergyCap) newValue);
			return;
		case PlacerPackage.GLOBAL__GLOBAL_INFORMATIONS:
			setGlobalInformations((GlobalInformation) newValue);
			return;
		case PlacerPackage.GLOBAL__MAPPING_GOALS:
			setMappingGoals((MappingGoal) newValue);
			return;
		case PlacerPackage.GLOBAL__BUSSES:
			getBusses().clear();
			getBusses().addAll((Collection<? extends Bus>) newValue);
			return;
		case PlacerPackage.GLOBAL__PROCESSING_ELEMENTS:
			getProcessingElements().clear();
			getProcessingElements().addAll((Collection<? extends ProcessingElement>) newValue);
			return;
		case PlacerPackage.GLOBAL__PROCESSING_ELEMENT_CLASSES:
			getProcessingElementClasses().clear();
			getProcessingElementClasses().addAll((Collection<? extends ProcessingElementClass>) newValue);
			return;
		case PlacerPackage.GLOBAL__TASKS:
			getTasks().clear();
			getTasks().addAll((Collection<? extends Task>) newValue);
			return;
		case PlacerPackage.GLOBAL__TASK_GROUPS:
			getTaskGroups().clear();
			getTaskGroups().addAll((Collection<? extends TaskGroup>) newValue);
			return;
		case PlacerPackage.GLOBAL__MAX_MAKE_SPAN:
			setMaxMakeSpan((MaxMakeSpan) newValue);
			return;
		case PlacerPackage.GLOBAL__SOFTWARE_CLASS:
			setSoftwareClass((SoftwareClass) newValue);
			return;
		case PlacerPackage.GLOBAL__GLOBAL_PROPERTIES:
			getGlobalProperties().clear();
			getGlobalProperties().addAll((Collection<? extends GlobalProperties>) newValue);
			return;
		case PlacerPackage.GLOBAL__COMMAND_LINE_PARAMETERS:
			setCommandLineParameters((String) newValue);
			return;
		case PlacerPackage.GLOBAL__MAIN_PLACER_OUT1:
			setMainPlacerOut1((MainPlacerOut) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PlacerPackage.GLOBAL__CONSTRAINT_OR_OBJECTIVES:
			getConstraintOrObjectives().clear();
			return;
		case PlacerPackage.GLOBAL__POWER_CAP:
			setPowerCap((PowerCap) null);
			return;
		case PlacerPackage.GLOBAL__ENERGY_CAP:
			setEnergyCap((EnergyCap) null);
			return;
		case PlacerPackage.GLOBAL__GLOBAL_INFORMATIONS:
			setGlobalInformations((GlobalInformation) null);
			return;
		case PlacerPackage.GLOBAL__MAPPING_GOALS:
			setMappingGoals((MappingGoal) null);
			return;
		case PlacerPackage.GLOBAL__BUSSES:
			getBusses().clear();
			return;
		case PlacerPackage.GLOBAL__PROCESSING_ELEMENTS:
			getProcessingElements().clear();
			return;
		case PlacerPackage.GLOBAL__PROCESSING_ELEMENT_CLASSES:
			getProcessingElementClasses().clear();
			return;
		case PlacerPackage.GLOBAL__TASKS:
			getTasks().clear();
			return;
		case PlacerPackage.GLOBAL__TASK_GROUPS:
			getTaskGroups().clear();
			return;
		case PlacerPackage.GLOBAL__MAX_MAKE_SPAN:
			setMaxMakeSpan((MaxMakeSpan) null);
			return;
		case PlacerPackage.GLOBAL__SOFTWARE_CLASS:
			setSoftwareClass(SOFTWARE_CLASS_EDEFAULT);
			return;
		case PlacerPackage.GLOBAL__GLOBAL_PROPERTIES:
			getGlobalProperties().clear();
			return;
		case PlacerPackage.GLOBAL__COMMAND_LINE_PARAMETERS:
			setCommandLineParameters(COMMAND_LINE_PARAMETERS_EDEFAULT);
			return;
		case PlacerPackage.GLOBAL__MAIN_PLACER_OUT1:
			setMainPlacerOut1((MainPlacerOut) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PlacerPackage.GLOBAL__CONSTRAINT_OR_OBJECTIVES:
			return constraintOrObjectives != null && !constraintOrObjectives.isEmpty();
		case PlacerPackage.GLOBAL__POWER_CAP:
			return powerCap != null;
		case PlacerPackage.GLOBAL__ENERGY_CAP:
			return energyCap != null;
		case PlacerPackage.GLOBAL__GLOBAL_INFORMATIONS:
			return globalInformations != null;
		case PlacerPackage.GLOBAL__MAPPING_GOALS:
			return mappingGoals != null;
		case PlacerPackage.GLOBAL__BUSSES:
			return busses != null && !busses.isEmpty();
		case PlacerPackage.GLOBAL__PROCESSING_ELEMENTS:
			return processingElements != null && !processingElements.isEmpty();
		case PlacerPackage.GLOBAL__PROCESSING_ELEMENT_CLASSES:
			return processingElementClasses != null && !processingElementClasses.isEmpty();
		case PlacerPackage.GLOBAL__TASKS:
			return tasks != null && !tasks.isEmpty();
		case PlacerPackage.GLOBAL__TASK_GROUPS:
			return taskGroups != null && !taskGroups.isEmpty();
		case PlacerPackage.GLOBAL__MAX_MAKE_SPAN:
			return maxMakeSpan != null;
		case PlacerPackage.GLOBAL__SOFTWARE_CLASS:
			return softwareClass != SOFTWARE_CLASS_EDEFAULT;
		case PlacerPackage.GLOBAL__GLOBAL_PROPERTIES:
			return globalProperties != null && !globalProperties.isEmpty();
		case PlacerPackage.GLOBAL__COMMAND_LINE_PARAMETERS:
			return COMMAND_LINE_PARAMETERS_EDEFAULT == null ? commandLineParameters != null
					: !COMMAND_LINE_PARAMETERS_EDEFAULT.equals(commandLineParameters);
		case PlacerPackage.GLOBAL__MAIN_PLACER_OUT1:
			return mainPlacerOut1 != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (softwareClass: ");
		result.append(softwareClass);
		result.append(", commandLineParameters: ");
		result.append(commandLineParameters);
		result.append(')');
		return result.toString();
	}

} //GlobalImpl
