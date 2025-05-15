// package Java_Prog_Basic.06_Class-and-Object.6.4_Arguments;

class Cylinder {
    double radius, height, pi = 3.14;
    void setCylinder(double r, double h) {
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

public class App6_4 {
    public static void main(String[] args) {
        Cylinder volu = new Cylinder();
        volu.setCylinder(2.5, 5.0);
        System.out.println("底圆半径 = " + volu.radius);
        System.out.println("圆柱的高 = " + volu.height);
        System.out.println("底面积 = " + volu.area());
        System.out.println("体积 = " + volu.volume());
    }
}
