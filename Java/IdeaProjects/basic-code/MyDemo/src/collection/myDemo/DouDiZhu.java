package collection.myDemo;


import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        // 创建一副牌，包含大小王，四色，每色13张的54张牌，存储到一个集合中
        ArrayList<String> poker = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");

        String [] colors = {"♥","♦","♠","♣"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        // 使用循环遍历，组合出牌
        for (String color : colors) {
            for (String number : numbers) {
                String s = color + number;
                poker.add(s);
            }
        }

        // 洗牌，使用collections类的静态方法
        Collections.shuffle(poker);
        // System.out.println(poker);

        // 创建四个集合，分别存储三个玩家的牌和底牌
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        // 发牌，循环遍历poker
        method(poker, play1, play2, play3, dipai);

        // 看牌，显示每个玩家的牌和底牌
        System.out.println("玩家1"+ play1);
        System.out.println("玩家2"+ play2);
        System.out.println("玩家3"+ play3);
        System.out.println("底牌"+ dipai);
    }

    public static void method(ArrayList<String> poker, ArrayList<String> play1, ArrayList<String> play2, ArrayList<String> play3, ArrayList<String> dipai) {
        for (int i = 0; i < poker.size(); i++) {
            // 根据索引获取所有的牌
            String p = poker.get(i);
            if(i>=51){
                dipai.add(p);
            }else if(i%3==0){
                play1.add(p);
            }else if(i%3==1){
                play2.add(p);
            }else if(i%3==2){
                play3.add(p);
            }
        }
    }
}
