package test;

import java.util.Random;

public class Test22 {
    //随机生成一个五位验证码
    //前四位是大写字母或小写字母，最后一位是数字
    //视频教学版
    public static void main(String[] args) {

        //创建一个字符组用来存放所有英文字母
        Random r = new Random();
        char[] arr = new char[52];

        //给字符组添加所有大小写英文字母
        for (int i = 0; i < arr.length; i++) {
            if (i <= 25){
                arr[i] = (char) (65 + i);
            } else {
                arr[i] = (char) (97 + i - 26);
            }
        }

        //随机四个英文字母放到输出结果中
        String result = "";
        for (int i = 0; i < 4; i++) {
            int temp = r.nextInt(arr.length);
            result += arr[temp];
        }

//        随机一个数字放到结尾
        int randomNum = r.nextInt(10);
        result += randomNum;

//        打印五位验证码
        System.out.println(result);



    }
}
