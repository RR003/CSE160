package hw1;// Rahul Raja
// 113126572
// rahul.raja@stonybrook.edu

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input change amount");
        int amount = scanner.nextInt();
        int change, fiftyK, tenK, fiveK, oneK, fiveH, oneH, fifty, ten;

        fiftyK = amount / 50000;
        change = amount % 50000;

        tenK = change / 10000;
        change = change % 10000;

        fiveK = change / 5000;
        change = change % 5000;

        oneK = change / 1000;
        change = change % 1000;

        fiveH = change / 500;
        change = change % 500;

        oneH = change / 100;
        change = change % 100;

        fifty = change / 50;
        change = change % 50;

        ten = change / 10;

        System.out.println(fiftyK + " 50,000 KRW notes");
        System.out.println(tenK + " 10,000 KRW notes");
        System.out.println(fiveK + " 5,000 KRW notes");
        System.out.println(oneK + " 1,000 KRW notes");
        System.out.println(fiveH + " 500 KRW notes");
        System.out.println(oneH + " 100 KRW notes");
        System.out.println(fifty + " 50 KRW notes");
        System.out.println(ten + " 10 KRW notes");
    }
}
