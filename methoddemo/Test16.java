package methoddemo;

public class Test16 {
    public static void main(String[] args) {
        int [] arr1 = {11, 22, 33};
        int [] arr2 = {11, 22, 33};

        fill(arr1, arr2);

    }

    public static void fill(int [] arr1, int [] arr2){
        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]){
                    System.out.println("不相同");
                }
            }
            System.out.println("相同");
        }else {
            System.out.println("不相同");
        }
    }
}
