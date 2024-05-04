package examples.Scalar;

import java.util.Arrays;

public class NqueensMatrix {
    public static void main(String[] ar){
        int N =6;
        char[][]  arr = new char[N][N];
        for(int i=0; i<N; i++){
            for(int j = 0; j<N; j++){
                arr[i][j] = '.';
            }
        }

        nQueens(arr,0,new boolean[N],new boolean[2*N-1],new boolean[2*N-1]);
    }

    static void nQueens(char[][] arr,int r, boolean[] cols, boolean[] d1, boolean[] d2){
        if(r == arr.length){
            for(char[] a : arr ){
                System.out.println(Arrays.toString(a));
            }
            System.out.println();
            System.out.println("--------------------------------------------");
            return;
        }

        for(int col = 0; col<arr.length; col++){
             if(!cols[col] && !d1[r + col] && !d2[r - col + arr.length - 1]){
                 //select the queen
                 arr[r][col] = 'Q';
                 cols[col] = true;
                 d1[r+col] = true;
                 d2[r-col +arr.length -1] = true;
                 nQueens(arr, r+1, cols, d1,d2);
                 //unselect the queen
                 arr[r][col] = '.';
                 cols[col] = false;
                 d1[r+col] = false;
                 d2[r-col +arr.length -1] = false;
             }
        }
    }
}
