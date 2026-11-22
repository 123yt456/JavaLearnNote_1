package stringdemo;

public class Test11 {
    //身份证号码信息查看
    public static void main(String[] args) {
        String id = "356615200501314059";

        String brithYear = id.substring(6, 10);

        String birthMonth = id.substring(10, 12);
        if (birthMonth.charAt(0) == '0'){
            birthMonth = birthMonth.substring(1);
        }

        String birthDay = id.substring(12, 14);


        char gender = id.charAt(16);
        int num = gender - 48;

        System.out.println("人物信息为：");
        System.out.println("出生年月日：" + brithYear + "年" + birthMonth + "月" + birthDay + "日");
        if (num % 2 == 0){
            System.out.println("性别为：男");
        }else {
            System.out.println("性别为：女");
        }
    }
}
