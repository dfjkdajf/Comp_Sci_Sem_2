package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	public String role;

	public myCharacter(String myRole) {
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
 	}
	public void myToString() {
	System.out.println("Your role is " + role);
	System.out.println("Your strength trait is 0");
	System.out.println("Your dexterity trait is 0");
	System.out.println("Your intelligence trait is 0");
	System.out.println("Your constitution trait is 0");
	System.out.println("Your charisma trait is 0");
	return;
	}
}


