/**
 */
package cv.identification.tests;

import cv.identification.IdentificationFactory;
import cv.identification.IdentificationSection;

import cv.section.tests.SectionTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentificationSectionTest extends SectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IdentificationSectionTest.class);
	}

	/**
	 * Constructs a new Section test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentificationSectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Section test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IdentificationSection getFixture() {
		return (IdentificationSection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IdentificationFactory.eINSTANCE.createIdentificationSection());
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

} //IdentificationSectionTest
