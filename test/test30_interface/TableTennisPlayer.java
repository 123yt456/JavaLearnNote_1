package test.test30_interface;

public class TableTennisPlayer extends Athlete implements English {
    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员正在学习");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练" + this.getName() + "正在说英语");
    }
}
