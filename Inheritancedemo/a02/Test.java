package Inheritancedemo.a02;

public class Test {
    public static void main(String[] args) {
        Husky h = new Husky();
        SharPei sp = new SharPei();
        ChineseRuralDog crd = new ChineseRuralDog();

        h.eat();
        h.breakHouse();

        sp.eat();

        crd.eat();

    }
}
