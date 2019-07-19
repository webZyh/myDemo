/*
	打印1-10000范围内所有的水仙花数
 */
public class Test1{
	public static void main(String args[]){
		int x,y,z;
		for(int i=100; i<10000; i++){
			x = i/100;	// 获取百位数
			y = i%100/10; // 获得十位数
			z = i%100%10; // 获得个位数
			if(x*x*x + y*y*y + z*z*z == i){
				System.out.print(i+ "\t");
			}
		}
	}
}