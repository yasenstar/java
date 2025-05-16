// package Java_Prog_Basic.06_Class-and-Object.6.4_Arguments;

class LeastNumber {
    public void least(int[] array) {
        int temp = array[0];
        for(int i=1;i<array.length;i++) {
            if (temp > array[i]) {
                temp = array[i];
            }
        }
        System.out.println("最小的数是：" + temp);
    }
}

public class App6_5 {
    public static void main(String[] args) {
        int[] a = {8, 3, 7, 88, 9, 2, 23};
        LeastNumber minNumber = new LeastNumber();
        minNumber.least(a);
    }
}
