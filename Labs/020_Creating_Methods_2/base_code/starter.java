import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int x, int y) {
		int count = 0;
		int answer = 1;
		
		while (count < y) {
			answer = answer * x;
			count = count + 1;
		}
		
		return answer;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int base;
		int exponent;
		int answer;
		
		System.out.println("What is your base number?");
		base = sc.nextInt();
		
		System.out.println("What is your exponent number?");
		exponent = sc.nextInt();
		
		answer = pow(base, exponent);
		System.out.println("Your answer is: " + answer);
	}
}
