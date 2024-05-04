package examples.Scalar;

import java.util.Arrays;

public class SudokoSolver {

    public static void main(String[] args){
        int[][] arr = {
                { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
                { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
                { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
                { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
                { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
                { 0, 9, 0, 0, 0, 0, 4, 0, 0 }
        };

        sudokoSolver(arr, 0,0);
        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }

    }

     static boolean sudokoSolver(int[][] arr, int x, int y){
        if(x == arr.length){
            return true;
        }

        int nx = y==8 ? x+1: x;
        int ny = y==8 ? 0:y+1;

        if(arr[x][y] == 0){
            for(int val = 1; val<=9; val++){
                if(canWePlace(arr, x,y,val)){
                    arr[x][y] = val;
                    if(sudokoSolver(arr, nx, ny)){
                        return true;
                    }
                    arr[x][y] = 0;
                }
            }
        } else return sudokoSolver(arr, nx, ny);

        return false;
    }

    public static boolean canWePlace(int[][] arr, int x, int y, int val){
        for(int col= 0; col<arr[0].length; col++){
            if(arr[x][col] == val){
                return false;
            }
        }

        for(int row = 0; row<arr.length; row++){
            if(arr[row][y] == val){
                return false;
            }
        }

        x = x - x % 3;
        y = y - y % 3;
        for(int row = x; row<x+3; row++){
            for(int col = y; col<y+3; col++){
                if(arr[row][col] == val){
                    return false;
                }
            }
        }

        return true;
    }
}
