package examples.Scalar;


public class FirstAndLastPosition {
    public static void main(String[] args){
        int[] arr = {1,2,3,3,3,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5,6,6,6,6};
        int target = 3;
        int l = 0, r = arr.length-1;
        int first = -1;
        while(l<r){
            int mid = l + (r-l)/2;
            if(arr[mid] == target){
                first = mid;
                r = mid-1;
            } else if(arr[mid]<target){
                l = mid+1;
            } else{
                r = mid-1;
            }
        }
         l = 0;
         r = arr.length-1;
        int last = -1;
        while(l<r){
            int mid = l + (r-l)/2;
            if(arr[mid] == target){
                last = mid;
                l = mid+1;
            } else if(arr[mid]<target){
                l = mid+1;
            } else{
                r = mid-1;
            }
        }

        System.out.println(first +"   "+last);
    }
}
