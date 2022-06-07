import java.util.Scanner;
import java.util.Random;


class starter {

	public static boolean checkPrime(int n) {
		int i = 2;
		
		while (i < n) {
			
			if (n % i == 0) {
			return false;
		}
			i = i + 1;
	}

	return true;
}
	
public static void printPrimes(int n) {
	int i = 2;
	
	while (i <= n) {
		if (checkPrime(i)) {
			System.out.println(i);
		}
		
		i = i + 1;
	}
}
	
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Input a number and we'll print out every prime until that number: ");
	int n = sc.nextInt();
	printPrimes(n);
		
	}
			
}

