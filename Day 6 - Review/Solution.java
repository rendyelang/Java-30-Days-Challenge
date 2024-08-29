import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of test cases: ");
        int executionCount = scan.nextInt();
        
        for (int i = 0; i < executionCount; i++) {
            System.out.println("Enter the sentence: ");
            String sentence = scan.next();
            findEvenOddOfString(sentence);
        }
    }

    protected static void findEvenOddOfString(String sentence) {

        /** First way: */
        // String even = "";
        // String odd = "";
        // for (int j = 0; j < sentence.length(); j++) {
        //     if (j % 2 == 0) {
        //         even += sentence.charAt(j);
        //     } else {
        //         odd += sentence.charAt(j);
        //     }
        // }

        /** Second way: */
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            if (i %2 == 0) {
                even.append(sentence.charAt(i));
            } else {
                odd.append(sentence.charAt(i));
            }
        }

        System.out.println(even + " - " + odd);
    }
}
