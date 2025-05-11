// package Java_Prog_Basic.05_Array_String.5.2_One-Dim-Array;

public class App5_3_1 {
    public static void main(String[] args) {
        final int N = 13, S = 3, M = 5;
        int i = S-1, k = N, g = 1;
        int[] a = new int[N];
        for (int j=0; j<N; j++)
            a[j] = j+1;
        System.out.println("\n出圈的顺序是: ");
        do {
            i = i + (M - 1);
            while (i >= k)
                i = i - k;
            System.out.print(a[i] + "-->");
            for (int j=i; j<k-1; j++)
                a[j] = a[j+1];
            k--;
            g++;
        } while(g<=N);
        System.out.println("end.");
    }
}
