// package Java_Prog_Basic.07_Class-Characteristics.7.3_Constructor-Method;

class Cylinder {
    private double radius, height, pi = 3.14;
    String color;

    public Cylinder() {
        radius = 1;
        height = 2;
        color = "绿色";
    }

    public Cylinder(double r, double h, String color) {
        radius = r;
        height = h;
        this.color = color;
    }

    public void setColor() {
        System.out.println("该圆柱体的颜色是：" + color);
    }

    double area() {
        return pi * radius * radius;
    }

    double volume() {
        return area() * height;
    }
}

public class App7_5 {
    public static void main(String[] args) {
        
        Cylinder volu1 = new Cylinder();
        System.out.println("圆柱体1的底面积 = " + volu1.area());
        System.out.println("圆柱体1的体积 = " + volu1.volume());
        volu1.setColor();
        
        Cylinder volu2 = new Cylinder(2.5, 8.0, "红色");
        System.out.println("圆柱体1的底面积 = " + volu2.area());
        System.out.println("圆柱体1的体积 = " + volu2.volume());
        volu2.setColor();
    }
}
