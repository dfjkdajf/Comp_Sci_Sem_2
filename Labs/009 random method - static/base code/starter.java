import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random ();
		
		int rand_num1 = rand.nextInt(1000);
		System.out.println(rand_num1);
		
		int rand_a = rand.nextInt(10);
		System.out.println("A number between 0 - 9: " + rand_a);
		
		int rand_b = rand.nextInt(100) + 1;
		System.out.println("A number between 1 - 100: " + rand_b);
		
		double rand_c = rand.nextDouble() + 2.5;
		System.out.println("A number between 2.5 - 3.5: " + rand_c);
		
		double rand_d = rand.nextDouble() * 575 + 14;
		System.out.println("A number between 14 - 589: " + rand_d);
		


		
	}
}
