package epamTask6.task6;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;

public class Main {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Collections<Integer> list = new Collections<Integer>();
		boolean n = true;
        Scanner sc =  new Scanner(System.in);
        while(n) {
        	try {
	        	System.out.println("SELECT A NUMBER FROM 1-5 : ");
	        	System.out.println("1. Add an element to the list. ");
	        	System.out.println("2. Remove an element from the list. ");
	        	System.out.println("3. Show size of the List. ");
	        	System.out.println("4. Access an element with the index. ");
	        	System.out.println("5. Show current list. ");
	        	int choice = sc.nextInt();
	        	switch(choice) {
	        		case 1 : 
	        			System.out.println("Enter the number to be added : ");
	        			list.addElement(sc.nextInt());
	        			System.out.println("Element added successfully");
	        			System.out.println("Do you want to continue?");
	        			System.out.println("Enter y/Y for YES or n/N for NO");
	        			if(sc.next().charAt(0) == 'y' || sc.next().charAt(0) == 'Y') {
	        				n = true;
	        				break;
	        			} else {
	        				System.out.println("Thank you!");
	        				n = false;
	        				break;
	        			}
		        	case 2 : 
		        		System.out.println("Enter the number to be deleted : ");
		        		System.out.println("The current list is : "+list);
		        		list.remove(sc.nextInt());
		        		System.out.println("Element deleted successfully");
		        		System.out.println("Do you want to continue?");
	        			System.out.println("Enter y/Y for YES or n/N for NO");
		        		if(sc.next().charAt(0) == 'y' || sc.next().charAt(0) == 'Y') {
		        			n = true;
		        			break;
		        		} else {
		        			System.out.println("Thank you!");
		        			n = false;
		        			break;
		        		}
		        	case 3 : 
		        		System.out.println("The size of the list is : " +list.size());
		        		System.out.println("Do you want to continue?");
	        			System.out.println("Enter y/Y for YES or n/N for NO");
			        	if(sc.next().charAt(0) == 'y' || sc.next().charAt(0) == 'Y') {
			        		n = true;
			        		break;
			        	} else {
			        		System.out.println("Thank you!");
			        		n = false;
			        		break;
			        	}	
		        	case 4 :
		        		System.out.println("Enter the Index : ");
		        		System.out.println("The element is : "+list.getElement(sc.nextInt()));
		        		System.out.println("Do you want to continue?");
	        			System.out.println("Enter y/Y for YES or n/N for NO");
	        			if(sc.next().charAt(0) == 'y' || sc.next().charAt(0) == 'Y') {
	        				n = true;
	        				break;
	        			} else {
	        				System.out.println("Thank you!");
	        				n = false;
	        				break;
	        			}
		        	case 5 :
		        		System.out.println("The elements in the list are : " +list);
		        		System.out.println("Do you want to continue?");
	        			System.out.println("Enter y/Y for YES or n/N for NO");
			        	if(sc.next().charAt(0) == 'y' || sc.next().charAt(0) == 'Y') {
			        		n = true;
			        		break;
			        	} else {
			        		System.out.println("Thank you!");
			        		n = false;
			        		break;
			        	}
		        	default :
		        		System.out.println("Please enter a number from 1-5");
		        		break;
	        	}
		    } catch (Exception e) {
		    	System.out.println("Enter a number between 1-5");
		    }
        }
	}
}