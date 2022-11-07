/**
 */
package cv.identification.contact.tests;

import cv.identification.contact.ContactFactory;
import cv.identification.contact.WorkPhoneNumber;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Phone Number</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkPhoneNumberTest extends PhoneNumberTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkPhoneNumberTest.class);
	}

	/**
	 * Constructs a new Work Phone Number test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPhoneNumberTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Work Phone Number test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WorkPhoneNumber getFixture() {
		return (WorkPhoneNumber)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ContactFactory.eINSTANCE.createWorkPhoneNumber());
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

} //WorkPhoneNumberTest
