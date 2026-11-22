package entity.对象数组3;

public class Phone {
    private String brand;
    private int prize;
    private String color;

    public Phone() {
    }

    public Phone(String brand, int prize, String color) {
        this.brand = brand;
        this.prize = prize;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
