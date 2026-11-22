package stringdemo;

public class Test10 {
    //手机号屏蔽
    public static void main(String[] args) {
        String str = "17622585374";

        String start = str.substring(0, 3);
        String end = str.substring(7);

        String result = start + "****" + end;

        System.out.println(result);
    }
}
