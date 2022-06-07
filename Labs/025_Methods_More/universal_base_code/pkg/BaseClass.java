package pkg;
import java.util.Scanner;
import java.util.Random;

public class BaseClass {
	public String role;

	public BaseClass(String myRole) {
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
 	public void setRole(){
 		System.out.println("Your role is " + role);
 		return;
 	}
	public void setStrength(){
		System.out.println("Your strength trait is 0");
		return;
	}
	public void setDexterity(){
		System.out.println("Your dexterity trait is 0");
		return;	
	}
	public void setIntelligence(){
		System.out.println("Your intelligence trait is 0");
		return;
	}
	public void setConstitution(){
		System.out.println("Your constituion trait is 0");
		return;
	}
	public void setCharisma(){
		System.out.println("Your charisma trait is 0");
		return;
	}
	
}



