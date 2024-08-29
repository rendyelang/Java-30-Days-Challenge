// Problem: https://www.hackerrank.com/challenges/30-binary-numbers/problem

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to number converter!");
        System.out.println("Enter a decimal number: ");
        int decimalValue = scan.nextInt();

        // BINARY RESULT 
        ArrayList<Integer> resultInBinary = decimalToBinary(decimalValue);
        
        // DECIMAL RESULT
        int decimalResult = binaryToDecimal(resultInBinary);

        // int consecutiveOneCount = findConsecutiveOne(resultInBinary);

        // System.out.println(consecutiveOneCount);

        System.out.println("Binary value of " + decimalValue + " is: " + resultInBinary);
        
        System.out.println("Decimal value of " + resultInBinary + " is: " + decimalResult);

        scan.close();
    }

    protected static ArrayList<Integer> decimalToBinary(int decimalValue) {
        ArrayList<Integer> binaryList = new ArrayList<>();

        while (decimalValue > 0) {
            int remainder = decimalValue %2;
            decimalValue = decimalValue / 2;
            binaryList.add(remainder);
        }

        Collections.reverse(binaryList);

        return binaryList;
    }

    protected static int binaryToDecimal(ArrayList<Integer> binaryValue) {
        int decimalResult = 0;
        int power = binaryValue.size()-1;
        for (int value : binaryValue) {
            decimalResult += value * Math.pow(2, power);
            power--;
        }

        return decimalResult;
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
