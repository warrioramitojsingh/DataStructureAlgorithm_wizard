// basic factorial recursion program in java. 

import java.util.Scanner;

public class Factorialbasic {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of which you want to find factorial.");
		int number= sc.nextInt();
		
	long fact=1;	
	
	for(int i=1; i<=number; i++) {
		fact=fact*i;
		System.out.println(fact);
		
	}
}
}
