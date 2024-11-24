import java.util.*;

public class App4_1 {
    public static void main(String[] args) {
        // Get 3 integer numbers from keyboard
        int a, b, c;
        Scanner reader = new Scanner(System.in);
        System.out.println("Input 1st integer: ");
        a = reader.nextInt();
        System.out.println("Input 2nd integer: ");
        b = reader.nextInt();
        System.out.println("Input 3rd integer: ");
        c = reader.nextInt();
        System.out.println("You have input a, b, c are " + a + ", " + b + ", " + c);

        // find max and min
        int max, min;

            // method 1
            if (a >= b)
                max = a;
            else
                max = b;
            if (c >= max)
                max = c;
            System.out.println("Max = " + max);

            // mehtod 2
            min = a<b ? a : b;
            min = c<min ? c : min;
            System.out.println("Min = " + min);
    }    
}
