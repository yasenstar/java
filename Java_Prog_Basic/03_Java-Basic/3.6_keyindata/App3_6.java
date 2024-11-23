import java.util.*;

public class App3_6 {
    public static void main(String[] args) {
        int num1;
        double num2;
        Scanner reader;
        reader = new Scanner(System.in);
        System.out.print("Please input first number(integer): ");
        num1 = reader.nextInt();
        System.out.print("Please input second number(double): ");
        num2 = reader.nextDouble();
        System.out.println(num1 + "*" + num2 + " = " + num1*num2);
    }
}
