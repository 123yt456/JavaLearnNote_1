package Inheritancedemo.a05;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //多态的运用：
    //动物类型写父类对象，这样就能传递狗也可以传递猫
    public void keepPet(Animal a, String something){
        //判断类型，狗/猫
        if (a instanceof Dog){
            //强转动物类型（⭐因为Animal不能调用子类方法，需要强转才能调用）
            //也方便输出对应动物类型的语句
            Dog g = (Dog)a;
            System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" +
                    g.getColor() + "的" + g.getAge() + "岁的狗");
            g.eat(something);
        }else if (a instanceof Cat){
            Cat c = (Cat)a;
            System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" +
                    c.getColor() + "的" + c.getAge() + "岁的猫");
            c.eat(something);
        }else {
            System.out.println("没有这种动物");
        }
    }
}
