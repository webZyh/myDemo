class Address{
  private String country;
  private String province;
  private String city;
  private String street;
  private String code;
  public Address(String country, String province, String city, String street, String code){
    this.setCountry(country);
    this.setProvince(province);
    this.setCity(city);
    this.setStreet(street);
    this.setCode(code);
  }
  public void print(){
    System.out.println("国家："+getCountry()+" 省份："+ getProvince() + " 城市："+ getCity()+ " 街道："+ getStreet()+ " 邮编："+getCode());
  }
  public String getCountry(){
    return this.country;
  }
  public void setCountry(String c){
    this.country = c;
  }
  public String getProvince(){
    return this.province;
  }
  public void setProvince(String p){
    this.province = p;
  }
  public String getCity(){
    return this.city;
  }
  public void setCity(String c){
    this.city = c;
  }
  public String getStreet(){
    return this.street;
  }
  public void setStreet(String s){
    this.street = s;
  }
  public String getCode(){
    return this.code;
  }
  public void setCode(String c){
    this.code = c;
  }
}
public class Demo1{
  public static void main(String args[]){
    Address addr = new Address("中国","江西","九江","学士路","332506");
    addr.print();
  }
}