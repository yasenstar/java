// package Java_Prog_Basic.06_Class-and-Object.6.4_Arguments;

class Trans {
    int temp;
    int[][] transpose(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array[i].length; j++) {
                temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        return array;
    }
}

public class App6_6 {
    public static void main(String[] args) {
        int[][] a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] b = new int[3][3];
        Trans pose = new Trans();
        b = pose.transpose(a);
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "    ");
            }
            System.out.print("\n");
        }
    }
}
