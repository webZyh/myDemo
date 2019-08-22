package day09.myDemo;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    // 群众收红包
    public void recieve(ArrayList<Integer> list){
        // 获取一个随机的索引
        int index = new Random().nextInt(list.size());

        // 拿到集合中的红包
        int delta = list.remove(index);

        //获取自己的余额并加上收红包的余额
        int money = super.getMoney();

        super.setMoney(money+delta);
    }
}
