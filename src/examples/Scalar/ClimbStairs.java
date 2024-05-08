package examples.Scalar;


public class ClimbStairs {
    public static void main(String[] args){
        int N = 4;
        System.out.println(climbStairs(N));
    }

    static int climbStairs(int N){
        if(N==0){
            return 1;
        }
        if(N<0){
            return 0;
        }

        int f1 = climbStairs(N-1);
        int f2 = climbStairs(N-2);
        int f3 = climbStairs(N-3);
        return f1+f2+f3;
    }
}
