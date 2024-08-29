// Problem: https://www.hackerrank.com/challenges/30-loops/problem

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt(); 
    scan.close();

    int i = 1;
    while (i <=10) {
        int calculation = n * i;
        System.out.println(n + " x " + i + " = " + calculation);
        i++;
    }
}
}
