package examples.Scalar;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 9, 12},
                {15, 19, 22, 28},
                {29, 32, 39, 45}};

        int target = 22;
        int i = 0, j = arr.length-1;
        boolean isPresent = false;
        while(i<arr.length && j >= 0){
            if(arr[i][j] == target){
                isPresent = true;
                System.out.println(i +" , "+j);
                break;
            } else if(arr[i][j]< target){
                i++;
            } else{
                j--;
            }
        }
        System.out.println(isPresent);
    }
}
