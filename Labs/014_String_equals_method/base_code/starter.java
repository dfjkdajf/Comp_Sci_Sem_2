import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	
	String warrior = new String("Warrior");
	String wizard = new String("Wizard");
	String rogue = new String("Rogue");
	
	System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
	String text = sc.nextLine();
	
	boolean a = warrior.equals(text);
	boolean b = wizard.equals(text);
	boolean c =rogue.equals(text);
	
	
	if(a){
			System.out.println("You've chosen the Warrior! For Honor!");
	}
	else if(b){
			System.out.println("You've chosen the Wizard! Excelsior!");
	}
	else if(c){
			System.out.println("You've chosen the Rogue! How cunning!");
	}
	else{
			System.out.println("You've decided not to chose a role. Rerun program.");
	}

}
}