/**
 */
package cv.edutrain.tests;

import cv.edutrain.EducationTraining;
import cv.edutrain.EdutrainFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Education Training</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EducationTrainingTest extends TestCase {

	/**
	 * The fixture for this Education Training test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EducationTraining fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EducationTrainingTest.class);
	}

	/**
	 * Constructs a new Education Training test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EducationTrainingTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Education Training test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EducationTraining fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Education Training test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EducationTraining getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EdutrainFactory.eINSTANCE.createEducationTraining());
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

} //EducationTrainingTest
