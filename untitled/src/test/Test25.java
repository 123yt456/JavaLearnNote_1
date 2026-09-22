package test;

import java.util.Scanner;

public class Test25 {
    //数字加密
    public static void main(String[] args) {
        int[] arr = getPassword();
        //自研版
//        int[] newArr = getEncryptPassword(arr);
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.print(newArr[i]);
//        }
        //⭐视频教学版
        getEncryptPassword(arr);
        System.out.println();
        getEncryptPassword(arr);

    }

    //输入密码，并获取密码的数组
    public static int[] getPassword() {
        //键入密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入以您的密码：");
        int password = sc.nextInt();
        while (password == 0) {
            System.out.println("密码不能是0，请重新输入！");
            int pass2 = sc.nextInt();
            password = pass2;
        }
        //获取密码长度
        int temp = password;
        int passLength = 1;
        //⚠️易错点：循环中不修改 temp 的值会一直停不下来！
        while (temp / 10 != 0) {
            passLength++;
            temp /= 10;
        }
        //将密码存入数组中
        int temp2 = password;
        int[] arr = new int[passLength];
        for (int i = 0; i < arr.length; i++) {
            arr[arr.length - 1 - i] = temp2 % 10;
            temp2 /= 10;
        }
        return arr;
    }

//    //创建新数组版密码加密
//    public static int[] getEncryptPassword(int[] arr) {
//        //密码加密：将原密码反转
//        int[] newArr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[arr.length - 1 - i];
//        }
//
//        //密码加密： 每位数都加5，再对10求余
//        //可以和上方代码合并到一起
//        for (int i = 0; i < newArr.length; i++) {
//            newArr[i] = (newArr[i] + 5) % 10;
//        }
//        return newArr;
//    }


    //⭐视频教学版，不创建新数组⭐
    public static void getEncryptPassword(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        //密码加密：将原密码反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //拼接最后的密码
//        int number = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                number = number * 10 + arr[i];
//            } else {
//                number *= 10;
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
//        System.out.println(number);
    }

}
