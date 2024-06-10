import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operator, n1, n2, result = 0;
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.println("1 - Add \n2 - Subtract \n3 - Multiply \n4 - Divide \n5 - Exit");
            System.out.print("Choose Operator: ");
            operator = sc.nextInt();

            if (operator == 5) {
                continueCalculation = false;
                System.out.println("Exiting the calculator. Welcome back anytime.");
                break;
            }

            System.out.print("Enter first number: ");
            n1 = sc.nextInt();
            System.out.print("Enter second number: ");
            n2 = sc.nextInt();

            switch (operator) {
                case 1:
                    result = n1 + n2;
                    break;
                case 2:
                    result = n1 - n2;
                    break;
                case 3:
                    result = n1 * n2;
                    break;
                case 4:
                    if (n2 != 0) {
                        result = n1 / n2;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Entered operator is not valid");
                    continue;
            }
            System.out.println("Result is: " + result);
        }

        sc.close();
    }
}
