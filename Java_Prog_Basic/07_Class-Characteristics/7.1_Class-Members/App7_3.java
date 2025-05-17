// package Java_Prog_Basic.07_Class-Characteristics.7.1_Class-Members;

class Cylinder {
    private double radius;
    private double height;
    private double pi = 3.14;
    private String color;

    public double setCylinder(double r, double h) {
        radius = r;
        height = h;
        return r + h;
    }

    public void setCylinder(double a) {
        System.out.println("another method: " + a);
    }

    public void setCylinder(String c) {
        color = c;
    }

    public String show() {
        return color;
    }

}

public class App7_3 {
    public static void main(String[] args) {
        double r_h;
        Cylinder volu;
        volu = new Cylinder();
        r_h = volu.setCylinder(2.5, 5.0);
        System.out.println("圆柱体的半径与高的和 = " + r_h);
        volu.setCylinder(3.5);
        volu.setCylinder("红色");
        System.out.println("圆柱体的颜色是：" + volu.show());
    }
}
