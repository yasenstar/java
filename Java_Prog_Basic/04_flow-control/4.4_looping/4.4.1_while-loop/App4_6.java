// package Java_Prog_Basic.04_flow-control.4.4_looping.4.4.1_while-loop;
import java.util.*;
public class App4_6 {
    public static void main(String[] args) {
        int num;
        Scanner reader = new Scanner(System.in);
        System.out.print("请输入一个正整数或0：");
        num = reader.nextInt();

        int a=0, b=1, n;
        while (b<num) {
            n = a + b;
            a = b;
            b = n;
        }

        if (num == 0) System.out.println(num + "是斐波那契数列中的数");
        else {
            if (num == b) System.out.println(num + "是斐波那契数列中的数");
            else System.out.println(num + "不是斐波那契数列中的数");
        }
    }
}
