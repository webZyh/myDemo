/*
	�ж�ĳ�����ܷ�3��5��7ͬʱ����
 */
import java.util.Scanner;

public class Test4{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);	//�Ӽ�������
		System.out.print("������numֵ��");
		int num = scan.nextInt();
		int x = num%3;
		int y = num%7;
		int z = num%7;
		if(x==0&&y==0&&z==0){
			System.out.println(num+"�ܱ�3,5,7ͬʱ����");
		}else{
			System.out.println(num+"���ܱ�3,5,7ͬʱ����");
		}
	}
}