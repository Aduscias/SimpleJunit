import org.junit.*;

import static org.junit.Assert.*;

public class UtilsTestJUnit {

    Utils utils;

    @Before
    public void beforeTest() {
        utils = new Utils();
    }

    @After
    public void afterTest() {
        utils = null;
    }

    @Test
    public void plus() {
        Assert.assertEquals(1 + 2, utils.plus(1, 2));
    }

    @Test
    public void division() {
        Assert.assertEquals((float) 1.5, utils.division(3, 2));
    }

    @Test
    public void divisionNaN() {
        Assert.assertEquals(Float.NaN, utils.division(3, 0));
    }

    @Test
    public void factorial() {
        Assert.assertEquals(120, utils.factorial(5));
    }
}