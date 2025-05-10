// package Java_Prog_Basic.04_flow-control.4.4_looping.4.4.2_do-while-loop;
// filename: App4_10.java

import java.util.*;

public class App4_10 {
    public static void main(String[] args) {
        int n=1, s=1, m;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.print("请输入一个大于1的整数m：");
            m = reader.nextInt();
        } while (m<=1);
        do {
            n++;
            s = s*n;
        } while (s<=m);
        System.out.println("满足s<m时的最大s是：" + s/n + "，此时n是：" + (n-1));        
    }
}
