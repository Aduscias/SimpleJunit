public class UtilsTest {

    public static void main(String[] args) {
        plusTest(10, 15, 25);
        divisionTest(3, 2, (float)1.5);
        divisionTest(3, 0, Float.NaN);
        factorialTest(5, 120);
//        factorialTest(-3, 0);
    }

    private static void plusTest(int number1, int number2, int etalonResult) {
        Utils utils = new Utils();
        if (utils.plus(number1, number2) != etalonResult) {
            System.out.println("\33[31m Test failed.");
        } else {
            System.out.println("\33[32m Test passed.");
        }
    }

    private static void divisionTest(int number1, int number2, float etalonResult) {
        Utils utils = new Utils();
        float currentResult = utils.division(number1, number2);
        if (currentResult == etalonResult || (Float.isNaN(currentResult) && Float.isNaN(etalonResult))) {
            System.out.println("\33[32m Test passed.");
        } else {
            System.out.println("\33[31m Test failed.");
            System.out.println("Number1 = " + number1 + ", number2 = " + number2 + ", etalonResult = " +
                    etalonResult + ", currentResult = " + currentResult);
        }
    }

    private static void factorialTest(int number, int etalonResult) {
        Utils utils = new Utils();
        float currentResult = utils.factorial(number);
        if (currentResult == etalonResult || (Float.isNaN(currentResult) && Float.isNaN(etalonResult))) {
            System.out.println("\33[32m Test passed.");
        } else {
            System.out.println("\33[31m Test failed.");
            System.out.println("Number1 = " + number + ", etalonResult = " +
                    etalonResult + ", currentResult = " + currentResult);
        }
    }
}
