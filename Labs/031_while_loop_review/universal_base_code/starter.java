import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random ();
		
		int[] numbers = new int [101];
		int count = 0;
		while (count < 101) {
			numbers [count] = rand.nextInt(101);
			count = count + 1;
		}
		
		count = 0;
		while (count < 101) {
			System.out.print(numbers[count] + " ");
			count = count + 1;
		}


		
	}
}
