package stringdemo;

import java.util.Scanner;

public class Test9 {
    //视频教学版本金额转换
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入金额：");
            money = sc.nextInt();

            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("输入的金额无效，请重新输入！");
            }
        }

        String moneyStr = "";
        while (true) {
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            money /= 10;
            moneyStr = capitalNumber + moneyStr;

            if (money == 0) {
                break;
            }
        }

        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

        String result = "";
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            String s = arr[i];
            result = result + c + s;
        }
        System.out.println(result);
    }

    public static String getCapitalNumber(int num) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖",};
        return arr[num];
    }
}
