// Create a Calculator 

import java.util.*;
public class Calculator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Choose operation");
		System.out.println("Addidtion");
		System.out.println("Subtraction");
		System.out.println("Multiplication");
		System.out.println("Division");
		System.out.println("Modulus");
		System.out.println("Enter your choice");
		String choice = sc.next();
		
		switch(choice){
		    case "Addition": System.out.println(a+b);
		    break;
            case "Subtraction": System.out.println(a-b);
		    break;
		    case "Multiplication": System.out.println (a*b);
		    break;
		    case "Division": System.out.println(a/b);
		    break;
		    case "Modulus": System.out.println(a%b);
		    break;
		    default: System.out.println("Invalid input");
		}
	}
}
