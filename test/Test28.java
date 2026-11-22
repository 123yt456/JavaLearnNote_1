package test;

public class Test28 {
    public static void main(String[] args) {
        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };


        int annualTotalRevenue = 0;
        for (int i = 0; i < arr.length; i++) {
            int quarterRevenue = 0;
            for (int j = 0; j < arr[i].length; j++) {
                quarterRevenue += arr[i][j];
                annualTotalRevenue += arr[i][j];
            }
            System.out.println("第" + (i + 1) + "个季度的总营业额为" + quarterRevenue);
        }
        System.out.println("全年总营业额为：" +  annualTotalRevenue);
    }
}
