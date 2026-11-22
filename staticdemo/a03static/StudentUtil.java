package staticdemo.a03static;

import java.util.ArrayList;

public class StudentUtil {
    //私有化构造方法
    private StudentUtil(){}

    public static int getMaxAge(ArrayList<Student> list){
        int maxAge = 0;
        for (int i = 0; i < list.size(); i++) {
            //⭐方法反复调用，用一个临时变量进行记录，提高代码的效率
            int age = list.get(i).getAge();
            if (maxAge < age){
                maxAge = age;
            }
        }
        return maxAge;
    }
}
