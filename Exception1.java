package javapraticeprogram;

public class Exception1 {

	public static void main(String[] args) {
			try{    
		        	int a[] = new int[5];    // 0 1 2 3 4 
		        	a[6] = 30;    			// 6
		       }    
		       catch(ArithmeticException e)  
		       {  
		    	   System.out.println("Arithmetic Exception occurs");  
		       }    
		       catch(ArrayIndexOutOfBoundsException e)  
		       {  
		           System.out.println("ArrayIndexOutOfBoundary Exception");  
		       }

		// TODO Auto-generated method stub

	}

}
