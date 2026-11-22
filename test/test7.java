package test;
import java.util.Scanner;

//三元运算符练习1
public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个老虎的体重");
        int a = sc.nextInt();
        System.out.println("请输入第二个老虎的体重");
        int b = sc.nextInt();

//        System.out.println(a == b);
        System.out.println(a == b ? "相同" : "不相同");

    }
}
