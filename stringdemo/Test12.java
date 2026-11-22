package stringdemo;

import java.util.Scanner;

public class Test12 {
    //敏感词替换
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的发言：");
        String str = sc.next();

        String[] arr = {"nm", "cnm", "nmsl", "sb", "tmd", "tm"};

        for (int i = 0; i < arr.length; i++) {
            str = str.replace(arr[i], "***");
        }

        System.out.println(str);
    }
}
