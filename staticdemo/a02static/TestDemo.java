package staticdemo.a02static;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 34, 100};
        double[] arr2 = {10.1, 12.2, 13.3};

        String printArr = ArrayUtil.printArr(arr);
        System.out.println(printArr);

        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
