// package Java_Prog_Basic.07_Class-Characteristics.7.5_Using-Object;

class Cylinder {
    private static double pi = 3.14;
    private double radius, height;

    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    public void compare(Cylinder volu) {
        if(this==volu) {
            System.out.println("这两个对象相等");
        }
        else {
            System.out.println("这两个对象不相等");
        }
    }
}

public class App7_11 {
    public static void main(String[] args) {
        Cylinder volu1 = new Cylinder(1.0, 2.0);
        Cylinder volu2 = new Cylinder(1.0, 2.0);
        Cylinder volu3 = volu1;

        volu1.compare(volu2);
        volu1.compare(volu3);
        volu2.compare(volu3);
    }
}
