import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	String name;
	int repeat;
	
	System.out.print("Please enter a name: ");
	name = sc.nextLine();
	System.out.print("How many times would you like this name to be repeated? ");
	repeat = sc.nextInt();
	
	int x = 0;
	while(true)
	{
		System.out.println(name);
		if(x == repeat-1)
		{
			break;
		}
		x=x+1;
	}
}

}
