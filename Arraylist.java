package javaexerciseprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();   //Generics
	     list.add("Venkatesh");				//Adding in arraylist    
	     list.add("Indramohan");    
	     System.out.println(list);			//Printing arraylist
	  
	  for(String name:list)    
	     System.out.println(name);

	  for(int i=0;i<list.size();i++)  //2    i < 2   0, 1
	  { 
		  System.out.println(list.get(i));  
	   }
	  
	  // Iterator itr = list.iterator();
	  Iterator<String> itr=list.iterator(); //getting Iterator  
	  while(itr.hasNext()) 			    //check iterator has elements
	  {  
		 System.out.println(itr.next());  	//Printing element and move next  
	  }     
	  
	  // Iterates in reverse order  
	  ListIterator<String> list1=list.listIterator(list.size());
	  System.out.println("Entered into List Iterator");
	  while(list1.hasPrevious())  
	  {  
	      System.out.println(list1.previous());  
	  }  
	  
	  ListIterator<String> list2=list.listIterator(list.size());
	  System.out.println("Entered into List Iterator");
	  while(list2.hasNext())  
	  {  
	      System.out.println("True" +list2.next());  
	  } 
	  
	  System.out.println(list.get(1));	//return 2nd element  
	  list.set(1,"Mohan Raj");   		//changing data    
	  System.out.println(list.get(1));
	}  
	}
		

