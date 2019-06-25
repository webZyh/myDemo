/*
	Çó13-23+33-43...+993-1003µÄÖµ
 */

public class Test6{
	public static void main(String args[]){
		int sum = 0;
		for(int i=0;i<100;i++){
			if(i%2==0){
				sum -=i*10+3;
			}else{
				sum += i*10+3;
			}
		}
		System.out.println(sum);
	}
}