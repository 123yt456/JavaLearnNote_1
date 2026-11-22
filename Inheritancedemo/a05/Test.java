package Inheritancedemo.a05;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("天田", 14);
        Dog d = new Dog(2, "灰白色");
        Cat c = new Cat(1, "橙色");

        p.keepPet(d, "骨头");
        p.keepPet(c, "🐟");

        //如果同时使用两个包中的同名类，需要用全类名
        Inheritancedemo.a02.Dog d2 = new Inheritancedemo.a02.Dog();
        d2.eat();
        d2.drink();

        Inheritancedemo.a01.Dog d3 = new Inheritancedemo.a01.Dog();
        d3.guardHouse();
        d3.eat();
    }
}
