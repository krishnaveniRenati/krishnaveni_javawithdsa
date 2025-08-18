package javapraticeprogram;
public class Scanner{
		
		//static final double pi = 3.14;
		// double pi = 3.14;
		static final double PRICE=234.90;  
		public static void main(String[] args)  
		{  
		int unit;  
		double total_bill;  
		System.out.print("Enter the number of units you have used: ");  
		Scanner sc=new Scanner();  
		unit=sc.nextInt();  
		total_bill=PRICE*unit;  
		System.out.println("The total amount you have to pay is: "+total_bill);
		}

	public int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
