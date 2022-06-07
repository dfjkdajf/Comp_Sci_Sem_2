import pkg.*;
import java.util.Scanner;
import java.util.Random;

class myCharacter {
	String role;
	
	myCharacter() {
		role = "No role";
		System.out.println("You've decided not to chose a role. Rerun program.");
	}

	myCharacter(String myRole) {
		role = myRole;
		
		if(role.equals("Rogue")) {
			System.out.println("You've chosen the Rogue! How cunning!");
		} else if(role.equals("Warrior")) {
			System.out.println("You've chosen the Warrior! For Honor!");
		} else if(role.equals("Wizard")) {
			System.out.println("You've chosen the Wizard! Excelsior!");
		} else {
			System.out.println("You've decided not to chose a role. Rerun program.");
		}

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		myCharacter John = new myCharacter();
		
		System.out.print("What class would you like to be? ");
		String role = in.nextLine();
		
		myCharacter Bob = new myCharacter(role);
		

		
	}
}
