package test;
import java.util.Scanner;

public class Test24 {
    //评委打分
    //没写方法，视频教学中写了四个方法(除了最后算总得分的另外四个方法)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        //将键盘录入的评分存入数组
        System.out.println("请依次输入六个评委的打分");
        for (int i = 0; i < arr.length; ) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){
                arr[i] = score;
                i++;
            }else {
                System.out.println("输入的分数有误，请重新输入！！");
            }
        }

        //获取最大评分
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }

        //获取最小评分
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }

        //获取总评分
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        //最终得分(去掉最高分和最低分后的四个评委平均分)
        int result = (sum - max - min) / (arr.length - 2);

        System.out.println("选手的最终得分为：" + result);
    }
}
