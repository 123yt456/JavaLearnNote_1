package test.test32_inner;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Outer o = new Outer();
        /*
        因为inner是private私有的
        所以变量类型不能直接写Outer.Inner（找不到内部类对象，会报错）
        第一种：用父类类型 Object 接收
        第二种：直接使用方法获取到的对象
         */
        Object inner = o.getInstance();
        o.getInstance();

        //细节：用美元符号$区分内部类
        System.out.println(inner);

//        Outer.Inner oi = new Outer().new Inner();
        o.getInstance().show();

        Scanner sc = new Scanner(System.in);
        sc.nextInt();
    }
}
