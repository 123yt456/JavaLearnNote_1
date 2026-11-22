package stringdemo;

import java.util.Scanner;
public class Test5 {
    //键盘录入一个字符串，统计大小写字符和数字字符的出现个数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        int digitCount = 0;
        int upperCount = 0;
        int lowerCount = 0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            //或者直接写成 c >= '0' && c <= '9'
            if (c >= 48 && c <= 57){
                digitCount ++;
            } //或者直接写成 c >= 'A' && c <= 'Z'
            else if (c >= 65 && c <= 90) {
                upperCount ++;
            } //或者直接写成 c >= 'a' && c <= 'z'
            else if (c >= 97 && c <= 122) {
                lowerCount ++;
            }
        }

        System.out.println("大写字符的个数为：" + upperCount);
        System.out.println("小写字符的个数为：" + lowerCount);
        System.out.println("数字字符的个数为：" + digitCount);
    }
}
