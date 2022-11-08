/**
 */
package cv.tests;

import cv.CvFactory;
import cv.SecondLanguage;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Second Language</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecondLanguageTest extends LanguageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SecondLanguageTest.class);
	}

	/**
	 * Constructs a new Second Language test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondLanguageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Second Language test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SecondLanguage getFixture() {
		return (SecondLanguage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CvFactory.eINSTANCE.createSecondLanguage());
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

} //SecondLanguageTest
