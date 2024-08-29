// Problem: https://www.hackerrank.com/challenges/30-arrays/problem

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        System.out.println("Before reverse: " + arr);

        Collections.reverse(arr);
        System.out.println("After reversed: " + arr);
    }
}
