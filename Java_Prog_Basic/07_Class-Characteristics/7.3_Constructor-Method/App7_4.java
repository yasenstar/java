// package Java_Prog_Basic.07_Class-Characteristics.7.2_Method-Overloading;

class Cylinder {
    private double radius, height, pi = 3.14;

    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    double area() {
        return pi * radius * radius;
    }

    double volume() {
        return area() * height;
    }
}

public class App7_4 {
    public static void main(String[] args) {
        Cylinder volu = new Cylinder(3.5, 8);
        System.out.println("圆柱底面积 = " + volu.area());
        System.out.println("圆柱的体积 = " + volu.volume());
    }
}
