package stringdemo;

public class Test17 {
    //统计字符串Java出现的次数
    public static void main(String[] args) {
        String str = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，" +
                "Java是高性能的，Java语言是跨平台的";

        int count = getTimes(str, "Java");
        System.out.println(count);


    }

    public static int getTimes(String str, String java){
        int count = 0;
        //- indexOf(目标字符串)：在字符串里查找目标，**返回目标第一次出现的起始下标**
        //- 如果找不到目标，返回 -1
        int index = str.indexOf("Java");
        while (index != -1){
            count ++;
            str = str.substring(index + java.length());
            index = str.indexOf("Java");
        }
        return count;
    }
}
