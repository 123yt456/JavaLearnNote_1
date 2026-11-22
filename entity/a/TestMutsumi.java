package entity.a;

public class TestMutsumi {
    public static void main(String[] args) {
        Mutsumi m = new Mutsumi();
        m.setName("若叶睦");
        m.setAge(16);

        Mutsumi m2 = new Mutsumi("若叶睦", 15);

        System.out.println(m2.getName());
        System.out.println(m2.getAge());

        m.getHobby();
        m.getSelf();

    }
}
