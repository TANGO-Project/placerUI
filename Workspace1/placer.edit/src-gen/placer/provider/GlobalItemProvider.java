/**
 */
package placer.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import placer.Global;
import placer.PlacerFactory;
import placer.PlacerPackage;
import placer.SoftwareClass;

/**
 * This is the item provider adapter for a {@link placer.Global} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSoftwareClassPropertyDescriptor(object);
			addCommandLineParametersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Software Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSoftwareClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Global_softwareClass_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Global_softwareClass_feature",
								"_UI_Global_type"),
						PlacerPackage.Literals.GLOBAL__SOFTWARE_CLASS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Command Line Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommandLineParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Global_commandLineParameters_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Global_commandLineParameters_feature",
								"_UI_Global_type"),
						PlacerPackage.Literals.GLOBAL__COMMAND_LINE_PARAMETERS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PlacerPackage.Literals.GLOBAL__CONSTRAINT_OR_OBJECTIVES);
			childrenFeatures.add(PlacerPackage.Literals.GLOBAL__POWER_CAP);
			childrenFeatures.add(PlacerPackage.Literals.GLOBAL__ENERGY_CAP);
			childrenFeatures.add(PlacerPackage.Literals.GLOBAL__GLOBAL_INFORMATIONS);
			childrenFeatures.add(PlacerPackage.Literals.GLOBAL__MAPPING_GOALS);
			childrenFeatures.add(PlacerPackage.Literals.GLOBAL__BUSSES);
			childrenFeatures.add(PlacerPackage.Literals.GLOBAL__PROCESSING_ELEMENTS);
			childrenFeatures.add(PlacerPackage.Literals.GLOBAL__PROCESSING_ELEMENT_CLASSES);
			childrenFeatures.add(PlacerPackage.Literals.GLOBAL__TASKS);
			childrenFeatures.add(PlacerPackage.Literals.GLOBAL__TASK_GROUPS);
			childrenFeatures.add(PlacerPackage.Literals.GLOBAL__MAX_MAKE_SPAN);
			childrenFeatures.add(PlacerPackage.Literals.GLOBAL__GLOBAL_PROPERTIES);
			childrenFeatures.add(PlacerPackage.Literals.GLOBAL__MAIN_PLACER_OUT1);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Global.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Global"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		SoftwareClass labelValue = ((Global) object).getSoftwareClass();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_Global_type")
				: getString("_UI_Global_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Global.class)) {
		case PlacerPackage.GLOBAL__SOFTWARE_CLASS:
		case PlacerPackage.GLOBAL__COMMAND_LINE_PARAMETERS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case PlacerPackage.GLOBAL__CONSTRAINT_OR_OBJECTIVES:
		case PlacerPackage.GLOBAL__POWER_CAP:
		case PlacerPackage.GLOBAL__ENERGY_CAP:
		case PlacerPackage.GLOBAL__GLOBAL_INFORMATIONS:
		case PlacerPackage.GLOBAL__MAPPING_GOALS:
		case PlacerPackage.GLOBAL__BUSSES:
		case PlacerPackage.GLOBAL__PROCESSING_ELEMENTS:
		case PlacerPackage.GLOBAL__PROCESSING_ELEMENT_CLASSES:
		case PlacerPackage.GLOBAL__TASKS:
		case PlacerPackage.GLOBAL__TASK_GROUPS:
		case PlacerPackage.GLOBAL__MAX_MAKE_SPAN:
		case PlacerPackage.GLOBAL__GLOBAL_PROPERTIES:
		case PlacerPackage.GLOBAL__MAIN_PLACER_OUT1:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(PlacerPackage.Literals.GLOBAL__CONSTRAINT_OR_OBJECTIVES,
				PlacerFactory.eINSTANCE.createSamePE()));

		newChildDescriptors.add(createChildParameter(PlacerPackage.Literals.GLOBAL__CONSTRAINT_OR_OBJECTIVES,
				PlacerFactory.eINSTANCE.createRunOn()));

		newChildDescriptors.add(createChildParameter(PlacerPackage.Literals.GLOBAL__CONSTRAINT_OR_OBJECTIVES,
				PlacerFactory.eINSTANCE.createSymetricPE()));

		newChildDescriptors.add(createChildParameter(PlacerPackage.Literals.GLOBAL__CONSTRAINT_OR_OBJECTIVES,
				PlacerFactory.eINSTANCE.createMustBeUsed()));

		newChildDescriptors.add(createChildParameter(PlacerPackage.Literals.GLOBAL__POWER_CAP,
				PlacerFactory.eINSTANCE.createPowerCap()));

		newChildDescriptors.add(createChildParameter(PlacerPackage.Literals.GLOBAL__ENERGY_CAP,
				PlacerFactory.eINSTANCE.createEnergyCap()));

		newChildDescriptors.add(createChildParameter(PlacerPackage.Literals.GLOBAL__GLOBAL_INFORMATIONS,
				PlacerFactory.eINSTANCE.createGlobalInformation()));

		newChildDescriptors.add(createChildParameter(PlacerPackage.Literals.GLOBAL__MAPPING_GOALS,
				PlacerFactory.eINSTANCE.createMultiObjectiveGoal()));

		newChildDescriptors.add(createChildParameter(PlacerPackage.Literals.GLOBAL__MAPPING_GOALS,
				PlacerFactory.eINSTANCE.createSimpleObjectiveGoal()));

		newChildDescriptors
				.add(createChildParameter(PlacerPackage.Literals.GLOBAL__BUSSES, PlacerFactory.eINSTANCE.createBus()));

		newChildDescriptors.add(createChildParameter(PlacerPackage.Literals.GLOBAL__PROCESSING_ELEMENTS,
				PlacerFactory.eINSTANCE.createProcessingElement()));

		newChildDescriptors.add(createChildParameter(PlacerPackage.Literals.GLOBAL__PROCESSING_ELEMENT_CLASSES,
				PlacerFactory.eINSTANCE.createMultiTaskPermanentTasks()));

		newChildDescriptors.add(createChildParameter(PlacerPackage.Literals.GLOBAL__PROCESSING_ELEMENT_CLASSES,
				PlacerFactory.eINSTANCE.createSwitchingTask()));

		newChildDescriptors
				.add(createChildParameter(PlacerPackage.Literals.GLOBAL__TASKS, PlacerFactory.eINSTANCE.createTask()));

		newChildDescriptors.add(createChildParameter(PlacerPackage.Literals.GLOBAL__TASK_GROUPS,
				PlacerFactory.eINSTANCE.createTaskGroup()));

		newChildDescriptors.add(createChildParameter(PlacerPackage.Literals.GLOBAL__MAX_MAKE_SPAN,
				PlacerFactory.eINSTANCE.createMaxMakeSpan()));

		newChildDescriptors.add(createChildParameter(PlacerPackage.Literals.GLOBAL__GLOBAL_PROPERTIES,
				PlacerFactory.eINSTANCE.createGlobalProperties()));

		newChildDescriptors.add(createChildParameter(PlacerPackage.Literals.GLOBAL__MAIN_PLACER_OUT1,
				PlacerFactory.eINSTANCE.createMainPlacerOut()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PlacerEditPlugin.INSTANCE;
	}

}
