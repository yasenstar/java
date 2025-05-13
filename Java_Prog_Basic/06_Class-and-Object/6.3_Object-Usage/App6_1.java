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

public class App6_1 {
    public static void main(String[] args) {
        Cylinder volu;
        volu = new Cylinder();
        volu.radius = 2.0;
        volu.height = 7.0;
        System.out.println("底圆半径 = " + volu.radius);
        System.out.println("圆柱的高 = " + volu.height);
        volu.area();
        System.out.println("圆柱体的体积 =" + volu.volumn());
    }
}
