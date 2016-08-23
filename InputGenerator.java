package ExampleClass3;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;

/*
 * Created with NetBeans IDE 7.3
 * Author: SuyashL
 * Date: Sep 22, 2015
 */
public class InputGenerator {
    public static void main(String[] args) {
        int i, size;

        FileOutputStream out;
        PrintStream p;

        Random rand = new Random();

        try {
            for (size = 2000; size <= 10000; size = size + 2000) {
                out = new FileOutputStream("/Users/SuyashL/NetBeansProjects/CZ2001_ExampleClasses/src/ExampleClass3/TestFiles/rand_num_" + size + ".txt");
                p = new PrintStream(out);

                for (int j = 1; j <= size; j++) {
                    i = rand.nextInt((size - 1) + 1) + 1;
                    p.println(i);
                }

                p.close();
            }

            for (size = 2000; size <= 10000; size = size + 2000) {
                out = new FileOutputStream("/Users/SuyashL/NetBeansProjects/CZ2001_ExampleClasses/src/ExampleClass3/TestFiles/ascending_" + size + ".txt");
                p = new PrintStream(out);

                for (int j = 1; j <= size; j++) {
                    p.println(j);
                }

                p.close();
            }

            for (size = 2000; size <= 10000; size = size + 2000) {
                out = new FileOutputStream("/Users/SuyashL/NetBeansProjects/CZ2001_ExampleClasses/src/ExampleClass3/TestFiles/descending_" + size + ".txt");
                p = new PrintStream(out);

                for (int j = size; j >= 1; j--) {
                    p.println(j);
                }

                p.close();
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
