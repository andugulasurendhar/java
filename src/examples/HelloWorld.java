package examples;

import javax.lang.model.type.ArrayType;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;




public class HelloWorld {

    public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices) {
        // Write your code here
        ArrayList<String> a = new ArrayList<>();
        for(int i=0; i<startIndices.size(); i++) {
            a.add(s.substring(startIndices.get(i) - 1, endIndices.get(i) - 1));
        }
        ArrayList<Integer> res= new ArrayList<>();

        for (String i : a){
            int count = 0;
            boolean first = i.charAt(0)=='|';
            boolean last = i.charAt(i.length()-1)=='|';

            String[] str = i.split("\\|");
            count+= first ?str[0].length():0;
            count+= last ?str[str.length-1].length():0;
            for(int k=1; k< str.length-1; k++){
                count+= str[k].length();
            }
            res.add(count);
        }

        return res;
    }

    public  static int removeDuplicates(int[] nums) {
        int index = 1;
        int prev = nums[0];
        int count=1;
        for(int i=1; i<nums.length; i++){
            if((prev == nums[i] && count <2)){
                prev = nums[i];
                count++;
                nums[index]= nums[i];
                index++;
            } else if((prev != nums[i])){
                prev = nums[i];
                count=1;
                nums[index]= nums[i];
                index++;
            }
        }
        return index;
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else hm.put(num, 1);
        }

        int n = nums.length/2;
        for(Integer a : hm.keySet() ){
            if(hm.get(a)>n){
                return a;
            }
        }

        return -1;
    }

    public boolean isValid(String s) {
        Stack<Character>  a= new Stack<>();
        for(char i : s.toCharArray()){
            if(i=='{' || i== '[' || i == '('){
                a.push(i);
            } else if((i == '}' && a.peek() == '{') || (i==')' && a.peek() == '(')|| (i==']' && a.peek() == '[') ){
                a.pop();
            }
        }

        return a.isEmpty();

    }
    public static void main(String[] args) throws IOException {

        String s = "**|****|**|*";

        List<Integer> startIndices = new ArrayList<>(Arrays.asList(1,2,1));
        List<Integer> endIndices = new ArrayList<>(Arrays.asList(6,9,12));
        List<Integer> result = numberOfItems(s, startIndices, endIndices);

        int[] a = new int[]{0,0,1,1,1,1,1,3,3,3};

        System.out.println(removeDuplicates(a));

        System.out.println(majorityElement(a));
    }
}
