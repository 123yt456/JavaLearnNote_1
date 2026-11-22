package stringdemo;

import java.util.Scanner;
public class Test6 {
    //字符串拼接
    //定义一个方法，把int数组中的数据按照指定格式拼接成一个字符串并返回
    public static void main(String[] args) {
        //用户输入一个数并存入数组
        int[] arr = getInts();

        //拼接字符串并返回
        getString(arr);
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

    public static void getString(int[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if (i != (arr.length - 1)){
                str += ",";
            }
        }
        String newStr = "[" + str + "]";
        System.out.print(newStr);
    }
}
