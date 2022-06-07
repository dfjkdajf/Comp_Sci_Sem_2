import java.util.Scanner;
import java.util.Random;
    class starter {
    public static void main (String args[]) {
        Random rand = new Random ();
        
        int[] numbers = new int[20];
        int[] numbers2 = new int[20];
        int count = 0;
         
        while(count < 20) {
            numbers [count] = rand.nextInt(50) + 1;
            count = count + 1;
        }
        
        count = 0;
        System.out.println("These are the 20 numbers");
        while(count < 20) {
            System.out.print(numbers[count] + " ");
            count = count + 1;
        }
        System.out.println();
        
        count = 0;
        while (count < 20) {
            numbers2[count] = numbers[19 - count];
            count = count + 1;
        }
        
        count = 0;
        System.out.println("These are those numbers backwards");
        while (count < 20) {
            System.out.print(numbers2[count] + " ");
            count = count + 1;
        }
    }
}