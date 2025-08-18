package SortingSearaching;

public class Bubblesort {
	static int array[] = {2, 1, 6, 5, 4};


	public static void main(String[] args) {
		

		   
		        int length = array.length;

		        System.out.println("Unsorted Array:");
		        for (int i = 0; i < length; i++) {
		            System.out.print(array[i]);
		        }
		        System.out.println("unsorted Array");

		        bubbleSort(array, length);}
		        public static void bubbleSort(int array[], int length) {
		        
		   

		    
		        for (int i = 0; i < length - 1; i++) {  
		            for (int j = 0; j < length - i - 1; j++) {  
		                if (array[j] > array[j + 1]) {  
		                    // swap elements
		                    int temp = array[j];
		                    array[j] = array[j + 1];
		                    array[j + 1] = temp;
		                }
		            }
		        }
		    }
		// TODO Auto-generated method stub

	}

