import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name; 
		String title;
		String role;
		int total = 25, strength, dexterity, intelligence, constitution, charisma;
		
		System.out.println("What is your name?");
		name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		role = sc.nextLine();
		
		if (role.equals("Wizard")) {
			System.out.println("You've chosen the Wizard! Excelsior!");
		} else if (role.equals("Warrior")){
			System.out.println("You've chosen the Warrior! For Honor!");
		} else if (role.equals("Rogue")) {
			System.out.println("You've chosen the Rogue! How cunning!");
		} else { 
			System.out.println("You've decided not to chose a role. Rerun the program.");
		}
	
		System.out.println();
		
		System.out.println("You have " + total + " skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		
		System.out.print("Strength (1-10): ");
		strength = sc.nextInt();
		if(strength > 10) {
			System.out.print("Please input a smaller value. Strength (1-10): ");
			strength = sc.nextInt();
		}
		total = total - strength;
		System.out.println("You have " + total + " left to spend");
		
		System.out.println();
		
		System.out.print("Dexterity (1-10): ");
		dexterity = sc.nextInt();
		if(dexterity > 10) {
			System.out.print("Please input a smaller value. dexterity (1-10): ");
			dexterity = sc.nextInt();
		}
		total = total - dexterity;
		System.out.println("You have " + total + " left to spend");
		
		System.out.println();
			
			System.out.print("Intelligence (1-10): ");
		intelligence = sc.nextInt();
		if(intelligence > 10) {
			System.out.print("Please input a smaller value. Intelligence (1-10): ");
			intelligence = sc.nextInt();
		}
		total = total - intelligence;
		System.out.println("You have " + total + " left to spend");
		
		System.out.println();
		
		System.out.print("Constitution (1-10): ");
		constitution = sc.nextInt();
		if(constitution > 10) {
			System.out.print("Please input a smaller value. Constitution (1-10): ");
			constitution = sc.nextInt();
		}
		total = total - constitution;
		System.out.println("You have " + total + " left to spend");	
		
		System.out.println();
		
		System.out.print("Charisma (1-10): ");
		charisma = sc.nextInt();
		if(charisma > 10) {
			System.out.print("Please input a smaller value. Charisma (1-10): ");
			charisma = sc.nextInt();
		}
		total = total - charisma;
		System.out.println("You have " + total + " left to spend");
		System.out.println();
		
		if (total > 0) {
			System.out.println("You have " + total + " to spend for next time.");
		}
		System.out.println();
		
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + name + ", the " + title + " of CVHS.");
		System.out.println("You're a " + role + " with the following stats!");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Constitution - " + constitution);
		System.out.println("Charisma - " + charisma);
	}
}
