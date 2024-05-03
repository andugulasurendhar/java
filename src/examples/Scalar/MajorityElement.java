package examples.Scalar;
//
//N = 8
//arr = {2,2,6,6,6,2,8,6}
//Majority element is the number which apprears more than n/2 times

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args){
     int[] arr = {2,2,6,6,6,2,8,6,6};
     int N = arr.length;
//Moore Voting select a candidate and traverse the array, if the element is same as candidate count++ else count--;
        //if count=0 then change the candidate to current element
     int candidate = arr[0];
     int count = 1;
     for(int i=1; i<N; i++){
         if(arr[i]==candidate){
             count++;
         } else{
             count--;
             if(count == 0){
                 candidate = arr[i];
                 count = 1;
             }
         }
     }
     count = 0;
        for (int j : arr) {
            if (j == candidate) {
                count++;
            }
        }

     if(count > N/2){
         System.out.println(candidate);
     } else{
         System.out.println(-1+"");
     }
//another solution using arrays.sort
//     Arrays.sort(arr);
//     int count = 1;
//     for(int i = 0; i<arr.length-1; i++){
//         if(arr[i] == arr[i+1]){
//             count++;
//             if(count > N/2){
//                 System.out.println(arr[i]);
//             }
//         } else{
//             count = 1;
//         }
//     }
    }
}
