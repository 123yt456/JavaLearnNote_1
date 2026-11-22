package arraylistdemo.添加手机对象并返回要求的数据;

import java.util.ArrayList;

public class PhoneTest {
    //打印价格低于3000的手机信息
    public static void main(String[] args) {
        //创建手机对象集合
        ArrayList<Phone> list = new ArrayList<>();

        //创建手机对象
        Phone p1 = new Phone("菠萝", 1999);
        Phone p2 = new Phone("苹果", 14999);
        Phone p3 = new Phone("vivo", 6999);
        Phone p4 = new Phone("樱桃", 2999);

        //把手机对象存入集合
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        //获取所有低于3000的手机的集合
        ArrayList<Phone> list2 = getPhoneInfo(list);

        //遍历打印新集合中的数据
        for (int i = 0; i < list2.size(); i++) {
            Phone p = list2.get(i);
            System.out.println(p.getBrand() + "," + p.getPrize());
        }


    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        //定义一个新集合用于存储价格低于3000的手机对象
        ArrayList<Phone> list2 = new ArrayList<>();

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            //手机对象价格低于3000时，就把手机对象添加到新集合当中
            if (p.getPrize() < 3000){
                list2.add(p);
            }
        }
        //返回新集合
        return list2;
    }
}
