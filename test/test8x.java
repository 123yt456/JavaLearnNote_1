package test;

//三元运算符练习2
public class test8x {
    public static void main(String[] args) {
        int a = 150;
        int b = 210;
        int c = 165;

//        int next = a > b ? a : b;
//        int result = next > c ? next : c;

        //或者
        int result = (a > b ? a : b) > c ? (a > b ? a : b) : c;


        System.out.println(result);


    }
}
