package javabasic.ch01;
import java.io.*;

public class App1_1 {
    public static void main(String[] args) {
        char c = '';
        System.out.print("Please input a char ");
        try {
            c = (char)System.in.read();
        }
        catch(IOException s) {}
        System.out.println("What you've input: "+ c);
        // System.out.println("Hello World\n");
    }
}
