package Fundamentals01;

import java.util.Scanner;

public class Pattern0 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		for(int row=1;row<=n;row++) {
			
			//work
			System.out.print("*");
			//preparation
			System.out.println();
		}
		s.close();
	}

}
