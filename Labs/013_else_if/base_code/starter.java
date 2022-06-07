import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	int rand_num1 = rand.nextInt(1000);
	System.out.print("Pick a number between 1 - 1000: ");
	int number = sc.nextInt();
	
	boolean a = number > rand_num1;
	
	if(a)
	{System.out.println("Your number was greater than the random number. The number was " + rand_num1);
	}
	else
	{System.out.println("Your number was smaller than the random number. The number was " + rand_num1);
	}
}
}
