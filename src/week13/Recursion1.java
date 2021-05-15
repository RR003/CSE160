package week13;

public class Recursion1 {
    public static long factorial(int n) {
        if (n == 0) return 1;
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static double calculateSeries(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        else return (1.0 / n) + calculateSeries(n - 1);
    }

    public static int sumDigits(long n) {
        String string = String.valueOf(n);
        if (string.length() == 1) return Integer.parseInt(string);
        else return Integer.parseInt(string.substring(0, 1))
                + sumDigits(Integer.parseInt(string.substring(1, string.length())));
    }



    public static void main(String[] args) {
        System.out.println(factorial(6));
        System.out.println(calculateSeries(3));
        System.out.println(sumDigits(345));
    }
}
