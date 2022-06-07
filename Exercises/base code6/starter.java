import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static boolean multDiv3(int a, int b) {
		int x = a;
		int y = b;
		int z = x * y;
		if (z%3 == 0){
		 return true;
	}else {
		return false;
	}
}	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(multDiv3(a,b));
		
		
		
	}
	
	
}

		

