package 学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    //常量的应用：提高阅读性
    /*private限制只能在本类中使用
      用static是因为下面的方法是静态的，所以要用静态修饰
      final限制不能被修改
    */
    //常量的命名规范：全部大写，字母之间用下划线隔开
    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String CHECK_STUDENT = "4";
    private static final String EXIT = "5";

    public static void StudentSystem() {
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-------------欢迎来到黑马学生管理系统----------------");

            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择:");
            String choose = sc.next();


            switch (choose) {
                case ADD_STUDENT: {
                    addStudent(list);
                    break;
                }
                case DELETE_STUDENT: {
                    deleteStudent(list);
                    break;
                }
                case UPDATE_STUDENT: {
                    updateStudent(list);
                    break;
                }
                case CHECK_STUDENT: {
                    checkStudent(list);
                    break;
                }
                case EXIT: {
                    System.exit(0);
                }
                default: {
                    System.out.println("没有这个选项");
                    break;
                }
            }
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Student stu = new Student();

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入学生id：");
            String id = sc.next();
            int flag = checkId(list, id);
            if (flag >= 0){
                System.out.println("该id已存在，请重新输入");
            }else {
                stu.setId(id);
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.next();
        stu.setName(name);

        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        stu.setAge(age);

        System.out.println("请输入学生地址：");
        String address = sc.next();
        stu.setAddress(address);

        list.add(stu);

        System.out.println("⭐该学生信息已添加成功⭐");
    }

    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要删除的学生id：");
        String id = sc.next();

        int index = checkId(list, id);
        if (index >= 0){
            list.remove(index);
            System.out.println("⭐id为" + id + "的学生信息删除成功⭐");
        }else {
            System.out.println("该学生id不存在，删除失败");
        }
    }

    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要修改的学生id：");
        String id = sc.next();

        int index = checkId(list, id);
        if (index >= 0){
            Student stu = list.get(index);

            System.out.println("请输入学生姓名：");
            String newName = sc.next();
            stu.setName(newName);

            System.out.println("请输入学生年龄：");
            int newAge = sc.nextInt();
            stu.setAge(newAge);

            System.out.println("请输入学生地址：");
            String newAddress = sc.next();
            stu.setAddress(newAddress);

            System.out.println("⭐id为" + id + "的学生信息修改成功⭐");
        }else {
            System.out.println("该学生id不存在，修改失败");
        }
    }

    public static void checkStudent(ArrayList<Student> list) {
        if (list.size() == 0){
            System.out.println("还未添加任何学生信息，请添加后再查询");
            return;
        }

        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t"
                    + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    public static int checkId(ArrayList<Student> list, String id){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}