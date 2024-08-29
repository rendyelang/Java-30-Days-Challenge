// Problem: https://www.hackerrank.com/challenges/30-conditional-statements/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         int value = scan.nextInt();
         scan.close();

        if (value %2 == 1 || (value >5 && value <21)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

    }
}
