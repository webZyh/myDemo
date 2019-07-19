/*
	给定三个数字，求出3个数字的最大值，并将最大值输出
 */
public class Test3{
	public static void main(String args[]){
		int x = 1;
		int y = 5;
		int z = 3;
		int max;
		max = (x > y) ? x : y;
		max = (max > z) ? max : z;
		System.out.println("最大值："+max);
	}
}