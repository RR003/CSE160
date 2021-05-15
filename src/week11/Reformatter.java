package week11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Reformatter {
    public static void main(String[] args) throws FileNotFoundException {
        File textFile = new File(args[0]);
        String outputNew = "";

        Scanner fs = new Scanner(textFile);
        while (fs.hasNextLine()) {
            outputNew += fs.nextLine() + "\n";
        }
        fs.close();

        outputNew = outputNew.replaceAll("\\n\\s*\\{", "{");

        PrintWriter pw = new PrintWriter(textFile);
        pw.append(outputNew);
        pw.close();
    }
}
