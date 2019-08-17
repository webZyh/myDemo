package cn.itcast.day07.demo05;

import java.util.ArrayList;

// 自定义4个学生对象，添加到集合，并遍历。
public class MyDemo02 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("zyh", 18);
        Student s2 = new Student("zlc", 12);
        Student s3 = new Student("zgx", 28);
        Student s4 = new Student("lhj", 2);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("我是学生"+(i+1)+"，姓名"+stu.getName()+",年龄"+stu.getAge());
        }
    }
}
