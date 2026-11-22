package test;

import java.util.Scanner;

public class Test11 {
    //不利用* / % 得出商和余数
    //自练习版
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int a = sc.nextInt();
        System.out.println("请输入除数：");
        int b = sc.nextInt();


        int shang = 0;
        if (a > 0 && b > 0) {
            while (a - b >= 0) {
                a -= b;
                shang++;
            }
            System.out.println(shang);
            System.out.println(a);

        } else if (a < 0 && b > 0) {
            while (a + b <= 0) {
                a += b;
                shang--;
            }
            System.out.println(shang);
            System.out.println(a);

        } else if (a > 0 && b < 0) {
            while (a + b >= 0) {
                a += b;
                shang--;
            }
            System.out.println(shang);
            System.out.println(a);

        } else if (a < 0 && b < 0) {
            while (a - b <= 0) {
                a -= b;
                shang++;
            }
            System.out.println(shang);
            System.out.println(a);

        } else if (a == 0 && b != 0) {
            System.out.println(shang);
            System.out.println(a);
        } else {
            System.out.println("0不能作为除数,请重新输入！");
        }


    }
}
