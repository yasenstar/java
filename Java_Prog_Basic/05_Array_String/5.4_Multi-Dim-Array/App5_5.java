// package Java_Prog_Basic.05_Array_String.5.4_Multi-Dim-Array;

public class App5_5 {
    public static void main(String[] args) {
        
        int i, j, k, sum = 0;

        int[][][] a = {
            {
                {1,2,2},
                {3,4,2}
            },
            {
                {1,2,2},
                {3,4,2}
            },
            {
                {5,6,4},
                {7,8,9}
            }
        };

        for(i=0; i<a.length; i++) {
            for(j=0; j<a[i].length; j++) {
                for(k=0; k<a[i][j].length; k++) {
                    System.out.println("a[" + i + "][" + j + "][" + k + "] = " + a[i][j][k]);
                    sum = sum + a[i][j][k];
                }
            }
        }

        System.out.println("Sum = " + sum);

    }
}
