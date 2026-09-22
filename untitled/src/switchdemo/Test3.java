package switchdemo;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = sc.nextInt();

        switch (week){
            //或者简化写成case 1,2,3,4,5:
            //或者简化写成（JDK12）case 1,2,3,4,5 ->
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            //或者简化写成case 6,7:
            //或者简化写成（JDK12）case 6,7 ->
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期");
                break;

        }
    }
}
