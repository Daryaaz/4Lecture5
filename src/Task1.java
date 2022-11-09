import java.util.Random;
public class Task1 {
    public static void main(String[] args) {
//        int number1 = 34;
//        int number2 = 49;
//        int sum = number1 + number2;
//        System.out.println("Two number sum is " + sum);

        Random randomGenerator = new Random();
        int randomNumber1 = randomGenerator.nextInt(101);
        int randomNumber2 = randomGenerator.nextInt(101);
        int sum = randomNumber1 + randomNumber2;
        System.out.print("Two random number sum is " + sum);

    }
}
