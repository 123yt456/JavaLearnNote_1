package arraylistdemo.添加学生对象并遍历集合;

import java.util.ArrayList;
import java.util.Scanner;

public class 键盘录入添加学生对象 {
    //键盘录入学生信息 并遍历打印学生对象
    public static void main(String[] args) {
        //创建学生对象集合
        ArrayList<Student> list = new ArrayList<>();

        //键盘录入指定个数的学生对象
        Scanner sc = new Scanner(System.in);
        //⭐这里不能写 i < list.size(),因为当前集合的长度为0，需要自定义长度
        for (int i = 0; i < 3; i++) {
            Student s = new Student();

            System.out.println("请输入第" + (i + 1) + "个学生的姓名"); //⭐不加小括号会在 +i 后变成 字符串+1，导致输出错误
            String name = sc.next();
            System.out.println("请输入第" + (i + 1) + "个学生的年龄");
            int age = sc.nextInt();

            s.setName(name);
            s.setAge(age);

            list.add(s);
        }

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }

    }
}
