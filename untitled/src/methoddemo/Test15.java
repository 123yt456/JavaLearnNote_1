package methoddemo;
import java.util.Scanner;

public class Test15 {
    //计算该数字是几位数字
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int a = sc.nextInt();
       int count = getCount(a);
        System.out.println("该数字是" + count + "位数字");
    }

    public static int getCount(int num){
        int count = 0;
        while (num != 0){
            count ++;
            num /= 10;
        }
        return count;
    }
}
