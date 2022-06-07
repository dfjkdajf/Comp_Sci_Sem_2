import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Wizard[] x = new Wizard[100];
		x[0] = new Wizard();
		for (int i = 0; i < x.length; i++) {
			x[i] = new Wizard();
		}
		Warrior[] y = new Warrior[100];
		y[0] = new Warrior();
		for (int i = 0; i < y.length; i++) {
			y[i] = new Warrior();
		}
		
		for(int i = 0; i < 100; i++) {
			x[i].attack(y[i]);
			y[i].attack(x[i]);
		}
		


		
	}
}
