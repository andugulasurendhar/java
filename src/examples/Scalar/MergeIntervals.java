package examples.Scalar;

import java.util.Arrays;
import java.util.Stack;

public class MergeIntervals {
    //{{1,4},{8,12},{3,7},{2,6},{9,11},{17,25},{15,21}} => {{1,7},{8,12},{15,25}}
     public static void main(String[] args){
         int[][] arr = {{1,4},{8,12},{3,7},{2,6},{9,11},{17,25},{15,21}};
         Arrays.sort(arr, (a,b)->a[0]-b[0]);
         Stack<int[]> st = new Stack<>();
         for (int[] ints : arr) {
             if (st.size() > 0 && ints[0] <= st.peek()[1]) {
                 st.peek()[1] = Math.max(st.peek()[1], ints[1]);
             } else {
                 st.push(ints);
             }
         }
         while(st.size()>0){
             System.out.println(Arrays.toString(st.pop()));
         }

     }
}
