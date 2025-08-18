package javapraticeprogram;

public class Exception {

			 public static void main(String args[]){  
			 try{  
			         int a = 50 / 0;         //code raise exception  
			         System.out.println(a);
			  }
			  catch(ArithmeticException e)
			  {
				   System.out.println(e);
				   System.out.println("Can't divided by zero"); 
			   }  
		     
			  System.out.println("Completed Successfully");
			 }
		 
}
		
		// TODO Auto-generated method stub
