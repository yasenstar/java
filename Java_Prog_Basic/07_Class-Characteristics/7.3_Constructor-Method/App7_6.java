// package Java_Prog_Basic.07_Class-Characteristics.7.3_Constructor-Method;

class Cylinder {
    private double radius, height, pi = 3.14;
    String color;

    public Cylinder() {
        this(2.5, 5.5, "红色");
        System.out.println("无参数的构造方法被调用了");
    }

    public Cylinder(double r, double h, String c) {
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

}

public class App7_6 {
    public static void main(String[] args) {
        Cylinder volu = new Cylinder();
        volu.show();
    }
}
