package arraydemo;

public class Test5 {
    public static void main(String[] args) {
        int [] arr1 = {33, 5, 22, 44, 55};

        //求最值
        //max不能取0，如果是负数则不能判断，必须是数组中的值
        int max = arr1[0];
        //循环开始条件可以写1，提高代码的效率(因为开始为0时第一次是自己和自己比较)
        for (int i = 0; i < arr1.length; i++) {
            if (max < arr1[i]){
                max = arr1[i];
            }
        }
        //三元写法：max = max < arr1[i] ? arr1[i] : max;
        System.out.println("最大值是" + max);

    }
}
