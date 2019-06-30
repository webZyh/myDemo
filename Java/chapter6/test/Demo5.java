abstract class Shape {
  /**
   * ������״�����
   * @return ��״�����
   */
  abstract double area();
   
  /**
   * ������״���ܳ�
   * @return ��״���ܳ�
   */
  abstract double perimeter();
}
/**
 * Բ��
 * @author developer
 * @version 2017.05.23
 */
class Circle extends Shape {
  /**
   * �뾶
   */
  protected double radius;
   
  /**
   * ���췽��
   * @param radius �뾶
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
       
      System.out.println("Բ�������" + s.area());
      System.out.println("Բ���ܳ���" + s.perimeter());
  }
}