// Problem: https://www.hackerrank.com/challenges/30-2d-arrays/problem

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        int maxCount = Integer.MIN_VALUE;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int currentCount = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + 
                                    arr.get(i+1).get(j+1) +
                                    arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            }
        }
        System.out.println(maxCount);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        bufferedReader.close();
    }
}
