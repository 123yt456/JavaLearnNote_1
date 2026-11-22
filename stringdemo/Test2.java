package stringdemo;

public class Test2 {
    //字符串的比较
    public static void main(String[] args) {
        String s1 = new String("Abc");
        String s2 = "abc";

        //==号比较
        boolean result1 = s1 == s2;
        System.out.println(result1);

        //比较字符串内容是否相等
        boolean result2 = s1.equals(s2);
        System.out.println(result2);

        //忽略大小写，比较字符串内容是否相等
        boolean result3 = s1.equalsIgnoreCase(s2);
        System.out.println(result3);
    }
}
