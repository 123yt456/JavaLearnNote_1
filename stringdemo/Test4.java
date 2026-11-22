package stringdemo;

import java.util.Scanner;
public class Test4 {
    //键盘录入字符串并遍历
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String s = sc.next();

        int length = s.length();
        for (int i = 0; i < length; i++) {
            char charAt = s.charAt(i);
            System.out.print(charAt);
        }

    }
}
