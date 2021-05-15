package week9;

import week9.OurInteger;

public class OurIntegerTest {
    public static void main(String[] args) {
        OurInteger integer = new OurInteger(8);
        System.out.println(integer.getValue());
        System.out.println(integer.isEven());
        System.out.println(integer.isOdd());
        System.out.println(integer.isOdd(5));
        System.out.println(integer.isPrime());
        System.out.println(integer.isPrime(5));
        System.out.println(integer.equals(4));
        System.out.println(OurInteger.parseInt("7"));
    }
}
