/*
	��ӡ1-10000��Χ�����е�ˮ�ɻ���
 */
public class Test1{
	public static void main(String args[]){
		int x,y,z;
		for(int i=100; i<10000; i++){
			x = i/100;	// ��ȡ��λ��
			y = i%100/10; // ���ʮλ��
			z = i%100%10; // ��ø�λ��
			if(x*x*x + y*y*y + z*z*z == i){
				System.out.print(i+ "\t");
			}
		}
	}
}