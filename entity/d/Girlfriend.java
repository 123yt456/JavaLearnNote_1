package entity.d;

public class Girlfriend {
    private String name;
    private int height;
    private int weight;

    public void wash(){
        System.out.println("女朋友给我洗衣服");
    }

    public void cook(){
        System.out.println("女朋友给我做饭");
    }

    public void show(){
        System.out.println("我女朋友叫" + name + "，身高" + height + "厘米，体重" + weight + "公斤");
    }



    public Girlfriend(){
    }

    public Girlfriend(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
