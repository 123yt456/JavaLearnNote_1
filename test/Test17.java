package test;
import java.util.Random;
import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        //猜数字
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.println("请输入你要猜的数字：");
            int guessNumber = sc.nextInt();

            if (guessNumber > num){
                System.out.println("大了");
            }else if (guessNumber < num){
                System.out.println("小了");
            }else {
                System.out.println("猜中了！");
                break;
            }
        }


    }
}
