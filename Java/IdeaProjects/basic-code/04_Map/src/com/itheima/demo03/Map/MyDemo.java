package com.itheima.demo03.Map;

import java.util.HashMap;
import java.util.Scanner;

public class MyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        // 创建一个map集合存储要找的字符和个数
        HashMap<Character,Integer> map = new HashMap<>();

        // 遍历字符串，获取每一个字符,存入map集合中
        for (char c : str.toCharArray()) {
            // 判断map集合中是否存有字符 c
            if(map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else {
                map.put(c,1);
            }
        }
        // 遍历Map集合，输入查找的结果
        // 使用Map.keySet()方法，将map集合中的key值存在set集合中
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }

    }
}
