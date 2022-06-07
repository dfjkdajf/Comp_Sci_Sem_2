import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = in.nextInt();
		System.out.print("Enter another numbber: ");
		int y = in.nextInt();
		
		
		if(x % 2 == 0) {
			System.out.println(x + " is even.");
		} else {
			System.out.println(x+  " is odd.");
		}
		
		if(y % 2 == 0) {
			System.out.println(y + " is even.");
		} else {
			System.out.println(y +  " is odd.");
		}
		
		if (x % 3 != 0) {
			System.out.println(x + " is not divisible by 3.");
		}
		
		if (y % 3 != 0) {
			System.out.println(y + " is not divisible by 3.");
		}
		
		if (x % 4 != 0) {
			System.out.println(x + " is not divisible by 4.");
		}
		
		if (y % 4 != 0) {
			System.out.println(y + " is not divisible by 4.");
		}
		
		if (x % 5 != 0) {
			System.out.println(x + " is not divisible by 5.");
		}
		
		if (y % 5 != 0) {
			System.out.println(y + " is not divisible by 5.");
		}
	}
}
