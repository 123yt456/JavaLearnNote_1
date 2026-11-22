package arraydemo;

public class 接雨水 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        int count = 0;
        int m = 0;
        for (int i = 0; i < index; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
            if (arr[i] < m) {
                count += m - arr[i];
            }
        }
//        System.out.println(count);

        int m2 = 0;
        for (int i = arr.length - 1; i > index; i--) {
            if (arr[i] > m2){
                m2 = arr[i];
            }
            if (arr[i] < m2){
                count += m2 - arr[i];
            }
        }

        System.out.println(count);
    }
}
