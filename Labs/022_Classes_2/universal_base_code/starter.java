import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		myCharacter john = new myCharacter();
		System.out.println("Your role is " + john.role);
		System.out.println("Your strength trait is " + john.strength);
		System.out.println("Your dexterity trait is " + john.dexterity);
		System.out.println("Your intelligence trait is " + john.intelligence);
		System.out.println("Your constitution trait is " + john.constitution);
		System.out.println("Your charisma trait is " + john.charisma);
	}
}
