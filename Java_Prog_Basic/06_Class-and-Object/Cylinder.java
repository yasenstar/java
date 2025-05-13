class Cylinder {
    double radius;
    double height;
    double pi = 3.14;
    double bottom_area() {
        System.out.println("圆柱体的底面积 = " + pi*radius*radius);
        return pi*radius*radius;
    }
    void volume() {
        System.out.println("圆柱体的体积 = " + (bottom_area()*height));
    }
}