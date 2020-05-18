package Fundamentals01;

import java.util.Scanner;

public class Hcf_Gcd {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int dividend=s.nextInt();
		int divisor=s.nextInt();
		
		while(dividend % divisor != 0) {
			int remainder=dividend%divisor;
			dividend=divisor;
			divisor=remainder;
		}
		System.out.println("Hcf is "+divisor);
		
		
		
		s.close();
	}

}
