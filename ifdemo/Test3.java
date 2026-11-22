package ifdemo;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int goods = 1000;

        System.out.println("请输入您的会员等级");
        int level = sc.nextInt();

        if (level >= 0 && level <= 3){
            if (level == 1){
                System.out.println("您需要支付" + (goods * 0.9) + "元");
            } else if (level == 2) {
                System.out.println("您需要支付" + (goods * 0.8) + "元");
            } else if (level == 3) {
                System.out.println("您需要支付" + (goods * 0.7) + "元");
            }else {
                System.out.println("无优惠制度，您需要支付" + goods + "元");
            }
        }else {
            System.out.println("输入等级有误，请重新输入。");

        }
    }
}
