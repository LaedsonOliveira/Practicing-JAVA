package calculator;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {

        float number2;
        float number1;
        float resultCalculation;
        int choose = 0;

        Scanner scanner = new Scanner(System.in);
        Operations operations = new Operations();

        try {
            System.out.println("Choose the option: \n 1 - Addition \n 2 - Subtraction \n 3 - Multiplication \n 4 - Division ");
            choose = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e ){
            System.out.println("Format number invalid!");

        }


        System.out.println("Write the first number:");
        number1 = Float.parseFloat(scanner.nextLine());

        System.out.println("Write the second number:");
        number2 = Float.parseFloat(scanner.nextLine());


        switch (choose){

            case 1:
                resultCalculation = operations.Addition(number1, number2);
                System.out.println("The result of the cont " + number1+ " + "+number2+" is "+ resultCalculation);
            case 2:
                resultCalculation = operations.Subtraction(number1, number2);
                System.out.println("The result of the cont " + number1+ " - "+number2+" is "+ resultCalculation);
            case 3:
                resultCalculation = operations.Multiplication(number1, number2);
                System.out.println("The result of the cont " + number1+ " * "+number2+" is "+ resultCalculation);
            case 4:
                resultCalculation = operations.Division(number1, number2);
                System.out.println("The result of the cont " + number1+ " / "+number2+" is "+ resultCalculation);
            default:

        }
    }
}
