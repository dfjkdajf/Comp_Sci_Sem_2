import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int [] x;
		x = new int [10];
		
		int count = 0;
		while (count < 10) {
			x[count] = 9 - count;
			count = count + 1;
		}

		count = 0;
		while (count < 10) {
			System.out.println(x[count]);
			count = count + 1;
		}
		
	}
}
