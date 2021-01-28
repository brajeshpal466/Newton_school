
import java.util.*;
class Kcirclesum{
    public static void main(String args []){
  Scanner sc= new Scanner(System.in);
  int n=sc.nextInt();
  int d=sc.nextInt();
  int arr []=new int [n];
  for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
  }
  kCircleSum(arr,n,d);

}
static void  kCircleSum(int arr[],int n,int k){
	
	
	for(int i=0;i<n;i++){
		int sum=0;
		for(int j=i;j<i+k;j++){
			sum+=arr[j%n];

		}
		System.out.print(sum+" ");
	}

	    }
}
