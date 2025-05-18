// package Java_Prog_Basic.07_Class-Characteristics.7.5_Using-Object;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("姓名：" + name + ", 年龄：" + age);
    }

    public static int minAge(Person[] p) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < p.length; i++) {
            if (p[i].age<min) {
                min = p[i].age;
            }
        }
        return min;
    }
}

public class App7_14 {
    public static void main(String[] args) {
        Person[] per = new Person[4];
        per[0] = new Person("张三", 20);
        per[1] = new Person("李四", 19);
        per[2] = new Person("王五", 22);
        per[3] = new Person("赵六", 15);
        for (int i = 0; i < per.length; i++) {
            per[i].show();
        }
        System.out.println("最年轻的人的年龄是：" + Person.minAge(per));
    }
}
