// package Java_Prog_Basic.06_Class-and-Object.6.3_Object-Usage;

class Cylinder {
    double radius;
    double height = 5.0;
    double pi = 3.14;
    void area() {
        System.out.println("底面积 = " + pi * radius * radius);
    }
    double volumn() {
        return (pi*radius*radius)*height;
    }
}

public class App6_2 {
    public static void main(String[] args) {
        Cylinder volu1, volu2;
        volu1 = new Cylinder();
        volu2 = new Cylinder();

        volu1.radius = volu2.radius = 2.5;
        System.out.println("圆柱1的底圆半径 = " + volu1.radius);
        System.out.println("圆柱2的底圆半径 = " + volu2.radius);

        // volu.radius = 2.0;
        // volu.height = 7.0;
        // System.out.println("圆柱的高 = " + volu.height);
        // volu.area();
        // System.out.println("圆柱体的体积 =" + volu.volumn());
    }
}
