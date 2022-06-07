import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void toString(String s) {
		System.out.println(s);
	}
	
	public static void toStringCombined(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		
		toString("Write a sentence!");
		s1 = sc.nextLine();
		
		toString("Write a sentence!");
		s2 = sc.nextLine();
		
		System.out.println();
		
		toString("This is using the methods!");
		toString(s1);
		toStringCombined(s1, s2);
	}
}
