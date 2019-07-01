abstract class Shape {
  /**
   * 计算形状的面积
   * @return 形状的面积
   */
  abstract double area();
   
  /**
   * 计算形状的周长
   * @return 形状的周长
   */
  abstract double perimeter();
}
/**
 * 圆类
 * @author developer
 * @version 2017.05.23
 */
class Circle extends Shape {
  /**
   * 半径
   */
  protected double radius;
   
  /**
   * 构造方法
   * @param radius 半径
   */
  public Circle(double radius) {
      this.radius = radius;
  }

  double area() {
      return Math.PI * radius * radius;
  }

  double perimeter() {
      return 2 * Math.PI * radius;
  }
}
public class Demo5 { 
  public static void main(String[] args) {
      Shape s = null;
      s = new Circle(3);
       
      System.out.println("圆的面积：" + s.area());
      System.out.println("圆的周长：" + s.perimeter());
  }
}