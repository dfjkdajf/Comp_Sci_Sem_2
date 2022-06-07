import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random ();
		int[] numbers = new int [1001];
		int count = 0;
		
		while (count < 1001) {
			numbers[count] = rand.nextInt(101) + 1;
			count = count + 1;
		}
		
		count = 0;
		while (count < 1001) {
			System.out.println(numbers[count]);
			count = count + 1;
		}
		
	}
}
