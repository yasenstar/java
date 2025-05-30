// package Java_Prog_Basic.05_Array_String.5.4_Multi-Dim-Array;
// filename: App5_4.java

public class App5_4 {
    public static void main(String[] args) {
        int i, j;
        int level = 15;
        int[][] iaYong = new int[level][];
        System.out.println("杨辉三角形");

        for(i=0; i<iaYong.length; i++) {
            iaYong[i] = new int[i+1];
        }

        iaYong[0][0] = 1;

        for(i=1;i<iaYong.length;i++) {
            iaYong[i][0] = 1;
            for(j=1;j<iaYong[i].length-1;j++) {
                iaYong[i][j] = iaYong[i-1][j-1] + iaYong[i-1][j];
            }
            iaYong[i][iaYong[i].length-1] = 1;
        }

        for(int[] row:iaYong) {
            for(int col:row) {
                System.out.print(col + "   ");
            }
            System.out.println();
        }
    }
}
