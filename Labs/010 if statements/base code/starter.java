import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int a = 2;
		int b = 5;
		boolean c = a != b;
		boolean d = a == b;
		if(c)
		{
			System.out.println("The first variable is: " + a);
			System.out.println("The second variable is: " + b);
			System.out.println("The variables are different");
		}
		if(d)
		{
			System.out.println("The first variable is: " + a);
			System.out.println("The second variable is: " + b);
			System.out.println("The variables are the same");
		}
	}
}
