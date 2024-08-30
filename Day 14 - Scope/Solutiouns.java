// Problem: https://www.hackerrank.com/challenges/30-scope/problem

import java.util.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    public Difference(int[] elements) {
        this.elements = elements;
    }
    
     void computeDifference() {
        int currentDifference = Integer.MIN_VALUE;
        
        for (int i = 0; i <= elements.length; i++) {
            // currentDifference = Math.abs(elements[i] - 4);
            // maximumDifference = Math.max(maximumDifference, currentDifference);
            for (int j = i + 1; j < elements.length; j++) {
                currentDifference = Math.abs(elements[i] - elements[j]);
                maximumDifference = Math.max(maximumDifference, currentDifference);
            }
        }       
    }

} // End of Difference class

public class Solutiouns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
