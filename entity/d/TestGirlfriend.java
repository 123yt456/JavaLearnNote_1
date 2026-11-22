package entity.d;

public class TestGirlfriend {
    public static void main(String[] args) {
        Girlfriend g = new Girlfriend();
        g.setName("若叶睦");
        g.setHeight(153);
        g.setWeight(86);

        g.show();
        g.wash();
        g.cook();
    }
}
