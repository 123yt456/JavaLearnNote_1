package stringdemo;

import java.util.Scanner;

public class Test7 {
    //字符串反转
    //键盘录入一个字符串，调用该方法后，输出反转字符串
    public static void main(String[] args) {
        String reverseString = getReverseString();
        System.out.println(reverseString);
    }

    private static String getReverseString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        int length = str.length();
        String result = "";

        //⭐或者用 length.forr 生成倒序循环，再修改 i 的值为 length-1
        for (int i = 0; i < length; i++) {
            char c = str.charAt(length - i - 1);
//            System.out.print(c);
            result += c;
        }
        return result;
    }

}
