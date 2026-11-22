package stringdemo;

public class Test1 {
    //创建String对象的两种方式
    public static void main(String[] args) {

        //第一种，直接赋值：
        String s1 = "小七走";
        System.out.println(s1);


        //第二种，用new的方式来获取一个空白字符串对象
        //空参构造，可以获取一个空白的字符串对象
        String s5 = new String();
        System.out.println("测试喵" + s5 + "测试喵");

        //传递一个字符串，根据传递的字符串内容在创建一个新的字符串对象
        String s2 = new String("阿拉蕾");
        System.out.println(s2);

        //传递一个字符数组，根据字符数组的内容在创建一个新的字符串对象
        char[] chs = {'a', 'b', 'c'};
        String s3 = new String(chs);
        System.out.println(s3);

        //传递一个字节数组，根据字节数组的内容在创建一个新的字符串对象
        byte[] bytes = {97, 98, 99, 100};
        String s4 = new String(bytes);
        System.out.println(s4);


    }
}
