import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What class would you like to be? ");
		String role = sc.nextLine();
		
		BaseClass character = new BaseClass(role);
		
		character.setRole();
		character.setStrength();
		character.setDexterity();
		character.setIntelligence();
		character.setConstitution();
		character.setCharisma();


		
	}
}
