import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first and last name with a space in the middle");
		String Name = sc.nextLine();
		System.out.println("The last name is: " + Name.substring(5));
		


		
	}
}
