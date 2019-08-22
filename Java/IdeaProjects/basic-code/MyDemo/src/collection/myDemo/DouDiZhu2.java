package collection.myDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// 创建一个map集合存放牌的索引和值，实现有序的斗地主
public class DouDiZhu2 {
    public static void main(String[] args) {
        // 创建map集合存放牌的索引和牌
        HashMap<Integer,String> poker = new HashMap<>();
        // 创建list集合存放索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();

        // 创建list集合存放牌的花色和内容，然后循环遍历组合
        List<String> colors = List.of("♥", "♦", "♠", "♣");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        //先将大小王特殊牌存入poker集合,将索引存入pokerIndex集合
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;
        // 循环遍历组合牌，存入poker集合中
        for (String number : numbers) { //此处需要把number放在外层，否则按索引排序会乱
            for (String color : colors){
                poker.put(index, color+number);
                pokerIndex.add(index);
                index++;
            }
        }

        // 洗牌
        Collections.shuffle(pokerIndex);
        // 创建玩家和底牌集合
        List<Integer> play1 = new ArrayList<>();
        List<Integer> play2 = new ArrayList<>();
        List<Integer> play3 = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();
        // 发牌，发的是索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            // i为pokerIndex集合的索引， ind为存储的值（是牌的索引）
            Integer ind = pokerIndex.get(i);
            if(i>=51){
                dipai.add(ind);
            }else if(i%3==0){
                play1.add(ind);
            }else if(i%3==1){
                play2.add(ind);
            }else if(i%3==2){
                play3.add(ind);
            }
        }

        // 排序
        Collections.sort(play1);
        Collections.sort(play2);
        Collections.sort(play3);
        Collections.sort(dipai);
        System.out.println(play1);
        System.out.println(play2);
        System.out.println(play3);
        System.out.println(dipai);
        // 看牌
        lookMethod("张三",poker,play1);
        lookMethod("李四",poker,play2);
        lookMethod("王五",poker,play3);
        lookMethod("底牌",poker,dipai);
    }

    private static void lookMethod(String name, HashMap<Integer,String> poker, List<Integer> list) {
        System.out.print(name+":");
        // 看牌，通过list中存储的索引，在poker集合中找到值
        for (Integer key : list) {
            String value = poker.get(key);
            System.out.print(value+" ");
        }
        System.out.println();


    }
}
