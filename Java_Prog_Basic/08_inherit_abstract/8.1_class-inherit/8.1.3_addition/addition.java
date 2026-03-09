class Animal {
    public String name = "Animal: 动物";
    public static String staticName = "Animal: 可爱的动物";

    public void eat() {
        System.out.println("Animal: 吃饭");
    }

    public static void staticEat() {
        System.out.println("Animal: 动物在吃饭");
    }
}

class Cat extends Animal {
    public String name = "Cat: 猫";
    public String str = "Cat: 可爱的小猫";
    public static String staticName = "Cat: 我是喵星人";

    public void eat() {
        System.out.println("Cat: 吃饭");
    }

    public static void staticEat() {
        System.out.println("Cat: 小猫在吃饭");
    }

    public void eatMethod() {
        System.out.println("Cat: 小猫喜欢吃鱼");
    }
}

public class addition {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Cat cat = (Cat) animal;
        System.out.println(animal.name);
        System.out.println(animal.staticName);
        animal.eat();
        animal.staticEat();
        // System.out.println(cat.str);
        cat.eatMethod();
        cat.staticEat();
    }
}