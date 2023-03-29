import java.util.Scanner;

public class App {
    private static final Scanner inputScanner = new Scanner(System.in);
    //...
    private static String getString(String prompt) {
        System.out.println(prompt);

        String userInput = inputScanner.nextLine();
        
    return userInput;
    }

    private static double getDouble(String prompt) {
        System.out.println(prompt);

        Double userInput = inputScanner.nextDouble();

    return userInput;
    }



    public static void main(String[] args) {
        Double num1 = getDouble("Enter the first number.");
        Double num2 = getDouble("Enter the second number.");
        Double addSum = Calculator.add(num1, num2);
        double subSum = Calculator.sub(num1, num2);
        double multSum = Calculator.multiply(num1, num2);
        double divSum = Calculator.div(num1, num2);
        System.out.println(addSum);
        System.out.println(subSum);
        System.out.println(multSum);
        System.out.println(divSum);
        String answer = inputScanner.nextLine();
        getString("Would you like to continue? (Y/N)");
        //String answer = getString("Would you like to continue? (T/N)"); --- why does this not cover the two above lines?

    }
}