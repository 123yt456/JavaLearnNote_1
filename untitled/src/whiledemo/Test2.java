package whiledemo;

public class Test2 {
    public static void main(String[] args) {
        double height = 8844430.0;
        double paper = 0.1;
        int count = 0;

        while (paper < height){
            paper *= 2;
            count++;
        }

        System.out.println(count);

    }

}
