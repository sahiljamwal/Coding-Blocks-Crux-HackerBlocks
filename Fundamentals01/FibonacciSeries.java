package Fundamentals01;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(getFibonacciNumber(n));
		s.close();
	}

	private static int getFibonacciNumber(int n) {
		int a=0;
		int b=1;
		int c=0;
		int counter=3;
		while(counter <= n) {
			c=a+b;
			a=b;
			b=c;
			counter++;
		}
		return c;
	}

}
