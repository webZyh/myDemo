/*
	�ֱ���while��do...while��forѭ�����100-200���ۼӺ�
 */
import java.util.Scanner;

public class Test5{
	public static void main(String args[]){
		int i = 100;
		int whileSum=0;
		while(i<=200){
			whileSum += i;
			i++;
		}
		System.out.println("while��ͣ�"+whileSum);

		int doWhileSum=0;
		do{
			doWhileSum += i;
		}while(i<=200);
		System.out.println("do...while��ͣ�"+whileSum);

		int forSum=0;
		for(i=100;i<=200;i++){
			forSum += i;
		}
		System.out.println("for��ͣ�"+forSum);
	}
}