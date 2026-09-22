package methoddemo;
import java.util.Scanner;

public class Test11 {
    //键盘录入一个数字，并按照从小到大的顺序插入一个数组中，生成一个新的数组
    public static void main(String[] args) {
        //创建数组1.2
        int [] arr1 = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int [] arr2 = new int[arr1.length + 1];

        //键入数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();

        //将数组的数字复制到新数组，并将键入数字放置最后
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[arr2.length - 1] = num;

        //获得键入数字应存放的索引位置
        int index = arr2.length - 1;
        for (int i = 0; i < arr2.length; i++) {
            if (num < arr2[i]){
                index = i;
                break;
            }
        }

        //从后向前依次移动数组，最后把键入数字放置到它的索引位置
        for (int i = arr2.length-1; i > index; i--) {
            arr2[i] = arr2[i-1];
        }
        arr2[index] = num;

        //遍历打印数组
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }


    }
}
//        for (int i = 0; i < arr2.length - 1; i++) {
//            if (num > arr2[i] && num < arr2[i + 1]){
//                for (int i1 = i + 1; i1 < arr2.length; i1++) {
//                    int temp = arr2[i1];
//                    arr2[i1] = num;
//                    num = temp;
//                }
//            }else if (num < arr2[0]){
//                for (int i1 = 0; i1 < arr2.length - 1; i1++) {
//                    int temp = arr2[i1];
//                    arr2[i1] = num;
//                    num = temp;
//                }
//            }
//        }
