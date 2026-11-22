package staticdemo.a03static;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("七海", 17, "女");
        Student s2 = new Student("日向", 18, "男");
        Student s3 = new Student("千枝实", 22, "女");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}
