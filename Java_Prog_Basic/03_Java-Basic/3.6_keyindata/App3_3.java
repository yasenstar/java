import java.io.*;

public class App3_3 {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input a string: ");
        str = buf.readLine();
        System.out.println("What you input is: " + str);
    }
}
