package methoddemo;

public class Test7 {
    //定义方法比较两个长方形的面积
    public static void main(String[] args) {
        int area1 = getArea(4, 6);
        int area2 = getArea(5, 8);

        if (area1 > area2){
            System.out.println("第一个长方形面积大");
        } else if (area1 < area2) {
            System.out.println("第二个长方形面积大");
        }else {
            System.out.println("两个长方形面积相等");
        }

    }

    public static int getArea(int length, int width){
        int result = length * width;
        return result;
    }

}
