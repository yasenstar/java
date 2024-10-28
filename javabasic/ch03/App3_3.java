// package javabasic.ch03;

import java.io.*;

public class App3_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf;
        String str;
        buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input string: ");
        str = buf.readLine();
        System.out.println("The String you input is: " + str);
    }
}
