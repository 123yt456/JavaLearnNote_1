package methoddemo;

public class Test3 {
    //带参数的方法定义
    public static void main(String[] args) {
        getSum(5,10);
    }

    public static void getSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);

    }
}
