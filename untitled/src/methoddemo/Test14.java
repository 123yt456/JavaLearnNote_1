package methoddemo;

public class Test14 {
    //够得到小数类型数字的绝对值并返回
    public static void main(String[] args) {

        double num = getAbs(-5.88);
        System.out.println(num);
    }

    public static double getAbs(double num){
        if (num >= 0){
            return num;
        }else {
            num = - num;
            return num;
        }

    }
}
