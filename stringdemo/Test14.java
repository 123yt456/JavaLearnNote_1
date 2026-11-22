package stringdemo;

import java.util.Scanner;

public class Test14 {
    //拼接字符串
    public static void main(String[] args) {
        int[] arr = getInts();
        String string = arrToString(arr);
        System.out.println(string);
    }

    public static int[] getInts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int num = sc.nextInt();

        int length = 0;
        int temp = num;
        while (temp % 10 != 0){
            length ++;
            temp /= 10;
        }

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[length - (i + 1)] = num % 10;
            num /= 10;
        }
        return arr;
    }

    public static String arrToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1){
                sb.append(arr[i] + ",");
            }else {
                sb.append(arr[i]);
            }
        }
        sb.append("]");

        return sb.toString();
    }

}
