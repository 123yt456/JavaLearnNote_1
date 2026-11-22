package entity.c;

public class TestPhone {
    public static void main(String[] args) {
        Phone p = new Phone("小米", 3999, "白色");
        p.call();
        p.sendMessage();
    }
}
