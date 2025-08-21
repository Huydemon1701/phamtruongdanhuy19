
package Lec4_ConditionalExecution;
import java.util.Scanner;
public class SimpleCalculator4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    double divResult = (double) num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + divResult);
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }
        scanner.close();
    }
}
