package arraydemo;

public class Test7 {
    //交换数组中的数据
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};


        //第一种循环写法
//        for (int i = 0; i < arr.length / 2; i++) {
            //1.
//            int a = arr[i];
//            int b = arr[arr.length - i - 1];
//            arr[i] = b;
//            arr[arr.length - i - 1] = a;

            //2.
//            int temp = arr[i];
//            arr[i] = arr[arr.length - i - 1];
//            arr[arr.length - i - 1] = temp;
//        }

        //第二种循环写法(视频教学方法)
        for (int i = 0, j = arr.length - 1; i < j; i ++, j --){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


        //打印遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
