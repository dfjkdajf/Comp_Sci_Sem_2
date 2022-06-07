import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String game;
		System.out.print("Welcome to Java Casino. Would you like to play slots or blackjack? ");
		game = sc.next();
		
		if (game.equals("Slots") || game.equals("slots")) {
			startSlotMachine();
		}
		else if (game.equals("Blackjack") || game.equals("blackjack")) {
			startBlackJack();
		}
		else {
			System.out.println("That wasn't quite the correct answer. Try again.");
		}
		
	}
	
	public static String toSymbol (int roll) {
		String s = "";
		switch (roll) {
			case 1:
				s = "🍉";
				break;
			case 2:
				s = "🍒";
				break;
			case 3:
				s = "🍋";
				break;
			case 4:
				s = "💎";
				break;
			case 5:
				s = "🔔";
				break;
			case 6:
				s = "🍊";
				break;
			case 7:
				s = "7️⃣";
				break;
			case 8:
				s = "🍌";
				break;
			case 9:
				s = "🍇";
				break;
			case 10:
				s = "🍎";
		}
		
		return s;
	}

	public static void startSlotMachine() {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int money = 1000, wager, roll1, roll2, roll3;
		String selection, symbol1, symbol2, symbol3;
	
		System.out.println("Java Slots");
	    System.out.println("Rules:");
	    System.out.println("1. Player starts off with $1000.");
	    System.out.println("2. Player may put in any amount of money less than the amount the player already has.");
	    System.out.println("3. The game will randomly roll 3 symbols");
	    System.out.println("	a. If two of the symbols match, the amount of money will double.");
	    System.out.println("	b. If three of the symbols match, the amount of money will triple!");
		System.out.println("	c. If three of the matching symbols happen to be a seven, you won the jackpot and will win a large sum of money!");
	    System.out.println("	d. If none of the symbols match, you will lose the money put in and won't gain any money.");


		while (true) {
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println();

			if (money == 0) {
				System.out.println("You've run out of money! Thanks for coming! Come back soon!");
				break;
			}

			System.out.print("Would you like to play the slots? (Yes/yes/Y/y or No/no/N/n): ");
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

				roll1 = rand.nextInt(10) + 1;
				roll2 = rand.nextInt(10) + 1;
				roll3 = rand.nextInt(10) + 1;

				symbol1 = toSymbol(roll1);
				symbol2 = toSymbol(roll2);
				symbol3 = toSymbol(roll3);

				System.out.println("Your rolls are:");
				System.out.println("_______________________");
				System.out.println(" | " + symbol1 + " | " + symbol2 + " | " + symbol3 + " |");
				System.out.println("_______________________");

				if ((roll1 == 7) && (roll2 == 7) && (roll3 == 7)) {
					System.out.println("Jackpot! You have now gained great fortune!!!");
					money = money + 10 * wager;
				}
				else if ((roll1 == roll2) && (roll2 == roll3)) {
					System.out.println("You won! Your wager has now been tripled!");
					money = money + 3 * wager;
				} else if ((roll1 == roll2) || (roll2 == roll3) || (roll1 == roll3)) {
					System.out.println("You won! Your wager has now been doubled!");
					money = money + 2 * wager;
				} else {
					System.out.println("Didn't win this time, better luck next time!");
				}

				System.out.println("You now have $" + money + ".");
			} else if (selection.equals("No") || selection.equals("no") || selection.equals("N")|| selection.equals("n")) {
				System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
				break;
			} else {
				System.out.println("That wasn't quite the correct answer. Try again.");
			}
		}

	}

	public static void startBlackJack () {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int money = 1000;
		int wager = 0; 
		int card = 0; 
		int card1 = 0;
		int card2 = 0;
		int total = 0;
		int total1 = 0;
		String selection;
		
		System.out.println("Java Blackjack");
		System.out.println("Rules:");
		System.out.println("1. Player will start off with $1000.");
	    System.out.println("2. Player may put in any amount of money less than the amount the player already has.");
	    System.out.println("3. The objective of the game is to get a card number total greater than the dealer but less than 21.");
	    System.out.println("4. The game will start off with 2 card for the player and dealer.");
		System.out.println("5. The player may decide to either draw a card or not.");
		System.out.println("	a. If the player decides to draw another card, the card total will increase depending on which card is drawn.");
		System.out.println("	b. If the card total is greater than 21, the player will lose.");
		System.out.println("	c. If the card total is less than 21, the player may decide to either draw another card or stay.");
		
		while(true) {
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println();
			
			if (money == 0) {
				System.out.println("You've run out of money! Thanks for coming! Come back soon!");
				break;
			}

			System.out.print("Would you like to play blackjack? (Yes/yes/Y/y or No/no/N/n): ");
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
				
				card = rand.nextInt(13) + 1;
				card1 = rand.nextInt(13) + 1;
				card2 = rand.nextInt(13) + 1;
				total = card + card1;
				total1 = card2;
				
				System.out.println("The cards you drew is " + card + " | " + card1);
				System.out.println("Your total is " + total);
				System.out.println("The dealer's card is " + card2);
				
				while (total < 21) {
					System.out.print("Would you like to draw another card or stay? ");
					selection = scan.next();
					if (selection.equals("Yes") || selection.equals("yes") || selection.equals("Y") || selection.equals("y")) {
						card = rand.nextInt(13) + 1;
						System.out.println("The card you drew is " + card);
						total = total + card;
						System.out.println("Your new total is " + total);
						card2 = rand.nextInt(13) + 1;
					}
					else if (selection.equals("No") || selection.equals("no") || selection.equals("N") || selection.equals("n")) {
						System.out.println("Your total is " + total);
						System.out.println("The dealer's total is " + total1);
						break;
					}
				}
				if (total > 21) {
					System.out.println("Bust! You lost! You now have $" + money);
				}
					if (total1 < 16) {
						card2 = rand.nextInt(13) + 1;
						System.out.println("The dealer drew " + card2);
						total1 = total1 + card2;
						System.out.println("The dealer's total is " + total1);
					}
					else if (total1 > 21) {
						System.out.println("You won! Your total was " + total + ". The dealer's total was " + total1);
						break;
					}
					
				
				if (total <= 21 && total > total1) {
					System.out.println("You won! Your total is " + total + ". The dealer's total is " + total1 + ".");
					money = money + 2 * wager;
					System.out.println("You now have $" + money);
				}
				
					
				} else if (selection.equals("No") || selection.equals("no") || selection.equals("N")|| selection.equals("n")) {
				System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
				break;
			} else {
				System.out.println("That wasn't quite the correct answer. Try again.");
				}
			}
		
		}
	}	


    
