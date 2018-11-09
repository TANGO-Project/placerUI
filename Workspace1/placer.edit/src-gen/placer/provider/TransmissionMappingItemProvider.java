/**
 */
package placer.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import placer.PlacerPackage;
import placer.TransmissionMapping;

/**
 * This is the item provider adapter for a {@link placer.TransmissionMapping} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransmissionMappingItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionMappingItemProvider(AdapterFactory adapterFactory) {
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

			addStartPropertyDescriptor(object);
			addDurationPropertyDescriptor(object);
			addEndPropertyDescriptor(object);
			addBusPropertyDescriptor(object);
			addTransmissionPropertyDescriptor(object);
			addFromPEPropertyDescriptor(object);
			addToPEPropertyDescriptor(object);
			addFromTaskPropertyDescriptor(object);
			addToTaskPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransmissionMapping_start_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransmissionMapping_start_feature",
								"_UI_TransmissionMapping_type"),
						PlacerPackage.Literals.TRANSMISSION_MAPPING__START, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransmissionMapping_duration_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransmissionMapping_duration_feature",
								"_UI_TransmissionMapping_type"),
						PlacerPackage.Literals.TRANSMISSION_MAPPING__DURATION, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransmissionMapping_end_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransmissionMapping_end_feature",
								"_UI_TransmissionMapping_type"),
						PlacerPackage.Literals.TRANSMISSION_MAPPING__END, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Bus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransmissionMapping_bus_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransmissionMapping_bus_feature",
								"_UI_TransmissionMapping_type"),
						PlacerPackage.Literals.TRANSMISSION_MAPPING__BUS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Transmission feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransmissionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TransmissionMapping_transmission_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_TransmissionMapping_transmission_feature",
						"_UI_TransmissionMapping_type"),
				PlacerPackage.Literals.TRANSMISSION_MAPPING__TRANSMISSION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the From PE feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromPEPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransmissionMapping_fromPE_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransmissionMapping_fromPE_feature",
								"_UI_TransmissionMapping_type"),
						PlacerPackage.Literals.TRANSMISSION_MAPPING__FROM_PE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the To PE feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToPEPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransmissionMapping_toPE_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransmissionMapping_toPE_feature",
								"_UI_TransmissionMapping_type"),
						PlacerPackage.Literals.TRANSMISSION_MAPPING__TO_PE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the From Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransmissionMapping_fromTask_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransmissionMapping_fromTask_feature",
								"_UI_TransmissionMapping_type"),
						PlacerPackage.Literals.TRANSMISSION_MAPPING__FROM_TASK, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the To Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransmissionMapping_toTask_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransmissionMapping_toTask_feature",
								"_UI_TransmissionMapping_type"),
						PlacerPackage.Literals.TRANSMISSION_MAPPING__TO_TASK, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns TransmissionMapping.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TransmissionMapping"));
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
		TransmissionMapping transmissionMapping = (TransmissionMapping) object;
		return getString("_UI_TransmissionMapping_type") + " " + transmissionMapping.getStart();
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

		switch (notification.getFeatureID(TransmissionMapping.class)) {
		case PlacerPackage.TRANSMISSION_MAPPING__START:
		case PlacerPackage.TRANSMISSION_MAPPING__DURATION:
		case PlacerPackage.TRANSMISSION_MAPPING__END:
		case PlacerPackage.TRANSMISSION_MAPPING__TRANSMISSION:
		case PlacerPackage.TRANSMISSION_MAPPING__FROM_TASK:
		case PlacerPackage.TRANSMISSION_MAPPING__TO_TASK:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
