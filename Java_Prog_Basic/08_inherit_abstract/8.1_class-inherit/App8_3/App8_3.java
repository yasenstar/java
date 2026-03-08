class Person {
    protected String name = "张三";
    protected int age;
    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    protected void show() {
        System.out.println("姓名：" + name + " 年龄：" + age);
    }
}

class Student extends Person {
    private String department;
    // int age = 28;
    public Student() {}
    public Student(String xn, int a, String dep) {
        name = xn;
        super.age = a;
        department = dep;
        System.out.println("子类Student的成员变量 age = " + age);
        super.show();
        System.out.println("系别：" + department);
    }
}

class Teacher {
    private String department;
    int age;
    private String name;
    public Teacher() {}
    public Teacher(String xn, int a, String dep) {
        name = xn;
        age = a;
        department = dep;
        System.out.println("子类Teacher的成员变量 age = " + age + ", 姓名：" + name);
    }
}

public class App8_3 {
    public static void main(String[] args) {
        // Person per = new Person();
        Student stu = new Student("李四", 20, "计算机系");
        // Teacher tea1 = new Teacher("老师", 50, "计算机系");
        // Teacher tea2 = new Teacher(per.name, 50, "计算机系");
        // System.out.println("人的默认姓名是：" + per.name);
    }
}
