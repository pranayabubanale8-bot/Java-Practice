import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        
        double a = sc.nextDouble();

        double b = sc.nextDouble();

        
        System.out.println("Select an operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo)");
        
        int operation = sc.nextInt();

        // Calculate and display the result
        switch (operation) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }
    }
}
