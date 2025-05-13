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

        volu2.pi = 3;
        System.out.println("圆柱1的pi值 = " + volu1.pi);
        System.out.println("圆柱2的pi值 = " + volu2.pi);

        volu1.height = 7.0;
        volu1.area();
        volu2.area();

        volu2.height = 10.0;
        System.out.println("圆柱1的高 = " + volu1.height);
        System.out.println("圆柱体1的体积 =" + volu1.volumn());
        System.out.println("圆柱2的高 = " + volu2.height);
        System.out.println("圆柱体2的体积 =" + volu2.volumn());
    }
}
