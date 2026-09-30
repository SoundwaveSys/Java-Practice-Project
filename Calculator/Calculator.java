import java.util.*;

public class Calculator {

    // Function to display the calculator menu
    public static String calculatorDisplay() {
        return "Welcome to Calculator\n\n" +
               "Choose one operation:\n" +
               "1. Add\n" +
               "2. Subtract\n" +
               "3. Exit\n";
    }

    // Function to get user input and store in an array
    public static void userInput(Scanner scanner, int[] numbers) {
        System.out.println("Give two numbers on two lines");
        System.out.print("Number 1 is: ");
        numbers[0] = scanner.nextInt();
        System.out.print("Number 2 is: ");
        numbers[1] = scanner.nextInt();
    }

    // Function to perform addition
    public static int addition(int a, int b) {
        return a + b;
    }

    // Function to perform subtraction
    public static int subtraction(int a, int b) {
        return a - b;
    }

    // Function to handle the calculator operations
    public static String calculatorFunction(int userChoice, Scanner scanner) {
        int[] numbers = new int[2];
        String result = "";
        
        if (userChoice == 1) {
            userInput(scanner, numbers);
            int output = addition(numbers[0], numbers[1]);
            result = "The sum is: " + output;
        } else if (userChoice == 2) {
            userInput(scanner, numbers);
            int output = subtraction(numbers[0], numbers[1]);
            result = "The difference is: " + output;
        } else {
            result = "Exiting the calculator, bye bye!";
            
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the calculator menu
            System.out.println(calculatorDisplay());

            System.out.print("Select the operation: ");
            int userChoice = scanner.nextInt();

            // Process the user choice and get result
            String result = calculatorFunction(userChoice, scanner);
            System.out.println(result);

			// Update your code below this line
            if (userChoice==3){
                break;
            }
            
        }

        // Close scanner to prevent resource leak
        scanner.close();
    }
}
