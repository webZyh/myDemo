/* 
  使用面向对象的概念表示下面的生活场景
  小明去超市买东西，所有买到的东西都放在购物车之中，最后到收银台一起结账
*/

interface Goods{
  public String getName();
  public double getPrice();
}
/* 子类继承父类时，不需要再用public修饰 */
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
/* 定义购物车类，添加商品，搜索商品 */
class ShopCar{
  private Goods[] goods;  // 定义一个对象数组
  private int foot;
  public ShopCar(int len){  // 构造方法开辟商品数组的大小
    if(len>0){
      goods = new Goods[len];
    }else{
      goods = new Goods[1];
    }
  }
  // 添加商品，需要判断数组是否已满
  public boolean add(Goods g){
    if(this.foot<this.goods.length){
      this.goods[foot] = g;
      foot++;
      return true;
    }else{
      return false;
    }
  }
  // 关键字查找
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
    g = new Goods[count]; // 根据查找的记录数开辟对象数组 
    int f =0;
    for(int i = 0;i< this.goods.length;i++){
      if(this.goods[i]!=null){
        if(this.goods[i].getName().indexOf(keyword)!=-1){
          g[f] = this.goods[i]; // 将符合查询条件的商品信息保存
          f++;
        }
      }
    }
    return g;
  }
  // 得到全部商品信息
  public Goods[] getGoods(){
    return this.goods;
  }
}
public class Demo6{
  public static void main(String[] args) {
    ShopCar s1=new ShopCar(5);
    s1.add(new EatFood("面包",12.1));
    s1.add(new EatFood("辣条",2.4));
    s1.add(new EatFood("饼干",22.3));
    s1.add(new WashGoods("洗发水",32.5));
    s1.add(new WashGoods("卫生纸",22.8));
    print(s1.search("饼干")); // 打印查找出的商品的价格
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
    System.out.println("总价格为："+sum);
  }
}