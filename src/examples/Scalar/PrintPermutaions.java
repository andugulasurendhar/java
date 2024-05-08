package examples.Scalar;

import java.util.ArrayList;

public class PrintPermutaions {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        boolean[] selected = new boolean[arr.length];
        ArrayList<Integer> al = new ArrayList<>();
        printPermutations(arr, 0,al,selected);
    }

    static void printPermutations(int[] arr, int pos, ArrayList<Integer> al, boolean[] selected){
        if(pos == arr.length){
            System.out.println(al);
            return;
        }

        for(int i = 0; i< arr.length; i++){
            if(!selected[i]){
                selected[i] = true;
                al.add(arr[i]);
                printPermutations(arr, pos+1, al, selected);
                selected[i] = false;
                al.remove(al.size()-1);
            }
        }
    }


}
