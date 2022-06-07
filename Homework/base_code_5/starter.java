import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		startSlotMachine();
	}

	public static void startSlotMachine() {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int money = 1000, wager, roll1, roll2, roll3;
		String selection;

		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $1000.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");

		while (true) {
			System.out.println("------------------------------------------------------");
			System.out.println();

			if (money == 0) {
				System.out.println("You've run out of money! Thanks for coming! Come back soon!");
				break;
			}

			System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
			selection = scan.next();

			if (selection.equals("Yes") || selection.equals("yes") || selection.equals("Y") || selection.equals("y")) {
				System.out.print("You have $" + money + ". How much would you like to wager? ");
				wager = scan.nextInt();

				while (wager > money) {
					System.out.print("You only have $" + money + "! Please enter a smaller number: ");
					wager = scan.nextInt();
				}

				money = money - wager;
				System.out.println("Great! Let's play!!!");

				roll1 = rand.nextInt(9) + 1;
				roll2 = rand.nextInt(9) + 1;
				roll3 = rand.nextInt(9) + 1;

				System.out.println("Your rolls are:");
				System.out.println("_______________________");
				System.out.println(" | " + roll1 + " | " + roll2 + " | " + roll3 + " |");
				System.out.println("_______________________");

				if ((roll1 == roll2) && (roll2 == roll3)) {
					System.out.println("Jackpot! Your wager has now been tripled!");
					money = money + 3 * wager;
				} else if ((roll1 == roll2) || (roll2 == roll3) || (roll1 == roll3)) {
					System.out.println("You won! Your wager has now been doubled!");
					money = money + 2 * wager;
				} else {
					System.out.println("Didn't win this time, better luck next time!");
				}

				System.out.println("You now have $" + money + ".");
			} else if (selection.equals("No") || selection.equals("no") || selection.equals("N")
					|| selection.equals("n")) {
				System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
			} else {
				System.out.println("That wasn't quite the correct answer. Try again.");
			}
		}

	}
}