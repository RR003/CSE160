package week14;

import java.io.FileNotFoundException;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws Exception {
        /*File file = new File("/Users/rahul/IdeaProjects/CSE160/src/week14.test.txt");
        PrintWriter writer = new PrintWriter(file);
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 7; j++) {
                writer.print((int)(Math.random() * 15));
                writer.print(" ");
            }
            writer.println();
        }
        writer.close();*/
        SuperClass obj = new SubClass();
        obj.method();
    }
}

interface A {
    void go();
}
class B {
    public void go() {
        System.out.println("GO");
    }
}
class C extends B implements A {}

class SuperClass {
    void method() throws IOException {
        System.out.println("superClass method");
    }
}
class SubClass extends SuperClass{
    void method() throws FileNotFoundException {
        System.out.println("subclass method");
    }
}





