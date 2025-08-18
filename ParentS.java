package javapraticeprogram;

public class ParentS {  //Super-Class
	 void run1() {
			System.out.println("Parent Method");
			
		}  
		}  						

		class OverridingS1 extends ParentS{  //Sub-Class
		   public void run1()  //2
		   {
			   System.out.println("Child Method");
		   }  
		   
		  public static void main1(String args[]){  
			OverridingS obj = new OverridingS();	
			  obj.run();  
			ParentS obj1 = new ParentS();
			obj1.run1();
		  }   
		
	}

