package methoddemo;

public class Test13 {
    //奇数放在数组的左边，偶数放在数组的右边
    public static void main(String[] args) {
        int [] arr1 = {2, 5, 91, 16, 37, 20, 41, 62, 55, 33};
        int [] arr2 = new int[arr1.length];

        int left = 0;
        int right = 1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 1){
                arr2[left] = arr1[i];
                left ++;
            }else {
                arr2[arr2.length - right] = arr1[i];
                right ++;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
