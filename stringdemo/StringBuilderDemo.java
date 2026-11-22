package stringdemo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //可以写成 链式编程：sb.append("nihao").append(123456);
        sb.append("nihao");
        sb.append(123456);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        int num = sb.length();
        System.out.println(num);

        String str = sb.toString();
        System.out.println(str);

    }
}
