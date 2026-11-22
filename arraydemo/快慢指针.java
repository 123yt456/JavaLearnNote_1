package arraydemo;

import java.util.Scanner;

public class 快慢指针 {
    public static void main(String[] args) {
        //键入数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个递增的有序数组：");
        int num = sc.nextInt();

        //获取长度
        int temp = num;
        int length = 0;
        while (temp % 10 != 0){
            length ++;
            temp /= 10;
        }

        //存入数组
        int[] arr = new int[length];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num /= 10;
        }

        //创建快慢指针
        int slow = 0;
        int fast = 1;
        //如果快指针和慢指针的数不相同，慢指针 增1 后存入快指针的数，然后快指针 增1
        //否则快指针 增1
        while (fast < arr.length){
            if (arr[fast] != arr[slow]){
                slow ++;
                arr[slow] = arr[fast];
            }
            fast ++;
        }

        for (int i = 0; i <= slow; i++) {
            System.out.print(arr[i]);
        }
    }
}
