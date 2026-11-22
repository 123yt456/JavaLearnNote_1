package stringdemo;

import java.util.Scanner;
public class Test3 {
    //用户登录
    public static void main(String[] args) {
        String user = "七海千秋";
        int password = 123456;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入您的用户名：");
            String inputuser = sc.next();
            System.out.println("请输入您的密码：");
            int inputpasswo = sc.nextInt();

            boolean result = user.equals(inputuser);
            boolean result2 = password == inputpasswo;

            //自研版
//            if (result){
//                if (result2){
//                    System.out.println("登录成功——！");
//                    return;
//                }else {
//                    System.out.println("用户名或密码错误，登录失败，请重新输入！");
//                }
//            }else {
//                System.out.println("用户名或密码错误，登录失败，请重新输入！");
//            }

            //视频版
            if (result && result2){
                System.out.println("登录成功——！");
                    return;
            }else {
                if (i == 2){
                    System.out.println("输入超过三次，系统已锁定^^");
                }else {
                    System.out.println("用户名或密码错误，登录失败，请重新输入！" + "（您还剩下" + ( 2 - i) + "次机会）");
                }
            }
        }

    }
}
