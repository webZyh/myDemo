public class LoginDemo1{
  public static void main(String args[]){
    if(args.length != 2){
      System.out.println("����Ĳ�������ȷ��ϵͳ�Ƴ���");
      System.out.println("��ʽ��java LoginDemo1 �û��� ����");
      System.exit(1);
    }
    String name = args[0];
    String password = args[1];
    if(name.equals("zyh")&&password.equals("1122")){
      System.out.println("��ӭ"+ name + "���٣�");
    }else{
      System.out.println("������û���������");
    }
  }
}