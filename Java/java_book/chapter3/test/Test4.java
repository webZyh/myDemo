/*
	判断某个数能否被3、5、7同时整除
 */
import java.util.Scanner;

public class Test4{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);	//从键盘输入
		System.out.print("请输入num值：");
		int num = scan.nextInt();
		int x = num%3;
		int y = num%7;
		int z = num%7;
		if(x==0&&y==0&&z==0){
			System.out.println(num+"能被3,5,7同时整除");
		}else{
			System.out.println(num+"不能被3,5,7同时整除");
		}
	}
}