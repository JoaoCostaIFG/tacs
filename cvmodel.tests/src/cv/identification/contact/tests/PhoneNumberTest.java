/**
 */
package cv.identification.contact.tests;

import cv.identification.contact.ContactFactory;
import cv.identification.contact.PhoneNumber;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Phone Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link cv.identification.contact.PhoneNumber#PhoneNumberIsValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Phone Number Is Valid</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PhoneNumberTest extends ContactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PhoneNumberTest.class);
	}

	/**
	 * Constructs a new Phone Number test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhoneNumberTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Phone Number test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PhoneNumber getFixture() {
		return (PhoneNumber)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ContactFactory.eINSTANCE.createPhoneNumber());
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

	/**
	 * Tests the '{@link cv.identification.contact.PhoneNumber#PhoneNumberIsValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Phone Number Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cv.identification.contact.PhoneNumber#PhoneNumberIsValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testPhoneNumberIsValid__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //PhoneNumberTest
