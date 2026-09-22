package methoddemo;

public class Test4 {
    //定义方法求长方形的周长
    public static void main(String[] args) {
        getPerimeter(5.7,15.2);

    }

    public static void getPerimeter(double length, double width ) {
         double perimeter = (length + width) * 2;
        System.out.println(perimeter);
    }
}
