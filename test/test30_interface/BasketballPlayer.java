package test.test30_interface;

public class BasketballPlayer extends Athlete{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员正在学习");
    }
}
