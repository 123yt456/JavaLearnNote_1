package methoddemo;

public class Test17 {
    //将数T组arr中的所有元素的值改为value
    public static void main(String[] args) {
        int[] arr ={12, 13, 14, 15, 16};
       fill(arr, 5);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void fill(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
    }
}
