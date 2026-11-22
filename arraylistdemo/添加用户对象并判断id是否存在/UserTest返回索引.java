package arraylistdemo.添加用户对象并判断id是否存在;

import java.util.ArrayList;

public class UserTest返回索引 {
    public static void main(String[] args) {
        //创建用户对象集合
        ArrayList<User> list = new ArrayList<>();

        //创建用户对象
        User u1 = new User("juewangのdunzi", "江之岛盾子", "12345");
        User u2 = new User("galgame高手", "七海千秋", "486486");
        User u3 = new User("无能の预备学科66", "日向创", "111777");

        //把用户对象添加到集合中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //能找到 id 则返回 对应索引
       int index = checkId(list, "无能の预备学科66");
       if (index >= 0){
           System.out.println("该用户索引为：" + index);
       }else {
           System.out.println("该用户id不存在");
       }


    }

    //或者命名为getIndex
    public static int checkId(ArrayList<User> list, String id){
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
