import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter number 1:");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter number 2:");
            int num2 = Integer.parseInt(scanner.nextLine());

            System.out.println("1: Add");
            System.out.println("2: Subtract");
            System.out.println("3: Multiply");
            System.out.println("4: Divide");

            System.out.println("Enter your choice (1/2/3/4):");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Quotient: " + ((double) num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println("Do you want to continue? (yes/no):");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        scanner.close();
    }
}