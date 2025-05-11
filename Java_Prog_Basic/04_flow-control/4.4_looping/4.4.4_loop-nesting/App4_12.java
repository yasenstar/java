// package Java_Prog_Basic.04_flow-control.4.4_looping.4.4.4_loop-nesting;
// filename: App4_12.java

import java.util.*;

public class App4_12 {
    public static void main(String[] args) {
        int i, j, n, m=0;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.print("请输入正整数: ");
            n = reader.nextInt();
        } while (n<=0);
        System.out.println("2~" + n + "之间的素数有：");
        for (i=2; i<n; i++) {
            for (j=2; j<=Math.sqrt(i); j++)
                if (i%j==0) break;
            if (j>Math.sqrt(i)) {
                m++;
                System.out.print(i + "是素数, ");
            }
        }
        System.out.println("共有" + m + "个素数。");
    }
}
