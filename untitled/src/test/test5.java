package test;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入整数1");
        int num1 = sc.nextInt();

        System.out.println("请输入整数2");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

//        if (num1 == 6){
//            System.out.println(true);
//        } else if (num2 == 6) {
//            System.out.println(true);
//        } else if (sum % 6 == 0) {
//            System.out.println(true);
//        }else System.out.println(false);

        boolean result = num1 == 6 || num2 == 6 || sum % 6 == 0;
        System.out.println(result);


    }
}
