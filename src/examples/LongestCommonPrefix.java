package examples;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String a = longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(a);
    }
        public static String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) return "";
            String prefix = strs[0];
            for (int i = 1; i < strs.length; i++){
                int a = strs[i].indexOf(prefix);
                while (  a != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    a = strs[i].indexOf(prefix);
                    if (prefix.isEmpty()) return "";
                }
            }
            return prefix;
        }
}
