package week9;

import java.util.Date;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private int age;
    private String emailAddress;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "name=" + name  +
                " , age=" + age;
    }

    public static void main(String[] args) {
        Person student1 = new Student("John Smith", 21, 1);
        Person employee1 = new Employee("Peter Smith", 25, 100000, new MyDate(2017,1,1));
        Person faculty1 = new Faculty("Paul Smith", 25, 100000, new MyDate(2017,1,1), 1);
        Person staff1 = new Staff("RonSmith", 25, 100000, new MyDate(2017,1,1), 1);
    }

}

class Student extends Person {
    private int status;
    public static final int freshman = 1;
    public static final int sophomore= 2;
    public static final int junior = 3;
    public static final int senior = 4;

    public Student() {
        status = freshman;
    }

    public Student(String name, int age, int status) {
        super(name, age);
        this.status = status;
    }



    public String toString() {
        return super.toString() + " status=" + status;
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }
    public boolean equals(Object o) {
        if (o instanceof MyDate) return ((MyDate)o).year == year &&
                ((MyDate)o).month == month &&
                ((MyDate)o).day ==day;
        return false;
    }

    public int getYear() {
        return year;
    }
}

class Employee extends Person {
    private double salary;
    private MyDate hireDate;
    public Employee(String name, int age, double salary, MyDate hire) {
        super(name, age);
        this.salary = salary;
        this.hireDate = hire;
    }

    public MyDate getHire() {
        return hireDate;
    }
    public String toString() {
        return super.toString() + " salary=" + salary + " DateHired=" + getHire();
    }
}

class Faculty extends Employee {
    String officeHours;
    int rank;

    public Faculty(String name, int age, double salary, MyDate hire, int rank) {
        super(name, age, salary, hire);
        this.rank = rank;
    }

    public int salaryRange() {
        Date now = new Date();
        int years = now.getYear() - getHire().getYear();
        if (rank*years < 10) return 1;
        if (rank * years < 20) return 2;
        return 3;
    }

    public String toString() {
        return super.toString() + " rank=" + rank + " salaryRange=" + salaryRange();
    }
}

class Staff extends Employee {
    private int title;

    public Staff(String name, int age, double salary, MyDate hire, int title) {
        super(name, age, salary, hire);
        this.title = title;
    }

    public String toString() {
        return super.toString() + " title=" + title;
    }
}
