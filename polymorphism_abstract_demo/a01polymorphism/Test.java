package polymorphism_abstract_demo.a01polymorphism;

public class Test {
    public static void main(String[] args) {
        //多态应用
        Dog d = new Dog();
        getEat(d);
//        a.setName("小黑");
//        a.setAge(2);
//        System.out.println(a.getName() + " " + a.getAge());
    }

    //父类当参数，接收所有子类
    //好处：getEat只用写一份，以后新增兔子、鸭子，**不用改这个方法**，直接传新子类，扩展性好
    public static void getEat(Animal a){
        a.eat();
    }
}
