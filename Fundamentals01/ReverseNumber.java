package Fundamentals01;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		System.out.println("Reverse of "+n+" is "+ getReverse(n));
		s.close();
	}

	private static int getReverse(int n) {
		
		int count =(int) Math.log10(n)+1;
		int ans=0;
		
		for(int i=1;i<=count ;i++) {
			int remainder=n%10;
			ans+=remainder*Math.pow(10, count-i);
			n/=10;
		}
		
		return ans;
	}

}
