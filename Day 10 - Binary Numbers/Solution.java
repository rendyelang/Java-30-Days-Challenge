// Problem: https://www.hackerrank.com/challenges/30-binary-numbers/problem

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to decimal to binary converter!");
        System.out.println("Enter a decimal number: ");
        int decimalValue = scan.nextInt();

        ArrayList<Integer> resultInBinary = decimalToBinary(decimalValue);

        int consecutiveOneCount = findConsecutiveOne(resultInBinary);

        System.out.println(consecutiveOneCount);

        scan.close();
    }

    protected static ArrayList<Integer> decimalToBinary(int decimalValue) {
        ArrayList<Integer> binaryList = new ArrayList<>();

        while (decimalValue > 0) {
            int remainder = decimalValue %2;
            decimalValue = decimalValue / 2;
            binaryList.add(remainder);
        }

        return binaryList;
    }

    protected static int findConsecutiveOne(ArrayList<Integer> binaryList) {
        int maxConsecutive = 0;
        int currentConsecutive = 0;

        for (int binary: binaryList) {
            if (binary == 1) {
                currentConsecutive++;
                maxConsecutive = Math.max(maxConsecutive, currentConsecutive);
            } else {
                currentConsecutive = 0;
            }
        }

        return maxConsecutive;
    }
}
