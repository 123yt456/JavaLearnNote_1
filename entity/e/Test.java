package entity.e;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("若叶睦",12123, 20000, 3000);
        Coder c = new Coder("丰川祥子", 12125, 4500);

        m.work();
        c.work();

    }
}
