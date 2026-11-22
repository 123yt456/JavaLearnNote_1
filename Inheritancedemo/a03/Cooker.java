package Inheritancedemo.a03;

public class Cooker extends Employee{
    public Cooker() {
    }

    public Cooker(String id, String name, float salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("厨师正在炒菜");
    }
}
