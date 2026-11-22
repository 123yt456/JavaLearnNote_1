package Inheritancedemo.a03;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("kibo001", "日向", 12000, 100);
        Cooker c = new Cooker("kibo003", "狛枝", 28000);

        m.work();
        m.eat();
        System.out.println(m.getId() + "," + m.getName() + "," +
                m.getSalary() + "," + m.getManageReward()+"\n");

        c.work();
        c.eat();
        System.out.println(c.getId() + "," + c.getName() + "," + c.getSalary());
    }
}
