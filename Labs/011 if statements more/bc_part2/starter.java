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
	System.out.println("Give me another number");
	int num3 = sc.nextInt();
	
	boolean a = num1 > num2;
	boolean b = num1 > num3;
	boolean c = num2 > num1;
	boolean d = num2 > num3;
	boolean e = num3 > num1;
	boolean f = num3 > num2;
	boolean g = num1 < num2;
	boolean h = num1 < num3;
	boolean i = num2 < num1;
	boolean j = num2 < num3;
	boolean k = num3 < num1;
	boolean l = num3 < num2;
					
	
	if((a) && (b))
	{System.out.println(num1 + " is the largest number");
	}
	
	if((c) && (d))
	{System.out.println(num2 + " is the largest number");
	}
	
	if((e) && (f))
	{System.out.println(num3 + " is the largest number");
	}
	
	if((g) && (h))
	{System.out.println(num1 + " is the smallest number");
	}
	
	if((i) && (j))
	{System.out.println(num2 + " is the smallest number");
	}
	
	if((k) && (l))
	{System.out.println(num3 + " is the smallest number");
	}
}
}
