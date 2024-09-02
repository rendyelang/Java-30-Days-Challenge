// Problem: https://www.hackerrank.com/challenges/30-more-exceptions/problem

public class Soul {
    public static void main(String[] args) {
        try {
            System.out.println(power(2, -3));
            System.out.println(power(3, 4));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        } else {
            return (int) Math.pow(n, p);
        }
    }
}
