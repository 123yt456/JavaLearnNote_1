package test.test31_interface2;

public class interimpl implements interA, interB{

    //实现多个接口存在相同名字的默认方法时，子类必须对该方法进行重写
    //细节：重写时去掉default关键字
    @Override
    public void method() {
        System.out.println("重写默认方法");
    }
}
