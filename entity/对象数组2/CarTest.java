package entity.对象数组2;
import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Cars[] arr = new Cars[3];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Cars c = new Cars();
            System.out.println("请输入汽车品牌：");
            String brand = s.next();
            c.setBrand(brand);

            System.out.println("请输入汽车价格：");
            int prize = s.nextInt();
            c.setPrize(prize);

            System.out.println("请输入汽车颜色：");
            String color = s.next();
            c.setColor(color);

            arr[i] = c;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBrand() + arr[i].getPrize() + arr[i].getColor());
        }

    }
}
