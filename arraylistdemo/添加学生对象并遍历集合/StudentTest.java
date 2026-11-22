package arraylistdemo.添加学生对象并遍历集合;

import java.util.ArrayList;

public class StudentTest {
    //遍历打印学生对象
    public static void main(String[] args) {
        //创建学生对象集合
        ArrayList<Student> list = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("七海千秋", 16);
        Student s2 = new Student("日向创", 17);

        //添加元素
        list.add(s1);
        list.add(s2);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            //⭐直接打印会打印地址值，要把里面的属性get出来
            System.out.println(stu.getName() + "," + stu.getAge());
        }


    }
}
