import java.io.*;
public class App3_5 {
    public static void main(String[] args) throws IOException {
        String str1, str2, str3;
        int num1, num2, num3;
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please input 1st integer: ");
        str1 = buf.readLine();
        num1 = Integer.parseInt(str1);
        System.out.println("The first integer is: " + num1);

        System.out.print("Please input 2nd integer: ");
        str2 = buf.readLine();
        num2 = Integer.parseInt(str2);
        System.out.println("The 2nd integer is: " + num2);

        System.out.print("Please input 3rd integer: ");
        str3 = buf.readLine();
        num3 = Integer.parseInt(str3);
        System.out.println("The thrid integer is: " + num3);

        System.out.println(num1 + "*" + num2 + "*" + num3 + " = " + num1*num2*num3);
    }
}
