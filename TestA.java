

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestA.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestA
{
    /**
     * Default constructor for test class TestA
     */
    public TestA()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void testA(){
        Laberinto la = new Laberinto(new int[][]{{0,0,0,0},
                                                 {0,0,0,0},
                                                 {0,0,0,0},
                                                 {0,0,0,1}},
                                                 0,
                                                 0,
                                                 3,
                                                 3);
                                                 assertEquals(true,la.buscar());
    }
}
