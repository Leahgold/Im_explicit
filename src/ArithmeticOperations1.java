public class ArithmeticOperations1 {
    double number1;
    double number2;

    ArithmeticOperations1(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }


    public static void main(String[] args) {
        double number1 = 8;
        double number2 = 32;

        double result1 = number1 + number2;
        double result2 = number2 - number1;
        double result3 = number1 * number2;
        double result4 = number2 / number1;

        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);
        System.out.println("result3=" + result3);
        System.out.println("result4=" + result4);

    }
}
