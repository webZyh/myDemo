class Check{  // 执行具体的验证操作
  public boolean validate(String name, String password){
    if(name.equals("zyh")&&password.equals("1122")){
      return true;
    }else{
      return false;
    }
  }
}
class Operate{  // 调用具体的验证操作
  private String info[];
  public Operate(String info[]){
    this.info = info;
  }
  public String login(){
    Check check = new Check();
    this.isExit();  // 判断是否退出

    String name = this.info[0];
    String password = this.info[1]; // 取得用户名和密码
    String str = null;  // 声明一个变量，用于接收信息
    if(check.validate(name,password)){
      str = "欢迎"+ name + "光临！";
    }else{
      str = "错误的用户名和密码";
    }
    return str;
  }
  public void isExit(){
    if(this.info.length!=2){
      System.out.println("输入的参数不正确，系统推出！");
      System.out.println("格式：java LoginDemo1 用户名 密码");
      System.exit(1);
    }
  }
}
public class LoginDemo2{
  public static void main(String args[]){
    Operate oper = new Operate(args);
    System.out.println(oper.login());
  }
}