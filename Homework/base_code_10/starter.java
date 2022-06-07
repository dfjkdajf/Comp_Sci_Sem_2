import pkg.*;
import java.util.Scanner;
import java.util.Random;
    class starter{
        public static void main(String args[]) {
            Random rand = new Random();
            int [] numbers = new int [20];
            
            System.out.println("----------------------------------------------------");
            System.out.println("These are the 20 numbers");
            for (int i = 0; i < 20; i++) {
                numbers[i] = rand.nextInt(10) + 1;
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
            System.out.println("----------------------------------------------------");
            
            int target = rand.nextInt(10) + 1;
            System.out.println("The random number to look for is " + target);
            int numofdupes = 0;
            for (int i = 0; i < 20; i++) {
                if (target == numbers[i]) {
                    numofdupes = numofdupes + 1;
                    System.out.println("Duplicate found at index " + i);
                }
            }
            System.out.println("Total number of duplicates for " + target + " is " + numofdupes);
            System.out.println("----------------------------------------------------");
        
            System.out.println("Looking for two in a row:");
            for (int i = 0; i < 19; i++) {
                if (numbers[i] == numbers[i+1]) {
                System.out.println("Two in a row found at indexes " + i + " and " + (i+1) + ". The number is " + numbers[i]);
            }
        }
    }
}
    
