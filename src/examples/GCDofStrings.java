package examples;



public  class GCDofStrings {

    public static void main(String[] args){
        String w1 = "cd";
        String w2 = "abef";

        System.out.println(gcdStr(w1,w2));
    }

    public static String gcdStr(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        char[] a = new char[word1.length()+word2.length()];
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}