package arraydemo;

public class Test2 {
    //遍历数组并求和
    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println(sum);
    }
}
