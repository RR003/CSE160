package week8;

import java.util.Arrays;

public class ObjectOrientedThinking2 {
    public static int[] count(String s) {
        int[] result = new int[10];
        for (int i = 0; i < s.length(); i++) {
            if (isCharNumber(s.charAt(i))) result[Integer.valueOf(s.substring(i, i+ 1))]++;
        }
        return result;
    }

    public static boolean isCharNumber(char c){
        if (c >= '0' && c <= '9') return true;
        return false;
    }


    public static void main(String[] args) {
        String array = "1234fjksdg54jfg3rgof21";
        int[] result = count(array);
        System.out.println(Arrays.toString(result));
    }
}
