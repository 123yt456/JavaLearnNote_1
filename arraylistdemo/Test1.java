package arraylistdemo;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<String> list = new ArrayList<>();

        //1.添加元素
        boolean result = list.add("若叶睦"); //返回值为布尔类型
        list.add("喜欢");
        list.add("吃黄瓜");

        System.out.println(result); //添加元素永远返回true
        System.out.println(list);

/*
        //2.删除元素
        //直接删除一个元素
        boolean result2 = list.remove("喜欢"); //返回值为布尔类型
        boolean result22 = list.remove("哈哈");

        System.out.println(result2); //删除成功返回true
        System.out.println(result22); //当删除元素不存在时返回false
        System.out.println(list);

        //根据索引删除元素，把被删除元素返回
        String str = list.remove(0);

        System.out.println(str);
        System.out.println(list);
*/

        //3.修改元素
        //根据索引修改元素，把被修改的值返回
        String str2 = list.set(0, "丰川祥子");

        System.out.println(str2);
        System.out.println(list);


        //查询元素
        //根据索引查询元素，把被查询的元素返回
        String str3 = list.get(2);

        System.out.println(str3);
        System.out.println(list);
    }
}
