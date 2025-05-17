// package Java_Prog_Basic.07_Class-Characteristics.7.2_Class-Members;

class Cylinder {
    private double radius;
    private double height;
    private double pi = 3.14;

    public void setCylinder(double r, double h) {
        if (r > 0 && h > 0) {
            radius = r;
            height = h;
        }
        else {
            System.out.println("对不起，您的数据有错误，输入不能为负数!!");
        }
    }

    double area() {
        return pi * radius * radius;
    }

    double volume() {
        return area() * height;
    }
}

public class App7_2 {
    public static void main(String[] args) {
        Cylinder volu;
        volu = new Cylinder();
        volu.setCylinder(2.5, 5.5);;
        System.out.println("底面积 = " + volu.area());
        System.out.println("圆柱体体积 = " + volu.volume());
    }
}
