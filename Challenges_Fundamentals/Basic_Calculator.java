package Challenges_Fundamentals;

import java.util.Scanner;

public class Basic_Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch;
		do {
			String str = s.next().toLowerCase();
			ch=str.charAt(0);

			switch (ch) {
			case '+':
				int num1 = s.nextInt();
				int num2 = s.nextInt();
				System.out.println(num1 + num2);
				break;
			case '*':
				num1 = s.nextInt();
				num2 = s.nextInt();
				System.out.println(num1 * num2);
				break;
			case '/':
				num1 = s.nextInt();
				num2 = s.nextInt();
				System.out.println(num1 / num2);
				break;
			case '-':
				num1 = s.nextInt();
				num2 = s.nextInt();
				System.out.println(num1 - num2);
				break;
			case '%':
				num1 = s.nextInt();
				num2 = s.nextInt();
				System.out.println(num1 % num2);
				break;
			case 'x':
				break;
			default:
				System.out.println("Invalid operation. Try again.");
				break;
			}
			if(ch == 'x')
				break;
		} while (ch != 'x' || ch != 'X');

		s.close();
	}

}
