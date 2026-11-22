package test.test30_interface;

/* 流程图：
                           人
             教练                         运动员
    （说英语）乒乓球教练，篮球教练 | （说英语）乒乓球运动员，篮球运动员
    （接口：说英语）
 */
public class Test {
    public static void main(String[] args) {
        TableTennisPlayer ttp = new TableTennisPlayer("程小时", 22);

        System.out.println(ttp.getName() + " " + ttp.getAge());
        ttp.study();
        ttp.speakEnglish();
    }
}
