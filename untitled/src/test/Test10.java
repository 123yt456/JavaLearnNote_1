package test;

import java.util.Scanner;

public class Test10 {
    //回文数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = sc.nextInt();

        if (x >= 0) {
            int result = 0;
            for (int num = x; num != 0; num /= 10) {
                int ge = num % 10;
                result = result * 10 + ge;
            }
            System.out.println(result == x);
        }else {
            System.out.println(false);
        }
    }


}
