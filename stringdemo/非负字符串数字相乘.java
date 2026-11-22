package stringdemo;

public class 非负字符串数字相乘 {
    public static void main(String[] args) {
        String num1 = "12345";
        String num2 = "4556";

        int reverse1 = 0;
        for (int i = 0; i < num1.length(); i++) {
            reverse1 += num1.charAt(i) - '0';
            if (i != num1.length() - 1){
                reverse1 *= 10;
            }
        }

        int reverse2 = 0;
        for (int i = 0; i < num2.length(); i++) {
            reverse2 += num2.charAt(i) - '0';
            if (i != num2.length() - 1){
                reverse2 *= 10;
            }
        }

        int total = reverse1 * reverse2;

        System.out.println(total);
    }
}
