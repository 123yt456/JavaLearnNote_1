package ifdemo;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = sc.nextInt();

        if (week >= 1 && week <= 7) {
            if (week >= 1 && week <= 5){
                System.out.println("工作日");
            }else{
                System.out.println("休息日");
            }
        }else {
            System.out.println("无效的星期数，请重新输入！");
        }
    }
}
