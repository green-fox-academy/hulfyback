package solutions.userinput;

import solutions.Decoration;

import java.util.Scanner;

public class AverageOfInput {
    public static void averageOfInput(int countOfNumbers){
        Decoration.decorate("17");
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int avg = 0;
        int i;

        for (i = 0; i < countOfNumbers ; i++) {
            System.out.println("Enter a number: ");
            number =  scanner.nextInt();
            sum += number;
        }

        avg = sum / countOfNumbers;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
}