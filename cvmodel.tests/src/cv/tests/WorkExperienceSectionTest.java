/**
 */
package cv.tests;

import cv.CvFactory;
import cv.WorkExperienceSection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Experience Section</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkExperienceSectionTest extends OrderedSectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkExperienceSectionTest.class);
	}

	/**
	 * Constructs a new Work Experience Section test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkExperienceSectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Work Experience Section test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WorkExperienceSection getFixture() {
		return (WorkExperienceSection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CvFactory.eINSTANCE.createWorkExperienceSection());
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

} //WorkExperienceSectionTest
