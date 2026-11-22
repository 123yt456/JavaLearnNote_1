package entity.文字版格斗游戏;

import java.util.Random;

public class FightingGame {
    private String name;
    private int blood;

    public void attack(FightingGame fightingGame) {
        //一次造成的伤害
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        //剩余血量
        int remainBoold = fightingGame.getBlood() - hurt;
        //如果血量变成负数就改成0
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        //修改xxx的血量
        fightingGame.setBlood(remainBoold);

        System.out.println(this.getName() + "举起兔子打了" + fightingGame.getName() + "一下，造成了"
                + hurt + "点伤害，" + fightingGame.getName() + "还剩下" + remainBoold + "点血");
    }

    public FightingGame() {
    }

    public FightingGame(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
}
