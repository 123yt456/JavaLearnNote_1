package methoddemo;

public class Test20 {
    //将数组arr中从索引from（包含from）开始，到索引to结束（不包含to）的元素复制到新数组中，
    public static void main(String[] args) {
        int[] arr = {12, 13, 24, 37, 46, 50};
        int[] newArr = copyOfRange(arr,1,4);

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to){
        int max = Math.max(from, to);
        int min = Math.min(from,to);
        int length = max - min;
        int index = 0;

        int[] newArr = new int[length];

        for (int i = min; i < max; i++) {
            newArr[index] = arr[i];
            index ++;
        }
        return newArr;
    }
}
