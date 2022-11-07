/**
 */
package cv.identification.contact.tests;

import cv.identification.contact.ContactFactory;
import cv.identification.contact.MobilePhoneNumber;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mobile Phone Number</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MobilePhoneNumberTest extends PhoneNumberTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MobilePhoneNumberTest.class);
	}

	/**
	 * Constructs a new Mobile Phone Number test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePhoneNumberTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mobile Phone Number test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MobilePhoneNumber getFixture() {
		return (MobilePhoneNumber)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ContactFactory.eINSTANCE.createMobilePhoneNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MobilePhoneNumberTest
