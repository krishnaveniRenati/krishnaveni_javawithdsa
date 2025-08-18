package SortingSearaching;

public class Linearsearch1 {
	public  static int Linearsearch1(int arr[],int n,int val)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==val)
				return i ;
		}
		return -1;
		}
	public static void main(String[] args) {
		{
			int arr[]= {12,25,8,10,32};
			int x=8;
			 int result=Linearsearch1(arr,arr.length,x);
			 if(result==-1)
				 System.out.print("element is not present in array");
			 else
				 System.out.print(" element is present at index:"+result);
	
	}
	
	
		// TODO Auto-generated method s
	}
}

