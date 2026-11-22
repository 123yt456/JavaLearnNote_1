package staticdemo.a01static;

public class StudentTest {
    public static void main(String[] args) {
        //类名调用（推荐）
        Student.teacherName = "黑白熊";

        //第一个学生
        Student s1 = new Student();
        s1.setName("七海");
        s1.setAge(17);
        s1.setGender("女");
        //对象名调用
//        s1.teacherName = "黑白熊";

        s1.study();
        s1.show();

        //第二个学生
        Student s2 = new Student();
        s2.setName("罪木");
        s2.setAge(17);
        s2.setGender("女");

        s2.study();
        s2.show();
    }
}
