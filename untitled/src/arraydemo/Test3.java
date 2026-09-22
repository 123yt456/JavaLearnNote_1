package arraydemo;

public class Test3 {
    //统计能被3整除的数字个数
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 3 == 0) {
                count ++;
   //                System.out.println(arr1[i]);
            }
        }
        System.out.println("有" + count + "个能被3整除的数");
    }
}
