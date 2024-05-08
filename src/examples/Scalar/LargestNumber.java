package examples.Scalar;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LargestNumber {
    public static void main(String[] args){
        System.out.println(largestNumber(new int[]{12, 24, 5424, 23, 24, 24,9}));
    }

    public static String largestNumber(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            String ab = a + "" + b;
            String ba = b + "" + a;
            return ba.compareTo(ab); // Compare as strings lexicographically
        });
        for(int a : nums){
            pq.offer(a);
        }

        StringBuilder sb = new StringBuilder();
        while(pq.size()>0){
            sb.append(pq.poll());
        }

        return sb.toString();
    }

}
