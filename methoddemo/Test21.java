package methoddemo;
import java.util.Random;

public class Test21 {
    //随机抽奖并打印奖项，每个奖只能抽一次
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] brr = new int[arr.length];

        Random r = new Random();

        for (int i = 0; i < arr.length;) {
            int num = r.nextInt(arr.length);
            int prize = arr[num];

            boolean flag = getAward(brr, prize);
            if (!flag){
                brr[i] = prize;
                i++;
            }
        }

        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }

    }

    public static boolean getAward(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize){
                return true;
            }
        }
        return false;
    }
}
//        switch (index){
//            case 0:
//                System.out.println(arr[0] + "的奖金被抽出");
//                break;
//            case 1:
//                System.out.println(arr[1] + "的奖金被抽出");
//                break;
//            case 2:
//                System.out.println(arr[2] + "的奖金被抽出");
//                break;
//            case 3:
//                System.out.println(arr[3] + "的奖金被抽出");
//                break;
//            case 4:
//                System.out.println(arr[4] + "的奖金被抽出");
//                break;
//        }