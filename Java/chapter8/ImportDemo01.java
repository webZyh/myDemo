package org.zyh.b;  // 定义一个包
import org.zyh.a.Demo;  // 手动加载所需的类
import org.zyh.a.*; // 自动加载所需的类

public class ImportDemo01{
  public static void main(String args[]){
    System.out.println(new Demo().getInfo());
  }
}