package week14;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(findLargest(new int[]{3,4,5,6,2,1}, 0));
    }
    public static int sumDigits(long n) {
        String string = String.valueOf(n);
        if (string.length() < 2) return Integer.parseInt(string.substring(0, string.length()));
        else return Integer.parseInt(string.substring(0,1)) + sumDigits(Long.parseLong(string.substring(1,string.length())));
    }
    public static void reverseDisplay(int value) {
        String string = String.valueOf(value);
        if (string.length() == 1) System.out.print(string);
        else {
            System.out.print(string.substring(string.length() - 1));
            reverseDisplay(Integer.parseInt(string.substring(0, string.length() - 1)));
        }
    }

    public static int max(int a, int b){
        if (a > b) {
            return a; }
        else {
            return b;
        }
    }
    public static int findLargest (int [] list, int currentIndex) {
        if (currentIndex == list.length - 1) return list[currentIndex];
        return Math.max(list[currentIndex], findLargest(list, currentIndex + 1));
    }

}
