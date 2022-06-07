import java.util.Random;

class Dog {
	String name;
	int age;
	String breed;
	
	Dog (){
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	
	Dog (String myName) {
		name = myName;
		age = 1;
		breed = "dog dog";
	}
	
	Dog (String myName, String myBreed) {
		name = myName;
		breed = myBreed;
		age = 1;
	}
	
	Dog (String myName, int myAge) {
		name = myName;
		age = myAge;
		breed = "dog dog";
	}
	
	public void setName(String myName) {
		name = myName;
	}
	
	public void setAge(int myAge) {
		age = myAge;
	}
	
	public void setBreed(String myBreed) {
		breed = myBreed;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public boolean isSleeping() {
		Random rand = new Random();
		if(rand.nextInt(2) == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public void bark() {
		System.out.println(name + " is barking!");
	}
}

class starter {
	public static void main(String args[]) {
		Dog dog1 = new Dog("Rocket");
		dog1.setAge(5);
		
		Dog dog2 = new Dog("Fido", "Labrador");
		
		if (dog1.isSleeping()) {
			System.out.println( dog1.getName() + " is asleep.");
		} else {
			dog1.bark();
		
			if (dog2.isSleeping()) {
				dog2.bark();
			} else {
				dog2.bark();
			}
		}	
	}	
		
}
