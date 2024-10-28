// package javabasic.ch03;

import java.io.*;

public class App3_4 {
    public static void main(String[] args) throws IOException {
        float num;
        String str;
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input a float number: ");
        str = buf.readLine();
        num = Float.parseFloat(str);
        System.out.println("What you input is: " + num);
        buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input a float number: ");
        str = buf.readLine();
        num = Float.parseFloat(str);
        System.out.println("What you input is: " + num);
    }
}
