// package Java_Prog_Basic.05_Array_String.5.5_String;

public class App5_6 {
    public static void main(String[] args) {
        String str;
        str = new String("rotor");

        int i = 0, n;
        boolean yn = true;

        if(args.length > 0) {
            str = args[0];
        }

        n = str.length();
        char sChar, eChar;

        System.out.println("str = " + str + ", length = " + n);

        // Method 1
        while (yn && (i<n/2)) {
            sChar = str.charAt(i);
            eChar = str.charAt(n-i-1);
            System.out.println("sChar = " + sChar + ", eChar = " + eChar);
            if(sChar == eChar) {
                i++;
            }
            else {
                yn = false;
            }
        }
        System.out.println("Method 1: " + yn);

        // Method 2
        String temp = "", sub1 = "";
        for(i = 0; i<n; i++) {
            sub1 = str.substring(i, i+1);
            temp = sub1 + temp;
            System.out.println("sub1 = " + sub1 + ", temp = " + temp);
        }
        System.out.println("Method 2: " + str.equals(temp));
    }
}
