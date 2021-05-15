package week10;

public class Account {
    private String name;

    private double balance;

    public Account(String name, double balance) {

        this.name = name;

        this.balance = balance;

    }
    public String toString() {

        return name + ", " + balance;

    }

    public boolean equals(Object other) {

        Account otherAccount = (Account) other;

        return (this.balance == otherAccount.balance) &&

                this.name.equals(otherAccount.name);

    }
    public static void main(String[] args) {

        Account acct1 = new Account("Armani Smith",1500);

        System.out.println(acct1);

        // Uncomment this code to week14.test week10.SavingsAccount

        /*

        week10.SavingsAccount acct2 = new week10.SavingsAccount("Dakota Jones",1500,4.5);

        week10.SavingsAccount acct3 = new week10.SavingsAccount("Dakota Jones",1500,4.5);

                System.out.println(acct2);

                System.out.println(acct2.equals(acct3));

        */

    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }

    public String toString() {
        return super.toString() + " interest rate: " + interestRate;
    }

    public boolean equals(Object o) {
        SavingsAccount account = (SavingsAccount) o;
        return (super.equals(o) && this.interestRate == account.interestRate);
    }
}
