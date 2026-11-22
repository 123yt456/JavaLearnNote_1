package polymorphism_abstract_demo.a3abstract_interface;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小青蛙", 2);
        Dog g = new Dog("小狗", 3);
        Sheep s = new Sheep("小羊", 1);

        System.out.println(f.getName() + " " + f.getAge());
        f.eat();
        f.drink();
        f.swim();

        System.out.println(g.getName() + " " + g.getAge());
        g.eat();
        g.swim();

        System.out.println(s.getName() + " " + s.getAge());
        s.eat();
    }
}
