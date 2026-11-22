package methoddemo;

public class Test9 {
    //利用方法重载，兼容byte,short,int,long
    //比较两个整数是否相同
    //视频教学版
    public static void main(String[] args) {
        //1.
        compare(4,9);

        //2.
        compare((byte) 5,(byte) 6);

        //3.
        byte a = 10;
        byte b = 7;
        compare(a,b);
    }

    public static void compare(int num1, int num2){
        System.out.println(num1 == num2);
    }

    public static void compare(byte num1, byte num2){
        System.out.println(num1 == num2);
    }

    public static void compare(short num1, short num2){
        System.out.println(num1 == num2);
    }

    public static void compare(long num1, long num2){
        System.out.println(num1 == num2);
    }


}
