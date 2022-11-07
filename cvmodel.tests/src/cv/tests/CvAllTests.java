/**
 */
package cv.tests;

import cv.content.tests.ContentTests;

import cv.edutrain.tests.EdutrainTests;

import cv.identification.contact.tests.ContactTests;

import cv.identification.tests.IdentificationTests;

import cv.order.tests.OrderTests;

import cv.section.tests.SectionTests;

import cv.skill.tests.SkillTests;

import cv.workexp.tests.WorkexpTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Cv</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class CvAllTests extends TestSuite {

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
		TestSuite suite = new CvAllTests("Cv Tests");
		suite.addTest(OrderTests.suite());
		suite.addTest(ContentTests.suite());
		suite.addTest(SectionTests.suite());
		suite.addTest(WorkexpTests.suite());
		suite.addTest(EdutrainTests.suite());
		suite.addTest(IdentificationTests.suite());
		suite.addTest(ContactTests.suite());
		suite.addTest(SkillTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CvAllTests(String name) {
		super(name);
	}

} //CvAllTests
