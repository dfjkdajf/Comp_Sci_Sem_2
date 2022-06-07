import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.println("Give me one number");
	int num1 = sc.nextInt();
	System.out.println("Give me another number");
	int num2 = sc.nextInt();
	
	boolean c = num1 != num2;
	boolean d = num1 == num2;
	
	if(c)
	{System.out.println("The numbers are different");
	}
	if(d)
	{System.out.println("The numbers are equal");
	}	
	
		
	}
}
