package test;

import java.util.Scanner;
import java.util.Random;

public class Test27 {
    //双色球系统
    public static void main(String[] args) {

        int[] arr = getRadNum();

        int blueNum = getBlueNum();

        int[] arr2 = randomRadNum();

        int randomBlue = randomBlueNum();

        int correctRadNum = judgeRadNum(arr, arr2);

        int correctBlueNum = judgeBlueNum(blueNum,randomBlue);

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
        System.out.printf("%3d", randomBlue);

        System.out.println();
        System.out.println("红球猜中个数为：" + correctRadNum);

        System.out.println("蓝球猜中个数为：" + correctBlueNum);

        prize(correctRadNum, correctBlueNum);



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
//        int blueNum = sc.nextInt();
//
//        while (blueNum < 1 || blueNum > 16){
//            System.out.println("输入的蓝色球号码有误，请重新输入！");
//            blueNum = sc.nextInt();
//        }
        //⭐视频教学版本
        int blueNum = 0;
        while (true){
            blueNum = sc.nextInt();
            if ( blueNum >= 1 && blueNum <= 16){
                break;
            }else {
                System.out.println("输入的蓝色球号码有误，请重新输入！");
            }
        }

        return blueNum;
    }

    public static int[] randomRadNum() {
        int[]arr = new int[6];
        Random r = new Random();

        //获取六个1~33的随机数
        for (int i = 0; i < arr.length; i++) {
            int randomNum = r.nextInt(33) + 1;
            arr[i] = randomNum;
            //六个数不能相同
            boolean flag = false;
            for (int i1 = 0; i1 < i; i1++) {
                if (arr[i1] == arr[i]){
                    flag = true;
                    break;
                }
            }
            //如果相同重新随机，直至不相同为止
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

    public static int randomBlueNum(){
        Random r = new Random();
        int randomBlue = r.nextInt(16) + 1;

        return randomBlue;
    }

    public static int judgeRadNum(int[] arr, int[] brr){
        int correctNum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < brr.length; i1++) {
                if (arr[i] == brr[i1]){
                    correctNum ++;
                    //⭐如果找到了就跳出内循环
                    break;
                }
            }
        }
        return correctNum;
    }

    public static int judgeBlueNum(int blue, int randomBlue){
        int judge = 0;
        if (blue == randomBlue){
            judge = 1;
        }

        return judge;
    }

    public static void prize(int Red, int Blue){
        if (Red == 6 && Blue == 1){
            System.out.println("中" + Red + "+" + Blue + "，一等奖，奖金1000万");
        }else if (Red == 6 && Blue == 0){
            System.out.println("中" + Red + "+" + Blue + "，二等奖，奖金500万");
        } else if (Red == 5 && Blue == 1) {
            System.out.println("中" + Red + "+" + Blue + "，三等奖，奖金3000元");
        } else if ((Red == 5 && Blue == 0) || (Red == 4 && Blue == 1)) {
            System.out.println("中" + Red + "+" + Blue + "，四等奖，奖金200元");
        } else if ((Red == 4 && Blue == 0) || (Red == 3 && Blue == 1)) {
            System.out.println("中" + Red + "+" + Blue + "，五等奖，奖金10元");
        } else if ((Red == 2 && Blue == 1) || (Red == 1 && Blue == 1) || (Red == 0 && Blue == 1)) {
            System.out.println("中" + Red + "+" + Blue + "，六等奖，奖金5元");
        }else {
            System.out.println("没有中奖QWQ");
        }
    }

}
