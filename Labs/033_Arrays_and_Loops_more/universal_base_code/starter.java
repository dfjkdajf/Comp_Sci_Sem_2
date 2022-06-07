import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int [] numbers = new int[200];
		int count = 0;
		int maximum;
		int minimum;
		int average;
		int sum = 0;
		
		while(count < 200) {
			numbers[count] = rand.nextInt(100) + 1;
			count ++;
		}
		
		maximum = numbers[0];
		count = 1;
		while (count < 200) {
			if (numbers[count] > maximum) {
				maximum = numbers[count];
			}
			count++;
		}

		minimum = numbers[0];
		count = 1;
		while (count < 200) {
			if (numbers[count] < minimum) {
				minimum = numbers[count];
			}
			count++;
		}
		
		count = 0;
		while(count < 200) {
			sum = sum + numbers [count];
			count ++;
		}
		average = sum / 200;
		
		System.out.println("There are " + numbers.length + " elements.");
		System.out.println("The maximum of " + numbers.length + " randim numbers is: " + maximum);
		System.out.println("The maximum of " + numbers.length + " randim numbers is: " + minimum);
		System.out.println("The maximum of " + numbers.length + " randim numbers is: " + average);
	}
	
}
