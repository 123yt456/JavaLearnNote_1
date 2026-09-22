package test;

public class Test20 {
    //找101~200之间的质数并打印
    //平方根版
    public static void main(String[] args) {

        num(101, 200);

    }

//判断两数范围内有多少个质数并打印
    public static void num(int from, int to){
        int count = 0;

        for (int i = from; i <= to; i++) {
            boolean flag = true;
            int sqrt = getSqrt(i);
            for (int i1 = 2; i1 <= sqrt; i1++) {
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

//获取一个数的平方根
    public static int getSqrt(int num){
        int i = 1;
        for (; i < num; i++) {
            if (i * i == num){
                return i;
            } else if (i * i > num) {
                i -= 1;
                return i;
            }
        }
        return i;
    }
}


