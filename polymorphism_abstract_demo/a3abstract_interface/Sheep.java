package polymorphism_abstract_demo.a3abstract_interface;

public class Sheep extends Animal{
    @Override
    public void eat() {
        System.out.println("羊在吃草");
    }

    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }
}
