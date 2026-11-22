package arraylistdemo;

import java.util.ArrayList;

public class 添加数字并遍历集合 {
    public static void main(String[] args) {
        //创建int类型的集合 (这里用到了int的包装类Integer)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        //遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("]");



        //拓展：创建char类型的集合 (用到了char的包装类Character)
        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('1');
        list2.add('2');
        list2.add('3');

        //遍历集合
        System.out.print("[");
        for (int i = 0; i < list2.size(); i++) {
            if (i == list2.size() - 1){
                System.out.print(list2.get(i));
            }else {
                System.out.print(list2.get(i) + ",");
            }
        }
        System.out.println("]");
    }
}
