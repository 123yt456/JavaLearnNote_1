package stringdemo;

import java.util.Scanner;

public class Test8 {
    //金额转换
    public static void main(String[] args) {
        int num = getNum();
        char[] chars = getString(num);

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }

    public static int getNum() {
        Scanner sc = new Scanner(System.in);
        int num;
        //或者用 while(true) + if + break
        do {
            System.out.println("请输入一个数：");
            num = sc.nextInt();
            if (num < 0){
                System.out.println("输入金额有误，请重新输入！");
            }
        }while (num < 0 || num > 9999999);

        return num;
    }

    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
//        }

        return chars;
    }

    public static char[] getString(int num) {
        String str = "零佰零拾零万零仟零佰零拾零元";
        char[] chars = getChars(str);

        for (int i = chars.length - 2; i > 0; i -= 2) {
            if (num % 10 != 0) {
                int ge = num % 10;

//                switch (ge) {
//                    case 0:
//                        chars[i] = '零';
//                        break;
//                    case 1:
//                        chars[i] = '壹';
//                        break;
//                    case 2:
//                        chars[i] = '贰';
//                        break;
//                    case 3:
//                        chars[i] = '叁';
//                        break;
//                    case 4:
//                        chars[i] = '肆';
//                        break;
//                    case 5:
//                        chars[i] = '伍';
//                        break;
//                    case 6:
//                        chars[i] = '陆';
//                        break;
//                    case 7:
//                        chars[i] = '柒';
//                        break;
//                    case 8:
//                        chars[i] = '捌';
//                        break;
//                    default:
//                        chars[i] = '玖';
//                        break;
//                }
                num /= 10;
            }
        }
        return chars;
    }

    public static String getCapitalNumber(int num){
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖",};
        return arr[num];
    }

}
