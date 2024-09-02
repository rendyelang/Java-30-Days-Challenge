// Problem: https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem

import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String S = scan.next();
        
        try {
            int stringToInt = Integer.parseInt(S);
            System.out.println(stringToInt);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }

        scan.close();
    }
}
