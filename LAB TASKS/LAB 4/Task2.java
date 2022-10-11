import java.util.Scanner;
public class Task2{

    public static void main(String[] args) {

        char operator;
        float num1, num2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, %, or /");
        operator = input.next().charAt(0);

        System.out.println("Enter first number");
        num1 = input.nextFloat();

        System.out.println("Enter second number");
        num2 = input.nextFloat();

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
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            case '%':
                result=num1%num2;
                System.out.println(num1 + " % " + num2 + " = " + result);
            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}
