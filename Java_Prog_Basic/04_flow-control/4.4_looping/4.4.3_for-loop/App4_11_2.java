// package Java_Prog_Basic.04_flow-control.4.4_looping.4.4.3_for-loop;
// filename: App4_11_2.java

import java.util.*;

public class App4_11_2 {
    public static void main(String[] args) {
        int i, n, sum = 0;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.print("请输入正整数: ");
            n = reader.nextInt();
        } while (n<=0);
        System.out.print("Sum = ");
        if (n<=10) {            
            for (i=1; i<n; i++) {
                sum += i;
                System.out.print(i + " + ");
            }
            sum += i;
            System.out.println(i + " = " + sum);
        }
        else {
            for (i=1; i<n; i++) {
                sum += i;
            }
            sum += i;
            System.out.println("1 + 2 + ... + " + n + " = " + sum);
        }
    }
}
