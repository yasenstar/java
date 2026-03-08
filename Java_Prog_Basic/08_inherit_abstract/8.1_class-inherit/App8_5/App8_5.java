class Person {
    protected String name;
    protected int age;
    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    protected void show() {
        System.out.println("姓名：" + name + "，年龄：" + age);
    }
}

class Student extends Person {
    private String department;
    public Student() {}
    public Student(String name, int age, String dep) {
        super(name, age);
        department = dep;
    }
    protected void show() {
        System.out.println("系别：" + department);
    }
    public void subShow() {
        System.out.println("我在子类里面");
    }
}

public class App8_5 {
    public static void main(String[] args) {
        Person per = new Student("张三",24,"电子");
        per.show();
    //     per.subShow();
    }
}
