package week13;

public class Recursion2 {
    public static String dec2Bin(int value) {
        String result = "";
        if (value == 0) return "0";
        else if (value == 1) return "1";
        else {
            int temp = value % 2;
            return  dec2Bin(value / 2) + String.valueOf(temp);
        }
    }

    public static int count(char[ ] chars, char ch){
        return count(chars, ch, chars.length - 1);
    }

    public static int count(char[ ] chars, char ch, int high){
        if (high < 0) return 0;
        else if (chars[high] == ch) return 1 + count(chars, ch, high - 1);
        else return count(chars, ch, high - 1);
    }



    public static void main(String[] args) {
        System.out.println(dec2Bin(432));
        String string = "good luck on finals";
        char[] chars = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            chars[i] = string.charAt(i);
        }

        System.out.println(count(chars, 'o'));

    }
}
