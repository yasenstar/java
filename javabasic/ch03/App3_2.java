// package javabasic.ch03;

public class App3_2 {
    public static void main(String[] args) {
        int a = 155;
        int b = 9;
        float g, h;
        System.out.println("a = " + a + " b = " + b);
        g = a / b;
        System.out.println("a/b = " + g);
        System.out.println("a = " + a + " b = " + b);
        h = (float)a/b;
        System.out.println("a/b = " + h);
        System.out.println("a = " + a + " b = " + b);
        System.out.println("(int)h = " + (int)h);
        String myNumber = "1234.567";
        System.out.println("MyNumber is " + myNumber);
        float myFloat = Float.parseFloat(myNumber);
        System.out.println("myFloat is " + myFloat);
    }
}
