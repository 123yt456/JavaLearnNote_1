package stringdemo;

import java.util.StringJoiner;

public class Test15 {
    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner(",");

        sj.add("若叶逵").add("喜欢吃").add("黄瓜");

        System.out.println(sj);
        System.out.println(sj.length());
    }
}
