package 学生管理系统升级版;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        Student s = new Student("abc11", "12345", "12045620020921562X", "12345678901");
        list.add(s);

        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作： 1登录 2注册 3忘记密码 4退出");


            String choose = sc.next();
            switch (choose) {
                case "1": {
                    logIn(list);
                    break;
                }
                case "2": {
                    register(list);
                    break;
                }
                case "3": {
                    forgotPassword(list);
                    break;
                }
                case "4": {
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("没有这个选项");
                    break;
            }
        }
    }

    public static void logIn(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; ) {
            //输入用户名
            System.out.println("请输入用户名：");
            String name = sc.next();

            //判断用户名是否已经注册，已注册进行 密码 和 验证码 的输入
            if (getId(list, name) >= 0) {
                //输入密码
                System.out.println("请输入密码：");
                String password = sc.next();



                //生成验证码，输入验证码 并判断验证码是否输入正确,不正确就重新输入
                while (true) {
                    //生成一个验证码
                    char[] chars = generateVerifyCode();
                    System.out.print("验证码为：");
                    for (int j = 0; j < chars.length; j++) {
                        System.out.print(chars[j]);
                    }
                    System.out.println();

                    //输入验证码
                    /*视频版：验证码存入集合，再转成字符串，再转字符数组进行打乱，最后转回字符串并返回
                     对比时候直接进行字符串比较，忽略大小写
                     */
                    System.out.println("请输入验证码\n");
                    String verifyCode = sc.next();

                    if (checkVerifyCode(chars, verifyCode)) {
                        System.out.println("验证码输入正确^v^");
                        break;
                    } else {
                        System.out.println("验证码输入错误，请重新输入！");
                    }
                }

                //判断 用户名或密码 是否输入正确，有三次机会
                /*⭐视频版：可以把用户名和密码封装成一个对象，其他参数填null
                然后方法只需要传list和对象就可以了，不需要零散的数据
                 */
                if (contains(list, name, password) && getId(list, name) >= 0 && i < 3) {
                    System.out.println("⭐登录成功⭐");
                    学生管理系统.StudentSystem ss = new 学生管理系统.StudentSystem();
                    ss.StudentSystem();
                    break;
                } else {
                    i++;
                    if (i != 3) {
                        System.out.println("用户名或密码错误，请重新输入!还有" + (3 - i) + "次机会");
                    } else {
                        System.out.println("登录失败，请重试");
                    }

                }
            } else {    //未注册提示后退出
                System.out.println("用户名未注册，请先注册");
                return;
            }
        }


    }

    public static void register(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        //输入用户名
        while (true) {
            System.out.println("请输入用户名（只能由字母和数字组合，不能是纯数字）：");
            String name = sc.next();

        /*判断用户名是否符合规范
        1.用户名唯一
        2.长度 3~15
        3.只能由字母和数字组成，但不能是纯数字
         */
            //先判断规范性，再判断用户是否被注册
            if (!(checkName(list, name))) {
                System.out.println("用户名不符合规范，请重新输入");
                continue;
            }

            if (getId(list, name) >= 0) {
                System.out.println("用户名已被注册,请重新输入");
            }else {
                stu.setName(name);
                break;
            }
        }

        //输入密码，密码要输入两次，两次一致才可以进行注册
        while (true) {
            System.out.println("请输入密码：");
            String password = sc.next();
            System.out.println("请再次输入密码：");
            String password2 = sc.next();

            if (password.equals(password2)) {
                stu.setPassword(password);
                break;
            } else {
                System.out.println("两次密码输入不一致，请重新输入");
            }
        }

        /*输入身份证号并进行验证
        1.长度为18
        2不能以0为开头
        3.前17位必须是数字
        4.最后一位可以是数字，也可以是大写X或小写x
         */
        while (true) {
            System.out.println("请输入身份证号：");
            String idNumber = sc.next();

            if (checkIdNumber(idNumber)) {
                stu.setIdNumber(idNumber);
                break;
            } else {
                System.out.println("身份证号输入有误，请重新输入");
            }
        }

        /*
        输入手机号并进行验证
        1.长度为11
        2.不能以0开头
        3.必须都是数字
         */
        while (true) {
            System.out.println("请输入手机号：");
            String phoneNumber = sc.next();
            if (checkPhoneNumber(phoneNumber)) {
                stu.setPhoneNumber(phoneNumber);
                break;
            } else {
                System.out.println("手机号输入不正确，请重新输入");
            }
        }

        //都符合规范，将用户信息存入集合，提示注册成功
        list.add(stu);
        System.out.println("⭐注册成功喵⭐");
    }

    public static void forgotPassword(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        //键盘录入用户名，不存在直接结束方法
        System.out.println("请输入需要修改密码的用户名：");
        String name = sc.next();

        int index = getId(list, name);

        if (index == -1){
            System.out.println("用户名未注册");
            return;
        }

        /*判断当前用户的身份证号码和手机号码是否一致，
        如果一致，则提示输入密码，进行修改
        如果不一致，则提示：账号信息不匹配，修改失败。
         */
        System.out.println("请输入身份证号：");
        String idNumber = sc.next();

        System.out.println("请输入手机号码：");
        String phoneNumber = sc.next();

        Student stu = list.get(index);

        //身份证比较应忽略大小写
        if (!(stu.getIdNumber().equalsIgnoreCase(idNumber)) || !(stu.getPhoneNumber().equals(phoneNumber))){
            System.out.println("账号信息不匹配，修改失败");
            return;
        }

        //全都正确后输入新密码
        System.out.println("请输入新密码：");
        String newPassword = sc.next();

        //将新密码存入用户信息中
        stu.setPassword(newPassword);

        //提示修改密码成功
        System.out.println("⭐密码修改成功⭐");
    }

    //判断用户名是否在集合中 并返回索引
    public static int getId(ArrayList<Student> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    //判断密码是否输入正确
    public static boolean contains(ArrayList<Student> list, String name, String password) {
        int index = getId(list, name);
        Student stu = list.get(index);
        if (stu.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    //获取一个验证码
    public static char[] generateVerifyCode() {
        //生成五位数验证码，四个字母一个数字，数字位置随机
        char[] chars = new char[5];

        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            boolean judge = r.nextBoolean();
            if (judge) {
                chars[i] = (char) (r.nextInt(26) + 65);
            } else {
                chars[i] = (char) (r.nextInt(26) + 97);
            }
        }

        int index = r.nextInt(chars.length);
        int num = r.nextInt(10);

        chars[index] = (char) ('0' + num);

        return chars;
    }

    //判断验证码是否输入正确
    public static boolean checkVerifyCode(char[] chars, String verifyCode) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != verifyCode.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    //判断用户名是否符合规范
    public static boolean checkName(ArrayList<Student> list, String name) {
        //用户名长度不属于 3~15 的区间，返回false
        if (name.length() < 3 || name.length() > 15) {
            return false;
        }

        //遍历字符串判断：1.只能是字母加数字的组合，2.但是不能是纯数字
        //定义一个计数器
        int numCount = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

            //1.用户名有 数字、小写字母、大写字母 以外的字符，返回false
            if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                return false;
            }

            //记录有一共有几个数字
            if (c >= '0' && c <= '9') {
                numCount++;
            }
        }
        //视频版：多写一个for循环，新创建一个int变量用来存字母个数，如果有字母存在，直接break，返回int > 0(即true)
        //2.字符串遍历完后，如果数字长度和字符串相等(用户名是纯数字)，返回false
        if (numCount == name.length()) {
            return false;
        }

        //全都符合，返回true
        return true;
    }

    //判断身份证号是否符合规范
    public static boolean checkIdNumber(String idNumber) {
        //长度不为18，或以0为开头，返回false
        if (idNumber.length() != 18 || idNumber.charAt(0) == 0) {
            return false;
        }

        //前17位不是数字，或最后一位不是数字，也不是大写X或小写x，返回false
        for (int i = 0; i < idNumber.length(); i++) {
            char c = idNumber.charAt(i);
            if (i < idNumber.length() - 1) {
                if (!(c >= '0' && c <= '9')) {
                    return false;
                }
            } else {
                if (!((c >= '0' && c <= '9') || c == 'X' || c == 'x')) {
                    return false;
                }
            }
        }
        //都正确返回true
        return true;
    }

    //判断手机号是否符合规范
    public static boolean checkPhoneNumber(String phoneNumber) {
        //长度不为11,或以零开头，返回false
        if (phoneNumber.length() != 11 || phoneNumber.charAt(0) == 0) {
            return false;
        }

        //不都是数字，返回false
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        //都符合返回true
        return true;
    }

}
