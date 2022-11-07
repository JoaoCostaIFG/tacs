/**
 */
package cv.workexp.tests;

import cv.workexp.WorkExperience;
import cv.workexp.WorkexpFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Experience</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkExperienceTest extends TestCase {

	/**
	 * The fixture for this Work Experience test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkExperience fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkExperienceTest.class);
	}

	/**
	 * Constructs a new Work Experience test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkExperienceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Work Experience test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(WorkExperience fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Work Experience test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkExperience getFixture() {
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
		setFixture(WorkexpFactory.eINSTANCE.createWorkExperience());
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

} //WorkExperienceTest
