package switchdemo;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请从1——4中选择按键输入");
        int num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预定");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            case 4:
                System.out.println("退出服务");
                break;
            default:
                System.out.println("退出服务");
                break;
        }
    }
}
