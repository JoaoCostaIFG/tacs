/**
 */
package cv.provider;


import cv.CvFactory;
import cv.CvPackage;
import cv.Person;

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

/**
 * This is the item provider adapter for a {@link cv.Person} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonItemProvider(AdapterFactory adapterFactory) {
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

			addFirstNamesPropertyDescriptor(object);
			addLastNamesPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addDateOfBirthPropertyDescriptor(object);
			addGenderPropertyDescriptor(object);
			addMaritalStatusPropertyDescriptor(object);
			addAboutMePropertyDescriptor(object);
			addPicturePropertyDescriptor(object);
			addNationalitiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the First Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Person_firstNames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Person_firstNames_feature", "_UI_Person_type"),
				 CvPackage.Literals.PERSON__FIRST_NAMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Person_lastNames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Person_lastNames_feature", "_UI_Person_type"),
				 CvPackage.Literals.PERSON__LAST_NAMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Person_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Person_title_feature", "_UI_Person_type"),
				 CvPackage.Literals.PERSON__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Of Birth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateOfBirthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Person_dateOfBirth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Person_dateOfBirth_feature", "_UI_Person_type"),
				 CvPackage.Literals.PERSON__DATE_OF_BIRTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gender feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Person_gender_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Person_gender_feature", "_UI_Person_type"),
				 CvPackage.Literals.PERSON__GENDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Marital Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaritalStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Person_maritalStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Person_maritalStatus_feature", "_UI_Person_type"),
				 CvPackage.Literals.PERSON__MARITAL_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the About Me feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAboutMePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Person_aboutMe_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Person_aboutMe_feature", "_UI_Person_type"),
				 CvPackage.Literals.PERSON__ABOUT_ME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Picture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPicturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Person_picture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Person_picture_feature", "_UI_Person_type"),
				 CvPackage.Literals.PERSON__PICTURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nationalities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNationalitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Person_nationalities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Person_nationalities_feature", "_UI_Person_type"),
				 CvPackage.Literals.PERSON__NATIONALITIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(CvPackage.Literals.PERSON__CONTACTS);
			childrenFeatures.add(CvPackage.Literals.PERSON__ADDRESSES);
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
	 * This returns Person.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Person"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Person)object).getFirstNames();
		return label == null || label.length() == 0 ?
			getString("_UI_Person_type") :
			getString("_UI_Person_type") + " " + label;
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

		switch (notification.getFeatureID(Person.class)) {
			case CvPackage.PERSON__FIRST_NAMES:
			case CvPackage.PERSON__LAST_NAMES:
			case CvPackage.PERSON__TITLE:
			case CvPackage.PERSON__DATE_OF_BIRTH:
			case CvPackage.PERSON__GENDER:
			case CvPackage.PERSON__MARITAL_STATUS:
			case CvPackage.PERSON__ABOUT_ME:
			case CvPackage.PERSON__NATIONALITIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CvPackage.PERSON__CONTACTS:
			case CvPackage.PERSON__ADDRESSES:
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

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.PERSON__CONTACTS,
				 CvFactory.eINSTANCE.createContact()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.PERSON__CONTACTS,
				 CvFactory.eINSTANCE.createEmail()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.PERSON__CONTACTS,
				 CvFactory.eINSTANCE.createPhoneNumber()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.PERSON__CONTACTS,
				 CvFactory.eINSTANCE.createHomePhoneNumber()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.PERSON__CONTACTS,
				 CvFactory.eINSTANCE.createWorkPhoneNumber()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.PERSON__CONTACTS,
				 CvFactory.eINSTANCE.createMobilePhoneNumber()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.PERSON__CONTACTS,
				 CvFactory.eINSTANCE.createUrlContact()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.PERSON__ADDRESSES,
				 CvFactory.eINSTANCE.createNamedAddress()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.PERSON__ADDRESSES,
				 CvFactory.eINSTANCE.createHomeAddress()));

		newChildDescriptors.add
			(createChildParameter
				(CvPackage.Literals.PERSON__ADDRESSES,
				 CvFactory.eINSTANCE.createWorkAddress()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CvEditPlugin.INSTANCE;
	}

}
