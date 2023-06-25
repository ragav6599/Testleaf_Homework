package week1.day1;

public class IsPrime {
	
	public static void main(String[] args) {
//	a) Create a class by name: IsPrime
//	b) Create a main method using shortcut
//	c) Write a logic to find if the given number is prime or not
//	d) Print if it is prime or not
//
//	Hint: Iterate through all numbers from 2 to n-1 (input) and 
//	for every number check if it divides n (input). 
//	If we find any number that divides, print prime.
//	If nothing divides, then print non-prime
		int n = 15;
		boolean isPrime = true;
		
		for (int i = 2; i < n; i++) {	
			if (n % i==0) {
				isPrime = false;
				break;
			}
		}
			
			if (isPrime) {
				System.out.println(n +" "+ "Is a Prime number");
			}
			else {
				System.out.println(n +" "+ "Is a Non- Prime number");
			}
	}

}
