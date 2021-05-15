package week10;

import week10.Account;
import week10.SavingsAccount;

public class AccountTest {
    public static void main(String[] args) {
        Account acct1 = new Account("Armani Smith",1500);

        System.out.println(acct1);

        // Uncomment this code to week14.test week10.SavingsAccount



        SavingsAccount acct2 = new SavingsAccount("Dakota Jones",1500,4.5);

        SavingsAccount acct3 = new SavingsAccount("Dakota Jones",1500,4.5);

                System.out.println(acct2);

                System.out.println(acct2.equals(acct3));


    }
}
