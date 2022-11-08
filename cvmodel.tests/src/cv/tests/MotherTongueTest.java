/**
 */
package cv.tests;

import cv.CvFactory;
import cv.MotherTongue;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mother Tongue</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MotherTongueTest extends LanguageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MotherTongueTest.class);
	}

	/**
	 * Constructs a new Mother Tongue test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotherTongueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mother Tongue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MotherTongue getFixture() {
		return (MotherTongue)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CvFactory.eINSTANCE.createMotherTongue());
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

} //MotherTongueTest
