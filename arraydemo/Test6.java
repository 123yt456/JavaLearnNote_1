package arraydemo;
import java.util.Random;

public class Test6 {
    //遍历数组求和
    public static void main(String[] args) {
        Random r = new Random();
        int [] arr = new int[10];
        int sum = 0;

        //生成10个 1——100 的随机数存入数组
        for (int i = 0; i <10; i++) {
            int num = r.nextInt(100) + 1;
            arr[i] = num;
        }

        //求所有数据的和
        for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
        }
        System.out.println("数组中所有数据和为：" + sum);

        //求所有数据的平均数
        int avg = sum / arr.length;
        System.out.println("数组的平均数为：" + avg);

        //统计有多少个数据比平均值小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg){
                count ++;
            }
        }
        System.out.println("数组中比平均值小的个数：" + count);
    }
}
