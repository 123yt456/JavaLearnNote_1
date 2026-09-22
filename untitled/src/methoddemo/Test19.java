package methoddemo;

public class Test19 {
    //将数组arr中的newLength个元素拷贝到新数组中，并将新数组返回，从索引为0开始
    public static void main(String[] args) {
        int[] arr = {14, 6, 20, 51, 12, 33, 9, 79};
        int[] newArr = copyOf(arr, 3);

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] copyOf(int[] arr, int newLength){
        int[] newArr = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

}
