package Lesson5;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter, please, first number");
        int number1 = sc.nextInt();
        System.out.println("Enter, please, second number");
        int number2 = sc.nextInt();
        System.out.println("What action do you want to do? Enter \"+\", \"-\", \"*\", \"/\" or \"%\"");
        char symbol = sc.next().charAt(0);

        switch (symbol) {
            case '+':
                System.out.println(number1 + " " + symbol + " " + number2 + " = " + Actions.plus(number1, number2));
                break;
            case '-':
                System.out.println(number1 + " " + symbol + " " + number2 + " = " + Actions.minus(number1, number2));
                break;
            case '*':
                System.out.println(number1 + " " + symbol + " " + number2 + " = " + Actions.multiplication(number1, number2));
                break;
            case '/':
                if (number2 > 0) {
                    System.out.println(number1 + " " + symbol + " " + number2 + " = " + Actions.division(number1, number2));
                } else
                    System.out.println("Can't divide by zero\n");
                break;
            case '%':
                if (number2 > 0) {
                    System.out.println(number1 + " " + symbol + " " + number2 + " = " + Actions.remainder(number1, number2));
                } else
                    System.out.println("Can't divide by zero\n");
                break;
            default:
                System.out.println("This symbol is undefined");
                System.exit(555);
        }
    }
}