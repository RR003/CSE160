package week2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say something: ");

        String identifier = scanner.nextLine();

        Pattern p = Pattern.compile("^([a-zA-Z_$][a-zA-Z\\d_$]*)$");
        Matcher m = p.matcher(identifier);

        if (m.matches()) System.out.println("this is a valid identifier");
        else System.out.println("this is not a valid identifier");

    }
}
