package week9;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Rahul", 18);
        Person student = new Student("Rahul", 18, 1);
        MyDate date = new MyDate(2020, 8, 24);
        Person employee = new Employee("Employee", 34, 75000, date);
        Person faculty = new Faculty("Faculty", 45, 80000, date, 2);
        Person staff = new Staff("Staff", 50, 85000, date, 4);

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);

    }
}
