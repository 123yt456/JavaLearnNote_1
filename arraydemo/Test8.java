package arraydemo;
import java.util.Random;

public class Test8 {
    //打乱数组中的数据
    public static void main(String[] args) {
        Random r = new Random();

        int [] arr1 = {1, 2, 3, 4, 5};
        //循环遍历数组，从0开始打乱数据的顺序
        for (int i = 0; i < arr1.length; i++) {
            //生成一个随机索引
            int ran = r.nextInt(arr1.length);
            //拿着随机索引指向的元素，和i指向的元素进行交换
            int temp = arr1[i];
            arr1[i] = arr1[ran];
            arr1[ran] = temp;
        }
        //打印遍历数组
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1){
                System.out.print(arr1[i]);
            }else {
                System.out.print(arr1[i] + ",");
            }
        }

    }
}
