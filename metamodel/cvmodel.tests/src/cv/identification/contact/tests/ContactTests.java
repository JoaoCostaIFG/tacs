/**
 */
package cv.identification.contact.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>contact</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContactTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ContactTests("contact Tests");
		suite.addTestSuite(EmailTest.class);
		suite.addTestSuite(PhoneNumberTest.class);
		suite.addTestSuite(HomePhoneNumberTest.class);
		suite.addTestSuite(WorkPhoneNumberTest.class);
		suite.addTestSuite(MobilePhoneNumberTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactTests(String name) {
		super(name);
	}

} //ContactTests
