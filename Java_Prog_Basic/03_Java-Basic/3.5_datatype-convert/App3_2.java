// package Java_Prog_Basic.03_Java-Basic.3.5_datatype-convert;

public class App3_2 {
    public static void main(String[] args) {
        int a = 155;        
        int b = 9;
        float g, h;
        System.out.println("a = " + a +" b = " + b);
        g = a/b;
        System.out.println("a / b = " + g + "\n");
        System.out.println("a = " + a +" b = " + b);
        h = (float) a/b;
        System.out.println("a / b = " + h + "\n");
        System.out.println("(int) h = " + (int) h);
    }
}
