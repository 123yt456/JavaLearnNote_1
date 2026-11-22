package stringdemo;

import java.util.Scanner;

public class 返回最后单词的长度 {
    public static void main(String[] args) {
        //键入英文短句
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个英文短句：");
        String text = sc.nextLine();

        //
        int length = 0;
        for (int i = text.length() - 1; i > 0; i--) {
            if (text.charAt(i) == ' '){
                break;
            }else {
                length ++;
            }
        }

        System.out.println(length);
    }
}
