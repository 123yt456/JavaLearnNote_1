package polymorphism_abstract_demo.a3abstract_interface;

public class Rabbit extends Animal{
    @Override
    public void eat() {
        System.out.println("兔子在吃胡萝卜");
    }

    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }
}
