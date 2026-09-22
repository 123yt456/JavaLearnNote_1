package test;

import java.util.Random;
import java.util.Scanner;

public class Test27Copy {
    //双色球系统
    public static void main(String[] args) {

        int[] arr = getRadNum();

        int blueNum = getBlueNum();

        int[] arr2 = randomRadNum();

        int correctNum = judgeRadNum(arr, arr2);

        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
            System.out.printf("%3d", arr[i]);
        }

        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + "\t");
            System.out.printf("%3d", arr2[i]);
        }

        System.out.println();
        System.out.printf("%3d", blueNum);

        System.out.println();
        System.out.println("红球猜中个数为：" + correctNum);



    }


    public static int[] getRadNum() {

        //输入六个红球的号码存入数组，且不能超出范围
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("请依次输入六个预测红球号码");
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第" + (i + 1) + "个红球号码：");
            arr[i] = sc.nextInt();
            while (arr[i] < 1 || arr[i] > 33) {
                System.out.println("输入的号码有误，请重新输入！");
                arr[i] = sc.nextInt();
            }

            //判断数字是否和前面的重复
            boolean flag = false;
            for (int i1 = 0; i1 < i; i1++) {
                if (arr[i1] == arr[i]) {
                    flag = true;
                    break;
                }
            }
            //如果重复就一直修改，且不能超出范围，直至符合标准
            while (flag) {
                System.out.println("输入的号码重复，请重新输入！");
                arr[i] = sc.nextInt();
                while (arr[i] < 1 || arr[i] > 33) {
                    System.out.println("输入的号码有误，请重新输入！");
                    arr[i] = sc.nextInt();
                }
                flag = false;
                for (int i2 = 0; i2 < i; i2++) {
                    if (arr[i2] == arr[i]) {
                        flag = true;
                    }
                }
            }

        }
        return arr;
    }

    public static int getBlueNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入蓝色球号码：");
        int blueNum = sc.nextInt();

        while (blueNum < 1 || blueNum > 16){
            System.out.println("输入的蓝色球号码有误，请重新输入！");
            blueNum = sc.nextInt();
        }

        return blueNum;
    }

    public static int[] randomRadNum() {
        int[]arr = new int[6];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randomnum = r.nextInt(33) + 1;
            arr[i] = randomnum;

            boolean flag = false;
            for (int i1 = 0; i1 < i; i1++) {
                if (arr[i1] == arr[i]){
                    flag = true;
                    break;
                }
            }

            while (flag){
                arr[i] = r.nextInt(33) + 1;
                flag = false;

                for (int i1 = 0; i1 < i; i1++) {
                    if (arr[i1] == arr[i]){
                        flag = true;
                    }
                }
            }

        }
        return arr;
    }

    public static int judgeRadNum(int[] arr, int[] brr){
        int correctNum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < brr.length; i1++) {
                if (arr[i] == brr[i1]){
                    correctNum ++;
                }
            }
        }
        return correctNum;
    }

}
