package pkg;
import java.util.Scanner;
import java.util.Random;


public class Bird {
    private String name = "John";
    private int age = 5;
    private boolean trained = false;
    
    public Bird() {
        this.interact();
    }
    
    public Bird(int age) {
        this.age = age;
        this.interact();
    }
    
    public Bird (boolean trained) {
        this.trained = trained;
        this.interact();
    }    
    
    public Bird (String name) {
        this.name = name;
        this.interact();
    }
    
    public Bird (String name, boolean trained) {
        this.name = name;
        this.trained = trained;
        this.interact();
    }
    
    public Bird (String name, int age, boolean trained) {
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
        System.out.println(this.name + " flies towards its owner!");
    }
    
    public void trick() {
        if(this.trained) {
            System.out.println(this.name + " speaks to owner!");
        } else {
            System.out.println(this.name + " gives a blank stare to its owner!");
        }
    }
}						


