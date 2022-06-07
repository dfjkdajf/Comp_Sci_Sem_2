package pkg;
import java.util.Scanner;
import java.util.Random;


public class Fish {
    private String name = "Nemo";
    private int age = 5;
    private boolean trained = false;
    
    public Fish() {
        this.interact();
    }
    
    public Fish(int age) {
        this.age = age;
        this.interact();
    }
    
    public Fish (boolean trained) {
        this.trained = trained;
        this.interact();
    }    
    
    public Fish (String name) {
        this.name = name;
        this.interact();
    }
    
    public Fish (String name, boolean trained) {
        this.name = name;
        this.trained = trained;
        this.interact();
    }
    
    public Fish (String name, int age, boolean trained) {
        this.name = name;
        this.age = age;
        this.trained = trained;
        this.interact();
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setIsTrained(boolean trained) {
        this.trained = trained;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public boolean getIsTrained() {
        return this.trained;
    }

    public void interact() {
        System.out.println(this.name + " swims towards its owner!");
    }
    
    public void trick() {
        if(this.trained) {
            System.out.println(this.name + " jumps out of water, doing a majestic backflip!");
        } else {
            System.out.println(this.name + " gives a blank stare to its owner!");
        }
    }
}						


