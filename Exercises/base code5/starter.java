import java.util.Scanner;
import java.util.Random;


class starter {
	public static int fact(int y){
		int x = y-1;
		while(true)
	{
		System.out.println(y);
		y = y * x;
		if(x ==1)
		{
			return y;
		}
		x = x - 1;
	}
}
	
	public static void main(String args[]) {
		// int i = 0;
		// // while (i < 21) {
		// // 	System.out.println(25-i);
		// // 	i ++;
		// }
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		
		int answer = fact(y);
		System.out.println(answer);
		System.out.println(fact(10));
		System.out.println(fact(11));
		System.out.println(fact(12));
		
		
		// System.out.print("Give an integer: ");
		// int x = sc.nextInt();
		// int i = 1;
		// int y = x;
		// while (i < x) {
		// 	y = y * (x-i);
		// 	i ++;
		// }
		// 	System.out.println(y);
			
		// int

		
	}
}
