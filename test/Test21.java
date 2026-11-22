package test;

import java.util.Random;

public class Test21 {
    //随机生成一个五位验证码
    //前四位是大写字母或小写字母，最后一位是数字
    public static void main(String[] args) {
         getNum();
    }

    public static void getNum(){
        Random r = new Random();
        int ranNum = r.nextInt(10);

        char num = 0;
        for (int i = 0; i < 4; i++) {
            int judge = r.nextInt(2);
            if (judge == 0){
                num = (char) (r.nextInt(26) + 65);
            } else if (judge == 1) {
                num = (char) (r.nextInt(26) + 97);
            }
            System.out.print(num + " ");
        }
    System.out.print(ranNum + " ");
   }

}