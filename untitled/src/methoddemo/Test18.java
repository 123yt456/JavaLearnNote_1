package methoddemo;

public class Test18 {
    //将数组arr中的元素从索引fromIndex开始到toIndex（不包含toIndex）对应的值改为value
    public static void main(String[] args) {
        int[] arr = {15, 61, 22, 54, 35, 47};
        fill(arr, 2, 4, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void fill(int[] arr, int fromindex, int toindex, int value){
        for (int i = fromindex; i < toindex; i++) {
            arr[i] = value;
        }
    }

}
