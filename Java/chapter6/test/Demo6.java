/* 
  ʹ���������ĸ����ʾ����������
  С��ȥ���������������򵽵Ķ��������ڹ��ﳵ֮�У��������̨һ�����
*/

interface Goods{
  public String getName();
  public double getPrice();
}
/* ����̳и���ʱ������Ҫ����public���� */
class EatFood implements Goods{
  private String name;
  private double price;
  public EatFood(){};
  public EatFood(String name, double price){
    this.name = name;
    this.price = price;
  }
  @Override
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }
  @Override
  public double getPrice(){
    return this.price;
  }
  public void setPrice(double price){
    this.price = price;
  }
}
class WashGoods implements Goods{
  private String name;
  private double price;
  public WashGoods() {}
  public WashGoods(String name, double price) {
    super();
    this.name = name;
    this.price = price;
  }
  @Override
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }
  @Override
  public double getPrice(){
    return this.price;
  }
  public void setPrice(double price){
    this.price = price;
  }
}  
/* ���幺�ﳵ�࣬�����Ʒ��������Ʒ */
class ShopCar{
  private Goods[] goods;  // ����һ����������
  private int foot;
  public ShopCar(int len){  // ���췽��������Ʒ����Ĵ�С
    if(len>0){
      goods = new Goods[len];
    }else{
      goods = new Goods[1];
    }
  }
  // �����Ʒ����Ҫ�ж������Ƿ�����
  public boolean add(Goods g){
    if(this.foot<this.goods.length){
      this.goods[foot] = g;
      foot++;
      return true;
    }else{
      return false;
    }
  }
  // �ؼ��ֲ���
  public Goods[] search(String keyword){
    Goods g[] = null;
    int count = 0;
    for(int i = 0; i< this.goods.length; i++){
      if(this.goods[i]!=null){
        if(this.goods[i].getName().indexOf(keyword)!=-1){
          count++;
        }
      }
    }
    g = new Goods[count]; // ���ݲ��ҵļ�¼�����ٶ������� 
    int f =0;
    for(int i = 0;i< this.goods.length;i++){
      if(this.goods[i]!=null){
        if(this.goods[i].getName().indexOf(keyword)!=-1){
          g[f] = this.goods[i]; // �����ϲ�ѯ��������Ʒ��Ϣ����
          f++;
        }
      }
    }
    return g;
  }
  // �õ�ȫ����Ʒ��Ϣ
  public Goods[] getGoods(){
    return this.goods;
  }
}
public class Demo6{
  public static void main(String[] args) {
    ShopCar s1=new ShopCar(5);
    s1.add(new EatFood("���",12.1));
    s1.add(new EatFood("����",2.4));
    s1.add(new EatFood("����",22.3));
    s1.add(new WashGoods("ϴ��ˮ",32.5));
    s1.add(new WashGoods("����ֽ",22.8));
    print(s1.search("����")); // ��ӡ���ҳ�����Ʒ�ļ۸�
    System.out.println("=============");
    print(s1.getGoods());
  }
  public static void print(Goods gs[]){
    double sum=0;
    for(int i=0;i<gs.length;i++){
      if(gs[i]!=null){
        //System.out.println(p[i]+",");
        System.out.println(gs[i].getName()+","+gs[i].getPrice());
        sum=sum+gs[i].getPrice();
      }
    }
    System.out.println("�ܼ۸�Ϊ��"+sum);
  }
}