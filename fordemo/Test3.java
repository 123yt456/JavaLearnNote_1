package fordemo;

public class Test3 {
    public static void main(String[] args) {
        int sum = 0;
        //求 1——100 的偶数之和

        //1.
        //可以快捷写成 100.for 后按回车
//        for (int i = 0; i <= 100; i += 2){
//            sum += i;
//        }
//        System.out.println(sum);


        //2.
//        for (int i = 1; i <= 100; i++ ){
//            if (i % 2 ==0){
//                sum += i;
//            }
//        }
//        System.out.println(sum);


        //3.
        int sum2 =0;
        for (int i = 1; i <= 100; i++ ) {
            sum2 +=(i % 2 == 0) ? i : 0;
        }
        System.out.println(sum2);


    }
}
