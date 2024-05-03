package examples;
import java.util.*;
public class StringEncode {

    public static void main(String[] args) {
        System.out.print(compress(new char[]{'a','a','b','b','c','c','c'}));
    }

    public static int compress(char[] chars) {
        ArrayList<Character> a=  new ArrayList<>();
        char priv = chars[0];
        int count = 0;
        for(char c : chars){
            if(priv == c)
            {
                count += 1;
            } else{
                a.add(priv);
                a.add((char)count);
                count = 0;
                priv = c;
            }
        }

        return a.size();
    }
}
