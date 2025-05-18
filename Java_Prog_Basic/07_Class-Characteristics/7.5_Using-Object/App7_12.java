// package Java_Prog_Basic.07_Class-Characteristics.7.5_Using-Object;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person compare(Person p) {
        if(this.age > p.age) {
            return this;
        }
        else {
            return p;
        }
    }

    public String compare1(Person p) {
        if(this.age > p.age) {
            return this.name;
        }
        else {
            return p.name;
        }
    }

}

public class App7_12 {
    public static void main(String[] args) {
        Person per1, per2, per3;
        String n;
        per1 = new Person("张三", 20);
        per2 = new Person("王五", 22);

        // Method 1: general approach, need both "name" and "age" be public
        // if (per1.age > per2.age) {
        //     System.out.println(per1.name + "年龄大。");
        // }
        // else {
        //     System.out.println(per2.name + "年龄大。");
        // }

        // Method 2
        per3 = (per1.compare(per2));

        if (per3 == per1) {
            System.out.println("张三年龄大");
        }
        else {
            System.out.println("李四年龄大");
        }

        // Method 3
        n = (per1.compare1(per2));
        System.out.println(n + "年龄大");

    }
}
