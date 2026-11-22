package test;

import java.util.Scanner;

public class Test26 {
    //数字解密
    public static void main(String[] args) {
        int[] arr = getPassword();
        getRestorePass(arr);

    }

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

    public static void getRestorePass(int[] arr){
        //反转数组
        for (int i = 0, j = arr.length - 1;i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //还原对10取余部分
        //0~4 加10， 5~9 数字不变
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4){
                arr[i] += 10;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 5;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

}
