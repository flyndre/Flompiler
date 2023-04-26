package de.flyndre.flompiler;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.io.File;

/**
 * Unit test for simple App.
 */
public class FlompilerTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FlompilerTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FlompilerTest.class );
    }

    /**
     * Rigorous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    /**
     * Parse empty class.
     */
    public void testEmptyClass() {
        File file = new File(TestConstants.RESOURCES_ROOT + "/basic/EmptyClass.java");
    }

    /**
     * Try to parse defective empty class and expect exception.
     */
    public void testDefectiveEmptyClass() {
        File file = new File(TestConstants.RESOURCES_ROOT + "/basic/defective/DefectiveEmptyClass.java");
    }
}
