/* 
  在排序好的数组中添加一个数字，将添加后的数字插入到数组合适的位置
*/
public class Demo10{
  public static void main(String args[]){
    int arr[] = {1,2,3,5};
    int a = 4;
    insert(a,arr);
  }
  public static void insert(int a,int temp[]){
    int newArr[] = new int[temp.length+1];
    int j = 0, m = 0;
    for(int i = 0; i< temp.length; i++){
      if(a<temp[i]){
        newArr[j++] = a;
        while(j<newArr.length){		//接着插入原数组剩下的元素
					newArr[j++] = temp[i++];
				}
				m++;
      }else{
				newArr[j++] = temp[i];
			}
    }
    if(m ==0){			//如果插入的数最大，则m==0
			newArr[j] = a;
    }
    for(int k=0; k<newArr.length; k++){
			System.out.print(newArr[k]+"\t");
		}
  }
}