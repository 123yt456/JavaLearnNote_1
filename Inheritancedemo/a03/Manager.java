package Inheritancedemo.a03;

public class Manager extends Employee{
    private float manageReward;

    public Manager() {
    }

    public Manager(String id, String name, float salary, float manageReward) {
        super(id, name, salary);
        this.manageReward = manageReward;
    }

    @Override
    public void work() {
        System.out.println("经理正在管理其他人"+getManageReward()+getName());
    }

    public float getManageReward() {
        return manageReward;
    }

    public void setManageReward(float manageReward) {
        this.manageReward = manageReward;
    }
}
