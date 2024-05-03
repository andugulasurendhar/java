package examples;

public class TitleToNum {
    public static void main(String[] args) {
        System.out.println(titleToNumber("FXSHRXW"));
    }

    public static int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int sum = 0, i = 0 ;

        while(i < len){
            char a = columnTitle.charAt(i);
            sum = sum*26;
            sum += (a-'@');
            i++;

        }

        return sum;
    }
}
