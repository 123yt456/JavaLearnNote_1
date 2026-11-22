package entity.文字版格斗游戏2;

public class TestFightingGame {
    public static void main(String[] args) {
        FightingGame f1 = new FightingGame("辉夜姬", 100, '女');
        FightingGame f2 = new FightingGame("八千代", 100, '女');

        f1.getAllInformation();
        f2.getAllInformation();

        while (true){
            f1.attack(f2);

            if (f2.getBlood() == 0){
                System.out.println(f1.getName() + " K.O了 " + f2.getName());
                break;
            }

            f2.attack(f1);

            if (f1.getBlood() == 0){
                System.out.println(f2.getName() + "K.O.了" + f1.getName());
                break;
            }

        }


    }
}
