/**
 */
package placer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see placer.PlacerFactory
 * @model kind="package"
 * @generated
 */
public interface PlacerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "placer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/placer";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "placer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlacerPackage eINSTANCE = placer.impl.PlacerPackageImpl.init();

	/**
	 * The meta object id for the '{@link placer.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.TaskImpl
	 * @see placer.impl.PlacerPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Transmissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TRANSMISSIONS = 1;

	/**
	 * The feature id for the '<em><b>Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IMPLEMENTATIONS = 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.TransmissionImpl <em>Transmission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.TransmissionImpl
	 * @see placer.impl.PlacerPackageImpl#getTransmission()
	 * @generated
	 */
	int TRANSMISSION = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__TO = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__AMOUNT = 2;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__TIMING = 3;

	/**
	 * The number of structural features of the '<em>Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.ProcessingElementClassImpl <em>Processing Element Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.ProcessingElementClassImpl
	 * @see placer.impl.PlacerPackageImpl#getProcessingElementClass()
	 * @generated
	 */
	int PROCESSING_ELEMENT_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT_CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resources Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT_CLASS__RESOURCES_DECLARATIONS = 1;

	/**
	 * The feature id for the '<em><b>Properties Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT_CLASS__PROPERTIES_DECLARATIONS = 2;

	/**
	 * The number of structural features of the '<em>Processing Element Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT_CLASS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Processing Element Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.MultiTaskPermanentTasksImpl <em>Multi Task Permanent Tasks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.MultiTaskPermanentTasksImpl
	 * @see placer.impl.PlacerPackageImpl#getMultiTaskPermanentTasks()
	 * @generated
	 */
	int MULTI_TASK_PERMANENT_TASKS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TASK_PERMANENT_TASKS__NAME = PROCESSING_ELEMENT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Resources Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TASK_PERMANENT_TASKS__RESOURCES_DECLARATIONS = PROCESSING_ELEMENT_CLASS__RESOURCES_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Properties Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TASK_PERMANENT_TASKS__PROPERTIES_DECLARATIONS = PROCESSING_ELEMENT_CLASS__PROPERTIES_DECLARATIONS;

	/**
	 * The number of structural features of the '<em>Multi Task Permanent Tasks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TASK_PERMANENT_TASKS_FEATURE_COUNT = PROCESSING_ELEMENT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Task Permanent Tasks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TASK_PERMANENT_TASKS_OPERATION_COUNT = PROCESSING_ELEMENT_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link placer.impl.SwitchingTaskImpl <em>Switching Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.SwitchingTaskImpl
	 * @see placer.impl.PlacerPackageImpl#getSwitchingTask()
	 * @generated
	 */
	int SWITCHING_TASK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_TASK__NAME = PROCESSING_ELEMENT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Resources Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_TASK__RESOURCES_DECLARATIONS = PROCESSING_ELEMENT_CLASS__RESOURCES_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Properties Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_TASK__PROPERTIES_DECLARATIONS = PROCESSING_ELEMENT_CLASS__PROPERTIES_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Switching Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_TASK__SWITCHING_DELAY = PROCESSING_ELEMENT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switching Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_TASK_FEATURE_COUNT = PROCESSING_ELEMENT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Switching Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCHING_TASK_OPERATION_COUNT = PROCESSING_ELEMENT_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link placer.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.BusImpl
	 * @see placer.impl.PlacerPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Time Unit Per Data Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__TIME_UNIT_PER_DATA_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__LATENCY = 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CONNECTIONS = 3;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.ProcessingElementImpl <em>Processing Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.ProcessingElementImpl
	 * @see placer.impl.PlacerPackageImpl#getProcessingElement()
	 * @generated
	 */
	int PROCESSING_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__MEMORY = 1;

	/**
	 * The feature id for the '<em><b>Power Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__POWER_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Resources Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__RESOURCES_DEFINITIONS = 4;

	/**
	 * The feature id for the '<em><b>Properties Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__PROPERTIES_DEFINITIONS = 5;

	/**
	 * The number of structural features of the '<em>Processing Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Processing Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.ImplementationImpl
	 * @see placer.impl.PlacerPackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Computation Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__COMPUTATION_MEMORY = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__PARAMETERS = 4;

	/**
	 * The feature id for the '<em><b>Resources Usages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__RESOURCES_USAGES = 5;

	/**
	 * The number of structural features of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.ConnectionImpl
	 * @see placer.impl.PlacerPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 8;

	/**
	 * The feature id for the '<em><b>Connection To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_TO = 0;

	/**
	 * The feature id for the '<em><b>Connection From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_FROM = 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.ConstraintOrObjectiveImpl <em>Constraint Or Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.ConstraintOrObjectiveImpl
	 * @see placer.impl.PlacerPackageImpl#getConstraintOrObjective()
	 * @generated
	 */
	int CONSTRAINT_OR_OBJECTIVE = 9;

	/**
	 * The feature id for the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OR_OBJECTIVE__INFO = 0;

	/**
	 * The number of structural features of the '<em>Constraint Or Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OR_OBJECTIVE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraint Or Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OR_OBJECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.SamePEImpl <em>Same PE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.SamePEImpl
	 * @see placer.impl.PlacerPackageImpl#getSamePE()
	 * @generated
	 */
	int SAME_PE = 10;

	/**
	 * The feature id for the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_PE__INFO = CONSTRAINT_OR_OBJECTIVE__INFO;

	/**
	 * The feature id for the '<em><b>Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_PE__YES = CONSTRAINT_OR_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task Same PE</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_PE__TASK_SAME_PE = CONSTRAINT_OR_OBJECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Same PE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_PE_FEATURE_COUNT = CONSTRAINT_OR_OBJECTIVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Same PE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_PE_OPERATION_COUNT = CONSTRAINT_OR_OBJECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link placer.impl.EnergyCapImpl <em>Energy Cap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.EnergyCapImpl
	 * @see placer.impl.PlacerPackageImpl#getEnergyCap()
	 * @generated
	 */
	int ENERGY_CAP = 11;

	/**
	 * The feature id for the '<em><b>Energy Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CAP__ENERGY_CAP = 0;

	/**
	 * The number of structural features of the '<em>Energy Cap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CAP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Energy Cap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.RunOnImpl <em>Run On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.RunOnImpl
	 * @see placer.impl.PlacerPackageImpl#getRunOn()
	 * @generated
	 */
	int RUN_ON = 12;

	/**
	 * The feature id for the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ON__INFO = CONSTRAINT_OR_OBJECTIVE__INFO;

	/**
	 * The feature id for the '<em><b>Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ON__YES = CONSTRAINT_OR_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processing Element Run On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ON__PROCESSING_ELEMENT_RUN_ON = CONSTRAINT_OR_OBJECTIVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Task Run On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ON__TASK_RUN_ON = CONSTRAINT_OR_OBJECTIVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Run On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ON_FEATURE_COUNT = CONSTRAINT_OR_OBJECTIVE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Run On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ON_OPERATION_COUNT = CONSTRAINT_OR_OBJECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link placer.impl.PowerCapImpl <em>Power Cap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.PowerCapImpl
	 * @see placer.impl.PlacerPackageImpl#getPowerCap()
	 * @generated
	 */
	int POWER_CAP = 13;

	/**
	 * The feature id for the '<em><b>Power Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CAP__POWER_CAP = 0;

	/**
	 * The number of structural features of the '<em>Power Cap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CAP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Power Cap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.SymetricPEImpl <em>Symetric PE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.SymetricPEImpl
	 * @see placer.impl.PlacerPackageImpl#getSymetricPE()
	 * @generated
	 */
	int SYMETRIC_PE = 14;

	/**
	 * The feature id for the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMETRIC_PE__INFO = CONSTRAINT_OR_OBJECTIVE__INFO;

	/**
	 * The feature id for the '<em><b>Processing Element Symetric PE</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMETRIC_PE__PROCESSING_ELEMENT_SYMETRIC_PE = CONSTRAINT_OR_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Symetric PE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMETRIC_PE_FEATURE_COUNT = CONSTRAINT_OR_OBJECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Symetric PE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMETRIC_PE_OPERATION_COUNT = CONSTRAINT_OR_OBJECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link placer.impl.MustBeUsedImpl <em>Must Be Used</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.MustBeUsedImpl
	 * @see placer.impl.PlacerPackageImpl#getMustBeUsed()
	 * @generated
	 */
	int MUST_BE_USED = 15;

	/**
	 * The feature id for the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_BE_USED__INFO = CONSTRAINT_OR_OBJECTIVE__INFO;

	/**
	 * The feature id for the '<em><b>Yes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_BE_USED__YES = CONSTRAINT_OR_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processing Element Must Be Used</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_BE_USED__PROCESSING_ELEMENT_MUST_BE_USED = CONSTRAINT_OR_OBJECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Must Be Used</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_BE_USED_FEATURE_COUNT = CONSTRAINT_OR_OBJECTIVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Must Be Used</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_BE_USED_OPERATION_COUNT = CONSTRAINT_OR_OBJECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link placer.impl.MappingGoalImpl <em>Mapping Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.MappingGoalImpl
	 * @see placer.impl.PlacerPackageImpl#getMappingGoal()
	 * @generated
	 */
	int MAPPING_GOAL = 16;

	/**
	 * The feature id for the '<em><b>Simple Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_GOAL__SIMPLE_OBJECTIVE = 0;

	/**
	 * The number of structural features of the '<em>Mapping Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_GOAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mapping Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.GlobalInformationImpl <em>Global Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.GlobalInformationImpl
	 * @see placer.impl.PlacerPackageImpl#getGlobalInformation()
	 * @generated
	 */
	int GLOBAL_INFORMATION = 17;

	/**
	 * The feature id for the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_INFORMATION__INFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_INFORMATION__TIME_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Data Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_INFORMATION__DATA_UNIT = 2;

	/**
	 * The number of structural features of the '<em>Global Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_INFORMATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Global Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.MultiObjectiveGoalImpl <em>Multi Objective Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.MultiObjectiveGoalImpl
	 * @see placer.impl.PlacerPackageImpl#getMultiObjectiveGoal()
	 * @generated
	 */
	int MULTI_OBJECTIVE_GOAL = 18;

	/**
	 * The feature id for the '<em><b>Simple Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OBJECTIVE_GOAL__SIMPLE_OBJECTIVE = MAPPING_GOAL__SIMPLE_OBJECTIVE;

	/**
	 * The feature id for the '<em><b>Simple Objective2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OBJECTIVE_GOAL__SIMPLE_OBJECTIVE2 = MAPPING_GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Objective Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OBJECTIVE_GOAL_FEATURE_COUNT = MAPPING_GOAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Objective Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OBJECTIVE_GOAL_OPERATION_COUNT = MAPPING_GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link placer.impl.SimpleObjectiveGoalImpl <em>Simple Objective Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.SimpleObjectiveGoalImpl
	 * @see placer.impl.PlacerPackageImpl#getSimpleObjectiveGoal()
	 * @generated
	 */
	int SIMPLE_OBJECTIVE_GOAL = 19;

	/**
	 * The feature id for the '<em><b>Simple Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OBJECTIVE_GOAL__SIMPLE_OBJECTIVE = MAPPING_GOAL__SIMPLE_OBJECTIVE;

	/**
	 * The number of structural features of the '<em>Simple Objective Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OBJECTIVE_GOAL_FEATURE_COUNT = MAPPING_GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Objective Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OBJECTIVE_GOAL_OPERATION_COUNT = MAPPING_GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link placer.impl.TaskGroupImpl <em>Task Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.TaskGroupImpl
	 * @see placer.impl.PlacerPackageImpl#getTaskGroup()
	 * @generated
	 */
	int TASK_GROUP = 20;

	/**
	 * The feature id for the '<em><b>Nb Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__NB_INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Task Task Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__TASK_TASK_GROUPS = 1;

	/**
	 * The number of structural features of the '<em>Task Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.GlobalImpl <em>Global</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.GlobalImpl
	 * @see placer.impl.PlacerPackageImpl#getGlobal()
	 * @generated
	 */
	int GLOBAL = 21;

	/**
	 * The feature id for the '<em><b>Constraint Or Objectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__CONSTRAINT_OR_OBJECTIVES = 0;

	/**
	 * The feature id for the '<em><b>Power Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__POWER_CAP = 1;

	/**
	 * The feature id for the '<em><b>Energy Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__ENERGY_CAP = 2;

	/**
	 * The feature id for the '<em><b>Global Informations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__GLOBAL_INFORMATIONS = 3;

	/**
	 * The feature id for the '<em><b>Mapping Goals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__MAPPING_GOALS = 4;

	/**
	 * The feature id for the '<em><b>Busses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__BUSSES = 5;

	/**
	 * The feature id for the '<em><b>Processing Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__PROCESSING_ELEMENTS = 6;

	/**
	 * The feature id for the '<em><b>Processing Element Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__PROCESSING_ELEMENT_CLASSES = 7;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__TASKS = 8;

	/**
	 * The feature id for the '<em><b>Task Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__TASK_GROUPS = 9;

	/**
	 * The feature id for the '<em><b>Max Make Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__MAX_MAKE_SPAN = 10;

	/**
	 * The feature id for the '<em><b>Software Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__SOFTWARE_CLASS = 11;

	/**
	 * The feature id for the '<em><b>Global Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__GLOBAL_PROPERTIES = 12;

	/**
	 * The feature id for the '<em><b>Command Line Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__COMMAND_LINE_PARAMETERS = 13;

	/**
	 * The feature id for the '<em><b>Main Placer Out1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__MAIN_PLACER_OUT1 = 14;

	/**
	 * The number of structural features of the '<em>Global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.MaxMakeSpanImpl <em>Max Make Span</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.MaxMakeSpanImpl
	 * @see placer.impl.PlacerPackageImpl#getMaxMakeSpan()
	 * @generated
	 */
	int MAX_MAKE_SPAN = 22;

	/**
	 * The feature id for the '<em><b>Max Make Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_MAKE_SPAN__MAX_MAKE_SPAN = 0;

	/**
	 * The number of structural features of the '<em>Max Make Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_MAKE_SPAN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Max Make Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_MAKE_SPAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.ResourcesDefinitionImpl <em>Resources Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.ResourcesDefinitionImpl
	 * @see placer.impl.PlacerPackageImpl#getResourcesDefinition()
	 * @generated
	 */
	int RESOURCES_DEFINITION = 26;

	/**
	 * The meta object id for the '{@link placer.impl.PropertiesDefinitionImpl <em>Properties Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.PropertiesDefinitionImpl
	 * @see placer.impl.PlacerPackageImpl#getPropertiesDefinition()
	 * @generated
	 */
	int PROPERTIES_DEFINITION = 27;

	/**
	 * The meta object id for the '{@link placer.impl.ParametersImpl <em>Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.ParametersImpl
	 * @see placer.impl.PlacerPackageImpl#getParameters()
	 * @generated
	 */
	int PARAMETERS = 25;

	/**
	 * The meta object id for the '{@link placer.impl.ResourcesDeclarationImpl <em>Resources Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.ResourcesDeclarationImpl
	 * @see placer.impl.PlacerPackageImpl#getResourcesDeclaration()
	 * @generated
	 */
	int RESOURCES_DECLARATION = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_DECLARATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Resources Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resources Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.PropertiesDeclarationImpl <em>Properties Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.PropertiesDeclarationImpl
	 * @see placer.impl.PlacerPackageImpl#getPropertiesDeclaration()
	 * @generated
	 */
	int PROPERTIES_DECLARATION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DECLARATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Properties Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Properties Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_DEFINITION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Resources Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resources Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Properties Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Properties Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.ResourcesUsageImpl <em>Resources Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.ResourcesUsageImpl
	 * @see placer.impl.PlacerPackageImpl#getResourcesUsage()
	 * @generated
	 */
	int RESOURCES_USAGE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_USAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_USAGE__FORMULA = 1;

	/**
	 * The number of structural features of the '<em>Resources Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_USAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resources Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_USAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.GlobalPropertiesImpl <em>Global Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.GlobalPropertiesImpl
	 * @see placer.impl.PlacerPackageImpl#getGlobalProperties()
	 * @generated
	 */
	int GLOBAL_PROPERTIES = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PROPERTIES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PROPERTIES__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Global Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PROPERTIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Global Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.TaskMappingImpl <em>Task Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.TaskMappingImpl
	 * @see placer.impl.PlacerPackageImpl#getTaskMapping()
	 * @generated
	 */
	int TASK_MAPPING = 30;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MAPPING__START = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MAPPING__DURATION = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MAPPING__END = 2;

	/**
	 * The feature id for the '<em><b>Name Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MAPPING__NAME_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Processing Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MAPPING__PROCESSING_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MAPPING__IMPLEMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MAPPING__TASK = 6;

	/**
	 * The number of structural features of the '<em>Task Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MAPPING_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Task Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.MappingImpl
	 * @see placer.impl.PlacerPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 31;

	/**
	 * The feature id for the '<em><b>Hardware Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__HARDWARE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Makespan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MAKESPAN = 1;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ENERGY = 2;

	/**
	 * The feature id for the '<em><b>Task Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TASK_MAPPINGS = 3;

	/**
	 * The feature id for the '<em><b>Shared Function Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__SHARED_FUNCTION_MAPPINGS = 4;

	/**
	 * The feature id for the '<em><b>Transmission Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TRANSMISSION_MAPPINGS = 5;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.SharedFunctionMappingImpl <em>Shared Function Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.SharedFunctionMappingImpl
	 * @see placer.impl.PlacerPackageImpl#getSharedFunctionMapping()
	 * @generated
	 */
	int SHARED_FUNCTION_MAPPING = 32;

	/**
	 * The feature id for the '<em><b>Shared Implem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_FUNCTION_MAPPING__SHARED_IMPLEM = 0;

	/**
	 * The feature id for the '<em><b>Nb Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_FUNCTION_MAPPING__NB_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_FUNCTION_MAPPING__HOST = 2;

	/**
	 * The feature id for the '<em><b>Name Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_FUNCTION_MAPPING__NAME_VALUES = 3;

	/**
	 * The number of structural features of the '<em>Shared Function Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_FUNCTION_MAPPING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Shared Function Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_FUNCTION_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.NameValueImpl <em>Name Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.NameValueImpl
	 * @see placer.impl.PlacerPackageImpl#getNameValue()
	 * @generated
	 */
	int NAME_VALUE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_VALUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Name Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Name Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.MainPlacerOutImpl <em>Main Placer Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.MainPlacerOutImpl
	 * @see placer.impl.PlacerPackageImpl#getMainPlacerOut()
	 * @generated
	 */
	int MAIN_PLACER_OUT = 34;

	/**
	 * The feature id for the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PLACER_OUT__INFO = 0;

	/**
	 * The feature id for the '<em><b>Json Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PLACER_OUT__JSON_FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PLACER_OUT__TIME_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Data Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PLACER_OUT__DATA_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PLACER_OUT__MAPPINGS = 4;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PLACER_OUT__FILE_PATH = 5;

	/**
	 * The number of structural features of the '<em>Main Placer Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PLACER_OUT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Main Placer Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PLACER_OUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.TransmissionMappingImpl <em>Transmission Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.TransmissionMappingImpl
	 * @see placer.impl.PlacerPackageImpl#getTransmissionMapping()
	 * @generated
	 */
	int TRANSMISSION_MAPPING = 35;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_MAPPING__START = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_MAPPING__DURATION = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_MAPPING__END = 2;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_MAPPING__BUS = 3;

	/**
	 * The feature id for the '<em><b>Transmission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_MAPPING__TRANSMISSION = 4;

	/**
	 * The feature id for the '<em><b>From PE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_MAPPING__FROM_PE = 5;

	/**
	 * The feature id for the '<em><b>To PE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_MAPPING__TO_PE = 6;

	/**
	 * The feature id for the '<em><b>From Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_MAPPING__FROM_TASK = 7;

	/**
	 * The feature id for the '<em><b>To Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_MAPPING__TO_TASK = 8;

	/**
	 * The number of structural features of the '<em>Transmission Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_MAPPING_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Transmission Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.impl.NewEClass37Impl <em>New EClass37</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.impl.NewEClass37Impl
	 * @see placer.impl.PlacerPackageImpl#getNewEClass37()
	 * @generated
	 */
	int NEW_ECLASS37 = 36;

	/**
	 * The number of structural features of the '<em>New EClass37</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS37_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New EClass37</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS37_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link placer.TimingObject <em>Timing Object</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.TimingObject
	 * @see placer.impl.PlacerPackageImpl#getTimingObject()
	 * @generated
	 */
	int TIMING_OBJECT = 37;

	/**
	 * The meta object id for the '{@link placer.SimpleGoal <em>Simple Goal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.SimpleGoal
	 * @see placer.impl.PlacerPackageImpl#getSimpleGoal()
	 * @generated
	 */
	int SIMPLE_GOAL = 38;

	/**
	 * The meta object id for the '{@link placer.SoftwareClass <em>Software Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placer.SoftwareClass
	 * @see placer.impl.PlacerPackageImpl#getSoftwareClass()
	 * @generated
	 */
	int SOFTWARE_CLASS = 39;

	/**
	 * Returns the meta object for class '{@link placer.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see placer.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link placer.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see placer.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.Task#getTransmissions <em>Transmissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transmissions</em>'.
	 * @see placer.Task#getTransmissions()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Transmissions();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.Task#getImplementations <em>Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementations</em>'.
	 * @see placer.Task#getImplementations()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Implementations();

	/**
	 * Returns the meta object for class '{@link placer.Transmission <em>Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission</em>'.
	 * @see placer.Transmission
	 * @generated
	 */
	EClass getTransmission();

	/**
	 * Returns the meta object for the reference '{@link placer.Transmission#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see placer.Transmission#getFrom()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_From();

	/**
	 * Returns the meta object for the reference '{@link placer.Transmission#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see placer.Transmission#getTo()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_To();

	/**
	 * Returns the meta object for the attribute '{@link placer.Transmission#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see placer.Transmission#getAmount()
	 * @see #getTransmission()
	 * @generated
	 */
	EAttribute getTransmission_Amount();

	/**
	 * Returns the meta object for the attribute '{@link placer.Transmission#getTiming <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timing</em>'.
	 * @see placer.Transmission#getTiming()
	 * @see #getTransmission()
	 * @generated
	 */
	EAttribute getTransmission_Timing();

	/**
	 * Returns the meta object for class '{@link placer.ProcessingElementClass <em>Processing Element Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Element Class</em>'.
	 * @see placer.ProcessingElementClass
	 * @generated
	 */
	EClass getProcessingElementClass();

	/**
	 * Returns the meta object for the attribute '{@link placer.ProcessingElementClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see placer.ProcessingElementClass#getName()
	 * @see #getProcessingElementClass()
	 * @generated
	 */
	EAttribute getProcessingElementClass_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.ProcessingElementClass#getResourcesDeclarations <em>Resources Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources Declarations</em>'.
	 * @see placer.ProcessingElementClass#getResourcesDeclarations()
	 * @see #getProcessingElementClass()
	 * @generated
	 */
	EReference getProcessingElementClass_ResourcesDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.ProcessingElementClass#getPropertiesDeclarations <em>Properties Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties Declarations</em>'.
	 * @see placer.ProcessingElementClass#getPropertiesDeclarations()
	 * @see #getProcessingElementClass()
	 * @generated
	 */
	EReference getProcessingElementClass_PropertiesDeclarations();

	/**
	 * Returns the meta object for class '{@link placer.MultiTaskPermanentTasks <em>Multi Task Permanent Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Task Permanent Tasks</em>'.
	 * @see placer.MultiTaskPermanentTasks
	 * @generated
	 */
	EClass getMultiTaskPermanentTasks();

	/**
	 * Returns the meta object for class '{@link placer.SwitchingTask <em>Switching Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switching Task</em>'.
	 * @see placer.SwitchingTask
	 * @generated
	 */
	EClass getSwitchingTask();

	/**
	 * Returns the meta object for the attribute '{@link placer.SwitchingTask#getSwitchingDelay <em>Switching Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switching Delay</em>'.
	 * @see placer.SwitchingTask#getSwitchingDelay()
	 * @see #getSwitchingTask()
	 * @generated
	 */
	EAttribute getSwitchingTask_SwitchingDelay();

	/**
	 * Returns the meta object for class '{@link placer.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see placer.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the attribute '{@link placer.Bus#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see placer.Bus#getName()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_Name();

	/**
	 * Returns the meta object for the attribute '{@link placer.Bus#getTimeUnitPerDataUnit <em>Time Unit Per Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit Per Data Unit</em>'.
	 * @see placer.Bus#getTimeUnitPerDataUnit()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_TimeUnitPerDataUnit();

	/**
	 * Returns the meta object for the attribute '{@link placer.Bus#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency</em>'.
	 * @see placer.Bus#getLatency()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_Latency();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.Bus#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see placer.Bus#getConnections()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Connections();

	/**
	 * Returns the meta object for class '{@link placer.ProcessingElement <em>Processing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Element</em>'.
	 * @see placer.ProcessingElement
	 * @generated
	 */
	EClass getProcessingElement();

	/**
	 * Returns the meta object for the attribute '{@link placer.ProcessingElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see placer.ProcessingElement#getName()
	 * @see #getProcessingElement()
	 * @generated
	 */
	EAttribute getProcessingElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link placer.ProcessingElement#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see placer.ProcessingElement#getMemory()
	 * @see #getProcessingElement()
	 * @generated
	 */
	EAttribute getProcessingElement_Memory();

	/**
	 * Returns the meta object for the attribute '{@link placer.ProcessingElement#getPowerModel <em>Power Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Model</em>'.
	 * @see placer.ProcessingElement#getPowerModel()
	 * @see #getProcessingElement()
	 * @generated
	 */
	EAttribute getProcessingElement_PowerModel();

	/**
	 * Returns the meta object for the reference '{@link placer.ProcessingElement#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see placer.ProcessingElement#getClass_()
	 * @see #getProcessingElement()
	 * @generated
	 */
	EReference getProcessingElement_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.ProcessingElement#getResourcesDefinitions <em>Resources Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources Definitions</em>'.
	 * @see placer.ProcessingElement#getResourcesDefinitions()
	 * @see #getProcessingElement()
	 * @generated
	 */
	EReference getProcessingElement_ResourcesDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.ProcessingElement#getPropertiesDefinitions <em>Properties Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties Definitions</em>'.
	 * @see placer.ProcessingElement#getPropertiesDefinitions()
	 * @see #getProcessingElement()
	 * @generated
	 */
	EReference getProcessingElement_PropertiesDefinitions();

	/**
	 * Returns the meta object for class '{@link placer.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation</em>'.
	 * @see placer.Implementation
	 * @generated
	 */
	EClass getImplementation();

	/**
	 * Returns the meta object for the attribute '{@link placer.Implementation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see placer.Implementation#getName()
	 * @see #getImplementation()
	 * @generated
	 */
	EAttribute getImplementation_Name();

	/**
	 * Returns the meta object for the attribute '{@link placer.Implementation#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see placer.Implementation#getDuration()
	 * @see #getImplementation()
	 * @generated
	 */
	EAttribute getImplementation_Duration();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.Implementation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see placer.Implementation#getParameters()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.Implementation#getResourcesUsages <em>Resources Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources Usages</em>'.
	 * @see placer.Implementation#getResourcesUsages()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_ResourcesUsages();

	/**
	 * Returns the meta object for the reference '{@link placer.Implementation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see placer.Implementation#getTarget()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Target();

	/**
	 * Returns the meta object for the attribute '{@link placer.Implementation#getComputationMemory <em>Computation Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computation Memory</em>'.
	 * @see placer.Implementation#getComputationMemory()
	 * @see #getImplementation()
	 * @generated
	 */
	EAttribute getImplementation_ComputationMemory();

	/**
	 * Returns the meta object for class '{@link placer.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see placer.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link placer.Connection#getConnectionTo <em>Connection To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection To</em>'.
	 * @see placer.Connection#getConnectionTo()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ConnectionTo();

	/**
	 * Returns the meta object for the reference '{@link placer.Connection#getConnectionFrom <em>Connection From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection From</em>'.
	 * @see placer.Connection#getConnectionFrom()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ConnectionFrom();

	/**
	 * Returns the meta object for class '{@link placer.ConstraintOrObjective <em>Constraint Or Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Or Objective</em>'.
	 * @see placer.ConstraintOrObjective
	 * @generated
	 */
	EClass getConstraintOrObjective();

	/**
	 * Returns the meta object for the attribute '{@link placer.ConstraintOrObjective#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info</em>'.
	 * @see placer.ConstraintOrObjective#getInfo()
	 * @see #getConstraintOrObjective()
	 * @generated
	 */
	EAttribute getConstraintOrObjective_Info();

	/**
	 * Returns the meta object for class '{@link placer.SamePE <em>Same PE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Same PE</em>'.
	 * @see placer.SamePE
	 * @generated
	 */
	EClass getSamePE();

	/**
	 * Returns the meta object for the attribute '{@link placer.SamePE#getYes <em>Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yes</em>'.
	 * @see placer.SamePE#getYes()
	 * @see #getSamePE()
	 * @generated
	 */
	EAttribute getSamePE_Yes();

	/**
	 * Returns the meta object for the reference list '{@link placer.SamePE#getTaskSamePE <em>Task Same PE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task Same PE</em>'.
	 * @see placer.SamePE#getTaskSamePE()
	 * @see #getSamePE()
	 * @generated
	 */
	EReference getSamePE_TaskSamePE();

	/**
	 * Returns the meta object for class '{@link placer.EnergyCap <em>Energy Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Cap</em>'.
	 * @see placer.EnergyCap
	 * @generated
	 */
	EClass getEnergyCap();

	/**
	 * Returns the meta object for the attribute '{@link placer.EnergyCap#getEnergyCap <em>Energy Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Cap</em>'.
	 * @see placer.EnergyCap#getEnergyCap()
	 * @see #getEnergyCap()
	 * @generated
	 */
	EAttribute getEnergyCap_EnergyCap();

	/**
	 * Returns the meta object for class '{@link placer.RunOn <em>Run On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run On</em>'.
	 * @see placer.RunOn
	 * @generated
	 */
	EClass getRunOn();

	/**
	 * Returns the meta object for the attribute '{@link placer.RunOn#getYes <em>Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yes</em>'.
	 * @see placer.RunOn#getYes()
	 * @see #getRunOn()
	 * @generated
	 */
	EAttribute getRunOn_Yes();

	/**
	 * Returns the meta object for the reference '{@link placer.RunOn#getProcessingElementRunOn <em>Processing Element Run On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processing Element Run On</em>'.
	 * @see placer.RunOn#getProcessingElementRunOn()
	 * @see #getRunOn()
	 * @generated
	 */
	EReference getRunOn_ProcessingElementRunOn();

	/**
	 * Returns the meta object for the reference '{@link placer.RunOn#getTaskRunOn <em>Task Run On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Run On</em>'.
	 * @see placer.RunOn#getTaskRunOn()
	 * @see #getRunOn()
	 * @generated
	 */
	EReference getRunOn_TaskRunOn();

	/**
	 * Returns the meta object for class '{@link placer.PowerCap <em>Power Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Cap</em>'.
	 * @see placer.PowerCap
	 * @generated
	 */
	EClass getPowerCap();

	/**
	 * Returns the meta object for the attribute '{@link placer.PowerCap#getPowerCap <em>Power Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Cap</em>'.
	 * @see placer.PowerCap#getPowerCap()
	 * @see #getPowerCap()
	 * @generated
	 */
	EAttribute getPowerCap_PowerCap();

	/**
	 * Returns the meta object for class '{@link placer.SymetricPE <em>Symetric PE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symetric PE</em>'.
	 * @see placer.SymetricPE
	 * @generated
	 */
	EClass getSymetricPE();

	/**
	 * Returns the meta object for the reference list '{@link placer.SymetricPE#getProcessingElementSymetricPE <em>Processing Element Symetric PE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processing Element Symetric PE</em>'.
	 * @see placer.SymetricPE#getProcessingElementSymetricPE()
	 * @see #getSymetricPE()
	 * @generated
	 */
	EReference getSymetricPE_ProcessingElementSymetricPE();

	/**
	 * Returns the meta object for class '{@link placer.MustBeUsed <em>Must Be Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Must Be Used</em>'.
	 * @see placer.MustBeUsed
	 * @generated
	 */
	EClass getMustBeUsed();

	/**
	 * Returns the meta object for the attribute '{@link placer.MustBeUsed#getYes <em>Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yes</em>'.
	 * @see placer.MustBeUsed#getYes()
	 * @see #getMustBeUsed()
	 * @generated
	 */
	EAttribute getMustBeUsed_Yes();

	/**
	 * Returns the meta object for the reference '{@link placer.MustBeUsed#getProcessingElementMustBeUsed <em>Processing Element Must Be Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processing Element Must Be Used</em>'.
	 * @see placer.MustBeUsed#getProcessingElementMustBeUsed()
	 * @see #getMustBeUsed()
	 * @generated
	 */
	EReference getMustBeUsed_ProcessingElementMustBeUsed();

	/**
	 * Returns the meta object for class '{@link placer.MappingGoal <em>Mapping Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Goal</em>'.
	 * @see placer.MappingGoal
	 * @generated
	 */
	EClass getMappingGoal();

	/**
	 * Returns the meta object for the attribute '{@link placer.MappingGoal#getSimpleObjective <em>Simple Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Objective</em>'.
	 * @see placer.MappingGoal#getSimpleObjective()
	 * @see #getMappingGoal()
	 * @generated
	 */
	EAttribute getMappingGoal_SimpleObjective();

	/**
	 * Returns the meta object for class '{@link placer.GlobalInformation <em>Global Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Information</em>'.
	 * @see placer.GlobalInformation
	 * @generated
	 */
	EClass getGlobalInformation();

	/**
	 * Returns the meta object for the attribute '{@link placer.GlobalInformation#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Information</em>'.
	 * @see placer.GlobalInformation#getInformation()
	 * @see #getGlobalInformation()
	 * @generated
	 */
	EAttribute getGlobalInformation_Information();

	/**
	 * Returns the meta object for the attribute '{@link placer.GlobalInformation#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see placer.GlobalInformation#getTimeUnit()
	 * @see #getGlobalInformation()
	 * @generated
	 */
	EAttribute getGlobalInformation_TimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link placer.GlobalInformation#getDataUnit <em>Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Unit</em>'.
	 * @see placer.GlobalInformation#getDataUnit()
	 * @see #getGlobalInformation()
	 * @generated
	 */
	EAttribute getGlobalInformation_DataUnit();

	/**
	 * Returns the meta object for class '{@link placer.MultiObjectiveGoal <em>Multi Objective Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Objective Goal</em>'.
	 * @see placer.MultiObjectiveGoal
	 * @generated
	 */
	EClass getMultiObjectiveGoal();

	/**
	 * Returns the meta object for the attribute '{@link placer.MultiObjectiveGoal#getSimpleObjective2 <em>Simple Objective2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Objective2</em>'.
	 * @see placer.MultiObjectiveGoal#getSimpleObjective2()
	 * @see #getMultiObjectiveGoal()
	 * @generated
	 */
	EAttribute getMultiObjectiveGoal_SimpleObjective2();

	/**
	 * Returns the meta object for class '{@link placer.SimpleObjectiveGoal <em>Simple Objective Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Objective Goal</em>'.
	 * @see placer.SimpleObjectiveGoal
	 * @generated
	 */
	EClass getSimpleObjectiveGoal();

	/**
	 * Returns the meta object for class '{@link placer.TaskGroup <em>Task Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Group</em>'.
	 * @see placer.TaskGroup
	 * @generated
	 */
	EClass getTaskGroup();

	/**
	 * Returns the meta object for the attribute '{@link placer.TaskGroup#getNbInstances <em>Nb Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Instances</em>'.
	 * @see placer.TaskGroup#getNbInstances()
	 * @see #getTaskGroup()
	 * @generated
	 */
	EAttribute getTaskGroup_NbInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.TaskGroup#getTaskTaskGroups <em>Task Task Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Task Groups</em>'.
	 * @see placer.TaskGroup#getTaskTaskGroups()
	 * @see #getTaskGroup()
	 * @generated
	 */
	EReference getTaskGroup_TaskTaskGroups();

	/**
	 * Returns the meta object for class '{@link placer.Global <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global</em>'.
	 * @see placer.Global
	 * @generated
	 */
	EClass getGlobal();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.Global#getConstraintOrObjectives <em>Constraint Or Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint Or Objectives</em>'.
	 * @see placer.Global#getConstraintOrObjectives()
	 * @see #getGlobal()
	 * @generated
	 */
	EReference getGlobal_ConstraintOrObjectives();

	/**
	 * Returns the meta object for the containment reference '{@link placer.Global#getPowerCap <em>Power Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Power Cap</em>'.
	 * @see placer.Global#getPowerCap()
	 * @see #getGlobal()
	 * @generated
	 */
	EReference getGlobal_PowerCap();

	/**
	 * Returns the meta object for the containment reference '{@link placer.Global#getEnergyCap <em>Energy Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Energy Cap</em>'.
	 * @see placer.Global#getEnergyCap()
	 * @see #getGlobal()
	 * @generated
	 */
	EReference getGlobal_EnergyCap();

	/**
	 * Returns the meta object for the containment reference '{@link placer.Global#getGlobalInformations <em>Global Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Informations</em>'.
	 * @see placer.Global#getGlobalInformations()
	 * @see #getGlobal()
	 * @generated
	 */
	EReference getGlobal_GlobalInformations();

	/**
	 * Returns the meta object for the containment reference '{@link placer.Global#getMappingGoals <em>Mapping Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping Goals</em>'.
	 * @see placer.Global#getMappingGoals()
	 * @see #getGlobal()
	 * @generated
	 */
	EReference getGlobal_MappingGoals();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.Global#getBusses <em>Busses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Busses</em>'.
	 * @see placer.Global#getBusses()
	 * @see #getGlobal()
	 * @generated
	 */
	EReference getGlobal_Busses();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.Global#getProcessingElements <em>Processing Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processing Elements</em>'.
	 * @see placer.Global#getProcessingElements()
	 * @see #getGlobal()
	 * @generated
	 */
	EReference getGlobal_ProcessingElements();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.Global#getProcessingElementClasses <em>Processing Element Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processing Element Classes</em>'.
	 * @see placer.Global#getProcessingElementClasses()
	 * @see #getGlobal()
	 * @generated
	 */
	EReference getGlobal_ProcessingElementClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.Global#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see placer.Global#getTasks()
	 * @see #getGlobal()
	 * @generated
	 */
	EReference getGlobal_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.Global#getTaskGroups <em>Task Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Groups</em>'.
	 * @see placer.Global#getTaskGroups()
	 * @see #getGlobal()
	 * @generated
	 */
	EReference getGlobal_TaskGroups();

	/**
	 * Returns the meta object for the containment reference '{@link placer.Global#getMaxMakeSpan <em>Max Make Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Make Span</em>'.
	 * @see placer.Global#getMaxMakeSpan()
	 * @see #getGlobal()
	 * @generated
	 */
	EReference getGlobal_MaxMakeSpan();

	/**
	 * Returns the meta object for the attribute '{@link placer.Global#getSoftwareClass <em>Software Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Software Class</em>'.
	 * @see placer.Global#getSoftwareClass()
	 * @see #getGlobal()
	 * @generated
	 */
	EAttribute getGlobal_SoftwareClass();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.Global#getGlobalProperties <em>Global Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Properties</em>'.
	 * @see placer.Global#getGlobalProperties()
	 * @see #getGlobal()
	 * @generated
	 */
	EReference getGlobal_GlobalProperties();

	/**
	 * Returns the meta object for the attribute '{@link placer.Global#getCommandLineParameters <em>Command Line Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command Line Parameters</em>'.
	 * @see placer.Global#getCommandLineParameters()
	 * @see #getGlobal()
	 * @generated
	 */
	EAttribute getGlobal_CommandLineParameters();

	/**
	 * Returns the meta object for the containment reference '{@link placer.Global#getMainPlacerOut1 <em>Main Placer Out1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main Placer Out1</em>'.
	 * @see placer.Global#getMainPlacerOut1()
	 * @see #getGlobal()
	 * @generated
	 */
	EReference getGlobal_MainPlacerOut1();

	/**
	 * Returns the meta object for class '{@link placer.MaxMakeSpan <em>Max Make Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Make Span</em>'.
	 * @see placer.MaxMakeSpan
	 * @generated
	 */
	EClass getMaxMakeSpan();

	/**
	 * Returns the meta object for the attribute '{@link placer.MaxMakeSpan#getMaxMakeSpan <em>Max Make Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Make Span</em>'.
	 * @see placer.MaxMakeSpan#getMaxMakeSpan()
	 * @see #getMaxMakeSpan()
	 * @generated
	 */
	EAttribute getMaxMakeSpan_MaxMakeSpan();

	/**
	 * Returns the meta object for class '{@link placer.ResourcesDefinition <em>Resources Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources Definition</em>'.
	 * @see placer.ResourcesDefinition
	 * @generated
	 */
	EClass getResourcesDefinition();

	/**
	 * Returns the meta object for the reference '{@link placer.ResourcesDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see placer.ResourcesDefinition#getName()
	 * @see #getResourcesDefinition()
	 * @generated
	 */
	EReference getResourcesDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link placer.ResourcesDefinition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see placer.ResourcesDefinition#getValue()
	 * @see #getResourcesDefinition()
	 * @generated
	 */
	EAttribute getResourcesDefinition_Value();

	/**
	 * Returns the meta object for class '{@link placer.PropertiesDefinition <em>Properties Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Definition</em>'.
	 * @see placer.PropertiesDefinition
	 * @generated
	 */
	EClass getPropertiesDefinition();

	/**
	 * Returns the meta object for the reference '{@link placer.PropertiesDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see placer.PropertiesDefinition#getName()
	 * @see #getPropertiesDefinition()
	 * @generated
	 */
	EReference getPropertiesDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link placer.PropertiesDefinition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see placer.PropertiesDefinition#getValue()
	 * @see #getPropertiesDefinition()
	 * @generated
	 */
	EAttribute getPropertiesDefinition_Value();

	/**
	 * Returns the meta object for class '{@link placer.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters</em>'.
	 * @see placer.Parameters
	 * @generated
	 */
	EClass getParameters();

	/**
	 * Returns the meta object for the attribute '{@link placer.Parameters#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see placer.Parameters#getName()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Name();

	/**
	 * Returns the meta object for the attribute list '{@link placer.Parameters#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see placer.Parameters#getValue()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Value();

	/**
	 * Returns the meta object for class '{@link placer.ResourcesDeclaration <em>Resources Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources Declaration</em>'.
	 * @see placer.ResourcesDeclaration
	 * @generated
	 */
	EClass getResourcesDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link placer.ResourcesDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see placer.ResourcesDeclaration#getName()
	 * @see #getResourcesDeclaration()
	 * @generated
	 */
	EAttribute getResourcesDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link placer.PropertiesDeclaration <em>Properties Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Declaration</em>'.
	 * @see placer.PropertiesDeclaration
	 * @generated
	 */
	EClass getPropertiesDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link placer.PropertiesDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see placer.PropertiesDeclaration#getName()
	 * @see #getPropertiesDeclaration()
	 * @generated
	 */
	EAttribute getPropertiesDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link placer.ResourcesUsage <em>Resources Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources Usage</em>'.
	 * @see placer.ResourcesUsage
	 * @generated
	 */
	EClass getResourcesUsage();

	/**
	 * Returns the meta object for the reference '{@link placer.ResourcesUsage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see placer.ResourcesUsage#getName()
	 * @see #getResourcesUsage()
	 * @generated
	 */
	EReference getResourcesUsage_Name();

	/**
	 * Returns the meta object for the attribute '{@link placer.ResourcesUsage#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see placer.ResourcesUsage#getFormula()
	 * @see #getResourcesUsage()
	 * @generated
	 */
	EAttribute getResourcesUsage_Formula();

	/**
	 * Returns the meta object for class '{@link placer.GlobalProperties <em>Global Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Properties</em>'.
	 * @see placer.GlobalProperties
	 * @generated
	 */
	EClass getGlobalProperties();

	/**
	 * Returns the meta object for the attribute '{@link placer.GlobalProperties#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see placer.GlobalProperties#getName()
	 * @see #getGlobalProperties()
	 * @generated
	 */
	EAttribute getGlobalProperties_Name();

	/**
	 * Returns the meta object for the attribute '{@link placer.GlobalProperties#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see placer.GlobalProperties#getValue()
	 * @see #getGlobalProperties()
	 * @generated
	 */
	EAttribute getGlobalProperties_Value();

	/**
	 * Returns the meta object for class '{@link placer.TaskMapping <em>Task Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Mapping</em>'.
	 * @see placer.TaskMapping
	 * @generated
	 */
	EClass getTaskMapping();

	/**
	 * Returns the meta object for the attribute '{@link placer.TaskMapping#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task</em>'.
	 * @see placer.TaskMapping#getTask()
	 * @see #getTaskMapping()
	 * @generated
	 */
	EAttribute getTaskMapping_Task();

	/**
	 * Returns the meta object for the reference '{@link placer.TaskMapping#getProcessingElement <em>Processing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processing Element</em>'.
	 * @see placer.TaskMapping#getProcessingElement()
	 * @see #getTaskMapping()
	 * @generated
	 */
	EReference getTaskMapping_ProcessingElement();

	/**
	 * Returns the meta object for the reference '{@link placer.TaskMapping#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation</em>'.
	 * @see placer.TaskMapping#getImplementation()
	 * @see #getTaskMapping()
	 * @generated
	 */
	EReference getTaskMapping_Implementation();

	/**
	 * Returns the meta object for the attribute '{@link placer.TaskMapping#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see placer.TaskMapping#getStart()
	 * @see #getTaskMapping()
	 * @generated
	 */
	EAttribute getTaskMapping_Start();

	/**
	 * Returns the meta object for the attribute '{@link placer.TaskMapping#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see placer.TaskMapping#getDuration()
	 * @see #getTaskMapping()
	 * @generated
	 */
	EAttribute getTaskMapping_Duration();

	/**
	 * Returns the meta object for the attribute '{@link placer.TaskMapping#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see placer.TaskMapping#getEnd()
	 * @see #getTaskMapping()
	 * @generated
	 */
	EAttribute getTaskMapping_End();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.TaskMapping#getNameValues <em>Name Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Values</em>'.
	 * @see placer.TaskMapping#getNameValues()
	 * @see #getTaskMapping()
	 * @generated
	 */
	EReference getTaskMapping_NameValues();

	/**
	 * Returns the meta object for class '{@link Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see Mapping
	 * @model instanceClass="Mapping"
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the attribute '{@link Mapping#getHardwareName <em>Hardware Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Name</em>'.
	 * @see Mapping#getHardwareName()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_HardwareName();

	/**
	 * Returns the meta object for the attribute '{@link Mapping#getMakespan <em>Makespan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Makespan</em>'.
	 * @see Mapping#getMakespan()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Makespan();

	/**
	 * Returns the meta object for the attribute '{@link Mapping#getEnergy <em>Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy</em>'.
	 * @see Mapping#getEnergy()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Energy();

	/**
	 * Returns the meta object for the containment reference list '{@link Mapping#getTaskMappings <em>Task Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Mappings</em>'.
	 * @see Mapping#getTaskMappings()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_TaskMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link Mapping#getSharedFunctionMappings <em>Shared Function Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Function Mappings</em>'.
	 * @see Mapping#getSharedFunctionMappings()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_SharedFunctionMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link Mapping#getTransmissionMappings <em>Transmission Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transmission Mappings</em>'.
	 * @see Mapping#getTransmissionMappings()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_TransmissionMappings();

	/**
	 * Returns the meta object for class '{@link placer.SharedFunctionMapping <em>Shared Function Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Function Mapping</em>'.
	 * @see placer.SharedFunctionMapping
	 * @generated
	 */
	EClass getSharedFunctionMapping();

	/**
	 * Returns the meta object for the attribute '{@link placer.SharedFunctionMapping#getSharedImplem <em>Shared Implem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared Implem</em>'.
	 * @see placer.SharedFunctionMapping#getSharedImplem()
	 * @see #getSharedFunctionMapping()
	 * @generated
	 */
	EAttribute getSharedFunctionMapping_SharedImplem();

	/**
	 * Returns the meta object for the attribute '{@link placer.SharedFunctionMapping#getNbInstance <em>Nb Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Instance</em>'.
	 * @see placer.SharedFunctionMapping#getNbInstance()
	 * @see #getSharedFunctionMapping()
	 * @generated
	 */
	EAttribute getSharedFunctionMapping_NbInstance();

	/**
	 * Returns the meta object for the attribute '{@link placer.SharedFunctionMapping#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see placer.SharedFunctionMapping#getHost()
	 * @see #getSharedFunctionMapping()
	 * @generated
	 */
	EAttribute getSharedFunctionMapping_Host();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.SharedFunctionMapping#getNameValues <em>Name Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Values</em>'.
	 * @see placer.SharedFunctionMapping#getNameValues()
	 * @see #getSharedFunctionMapping()
	 * @generated
	 */
	EReference getSharedFunctionMapping_NameValues();

	/**
	 * Returns the meta object for class '{@link placer.NameValue <em>Name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Value</em>'.
	 * @see placer.NameValue
	 * @generated
	 */
	EClass getNameValue();

	/**
	 * Returns the meta object for the attribute '{@link placer.NameValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see placer.NameValue#getName()
	 * @see #getNameValue()
	 * @generated
	 */
	EAttribute getNameValue_Name();

	/**
	 * Returns the meta object for the attribute '{@link placer.NameValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see placer.NameValue#getValue()
	 * @see #getNameValue()
	 * @generated
	 */
	EAttribute getNameValue_Value();

	/**
	 * Returns the meta object for class '{@link placer.MainPlacerOut <em>Main Placer Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Placer Out</em>'.
	 * @see placer.MainPlacerOut
	 * @generated
	 */
	EClass getMainPlacerOut();

	/**
	 * Returns the meta object for the attribute '{@link placer.MainPlacerOut#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info</em>'.
	 * @see placer.MainPlacerOut#getInfo()
	 * @see #getMainPlacerOut()
	 * @generated
	 */
	EAttribute getMainPlacerOut_Info();

	/**
	 * Returns the meta object for the attribute '{@link placer.MainPlacerOut#getJsonFormat <em>Json Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Format</em>'.
	 * @see placer.MainPlacerOut#getJsonFormat()
	 * @see #getMainPlacerOut()
	 * @generated
	 */
	EAttribute getMainPlacerOut_JsonFormat();

	/**
	 * Returns the meta object for the attribute '{@link placer.MainPlacerOut#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see placer.MainPlacerOut#getTimeUnit()
	 * @see #getMainPlacerOut()
	 * @generated
	 */
	EAttribute getMainPlacerOut_TimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link placer.MainPlacerOut#getDataUnit <em>Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Unit</em>'.
	 * @see placer.MainPlacerOut#getDataUnit()
	 * @see #getMainPlacerOut()
	 * @generated
	 */
	EAttribute getMainPlacerOut_DataUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link placer.MainPlacerOut#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see placer.MainPlacerOut#getMappings()
	 * @see #getMainPlacerOut()
	 * @generated
	 */
	EReference getMainPlacerOut_Mappings();

	/**
	 * Returns the meta object for the attribute '{@link placer.MainPlacerOut#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see placer.MainPlacerOut#getFilePath()
	 * @see #getMainPlacerOut()
	 * @generated
	 */
	EAttribute getMainPlacerOut_FilePath();

	/**
	 * Returns the meta object for class '{@link placer.TransmissionMapping <em>Transmission Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission Mapping</em>'.
	 * @see placer.TransmissionMapping
	 * @generated
	 */
	EClass getTransmissionMapping();

	/**
	 * Returns the meta object for the attribute '{@link placer.TransmissionMapping#getTransmission <em>Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission</em>'.
	 * @see placer.TransmissionMapping#getTransmission()
	 * @see #getTransmissionMapping()
	 * @generated
	 */
	EAttribute getTransmissionMapping_Transmission();

	/**
	 * Returns the meta object for the reference '{@link placer.TransmissionMapping#getFromPE <em>From PE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From PE</em>'.
	 * @see placer.TransmissionMapping#getFromPE()
	 * @see #getTransmissionMapping()
	 * @generated
	 */
	EReference getTransmissionMapping_FromPE();

	/**
	 * Returns the meta object for the reference '{@link placer.TransmissionMapping#getToPE <em>To PE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To PE</em>'.
	 * @see placer.TransmissionMapping#getToPE()
	 * @see #getTransmissionMapping()
	 * @generated
	 */
	EReference getTransmissionMapping_ToPE();

	/**
	 * Returns the meta object for the attribute '{@link placer.TransmissionMapping#getFromTask <em>From Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Task</em>'.
	 * @see placer.TransmissionMapping#getFromTask()
	 * @see #getTransmissionMapping()
	 * @generated
	 */
	EAttribute getTransmissionMapping_FromTask();

	/**
	 * Returns the meta object for the attribute '{@link placer.TransmissionMapping#getToTask <em>To Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Task</em>'.
	 * @see placer.TransmissionMapping#getToTask()
	 * @see #getTransmissionMapping()
	 * @generated
	 */
	EAttribute getTransmissionMapping_ToTask();

	/**
	 * Returns the meta object for class '{@link placer.NewEClass37 <em>New EClass37</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New EClass37</em>'.
	 * @see placer.NewEClass37
	 * @generated
	 */
	EClass getNewEClass37();

	/**
	 * Returns the meta object for the reference '{@link placer.TransmissionMapping#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus</em>'.
	 * @see placer.TransmissionMapping#getBus()
	 * @see #getTransmissionMapping()
	 * @generated
	 */
	EReference getTransmissionMapping_Bus();

	/**
	 * Returns the meta object for the attribute '{@link placer.TransmissionMapping#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see placer.TransmissionMapping#getStart()
	 * @see #getTransmissionMapping()
	 * @generated
	 */
	EAttribute getTransmissionMapping_Start();

	/**
	 * Returns the meta object for the attribute '{@link placer.TransmissionMapping#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see placer.TransmissionMapping#getDuration()
	 * @see #getTransmissionMapping()
	 * @generated
	 */
	EAttribute getTransmissionMapping_Duration();

	/**
	 * Returns the meta object for the attribute '{@link placer.TransmissionMapping#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see placer.TransmissionMapping#getEnd()
	 * @see #getTransmissionMapping()
	 * @generated
	 */
	EAttribute getTransmissionMapping_End();

	/**
	 * Returns the meta object for enum '{@link placer.TimingObject <em>Timing Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Timing Object</em>'.
	 * @see placer.TimingObject
	 * @generated
	 */
	EEnum getTimingObject();

	/**
	 * Returns the meta object for enum '{@link placer.SimpleGoal <em>Simple Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simple Goal</em>'.
	 * @see placer.SimpleGoal
	 * @generated
	 */
	EEnum getSimpleGoal();

	/**
	 * Returns the meta object for enum '{@link placer.SoftwareClass <em>Software Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Software Class</em>'.
	 * @see placer.SoftwareClass
	 * @generated
	 */
	EEnum getSoftwareClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlacerFactory getPlacerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link placer.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.TaskImpl
		 * @see placer.impl.PlacerPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Transmissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TRANSMISSIONS = eINSTANCE.getTask_Transmissions();

		/**
		 * The meta object literal for the '<em><b>Implementations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__IMPLEMENTATIONS = eINSTANCE.getTask_Implementations();

		/**
		 * The meta object literal for the '{@link placer.impl.TransmissionImpl <em>Transmission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.TransmissionImpl
		 * @see placer.impl.PlacerPackageImpl#getTransmission()
		 * @generated
		 */
		EClass TRANSMISSION = eINSTANCE.getTransmission();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__FROM = eINSTANCE.getTransmission_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__TO = eINSTANCE.getTransmission_To();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION__AMOUNT = eINSTANCE.getTransmission_Amount();

		/**
		 * The meta object literal for the '<em><b>Timing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION__TIMING = eINSTANCE.getTransmission_Timing();

		/**
		 * The meta object literal for the '{@link placer.impl.ProcessingElementClassImpl <em>Processing Element Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.ProcessingElementClassImpl
		 * @see placer.impl.PlacerPackageImpl#getProcessingElementClass()
		 * @generated
		 */
		EClass PROCESSING_ELEMENT_CLASS = eINSTANCE.getProcessingElementClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ELEMENT_CLASS__NAME = eINSTANCE.getProcessingElementClass_Name();

		/**
		 * The meta object literal for the '<em><b>Resources Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_ELEMENT_CLASS__RESOURCES_DECLARATIONS = eINSTANCE
				.getProcessingElementClass_ResourcesDeclarations();

		/**
		 * The meta object literal for the '<em><b>Properties Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_ELEMENT_CLASS__PROPERTIES_DECLARATIONS = eINSTANCE
				.getProcessingElementClass_PropertiesDeclarations();

		/**
		 * The meta object literal for the '{@link placer.impl.MultiTaskPermanentTasksImpl <em>Multi Task Permanent Tasks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.MultiTaskPermanentTasksImpl
		 * @see placer.impl.PlacerPackageImpl#getMultiTaskPermanentTasks()
		 * @generated
		 */
		EClass MULTI_TASK_PERMANENT_TASKS = eINSTANCE.getMultiTaskPermanentTasks();

		/**
		 * The meta object literal for the '{@link placer.impl.SwitchingTaskImpl <em>Switching Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.SwitchingTaskImpl
		 * @see placer.impl.PlacerPackageImpl#getSwitchingTask()
		 * @generated
		 */
		EClass SWITCHING_TASK = eINSTANCE.getSwitchingTask();

		/**
		 * The meta object literal for the '<em><b>Switching Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCHING_TASK__SWITCHING_DELAY = eINSTANCE.getSwitchingTask_SwitchingDelay();

		/**
		 * The meta object literal for the '{@link placer.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.BusImpl
		 * @see placer.impl.PlacerPackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__NAME = eINSTANCE.getBus_Name();

		/**
		 * The meta object literal for the '<em><b>Time Unit Per Data Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__TIME_UNIT_PER_DATA_UNIT = eINSTANCE.getBus_TimeUnitPerDataUnit();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__LATENCY = eINSTANCE.getBus_Latency();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__CONNECTIONS = eINSTANCE.getBus_Connections();

		/**
		 * The meta object literal for the '{@link placer.impl.ProcessingElementImpl <em>Processing Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.ProcessingElementImpl
		 * @see placer.impl.PlacerPackageImpl#getProcessingElement()
		 * @generated
		 */
		EClass PROCESSING_ELEMENT = eINSTANCE.getProcessingElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ELEMENT__NAME = eINSTANCE.getProcessingElement_Name();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ELEMENT__MEMORY = eINSTANCE.getProcessingElement_Memory();

		/**
		 * The meta object literal for the '<em><b>Power Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ELEMENT__POWER_MODEL = eINSTANCE.getProcessingElement_PowerModel();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_ELEMENT__CLASS = eINSTANCE.getProcessingElement_Class();

		/**
		 * The meta object literal for the '<em><b>Resources Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_ELEMENT__RESOURCES_DEFINITIONS = eINSTANCE.getProcessingElement_ResourcesDefinitions();

		/**
		 * The meta object literal for the '<em><b>Properties Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_ELEMENT__PROPERTIES_DEFINITIONS = eINSTANCE.getProcessingElement_PropertiesDefinitions();

		/**
		 * The meta object literal for the '{@link placer.impl.ImplementationImpl <em>Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.ImplementationImpl
		 * @see placer.impl.PlacerPackageImpl#getImplementation()
		 * @generated
		 */
		EClass IMPLEMENTATION = eINSTANCE.getImplementation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION__NAME = eINSTANCE.getImplementation_Name();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION__DURATION = eINSTANCE.getImplementation_Duration();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__PARAMETERS = eINSTANCE.getImplementation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Resources Usages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__RESOURCES_USAGES = eINSTANCE.getImplementation_ResourcesUsages();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__TARGET = eINSTANCE.getImplementation_Target();

		/**
		 * The meta object literal for the '<em><b>Computation Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION__COMPUTATION_MEMORY = eINSTANCE.getImplementation_ComputationMemory();

		/**
		 * The meta object literal for the '{@link placer.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.ConnectionImpl
		 * @see placer.impl.PlacerPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Connection To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__CONNECTION_TO = eINSTANCE.getConnection_ConnectionTo();

		/**
		 * The meta object literal for the '<em><b>Connection From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__CONNECTION_FROM = eINSTANCE.getConnection_ConnectionFrom();

		/**
		 * The meta object literal for the '{@link placer.impl.ConstraintOrObjectiveImpl <em>Constraint Or Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.ConstraintOrObjectiveImpl
		 * @see placer.impl.PlacerPackageImpl#getConstraintOrObjective()
		 * @generated
		 */
		EClass CONSTRAINT_OR_OBJECTIVE = eINSTANCE.getConstraintOrObjective();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_OR_OBJECTIVE__INFO = eINSTANCE.getConstraintOrObjective_Info();

		/**
		 * The meta object literal for the '{@link placer.impl.SamePEImpl <em>Same PE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.SamePEImpl
		 * @see placer.impl.PlacerPackageImpl#getSamePE()
		 * @generated
		 */
		EClass SAME_PE = eINSTANCE.getSamePE();

		/**
		 * The meta object literal for the '<em><b>Yes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAME_PE__YES = eINSTANCE.getSamePE_Yes();

		/**
		 * The meta object literal for the '<em><b>Task Same PE</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAME_PE__TASK_SAME_PE = eINSTANCE.getSamePE_TaskSamePE();

		/**
		 * The meta object literal for the '{@link placer.impl.EnergyCapImpl <em>Energy Cap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.EnergyCapImpl
		 * @see placer.impl.PlacerPackageImpl#getEnergyCap()
		 * @generated
		 */
		EClass ENERGY_CAP = eINSTANCE.getEnergyCap();

		/**
		 * The meta object literal for the '<em><b>Energy Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_CAP__ENERGY_CAP = eINSTANCE.getEnergyCap_EnergyCap();

		/**
		 * The meta object literal for the '{@link placer.impl.RunOnImpl <em>Run On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.RunOnImpl
		 * @see placer.impl.PlacerPackageImpl#getRunOn()
		 * @generated
		 */
		EClass RUN_ON = eINSTANCE.getRunOn();

		/**
		 * The meta object literal for the '<em><b>Yes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN_ON__YES = eINSTANCE.getRunOn_Yes();

		/**
		 * The meta object literal for the '<em><b>Processing Element Run On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_ON__PROCESSING_ELEMENT_RUN_ON = eINSTANCE.getRunOn_ProcessingElementRunOn();

		/**
		 * The meta object literal for the '<em><b>Task Run On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_ON__TASK_RUN_ON = eINSTANCE.getRunOn_TaskRunOn();

		/**
		 * The meta object literal for the '{@link placer.impl.PowerCapImpl <em>Power Cap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.PowerCapImpl
		 * @see placer.impl.PlacerPackageImpl#getPowerCap()
		 * @generated
		 */
		EClass POWER_CAP = eINSTANCE.getPowerCap();

		/**
		 * The meta object literal for the '<em><b>Power Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_CAP__POWER_CAP = eINSTANCE.getPowerCap_PowerCap();

		/**
		 * The meta object literal for the '{@link placer.impl.SymetricPEImpl <em>Symetric PE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.SymetricPEImpl
		 * @see placer.impl.PlacerPackageImpl#getSymetricPE()
		 * @generated
		 */
		EClass SYMETRIC_PE = eINSTANCE.getSymetricPE();

		/**
		 * The meta object literal for the '<em><b>Processing Element Symetric PE</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMETRIC_PE__PROCESSING_ELEMENT_SYMETRIC_PE = eINSTANCE.getSymetricPE_ProcessingElementSymetricPE();

		/**
		 * The meta object literal for the '{@link placer.impl.MustBeUsedImpl <em>Must Be Used</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.MustBeUsedImpl
		 * @see placer.impl.PlacerPackageImpl#getMustBeUsed()
		 * @generated
		 */
		EClass MUST_BE_USED = eINSTANCE.getMustBeUsed();

		/**
		 * The meta object literal for the '<em><b>Yes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST_BE_USED__YES = eINSTANCE.getMustBeUsed_Yes();

		/**
		 * The meta object literal for the '<em><b>Processing Element Must Be Used</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUST_BE_USED__PROCESSING_ELEMENT_MUST_BE_USED = eINSTANCE
				.getMustBeUsed_ProcessingElementMustBeUsed();

		/**
		 * The meta object literal for the '{@link placer.impl.MappingGoalImpl <em>Mapping Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.MappingGoalImpl
		 * @see placer.impl.PlacerPackageImpl#getMappingGoal()
		 * @generated
		 */
		EClass MAPPING_GOAL = eINSTANCE.getMappingGoal();

		/**
		 * The meta object literal for the '<em><b>Simple Objective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_GOAL__SIMPLE_OBJECTIVE = eINSTANCE.getMappingGoal_SimpleObjective();

		/**
		 * The meta object literal for the '{@link placer.impl.GlobalInformationImpl <em>Global Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.GlobalInformationImpl
		 * @see placer.impl.PlacerPackageImpl#getGlobalInformation()
		 * @generated
		 */
		EClass GLOBAL_INFORMATION = eINSTANCE.getGlobalInformation();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_INFORMATION__INFORMATION = eINSTANCE.getGlobalInformation_Information();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_INFORMATION__TIME_UNIT = eINSTANCE.getGlobalInformation_TimeUnit();

		/**
		 * The meta object literal for the '<em><b>Data Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_INFORMATION__DATA_UNIT = eINSTANCE.getGlobalInformation_DataUnit();

		/**
		 * The meta object literal for the '{@link placer.impl.MultiObjectiveGoalImpl <em>Multi Objective Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.MultiObjectiveGoalImpl
		 * @see placer.impl.PlacerPackageImpl#getMultiObjectiveGoal()
		 * @generated
		 */
		EClass MULTI_OBJECTIVE_GOAL = eINSTANCE.getMultiObjectiveGoal();

		/**
		 * The meta object literal for the '<em><b>Simple Objective2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_OBJECTIVE_GOAL__SIMPLE_OBJECTIVE2 = eINSTANCE.getMultiObjectiveGoal_SimpleObjective2();

		/**
		 * The meta object literal for the '{@link placer.impl.SimpleObjectiveGoalImpl <em>Simple Objective Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.SimpleObjectiveGoalImpl
		 * @see placer.impl.PlacerPackageImpl#getSimpleObjectiveGoal()
		 * @generated
		 */
		EClass SIMPLE_OBJECTIVE_GOAL = eINSTANCE.getSimpleObjectiveGoal();

		/**
		 * The meta object literal for the '{@link placer.impl.TaskGroupImpl <em>Task Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.TaskGroupImpl
		 * @see placer.impl.PlacerPackageImpl#getTaskGroup()
		 * @generated
		 */
		EClass TASK_GROUP = eINSTANCE.getTaskGroup();

		/**
		 * The meta object literal for the '<em><b>Nb Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_GROUP__NB_INSTANCES = eINSTANCE.getTaskGroup_NbInstances();

		/**
		 * The meta object literal for the '<em><b>Task Task Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_GROUP__TASK_TASK_GROUPS = eINSTANCE.getTaskGroup_TaskTaskGroups();

		/**
		 * The meta object literal for the '{@link placer.impl.GlobalImpl <em>Global</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.GlobalImpl
		 * @see placer.impl.PlacerPackageImpl#getGlobal()
		 * @generated
		 */
		EClass GLOBAL = eINSTANCE.getGlobal();

		/**
		 * The meta object literal for the '<em><b>Constraint Or Objectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL__CONSTRAINT_OR_OBJECTIVES = eINSTANCE.getGlobal_ConstraintOrObjectives();

		/**
		 * The meta object literal for the '<em><b>Power Cap</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL__POWER_CAP = eINSTANCE.getGlobal_PowerCap();

		/**
		 * The meta object literal for the '<em><b>Energy Cap</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL__ENERGY_CAP = eINSTANCE.getGlobal_EnergyCap();

		/**
		 * The meta object literal for the '<em><b>Global Informations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL__GLOBAL_INFORMATIONS = eINSTANCE.getGlobal_GlobalInformations();

		/**
		 * The meta object literal for the '<em><b>Mapping Goals</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL__MAPPING_GOALS = eINSTANCE.getGlobal_MappingGoals();

		/**
		 * The meta object literal for the '<em><b>Busses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL__BUSSES = eINSTANCE.getGlobal_Busses();

		/**
		 * The meta object literal for the '<em><b>Processing Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL__PROCESSING_ELEMENTS = eINSTANCE.getGlobal_ProcessingElements();

		/**
		 * The meta object literal for the '<em><b>Processing Element Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL__PROCESSING_ELEMENT_CLASSES = eINSTANCE.getGlobal_ProcessingElementClasses();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL__TASKS = eINSTANCE.getGlobal_Tasks();

		/**
		 * The meta object literal for the '<em><b>Task Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL__TASK_GROUPS = eINSTANCE.getGlobal_TaskGroups();

		/**
		 * The meta object literal for the '<em><b>Max Make Span</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL__MAX_MAKE_SPAN = eINSTANCE.getGlobal_MaxMakeSpan();

		/**
		 * The meta object literal for the '<em><b>Software Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL__SOFTWARE_CLASS = eINSTANCE.getGlobal_SoftwareClass();

		/**
		 * The meta object literal for the '<em><b>Global Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL__GLOBAL_PROPERTIES = eINSTANCE.getGlobal_GlobalProperties();

		/**
		 * The meta object literal for the '<em><b>Command Line Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL__COMMAND_LINE_PARAMETERS = eINSTANCE.getGlobal_CommandLineParameters();

		/**
		 * The meta object literal for the '<em><b>Main Placer Out1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL__MAIN_PLACER_OUT1 = eINSTANCE.getGlobal_MainPlacerOut1();

		/**
		 * The meta object literal for the '{@link placer.impl.MaxMakeSpanImpl <em>Max Make Span</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.MaxMakeSpanImpl
		 * @see placer.impl.PlacerPackageImpl#getMaxMakeSpan()
		 * @generated
		 */
		EClass MAX_MAKE_SPAN = eINSTANCE.getMaxMakeSpan();

		/**
		 * The meta object literal for the '<em><b>Max Make Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_MAKE_SPAN__MAX_MAKE_SPAN = eINSTANCE.getMaxMakeSpan_MaxMakeSpan();

		/**
		 * The meta object literal for the '{@link placer.impl.ResourcesDefinitionImpl <em>Resources Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.ResourcesDefinitionImpl
		 * @see placer.impl.PlacerPackageImpl#getResourcesDefinition()
		 * @generated
		 */
		EClass RESOURCES_DEFINITION = eINSTANCE.getResourcesDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES_DEFINITION__NAME = eINSTANCE.getResourcesDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCES_DEFINITION__VALUE = eINSTANCE.getResourcesDefinition_Value();

		/**
		 * The meta object literal for the '{@link placer.impl.PropertiesDefinitionImpl <em>Properties Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.PropertiesDefinitionImpl
		 * @see placer.impl.PlacerPackageImpl#getPropertiesDefinition()
		 * @generated
		 */
		EClass PROPERTIES_DEFINITION = eINSTANCE.getPropertiesDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_DEFINITION__NAME = eINSTANCE.getPropertiesDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_DEFINITION__VALUE = eINSTANCE.getPropertiesDefinition_Value();

		/**
		 * The meta object literal for the '{@link placer.impl.ParametersImpl <em>Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.ParametersImpl
		 * @see placer.impl.PlacerPackageImpl#getParameters()
		 * @generated
		 */
		EClass PARAMETERS = eINSTANCE.getParameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__NAME = eINSTANCE.getParameters_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__VALUE = eINSTANCE.getParameters_Value();

		/**
		 * The meta object literal for the '{@link placer.impl.ResourcesDeclarationImpl <em>Resources Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.ResourcesDeclarationImpl
		 * @see placer.impl.PlacerPackageImpl#getResourcesDeclaration()
		 * @generated
		 */
		EClass RESOURCES_DECLARATION = eINSTANCE.getResourcesDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCES_DECLARATION__NAME = eINSTANCE.getResourcesDeclaration_Name();

		/**
		 * The meta object literal for the '{@link placer.impl.PropertiesDeclarationImpl <em>Properties Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.PropertiesDeclarationImpl
		 * @see placer.impl.PlacerPackageImpl#getPropertiesDeclaration()
		 * @generated
		 */
		EClass PROPERTIES_DECLARATION = eINSTANCE.getPropertiesDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_DECLARATION__NAME = eINSTANCE.getPropertiesDeclaration_Name();

		/**
		 * The meta object literal for the '{@link placer.impl.ResourcesUsageImpl <em>Resources Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.ResourcesUsageImpl
		 * @see placer.impl.PlacerPackageImpl#getResourcesUsage()
		 * @generated
		 */
		EClass RESOURCES_USAGE = eINSTANCE.getResourcesUsage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES_USAGE__NAME = eINSTANCE.getResourcesUsage_Name();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCES_USAGE__FORMULA = eINSTANCE.getResourcesUsage_Formula();

		/**
		 * The meta object literal for the '{@link placer.impl.GlobalPropertiesImpl <em>Global Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.GlobalPropertiesImpl
		 * @see placer.impl.PlacerPackageImpl#getGlobalProperties()
		 * @generated
		 */
		EClass GLOBAL_PROPERTIES = eINSTANCE.getGlobalProperties();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PROPERTIES__NAME = eINSTANCE.getGlobalProperties_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PROPERTIES__VALUE = eINSTANCE.getGlobalProperties_Value();

		/**
		 * The meta object literal for the '{@link placer.impl.TaskMappingImpl <em>Task Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.TaskMappingImpl
		 * @see placer.impl.PlacerPackageImpl#getTaskMapping()
		 * @generated
		 */
		EClass TASK_MAPPING = eINSTANCE.getTaskMapping();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_MAPPING__TASK = eINSTANCE.getTaskMapping_Task();

		/**
		 * The meta object literal for the '<em><b>Processing Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_MAPPING__PROCESSING_ELEMENT = eINSTANCE.getTaskMapping_ProcessingElement();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_MAPPING__IMPLEMENTATION = eINSTANCE.getTaskMapping_Implementation();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_MAPPING__START = eINSTANCE.getTaskMapping_Start();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_MAPPING__DURATION = eINSTANCE.getTaskMapping_Duration();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_MAPPING__END = eINSTANCE.getTaskMapping_End();

		/**
		 * The meta object literal for the '<em><b>Name Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_MAPPING__NAME_VALUES = eINSTANCE.getTaskMapping_NameValues();

		/**
		 * The meta object literal for the '{@link placer.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.MappingImpl
		 * @see placer.impl.PlacerPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Hardware Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__HARDWARE_NAME = eINSTANCE.getMapping_HardwareName();

		/**
		 * The meta object literal for the '<em><b>Makespan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__MAKESPAN = eINSTANCE.getMapping_Makespan();

		/**
		 * The meta object literal for the '<em><b>Energy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__ENERGY = eINSTANCE.getMapping_Energy();

		/**
		 * The meta object literal for the '<em><b>Task Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__TASK_MAPPINGS = eINSTANCE.getMapping_TaskMappings();

		/**
		 * The meta object literal for the '<em><b>Shared Function Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__SHARED_FUNCTION_MAPPINGS = eINSTANCE.getMapping_SharedFunctionMappings();

		/**
		 * The meta object literal for the '<em><b>Transmission Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__TRANSMISSION_MAPPINGS = eINSTANCE.getMapping_TransmissionMappings();

		/**
		 * The meta object literal for the '{@link placer.impl.SharedFunctionMappingImpl <em>Shared Function Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.SharedFunctionMappingImpl
		 * @see placer.impl.PlacerPackageImpl#getSharedFunctionMapping()
		 * @generated
		 */
		EClass SHARED_FUNCTION_MAPPING = eINSTANCE.getSharedFunctionMapping();

		/**
		 * The meta object literal for the '<em><b>Shared Implem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_FUNCTION_MAPPING__SHARED_IMPLEM = eINSTANCE.getSharedFunctionMapping_SharedImplem();

		/**
		 * The meta object literal for the '<em><b>Nb Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_FUNCTION_MAPPING__NB_INSTANCE = eINSTANCE.getSharedFunctionMapping_NbInstance();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_FUNCTION_MAPPING__HOST = eINSTANCE.getSharedFunctionMapping_Host();

		/**
		 * The meta object literal for the '<em><b>Name Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_FUNCTION_MAPPING__NAME_VALUES = eINSTANCE.getSharedFunctionMapping_NameValues();

		/**
		 * The meta object literal for the '{@link placer.impl.NameValueImpl <em>Name Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.NameValueImpl
		 * @see placer.impl.PlacerPackageImpl#getNameValue()
		 * @generated
		 */
		EClass NAME_VALUE = eINSTANCE.getNameValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_VALUE__NAME = eINSTANCE.getNameValue_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_VALUE__VALUE = eINSTANCE.getNameValue_Value();

		/**
		 * The meta object literal for the '{@link placer.impl.MainPlacerOutImpl <em>Main Placer Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.MainPlacerOutImpl
		 * @see placer.impl.PlacerPackageImpl#getMainPlacerOut()
		 * @generated
		 */
		EClass MAIN_PLACER_OUT = eINSTANCE.getMainPlacerOut();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_PLACER_OUT__INFO = eINSTANCE.getMainPlacerOut_Info();

		/**
		 * The meta object literal for the '<em><b>Json Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_PLACER_OUT__JSON_FORMAT = eINSTANCE.getMainPlacerOut_JsonFormat();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_PLACER_OUT__TIME_UNIT = eINSTANCE.getMainPlacerOut_TimeUnit();

		/**
		 * The meta object literal for the '<em><b>Data Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_PLACER_OUT__DATA_UNIT = eINSTANCE.getMainPlacerOut_DataUnit();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_PLACER_OUT__MAPPINGS = eINSTANCE.getMainPlacerOut_Mappings();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_PLACER_OUT__FILE_PATH = eINSTANCE.getMainPlacerOut_FilePath();

		/**
		 * The meta object literal for the '{@link placer.impl.TransmissionMappingImpl <em>Transmission Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.TransmissionMappingImpl
		 * @see placer.impl.PlacerPackageImpl#getTransmissionMapping()
		 * @generated
		 */
		EClass TRANSMISSION_MAPPING = eINSTANCE.getTransmissionMapping();

		/**
		 * The meta object literal for the '<em><b>Transmission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION_MAPPING__TRANSMISSION = eINSTANCE.getTransmissionMapping_Transmission();

		/**
		 * The meta object literal for the '<em><b>From PE</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_MAPPING__FROM_PE = eINSTANCE.getTransmissionMapping_FromPE();

		/**
		 * The meta object literal for the '<em><b>To PE</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_MAPPING__TO_PE = eINSTANCE.getTransmissionMapping_ToPE();

		/**
		 * The meta object literal for the '<em><b>From Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION_MAPPING__FROM_TASK = eINSTANCE.getTransmissionMapping_FromTask();

		/**
		 * The meta object literal for the '<em><b>To Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION_MAPPING__TO_TASK = eINSTANCE.getTransmissionMapping_ToTask();

		/**
		 * The meta object literal for the '{@link placer.impl.NewEClass37Impl <em>New EClass37</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.impl.NewEClass37Impl
		 * @see placer.impl.PlacerPackageImpl#getNewEClass37()
		 * @generated
		 */
		EClass NEW_ECLASS37 = eINSTANCE.getNewEClass37();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_MAPPING__BUS = eINSTANCE.getTransmissionMapping_Bus();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION_MAPPING__START = eINSTANCE.getTransmissionMapping_Start();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION_MAPPING__DURATION = eINSTANCE.getTransmissionMapping_Duration();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION_MAPPING__END = eINSTANCE.getTransmissionMapping_End();

		/**
		 * The meta object literal for the '{@link placer.TimingObject <em>Timing Object</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.TimingObject
		 * @see placer.impl.PlacerPackageImpl#getTimingObject()
		 * @generated
		 */
		EEnum TIMING_OBJECT = eINSTANCE.getTimingObject();

		/**
		 * The meta object literal for the '{@link placer.SimpleGoal <em>Simple Goal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.SimpleGoal
		 * @see placer.impl.PlacerPackageImpl#getSimpleGoal()
		 * @generated
		 */
		EEnum SIMPLE_GOAL = eINSTANCE.getSimpleGoal();

		/**
		 * The meta object literal for the '{@link placer.SoftwareClass <em>Software Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placer.SoftwareClass
		 * @see placer.impl.PlacerPackageImpl#getSoftwareClass()
		 * @generated
		 */
		EEnum SOFTWARE_CLASS = eINSTANCE.getSoftwareClass();

	}

} //PlacerPackage
