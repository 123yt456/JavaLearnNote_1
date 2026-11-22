package arraylistdemo;

import java.util.ArrayList;

public class 集合遍历 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("阿拉蕾");
        list.add("藤都子");
        list.add("薇欧菈");
        list.add("要乐奈");
        list.add("高松灯");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("]");


    }
}
