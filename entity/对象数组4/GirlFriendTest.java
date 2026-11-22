package entity.对象数组4;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];

        GirlFriend g1 = new GirlFriend("若叶睦", 15, '女', "弹吉他");
        GirlFriend g2 = new GirlFriend("艾玛", 15, '女', "玩捉迷藏");
        GirlFriend g3 = new GirlFriend("千枝实", 21, '女', "打猎");
        GirlFriend g4 = new GirlFriend("七海千秋", 17, '女', "玩游戏");


        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend girlFriend = arr[i];
            sum += girlFriend.getAge();
        }

        int count = 0;
        int avg = sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend girlFriend = arr[i];
            if (girlFriend.getAge() < avg){
                count ++;
                System.out.println(girlFriend.getName() + "，" + girlFriend.getAge() + "，" + girlFriend.getGender() + "，" + girlFriend.getHobby());
            }
        }
        System.out.println(count + "个");
    }
}
