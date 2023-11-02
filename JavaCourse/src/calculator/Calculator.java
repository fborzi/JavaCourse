package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Double total = 0.0;
        showMenu(total);
    }
    private static void showMenu(Double total){
            System.out.println("Casio Calculatio Menu:");
            System.out.println("+ ADD");
            System.out.println("- SUBTRACT");
            System.out.println("* MULTIPLY");
            System.out.println("/ DIVIDE");
            System.out.println("0. EXIT");
            System.out.println("Please choose an operation:");
            doOperation(total);
    }
    private static void doOperation(Double total){
        Scanner sc = new Scanner(System.in);
        String operation = sc.next();
        switch (operation){
            case "+":
                System.out.println("You chose: ADD");
                total = add(total, askANumber());
                break;
            case "-":
                System.out.println("You chose: SUBTRACT");
                total = subtract(total, askANumber());
                break;
            case "*":
                System.out.println("You chose: MULTIPLY");
                total = multiply(total, askANumber());
                break;
            case "/":
                System.out.println("You chose: DIVIDE");
                total = divide(total, askANumber());
                break;
            case "0":
                System.out.println("You chose: EXIT");
                System.out.println("The total is: " + total);
                return;
            default:
                System.out.println("Wrong option, please choose again!");
                System.out.println("The total is: " + total);
                showMenu(total);
        }
        System.out.println("The total is: " + total);
        showMenu(total);
    }


    private static Double askANumber(){
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    private static Double add(Double a, Double b){
        return a + b;
    }
    private static Double subtract(Double a, Double b){
        return a - b;
    }
    private static Double multiply(Double a, Double b){
        return a * b;
    }
    private static Double divide(Double a, Double b){
        if(b == 0){
            return null;
        }
        return a / b;
    }

}
