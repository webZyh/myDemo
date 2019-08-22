package day09.myDemo;

import java.util.ArrayList;

public class SendMoneyDemo {

    public static void main(String[] args) {

        // 创建群主和群众
        Manage manage = new Manage("群主",100);
        Member one = new Member("群众A",0);
        Member two = new Member("群众B",0);
        Member three = new Member("群众C",0);

        manage.show();
        one.show();
        two.show();
        three.show();

        System.out.println("====================");

        ArrayList<Integer> list = manage.sendMoney(20,3);
        one.recieve(list);
        two.recieve(list);
        three.recieve(list);

        manage.show();
        one.show();
        two.show();
        three.show();
    }

}
