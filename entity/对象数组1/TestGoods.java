package entity.对象数组1;

public class TestGoods {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];

        Goods g1 = new Goods("001", "结城理兔兔玩偶", 99, 200);
        Goods g2 = new Goods("002", "怪盗团面具", 69, 150);
        Goods g3 = new Goods("003", "八十稻屿特产", 30, 500);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + "，" + goods.getName() + "，" + goods.getPrize() + "，" + goods.getCount());
        }
    }
}
