package stringdemo;
import java.util.Scanner;


public class 调整字符串 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串：");
        String strA = sc.next();
        System.out.println("请输入第二个字符串：");
        String strB = sc.next();

        //遍历字符串A 并进行旋转操作
        boolean result = compareStr(strA, strB);
        System.out.println(result);


    }

    private static boolean compareStr(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)){
                return true;
            }
        }
        return false;
    }

    //1.用subString进行截取，再把左边的字符截取出来拼接到右侧去
    private static String rotate(String str) {
        String first = str.substring(0, 1);  //或者 str.charAt(0);
          String end = str.substring(1);

        return end + first;
    }

    //2.把字符串先变成一个字符数组，然后调整字符数组里面数据，最后再把字符数组变成字符串
    private static String rotate2(String str) {
        char[] arr = str.toCharArray();

        char first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;

        String result = new String(arr);


        return result;
    }

}
