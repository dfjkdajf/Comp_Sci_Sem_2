import pkg.*;
import java.util.Scanner;
import java.util.Random;
    
class starter{
    public static void main(String args[]) {
        Fish[] fishes = {new Fish(),new Fish("John"), new Fish("Karl", true), new Fish("Moses", 30, true), new Fish(false)}; 
        
        System.out.println();
        
        for (int i = 0; i < fishes.length; i++) {
            fishes[i].trick();
        }
        System.out.println();
        
        Bird[] birds = {new Bird(), new Bird("John"), new Bird("Chris", true), new Bird("Jake", 4, false), new Bird(true)};
        System.out.println();
        for (int i = 0; i < birds.length; i++) {
            birds[i].trick();
        }
        
    }
}
    
