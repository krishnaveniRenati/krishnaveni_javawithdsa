package javapraticeprogram;

public class OverloadingS {
		int a, b, c;
	  void sum(int a, int b) //instance a=40   b=30
	  {
		  this.a = a;
		  this.b = b;
		  c = a + b;
		  print();
	  }
	  void print()
	  {
		   System.out.println(c);
	  }
	  
	  void sum(int a, int b, int c)
	  {
		  System.out.println(a+b+c);
	  }  
	  
	  public static void main(String args[]){  
	  OverloadingS obj = new OverloadingS();  
	  obj.sum(20,20);  
	  obj.sum(20,20,20);  
	  
	  }  
	}  



