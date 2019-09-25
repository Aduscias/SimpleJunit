public class Utils {

    public static void main(String[] args) {
        Utils utils = new Utils();
        System.out.println("Utils works!");
    }

    public int plus(int number1, int number2) {
        return number1 + number2;
    }


    public float division(float number1, float number2) {
        if (number2 == 0) {
            return Float.NaN;
        }
        return number1 / number2;
    }

    public int factorial(int n) {
        Utils utils = new Utils();
        if (n == 0) {
            return 1;
        } else {
            return n * utils.factorial(n - 1);
        }
    }

}
