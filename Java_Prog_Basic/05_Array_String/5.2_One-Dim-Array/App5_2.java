// package Java_Prog_Basic.05_Array_String.5.2_One-Dim-Array;

public class App5_2 {
    public static void main(String[] args) {
        int[] a = {8,50,20,7,81,55,76,93,42,72};
        // int[] a = {1,2,3,4,5,6,7};
        // int[] a = {7,6,5,4,3,2,1};
        int max1, max2, i;
        max1 = a[0];
        max2 = a[1];
        System.out.println("数组a中的元素为：");
        for (i=0; i<a.length; i++)
            System.out.print(a[i] + "\t");
        System.out.println();
        for (i=2; i<a.length; i++) {
            if (a[i]>max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i]>max2) {
                max2 = a[i];
            }
        }
        System.out.println("数组a中的最大值为：" + max1 + ", 第二大值为：" + max2);
    }
}
