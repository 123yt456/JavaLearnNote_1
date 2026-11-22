package arraylistdemo.添加手机对象并返回要求的数据;

public class Phone {
    private String brand;
    private int prize;

    public Phone() {
    }

    public Phone(String brand, int prize) {
        this.brand = brand;
        this.prize = prize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }
}
