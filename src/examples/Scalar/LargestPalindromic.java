package examples.Scalar;

import java.util.HashMap;
import java.util.Map;

public class LargestPalindromic {
    public static void main(String[] args){
        System.out.println(largestPalindromic("444947137"));
        System.out.println(largestPalindromic("0000009"));
        System.out.println(largestPalindromic("000000"));
    }
    public static String largestPalindromic(String num) {
        Map<Character, Integer> frequency = new HashMap<>();
        for(char c : num.toCharArray()){
            frequency.put(c, frequency.getOrDefault(c,0)+1);
        }

        StringBuilder b = new StringBuilder();
        Character largestSingle =  null;
        for(char c = '9'; c>='0'; c--){
            int count = frequency.getOrDefault(c,0);
            if(c=='0' && b.length()==0){
                largestSingle = largestSingle==null?c:largestSingle;
                break;
            }
            if(largestSingle==null && count%2==1){
                largestSingle = c;
            }

            int k = count/2;
            while(k-- > 0){
                b.append(c);
            }
        }

        StringBuilder res =  new StringBuilder();
        res.append(b);
        if(largestSingle!=null){
            res.append(largestSingle);
        }

        res.append(b.reverse());

        return res.toString();
    }
}
