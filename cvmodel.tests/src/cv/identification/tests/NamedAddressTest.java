/**
 */
package cv.identification.tests;

import cv.content.tests.AddressTest;

import cv.identification.IdentificationFactory;
import cv.identification.NamedAddress;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Named Address</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NamedAddressTest extends AddressTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NamedAddressTest.class);
	}

	/**
	 * Constructs a new Named Address test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedAddressTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Named Address test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NamedAddress getFixture() {
		return (NamedAddress)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IdentificationFactory.eINSTANCE.createNamedAddress());
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

} //NamedAddressTest
