class Person {
    private String name = "李四";
    private int age = 22;
    public Person() {
        System.out.println("调用了Person类的无参构造方法");
    }
    public Person(String name, int age) {
        System.out.println("调用了Person类的有参构造方法");
        this.name = name;
        this.age = age;
    }
    public void show() {
        System.out.println("姓名：" + name + " 年龄：" + age);
    }
}

class Student extends Person {
    private String department;
    public Student() {
        System.out.println("调用了学生类的无参构造方法Student()");
    }
    public Student(String name, int age, String dep) {
        super(name, age);
        this.department = dep;
        System.out.println("调用了学生类的有参构造方法");
        System.out.println("我是" + department + "的学生");
        System.out.println("姓名：" + name + " 年龄：" + age);
    }
}

public class App8_2 {
    public static void main(String[] args) {
        Person per1 = new Person();
        Person per2 = new Person("张三", 25);
        per1.show();
        per2.show();
        Student stu1 = new Student();
        Student stu2 = new Student("王五", 28, "信息系");
    }
}
