package methoddemo;
import java.util.Scanner;

public class Test12 {
    //键盘录入一个数字，并按照从小到大的顺序插入一个数组中，生成一个新的数组
    //⭐教学版
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();

        int [] arr1 = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int [] arr2 = new int[arr1.length + 1];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (num >= arr1[i]){
                arr2[i] = arr1[i];
                index = i +1;
            }else {
                arr2[i + 1] = arr1[i];
            }
        }
        arr2[index] = num;


        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");

        }


    }
}
