package examples.Scalar;

import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] ars){
        //2*3+4 ==== 23*4+
        String[] arr = {"2","3","*","4","+"};
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals("*") || arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.push(solve(a,b,arr[i]));
            } else{
                st.push(Integer.parseInt(arr[i]));
            }
        }
        System.out.println(st.pop());
    }

    public static int solve(int a, int b, String oprtr){
        if(oprtr.equals("+")){
            return a+b;
        } else if(oprtr.equals("-")){
            return b-a;
        } else if(oprtr.equals("*")){
            return a*b;
        } else {
            return b/a;
        }
    }
}
