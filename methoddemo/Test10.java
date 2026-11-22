package methoddemo;

public class Test10 {
    //四个练习
    public static void main(String[] args) {
        int [] arr = {11, 22, 33, 44, 55};
        //1.
        getArray(arr);

        //2.
        int max = getMax(arr);
        System.out.println(max);

        //3.
        boolean result = getExist(22,arr);
        System.out.println(result);

        //4.
        int [] copyArr = copyOfRange(arr, 1, 4);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }

    }

    //设计方法遍历数组 打印格式：[a,b,c]
    public static void getArray(int [] arr2){
        System.out.print("[");
        for (int i = 0; i < arr2.length; i++) {
            int temp = arr2[i];
            if (i == arr2.length - 1){
                System.out.print(temp);
            }else {
                System.out.print(temp + ", ");
            }
        }
        System.out.println("]");
    }

    //求数组的最大值,返回最大值
    public static int getMax(int [] arr3){
        int max = arr3[0];
        for (int i = 1; i < arr3.length; i++) {
            if (max < arr3[i]){
                max = arr3[i];
            }
        }
        return max;
    }

    //判断数组中的某一个数是否存在,将结果返回给调用处
    public static boolean getExist(int num, int [] arr4){
          //第一种方法：
//        boolean judge = false;
//        for (int i = 0; i < arr4.length; i++) {
//            if (num == arr4[i]){
//                judge = true;
//            }
//        }
//        return judge;

        //第二种方法(⭐视频教学版)：
        for (int i = 0; i < arr4.length; i++) {
            if (num == arr4[1]){
                return true;
            }
        }return false;
    }

    //将新数组从 索引from(包含) 到 索引to(不包含) 的元素复制到新数组中
    //并将新数组返回
    public static int[] copyOfRange(int [] arr5, int from, int to){
        //第一种方法
//        int length = to - from;
//        int [] copyarr = new int [length];
//
//        for (int i = 0; i < length; i++) {
//            copyarr[i] = arr5[from + i];
//        }
//        return copyarr;

        //第二种方法(⭐视频教学版)
        int length = to - from;
        int [] newArr = new int[length];
        int index = 0;

        for (int i = from; i < to; i++) {
            newArr[index] = arr5[i];
            index ++;
        }
        return newArr;
    }

}
