/**
 */
package cv.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>cv</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CvTests extends TestSuite {

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
		TestSuite suite = new CvTests("cv Tests");
		suite.addTestSuite(ContentTest.class);
		suite.addTestSuite(StartEndTimeFrameTest.class);
		suite.addTestSuite(OrderedSectionTest.class);
		suite.addTestSuite(SectionLayerTest.class);
		suite.addTestSuite(WorkExperienceSectionTest.class);
		suite.addTestSuite(EducationTrainingSectionTest.class);
		suite.addTestSuite(EmailTest.class);
		suite.addTestSuite(PhoneNumberTest.class);
		suite.addTestSuite(HomePhoneNumberTest.class);
		suite.addTestSuite(WorkPhoneNumberTest.class);
		suite.addTestSuite(MobilePhoneNumberTest.class);
		suite.addTestSuite(IdentificationSectionTest.class);
		suite.addTestSuite(SkillSectionTest.class);
		suite.addTestSuite(HardSkillTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CvTests(String name) {
		super(name);
	}

} //CvTests
