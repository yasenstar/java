// package Java_Prog_Basic.04_flow-control.4.4_looping.4.4.2_do-while-loop;
// filename: App4_9.java

import java.io.*;

public class App4_9 {
    public static void main(String[] args) throws IOException {
        int m, n, r;
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入两个正整数：");
        m = Integer.parseInt(buf.readLine());
        n = Integer.parseInt(buf.readLine());
        System.out.println("你输入的两个数是：" + m + "和" + n);
        do {
            if (m<n) {
                r = m;
                m = n;
                n = r;
            }
            r = m % n;
            m = n;
            n = r;
        } while (r!=0);
        System.out.println("最大公约数gcd是：" + m);
    }
}
