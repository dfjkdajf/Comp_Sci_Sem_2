import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int [] numbers = new int [100];
		int count = 0;
		while (count < numbers.length) {
			numbers[count] = rand.nextInt(100) + 1;
			count ++;
		}
		
		toStringArray(numbers);
		System.out.println("The maximum of " + numbers.length + " random numbers is: " + getArrayMax(numbers));
		System.out.println("The maximum of " + numbers.length + " random numbers is: " + getArrayMin(numbers));
		System.out.println("The maximum of " + numbers.length + " random numbers is: " + getArrayAverage(numbers));
	}
	
	public static void toStringArray(int[] numbers) {
		int count = 0;
		while (count < numbers.length) {
			System.out.println(numbers[count]);
			count++;
		}
	}
	
	public static int getArrayAverage(int[] numbers) {
		int count = 0;
		int sum = 0;
		while (count < numbers.length) {
			sum = sum + numbers[count];
			count++;
		}
		return sum / numbers.length;
	}
	
	public static int getArrayMax(int[] numbers) {
		int count = 1;
		int max = numbers[0];
		while (count < numbers.length) {
			if (numbers[count] > max) {
				max = numbers[count];
			}
			count++;
		}
		return max;
	}
	
	public static int getArrayMin(int[] numbers) {
		int count = 1;
		int min = numbers[0];
		while (count < numbers.length) {
			if (numbers[count] < min) {
				min = numbers[count];
			}
			count++;
		}
		return min;
	}
}
