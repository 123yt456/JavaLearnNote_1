package ifdemo;
import  java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        if (b >= 600){
            System.out.println("支付成功");
        }else {
            System.out.println("支付失败");
        }

    }
}
