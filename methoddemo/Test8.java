package methoddemo;

public class Test8 {
    //利用方法重载，兼容byte,short,int,long
    //比较两个整数是否相同
    public static void main(String[] args) {

        int compare = get(10,10);
        if (compare == 0){
            System.out.println("两个数不相同");
        }else {
            System.out.println("两个数相同");
        }
    }

    public static int get(int num1, int num2){
        boolean temp = num1 == num2;
        int  result = 1;
        if (!temp){
            result = 0;
        }
        return result;
    }

    public static int get(byte num1, byte num2){
        boolean temp = num1 == num2;
        int  result = 1;
        if (!temp){
            result = 0;
        }
        return result;
    }

    public static int get(short num1, short num2){
        boolean temp = num1 == num2;
        int  result = 1;
        if (!temp){
            result = 0;
        }
        return result;
    }

    public static int get(long num1, long num2){
        boolean temp = num1 == num2;
        int  result = 1;
        if (!temp){
            result = 0;
        }
        return result;
    }


}
