import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UtilsTestJUnit {

    private Utils utils;

    @BeforeEach
    void beforeTest() {
        utils = new Utils();
    }

    @AfterEach
    void afterTest() {
        utils = null;
    }

    @Test
    void plus() {
        Assertions.assertEquals(1 + 2, utils.plus(1, 2));
    }

    @Test
    void division() {
        Assertions.assertEquals((float) 1.5, utils.division(3, 2));
    }

    @Test
    void divisionNaN() {
        Assertions.assertEquals(Float.NaN, utils.division(3, 0));
    }

    @Test
    void factorial() {
        Assertions.assertEquals(120, utils.factorial(5));
    }

    @Test
    void toArrayEmptyString() {
        Assertions.assertArrayEquals(new String[]{}, Utils.toArray("", ' '));
    }

    @Test
    void toArraySpace() {
        String[] expectedResult = new String[]{"Hello,", "how", "are", "you?"};
        Assertions.assertArrayEquals(expectedResult, Utils.toArray("Hello, how are you?", ' '));
    }

    @Test
    void toArrayTab() {
        String[] expectedResult = new String[]{"a", "b", "c", "d"};
        Assertions.assertArrayEquals(expectedResult, Utils.toArray("a\tb\tc\td", '\t'));
    }

    @Test
    void isEmptyTrue() {
        Assertions.assertTrue(utils.isEmpty(""));
    }

    @Test
    void isEmptyFalse() {
        Assertions.assertFalse(utils.isEmpty("Not empty string"));
    }

    @Test
    void toDoubleZero() {
        Assertions.assertEquals(0.0, utils.toDouble("0.0"));
    }

    @Test
    void toDoubleInt() {
        Assertions.assertEquals(10.0, utils.toDouble("10"));
    }

    @Test
    void toDoubleDouble() {
        Assertions.assertEquals(5.5, utils.toDouble("5.5"));
    }

    @Test
    void toDoubleNegative() {
        Assertions.assertEquals(-5.5, utils.toDouble("-5.5"));
    }

    @Test
    void toStringZero() {
        Assertions.assertEquals("0.0", utils.toString(0));
    }

    @Test
    void toStringInt() {
        Assertions.assertEquals("10.0", utils.toString(10));
    }

    @Test
    void toStringDouble() {
        Assertions.assertEquals("5.5", utils.toString(5.5));
    }

    @Test
    void toStringNegative() {
        Assertions.assertEquals("-10.0", utils.toString(-10));
    }
}