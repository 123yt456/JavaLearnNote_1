package methoddemo;

public class Test6 {
    //定义一个方法，求每一家商场的营业额
    public static void main(String[] args) {
        double a = getSum(20.4,45.0,63.9);
        double b = getSum(90.5,35.0,83.3);
        double c = getSum(29.3,40.5,13.7);

        double sum = a + b + c;
        System.out.println(sum);

    }

    public static double getSum(double num1, double num2, double num3) {
        double result = num1 + num2 + num3;
        return result;

    }
}
