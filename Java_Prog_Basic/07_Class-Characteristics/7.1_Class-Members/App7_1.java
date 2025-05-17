// package Java_Prog_Basic.07_Class-Characteristics.7.1_Class-Members;

class Cylinder {
    private double radius = 2.8;
    double height;
    double pi = 3.14;

    double area() {
        return pi * radius * radius;
    }

    double volume() {
        return area() * height;
    }
}

public class App7_1 {
    public static void main(String[] args) {
        Cylinder volu;
        volu = new Cylinder();
        // volu.radius = 2.8;
        volu.height = -7.0;
        // System.out.println("底圆半径 = " + volu.radius);
        System.out.println("底面积 = " + volu.area());
        System.out.println("圆柱体体积 = " + volu.volume());
    }
}
