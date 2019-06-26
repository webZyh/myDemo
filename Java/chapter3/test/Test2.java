/*
	完成两个整数内容的交换
 */
public class Test2{
	public static void main(String args[]){
		int x = 1;
		int y = 5;
		int temp;
		System.out.println("交换前：x="+x+" "+"y="+y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("交换后：x="+x+" "+"y="+y);
	}
}