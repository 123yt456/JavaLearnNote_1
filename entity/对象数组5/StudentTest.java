
package entity.对象数组5;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student s1 = new Student(1232, "阿拉蕾", 16);
        Student s2 = new Student(1233, "藤都子", 16);
        Student s3 = new Student(1234, "薇欧拉", 17);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        //新建一个学生信息
        Student s4 = inputeStudent();
        //判断学生id是否重复
        boolean judje = contains(arr, s4.getId());

        while (judje) {
            //如果重复就一直改，直到不重复为止
            System.out.println("输入id重复，请重新输入！");
            s4 = inputeStudent();
            judje = contains(arr, s4.getId());
        }

        //id正确后把新学生信息添加到数组当中
        // 分为 数组已满 和 数组未满
        if (!judje) {

            //看数组有没有存满
            int count = arrCount(arr);

            //数组存满则新建数组再添加
            if (count == arr.length) {
                //新建数组并加入新元素
                Student[] newArr = createNewArr(arr);
                newArr[count] = s4;
                //遍历学生信息
                printArr(newArr);

                deleteStudent(newArr, 1232);

                updateStudentAge(newArr, 1233);


                //数组未存满，直接在原数组中添加元素
            } else {
                //在原数组中加入新元素
                arr[count] = s4;
                //遍历学生信息
                printArr(arr);

                deleteStudent(arr, 1232);
            }
        }


    }

    public static Student inputeStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入新增学生信息：");
        System.out.println("新增学生学号：");
        int id = sc.nextInt();
        System.out.println("新增学生姓名：");
        String name = sc.next();
        System.out.println("新增学生年龄：");
        int age = sc.nextInt();

        Student s = new Student(id, name, age);
        return s;
    }

    public static boolean contains(Student[] arr, int id) {

        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            if (arr[i] != null) {
                int sid = s.getId();
                if (sid == id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int arrCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static Student[] createNewArr(Student[] arr) {
        Student[] arr2 = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getId() + "," + arr[i].getName() + "," + arr[i].getSge());
            }
        }
    }

    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];

            if (stu != null) {
                if (stu.getId() == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void deleteStudent(Student[] arr, int id){
        //通过id删除学生信息
        //获取id索
        int index = getIndex(arr, id);
        //id存在（索引有效）则删除此学生信息，并遍历数组
        if (index >= 0){
            arr[index] = null;
            System.out.println();
            printArr(arr);
        }else {
            System.out.println("输入的id不存在，删除失败");
        }
    }

    public static void updateStudentAge(Student[] arr, int id){
        int index = getIndex(arr, id);

        if (index >= 0){

            Student stu = arr[index];
            int newAge = stu.getSge() + 1;
            stu.setSge(newAge);

            System.out.println();;
            printArr(arr);
        }else {
            System.out.println("该学生id不存在，修改失败");
        }
    }
}
