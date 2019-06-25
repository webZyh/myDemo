/*
	¥Ú”°       
								*
							*		*
						*		*		*
					*		*		*		*
				*		*		*		*		*				
 */

public class Test12{
	public static void main(String args[]){
		for(int i = 0;i <5;i++){
			for(int j = 4-i;j>0;j--){
				System.out.print(" ");
			}
			for(int j1 = 0; j1<i+1;j1++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}