import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

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

    @Test
    public void toArrayEmptyString() {
        String[] expectedResult = new String[]{};
        Assert.assertEquals(0, Utils.toArray("", ' ').length);
    }

    @Test
    public void toArraySpace() {
        String[] expectedResult = new String[]{"Hello,", "how", "are", "you?"};
        Assert.assertTrue(Arrays.equals(expectedResult, Utils.toArray("Hello, how are you?", ' ')));
    }

    @Test
    public void toArrayTab() {
        String[] expectedResult = new String[]{"a", "b", "c", "d"};
        Assert.assertTrue(Arrays.equals(expectedResult, Utils.toArray("a\tb\tc\td", '\t')));
    }

    @Test
    public void isEmptyTrue() {
        Assert.assertTrue(utils.isEmpty(""));
    }

    @Test
    public void isEmptyFalse() {
        Assert.assertFalse(utils.isEmpty("Not empty string"));
    }

    @Test
    public void toDoubleZero() {
        Assert.assertEquals(0.0, utils.toDouble("0.0"));
    }

    @Test
    public void toDoubleInt() {
        Assert.assertEquals(10.0, utils.toDouble("10"));
    }

    @Test
    public void toDoubleDouble() {
        Assert.assertEquals(5.5, utils.toDouble("5.5"));
    }

    @Test
    public void toDoubleNegative() {
        Assert.assertEquals(-5.5, utils.toDouble("-5.5"));
    }

    @Test
    public void toStringZero() {
        Assert.assertEquals("0.0", utils.toString(0));
    }

    @Test
    public void toStringInt() {
        Assert.assertEquals("10.0", utils.toString(10));
    }

    @Test
    public void toStringDouble() {
        Assert.assertEquals("5.5", utils.toString(5.5));
    }

    @Test
    public void toStringNegative() {
        Assert.assertEquals("-10.0", utils.toString(-10));
    }
}