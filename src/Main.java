import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the first number:");
        double num1 = input.nextDouble();
        System.out.println("Please enter which operation you wanna do: + - / *  ");
        char operator = input.next().charAt(0);
        System.out.println("Please enter the second number:");
        double num2 = input.nextDouble();
        calc(num1, operator, num2);
    }
    public static void calc(double num1, char operator,double num2) {
        double result;
        switch (operator){
            case '+':
                result = num1 + num2;
                System.out.printf("The result is : " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.printf("The result is : " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.printf("The result is : " + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.printf("The result is : " + result);
                break;
        }
    }
}