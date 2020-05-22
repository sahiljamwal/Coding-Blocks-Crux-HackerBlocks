package Challenges_Fundamentals;

import java.util.Scanner;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		System.out.println(checkArmsTrong(num));
		
		s.close();
	}

	private static boolean checkArmsTrong(int num) {
		int n=num;
		int count=(int)Math.log10(n)+1;
		int ans=0;
		for(int i=1;i<=count;i++) {
			int rem=num%10;
			ans+=Math.pow(rem, count);
			num/=10;
		}
		
		if (n == ans) {
			return true;
		}else {
			return false;
		}
	}

}
