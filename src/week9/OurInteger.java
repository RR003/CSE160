package week9;

public class OurInteger {
    private int value;

    public OurInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isEven(OurInteger o) {
        return o.value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 == 1;
    }

    public static boolean isOdd(int value) {
        return value % 2 == 1;
    }

    public static boolean isOdd(OurInteger o) {
        return o.value % 2 == 1;
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i < x/2; i++) {
            if (x % i== 0) return false;
        }
        return true;
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isPrime(OurInteger o) {
        return isPrime(o.value);
    }

    public boolean equals(Object o) {
        if (o instanceof OurInteger) return ((OurInteger)o).value == value;
        return false;
    }

    public boolean equals(OurInteger o) {
        return o.value == value;
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public static int parseInt(String string) {
        int result = 0;
        for (int i = 0; i < string.length(); i++)  {
            result = result * 10 + (string.charAt(i) - '0');
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(parseInt("123"));
    }
}
