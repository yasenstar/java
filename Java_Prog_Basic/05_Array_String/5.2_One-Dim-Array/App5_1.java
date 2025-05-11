// package Java_Prog_Basic.05_Array_String.5.2_One-Dim-Array;

public class App5_1 {
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];
        int i;
        for (i=0; i<n; i++)
            a[i] = i*i;
        for (i=0; i<n; i++)
            System.out.print("a[" + i + "] = " + a[i] + ",\t");
        System.out.print("数组a的地址是: " + a + ", 长度是: " + a.length);
        System.out.println("\n");
        for (i=n-1; i>=0; i--)
            System.out.print("a[" + i + "] = " + a[i] + ",\t");
        System.out.print("数组a的地址是: " + a + ", 长度是: " + a.length);
    }
}


// If call a[10] in line 13, get below error:
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
//         at App5_1.main(App5_1.java:14)