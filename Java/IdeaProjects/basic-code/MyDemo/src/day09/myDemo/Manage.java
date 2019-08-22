package day09.myDemo;


import java.util.ArrayList;

public class Manage extends User {
    public Manage() {
    }

    public Manage(String name, int money) {
        super(name, money);
    }

    // 发红包的方法,返回一个ArrayList集合存储红包
    public ArrayList<Integer> sendMoney(int totleMoney, int count){
        // 创建集合存储要发的红包
        ArrayList<Integer> sedList = new ArrayList<>();

        // 获取群主的红包余额，并判断是否有发红包的资格
        int leftMoney = super.getMoney();

        if(leftMoney < totleMoney){
            System.out.println("您的余额不足，无法发红包！");
            return sedList; // 返回空集合
        }

        // 扣除群主的金额
        super.setMoney(leftMoney-totleMoney);
        // 将红包等分放入集合中
        int avg = totleMoney/count;
        int mod = totleMoney%count;
        for (int i = 0; i < count-1; i++) {
            sedList.add(avg);
        }
        sedList.add(avg+mod);

        return sedList;

    }
}
