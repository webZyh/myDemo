/*
	��1��+2��+3��...+10��
 */

public class Test11{
	public static void main(String args[]){
		//aΪĳһ���ֵ��sumΪǰ������ܺ�;
		int a=1,sum=0;
		for (int i = 1; i <= 10; i++) {
			a*=i;
			sum+=a;
			System.out.println(i+"!="+a);
		}
		System.out.println("1!+2!+3!+...+10!="+sum);
	}
}