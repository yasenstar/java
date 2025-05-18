// package Java_Prog_Basic.07_Class-Characteristics.7.3_Constructor-Method;

class Cylinder {
    static int num = 0;
    private static double pi = 3.14;

    private double radius, height;

    static {
        num = 100;
        System.out.println("静态初始化器被调用了, num的初始值 = " + num);
    }

    static {
                System.out.println("静态初始化器再次被调用");
    }

    public Cylinder(double r, double h) {
        radius = r;
        height = h;
        num++;
    }

    public static void count() {
        System.out.println("创建了" + num + "个对象。");
    }

    void area() {
        System.out.println("底面积 = " + pi * radius * radius);
    }

    void volume() {
        System.out.println("体积 = " + pi * radius * radius * height);
    }

}

public class App7_9 {
    public static void main(String[] args) {
        Cylinder.count();
        Cylinder volu1 = new Cylinder(2.5, 5.5);
        volu1.count();
        volu1.area();
        volu1.volume();
        Cylinder volu2 = new Cylinder(3.2, 8.5);
        volu2.count();
        volu2.area();
        volu1.volume();       
        Cylinder volu3 = new Cylinder(3.2, 8.5);
        volu3.count();
        System.out.println("Number = " + Cylinder.num);
        System.out.println("Number = " + volu2.num);
        Cylinder.count();
    }
}
