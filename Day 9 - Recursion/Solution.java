// Problem: https://www.hackerrank.com/challenges/30-recursion/problem

public class Solution {
    public static void main(String[] args) {
        int test = recursion(3);
        System.out.println(test);
    }

    protected static int recursion(int value) {
        if (value <= 1) {
            return 1;
        }
        return value * recursion(value - 1);
    }
}
