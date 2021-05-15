package week14;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Final {
    public static void main(String[] args) throws Exception{
        Cards card = new Cards();
        card.sortCards(new String[]{"8H","10H","QD","JD","4S"});
        System.out.println(card.findMin("QD", "8H"));
    }
}

class YoungMcJava {
    public void tartan(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print(n + " ");
                }
                else System.out.print((n - 1) + " ");

            }
            System.out.println();
        }
    }

    public void tartanRecursion(int n) {
        helper(n, 0, 0);
    }
    public void helper(int n, int row, int column) {

        if ((row + column) % 2 == 0) System.out.print(n + " ");
        else System.out.print((n - 1) + " ");
        column++;
        if ((row + 1) * column != n*n) {
            if (column % n == 0) {
                System.out.println();
                row++;
                column = 0;
            }

            helper(n, row, column);
        }

    }
}

class IPAddress {
    private int intIP;

    public IPAddress() {}
    public IPAddress(int intIP) {
        this.intIP = intIP;
    }

    public int getIntIP() {
        return this.intIP;
    }
    public void setIntIP(int intIP){
        this.intIP = intIP;
    }

    public void setIP(byte[] bs) throws Exception {
        int total = 0;
        if (bs.length != 4) throw new Exception("not enough arguments");
        intIP = ((bs[0]*256+bs[1])*256+bs[2])*256+bs[3];
        System.out.println(intIP);
    }

    public byte[] extractIPaddressFromInt() {
        byte[] result = new byte[4];
        result[3] = (byte)(intIP % 256);
        int newval = intIP / 256;
        result[2] = (byte)(newval % 256);
        newval = newval / 256;
        result[1] = (byte) (newval % 256);
        newval = newval / 256;
        result[0] = (byte) (newval % 256);
        System.out.println(Arrays.toString(result));
        return result;
    }
}


class Person {
    private String name;
    private Calendar dob;

    public Person(String name, String dob) throws Exception{
        int[] result = checkDate(dob);
        this.name = name;
        this.dob = new GregorianCalendar(result[2],result[0], result[1]);
    }

    public int[] checkDate(String s) throws Exception{
        int[] result = new int[3];
        try {
            result[0] = Integer.parseInt(s.substring(0, 2));
            result[1] =  Integer.parseInt(s.substring(3,5));
            result[2] = Integer.parseInt(s.substring(6,10));
        }catch (Exception e){
            throw new Exception("date format invalid");
        }
        return result;
    }

    public String getName(){
        return name;
    }
    public Calendar getDate() {
        return dob;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDate(String date) throws Exception{
        int[] result = checkDate(date);
        this.dob = new GregorianCalendar(result[2],result[0], result[1]);
    }

    public String toString() {
        return "name= " + getName() + ", date= " + dob.get(Calendar.MONTH) + "/" + dob.get(Calendar.DAY_OF_MONTH) + "/" +
                dob.get(Calendar.YEAR);
    }

}

class Employee extends Person {

    private String salary;

    public Employee(String name, String dob, String salary) throws Exception {
        super(name, dob);
        this.salary = salary;
    }

    public String printSalary(String salary) {
        if (salary.length() < 4) return "$" + salary;
        else return printSalary(salary.substring(0,salary.length() - 3)) + "," + salary.substring(salary.length() - 3, salary.length());
    }

    public String toString() {
        return super.toString() + ", salary = " +  printSalary(salary);
    }
}

class Cards {
    public void sortCards(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            String word1 = array[i];
            for (int j = i + 1; j < array.length; j++) {
                System.out.print(word1 + " ");
                String word2 = array[j];
                int max = findMin(word1, word2);
                System.out.print(max + " ");
                if (max == 1) {
                    word1 = word2;
                    minIndex = j;
                }
            }
            System.out.println(word1);
            String temp = word1;
            array[minIndex] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public int findMin(String a, String b) {
        char aSuite,bSuite, aNum, bNum;
        if (a.length() == 3) {
            aSuite = a.charAt(2);
            aNum = ';';
        }else {
            aSuite = a.charAt(1);
            aNum = a.charAt(0);
            if (aNum == 'A') aNum = '1';
        }
        if (b.length() == 3) {
            bSuite = b.charAt(2);
            bNum = ';';
        }else {
            bSuite = b.charAt(1);
            bNum = b.charAt(0);
            if (bNum == 'A') bNum = '1';
        }






        if (aSuite == bSuite) {
            if (aNum <= bNum) return 0;
            else return 1;
        }else {
            if (aSuite < bSuite) return 0;
            else return 1;
        }
    }
}

class Hospital {
    
}

