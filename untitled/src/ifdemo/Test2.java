package ifdemo;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入票号");
        int a = sc.nextInt();

        //if嵌套
        if (a >= 0 && a <= 100) {
            if (a % 2 == 0) {
                System.out.println("坐右边");
            } else {
                System.out.println("坐左边");
            }
        }else {
            System.out.println("票号输入错误");
        }

    }
}
