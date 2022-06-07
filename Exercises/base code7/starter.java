import java.util.Scanner;
import java.util.Random;

class cat {
	String name;
	
	public cat(){
		name = "Garfield";
	}
	public cat(String a){
		name = a;	
	}
	public void meow(){
		System.out.println(name + " Meow");
		return;
	}
}


class starter {
	public static void main(String args[]) {
		cat x = new cat();
		cat y = new cat("Tom");
		x.meow();
		y.meow();
		
	}
}
