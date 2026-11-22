package test.test32_inner;
public class Outer {
    private int a = 10;

    public class Inner{
        private int a = 20;

        public void show(){
            int a = 30;
            System.out.println(new Outer().a);
            System.out.println(this.a);
            System.out.println(a);
        }
    }

    //创建外部类方法，返回内部类对象
    public Inner getInstance(){
        return new Inner();
    }
}
