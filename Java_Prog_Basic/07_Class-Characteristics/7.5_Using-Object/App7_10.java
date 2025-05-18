// package Java_Prog_Basic.07_Class-Characteristics.7.5_Using-Object;

class Cylinder {
    private static double pi = 3.14;
    private double radius, height;

    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    public void setCylinder(double r, double h) {
        radius = r;
        height = h;
    }

    void volume() {
        System.out.println("圆柱体的体积 = " + pi * radius * radius * height);
    }
}

public class App7_10 {
    public static void main(String[] args) {
        Cylinder volu1, volu2;
        volu1 = new Cylinder(2.5, 5.0);
        volu1.volume();
        volu2 = volu1;
        volu2.setCylinder(1.0, 2.0);
        volu2.volume();
        volu1.volume();
        System.out.println(volu2 == volu1);
    }
}
