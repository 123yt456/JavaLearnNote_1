package entity.a;

public class Mutsumi {
    private String name;
    private int age;


    //无参构造方法
    public Mutsumi() {
        System.out.println("没有定义构造方法哦！");
    }

    //有参构造方法
    public Mutsumi(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //给name赋值
    public void setName(String name) {
        this.name = name;
    }

    //获取name的值
    public String getName() {
        return name;
    }

    //给age赋值
    public void setAge(int age) {
        if (age <= 15) {
            this.age = age;
        } else {
            System.out.println("非法数据！（小睦最大15岁喵）");
        }
    }

    //获取age的值
    public int getAge() {
        return age;
    }


    public void getHobby() {
        System.out.println("喜欢黄瓜~");
    }

    public void getSelf() {
        System.out.println("Mortis——");
    }
}
