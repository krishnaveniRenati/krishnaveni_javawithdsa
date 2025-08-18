package javapraticeprogram;
import java.util.Scanner;
public class nestedif {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your age: ");
	        int age = scanner.nextInt();
	        System.out.println("Enter your income: ");
	        int income = scanner.nextInt();
	        scanner.close();

	        if (age >= 18) {
	            if (income >= 180000) {
	                System.out.println("You are eligible for tax filing.");
	                if (income >= 500000) {
	                    System.out.println("You are in the higher tax bracket.");
	                } else {
	                    System.out.println("You are in the lower tax bracket.");
	                }
	            } else {
	                System.out.println("You are not eligible for tax filing.");
	            }
	        } else {
	            System.out.println("You are not eligible for tax filing due to age.");
	        }
	    }
	}

