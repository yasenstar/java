import java.io.*;

public class App3_4 {
    public static void main(String[] args) throws IOException {
        String str;
        float num;
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input one real number: ");
        str = buf.readLine();
        num = Float.parseFloat(str);
        System.out.println("What you input the number is :" + num);
    }
}
