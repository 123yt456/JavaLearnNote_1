package fordemo;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字表示范围的开始");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字表示范围的结束");
        int b = sc.nextInt();

        //容错
        if (a > b){
            int c = 0;
            c = a;
            a = b;
            b = c;
        }

        int count = 0;
        for (int i = a; i <= b; i++){
            if (i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }
        System.out.println(count);

    }
}
