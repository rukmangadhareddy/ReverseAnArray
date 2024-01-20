package com.bridgelabzs.programes;
import java.util.Scanner;
public class PrimeNnumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number:");
	int number = scan.nextInt();
	int sum = 0;
	
	
	for(int i=1; i<=number;i++) {
		if(number % i==0) {
			sum++;
			
		}
	}
	if (sum==2) 
		System.out.println("is prime:"+number);
	else System.out.println("is not prime:");
	scan.close();
}

}
