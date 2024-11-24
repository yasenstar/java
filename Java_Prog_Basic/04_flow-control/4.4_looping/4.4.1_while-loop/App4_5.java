// package Java_Prog_Basic.04_flow-control.4.4_looping.4.4.1_while-loop;
import java.util.*;
public class App4_5 {
   public static void main(String[] args) {
    int max;
    Scanner reader = new Scanner(System.in);
    System.out.print("请输入斐波那契数列的最大序列号：");
    max = reader.nextInt();
    int n1 = 0, n2 = 1, k = 1;
    while (k<=max) {
        System.out.print(" " + n1 + " " + n2);
        n1 = n1 + n2;
        n2 = n1 + n2;
        k = k + 2;
    }
    System.out.println();
   } 
}
