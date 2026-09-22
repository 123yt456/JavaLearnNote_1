package test;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入自己的时髦值");
        int a = sc.nextInt();
        System.out.println("请输入对方时髦值");
        int b = sc.nextInt();

        if (a > b){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }

}
