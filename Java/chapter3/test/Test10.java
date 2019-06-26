/*
	求1-1000之间可以同时被3、5、7整除的数字
 */

public class Test10{
	public static void main(String args[]){
		int x,y,z;
		for(int i=0;i<1000;i++){
			x = i%3;
			y = i%5;
			z = i%7;
			if(x==0&&y==0&&z==0){
				System.out.println(i);
			}
		}
	}
}