package test;

import java.util.Random;

public class Test16 {
    //Random 打印随机数
    public static void main(String[] args) {
        Random r = new Random();

        //循环100次
        for (int i = 0; i < 100; i++) {
            //打印 33 ~ 60的数字
            int num = r.nextInt(28) + 33;
            System.out.println(num);
        }

//        System.out.println(num);
    }


}
