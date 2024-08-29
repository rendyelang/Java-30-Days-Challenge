// Problem: https://www.hackerrank.com/challenges/30-data-types/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in); // Initialized a Scanner object to read input from stdin.

        int secondInt;
        double secondDouble;
        String secondString;
        try { // Try block to handle the exception
            System.out.println("Enter an integer: ");
            secondInt = scan.nextInt();

            System.out.println("Enter a double: ");
            secondDouble = scan.nextDouble();
            scan.nextLine();

            System.out.println("Enter a string: ");
            secondString = scan.nextLine();
        } catch (Exception InputMismatchException) { // Catch block to handle the exception
            System.out.println("Invalid input. Please enter the valid value.");
            scan.close();
            return;
        }

        

        int sumInt = i + secondInt;
        double sumDouble = d + secondDouble;
        String concentenatedString = s + secondString;

        System.out.println("\n");
        System.out.println(sumInt);
        System.out.println(sumDouble);
        System.out.println(concentenatedString);

        scan.close();
    }
}
