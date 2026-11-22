package test;

import java.util.Scanner;

public class Test12 {
    //不利用* / % 得出商和余数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int dividend = sc.nextInt();
        System.out.println("请输入除数：");
        int divisor = sc.nextInt();


        int shang = 0;
        if (dividend > 0 && divisor > 0) {
            while (dividend - divisor >= 0) {
                dividend -= divisor;
                shang++;
            }
            System.out.println(shang);
            System.out.println(dividend);

        } else if (dividend < 0 && divisor > 0) {
            while (dividend + divisor <= 0) {
                dividend += divisor;
                shang--;
            }
            System.out.println(shang);
            System.out.println(dividend);

        } else if (dividend > 0 && divisor < 0) {
            while (dividend + divisor >= 0) {
                dividend += divisor;
                shang--;
            }
            System.out.println(shang);
            System.out.println(dividend);

        } else if (dividend < 0 && divisor < 0) {
            while (dividend - divisor <= 0) {
                dividend -= divisor;
                shang++;
            }
            System.out.println(shang);
            System.out.println(dividend);

        } else if (dividend == 0 && divisor != 0) {
            System.out.println(shang);
            System.out.println(dividend);
        } else {
            System.out.println("0不能作为除数,请重新输入！");
        }


    }
}
