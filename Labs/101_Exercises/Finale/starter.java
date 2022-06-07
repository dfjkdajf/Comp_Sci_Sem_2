import pkg.*;
import java.util.Scanner;
import java.util.Random;

public class Hangman {
	String guessingWord;
	int numtries;
	
	Hangman (){
		String generateWord();
		numtries = 5;
	}
	Hangman (int tries) {
		String generateWord();
		numtries = tries;
	}
	public int guessCheck(String letter, int start) {
		if (String letter == guessingWord.length()) {
			return;
		}
		else
		numtries--;
		return
	}
	public boolean checkWin(boolean [] arr) {
		if (generateWord == guessingWord) {
			System.out.println("Win");
		}
		if else (numtries < 0) {
			System.out.println("Lose");
		}
	}
}
	
	
	
	
	

class starter {
	public static void main(String args[]) {
		


		
	}
}
