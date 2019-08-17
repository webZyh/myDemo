package cn.zyh.day04.demo02;

public class Demo01Method {
    public static void main(String[] args) {
        sum(10,20);
        System.out.println(sum(10,20));
    }
    public static int sum(int a, int b){
        int result = a+b;
        return result;
    }
}
