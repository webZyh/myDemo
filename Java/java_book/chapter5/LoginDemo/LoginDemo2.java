class Check{  // ִ�о������֤����
  public boolean validate(String name, String password){
    if(name.equals("zyh")&&password.equals("1122")){
      return true;
    }else{
      return false;
    }
  }
}
class Operate{  // ���þ������֤����
  private String info[];
  public Operate(String info[]){
    this.info = info;
  }
  public String login(){
    Check check = new Check();
    this.isExit();  // �ж��Ƿ��˳�

    String name = this.info[0];
    String password = this.info[1]; // ȡ���û���������
    String str = null;  // ����һ�����������ڽ�����Ϣ
    if(check.validate(name,password)){
      str = "��ӭ"+ name + "���٣�";
    }else{
      str = "������û���������";
    }
    return str;
  }
  public void isExit(){
    if(this.info.length!=2){
      System.out.println("����Ĳ�������ȷ��ϵͳ�Ƴ���");
      System.out.println("��ʽ��java LoginDemo1 �û��� ����");
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