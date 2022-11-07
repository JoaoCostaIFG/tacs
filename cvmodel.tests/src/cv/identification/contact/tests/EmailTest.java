/**
 */
package cv.identification.contact.tests;

import cv.identification.contact.ContactFactory;
import cv.identification.contact.Email;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Email</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link cv.identification.contact.Email#EmailIsValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Email Is Valid</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class EmailTest extends ContactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EmailTest.class);
	}

	/**
	 * Constructs a new Email test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Email test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Email getFixture() {
		return (Email)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ContactFactory.eINSTANCE.createEmail());
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
	 * Tests the '{@link cv.identification.contact.Email#EmailIsValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Email Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cv.identification.contact.Email#EmailIsValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testEmailIsValid__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //EmailTest
