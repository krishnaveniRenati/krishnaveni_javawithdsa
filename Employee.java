package javapraticeprogram;

class Employee {   
	int empid;					  
String empname;  
static String organization ="XYZ";		//static variable  
Employee(int r, String n)				//constructor
{  
empid = r;  
empname = n;  
}  
void display (){System.out.println(empid+" "+empname+" "+organization);}  
}  

public class Static{  
public static class Employeee {

	}

public static class Employee {

	public Employee(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}

	}

public static void main(String args[]){  
Employee e1 = new Employee(111,"Karan");  
Employee e2 = new Employee();    
e1.display();  
e2.display();  
}  

}

