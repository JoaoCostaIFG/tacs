/**
 */
package cv.content.tests;

import cv.content.ContentFactory;
import cv.content.OnGoingTimeFrame;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>On Going Time Frame</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OnGoingTimeFrameTest extends TimeFrameTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OnGoingTimeFrameTest.class);
	}

	/**
	 * Constructs a new On Going Time Frame test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnGoingTimeFrameTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this On Going Time Frame test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OnGoingTimeFrame getFixture() {
		return (OnGoingTimeFrame)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ContentFactory.eINSTANCE.createOnGoingTimeFrame());
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

} //OnGoingTimeFrameTest
