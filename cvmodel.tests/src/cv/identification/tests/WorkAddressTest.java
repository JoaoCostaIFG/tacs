/**
 */
package cv.identification.tests;

import cv.identification.IdentificationFactory;
import cv.identification.WorkAddress;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Address</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkAddressTest extends NamedAddressTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkAddressTest.class);
	}

	/**
	 * Constructs a new Work Address test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkAddressTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Work Address test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WorkAddress getFixture() {
		return (WorkAddress)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IdentificationFactory.eINSTANCE.createWorkAddress());
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

} //WorkAddressTest
