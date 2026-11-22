package arraydemo;

public class Test4 {
    //判断奇偶性并变化数据
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arr1.length; i++) {
            //奇数扩大两倍，偶数变成原来的二分之一
            if (arr1[i] % 2 == 1){
                arr1[i] *= 2;
            }else {
                arr1[i] /= 2;
            }
            /*
            不建议放在这，一个循环只做一件事
            System.out.println(arr1[i]);
             */
        }
        //新建循环执行数组遍历
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}
