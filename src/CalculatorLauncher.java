public class CalculatorLauncher {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        Calculator calculator = new Calculator();
        int sum = calculator.sum(a, b);
        System.out.println("Sum is " + sum);
        int subst = calculator.subst(a, b);
        System.out.println("Substraction is " +  subst );
        int multi = calculator.multyply(a, b);
        System.out.println("Multiplication is " + multi);
        System.out.println("Division is " + calculator.division(a, b));

    }
}
