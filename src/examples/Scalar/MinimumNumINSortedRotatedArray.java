package examples.Scalar;

public class MinimumNumINSortedRotatedArray {
    public static void main(String args[]){
        int[] arr = {8,9,11,14,16,17,20,1,3,4,6,7};
        int l = 0, r = arr.length-1;

        while(l<r){
            int mid = l + (r-l)/2;
            if(arr[mid]<arr[r]){
                r = mid;
            } else{
                l = mid+1;
            }
        }

        System.out.println(l);
    }
}
