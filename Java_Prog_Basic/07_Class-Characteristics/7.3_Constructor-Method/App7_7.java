// package Java_Prog_Basic.07_Class-Characteristics.7.3_Constructor-Method;

class Cylinder {
    private double radius, height, pi = 3.14;
    String color;

    private Cylinder() {
        System.out.println("无参数的构造方法被调用了");
    }

    public Cylinder(double r, double h, String c) {
        this();
        System.out.println("有参数的构造方法被调用了");
        radius = r;
        height = h;
        color = c;
    }

    public void show() {
        System.out.println("圆柱体的底面半径 = " + radius);
        System.out.println("圆柱体的高 = " + height);
        System.out.println("圆柱体的颜色 = " + color);
    }

    void area() {
        System.out.println("底面积 = " + pi * radius * radius);
    }

    void volume() {
        System.out.println("体积 = " + pi * radius * radius * height);
    }

}

public class App7_7 {
    public static void main(String[] args) {
        Cylinder volu = new Cylinder(2.5, 5.5, "蓝色");
        volu.show();
        volu.area();
        volu.volume();
        Cylinder volu1 = new Cylinder(3.2, 8.5, "黄色");
        volu1.show();
        volu1.volume();
    }
}
