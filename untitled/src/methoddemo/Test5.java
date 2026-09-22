package methoddemo;

public class Test5 {
    //定义一个方法求圆的面积并打印
    public static void main(String[] args) {
        getArea(2.5);
    }

    public static void getArea(double r) {
        double area = 3.14 * r * r;
        System.out.println(area);

    }
}
