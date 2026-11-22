package stringdemo;

import java.util.Scanner;
import java.util.StringJoiner;

public class 转换罗马数字 {
    //数字长度 <= 9 (没有0，有 0 则返回 "")
    //返回对应数字的罗马数字
    public static void main(String[] args) {
        //键入数字 并判断规范性
        Scanner sc = new Scanner(System.in);
        String num = "";
        while (true) {
            System.out.println("请输入一个数字：");
            num = sc.next();
            boolean judge = checkStr(num);

            if (judge) {
                break;
            } else {
                System.out.println("输入数字无效，请重新输入喵~");
            }
        }

        //转换成罗马数字 查表法(用Switch case也可以)
        StringJoiner sj = new StringJoiner(",");  //可以用StringBuilder，不加间隔符
        String[] arr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - 48;  //⭐或者写成 - '0'
            String str = arr[digit];
            sj.add(str);
        }

        //打印结果
        System.out.println(sj);
    }

    //判断输入字符串的规范性
    public static boolean checkStr(String str){
        //长度小于等于9 不能为空 不能是负数
        if (str.length() > 9 || str.length() == 0 || str.charAt(0) == '-'){
            return false;
        }

        //只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }

}
