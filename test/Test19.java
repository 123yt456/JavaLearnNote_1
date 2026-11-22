package test;

public class Test19 {
    //找101~200之间的质数并打印
    //从头到尾循环版
    public static void main(String[] args) {

        num(101, 200);

    }

    public static void num(int from, int to){
        int count = 0;

        for (int i = from; i <= to; i++) {
            boolean flag = true;
            for (int i1 = 2; i1 < i; i1++) {
                if (i % i1 == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
                count ++;
            }
        }
        System.out.println("共有" + count + "个质数");
    }
}


