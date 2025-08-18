package javapraticeprogram;

public class Paraents {  //Super-Class
	 void run() {
			System.out.println("Parent Method");
			
		}  
		}  						

		class OverridingS extends Paraents{  //Sub-Class
		   void run()  //2
		   {
			   System.out.println("Child Method");
		   }  
		   
		  public static void main(String args[]){  
			OverridingS obj = new OverridingS();	
			  obj.run();  
			Paraents obj1 = new Paraents();
			obj1.run();
		  }  
		} 


