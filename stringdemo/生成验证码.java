package stringdemo;

import java.util.Random;

public class 生成验证码 {
    public static void main(String[] args) {
        //创建一个五位数字符数组
        char[] arr = new char[5];

        //数组前四位随机生成四个大小写英文字母
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            boolean judge = r.nextBoolean();
            if (judge){
                arr[i] = (char) (r.nextInt(26) + 65);
            }else {
                arr[i] = (char) (r.nextInt(26) + 97);
            }
        }

        //数组最后一位填上一个随机数字
        int num = r.nextInt(10);
        arr[arr.length - 1] = (char)('0' + num);

        //随机生成一个交换索引
        int index = r.nextInt(arr.length);

        //将最后一位数字和随机索引做交换
        char temp = arr[index];
        arr[index] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        //把字符数组转成字符串并打印
        String result = new String(arr);
        System.out.println(result);

    }
}
