package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three){
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static boolean canBeSummed(int n) {
		int i = 1;
		int sum = 0;
		
		while (sum < n) {
			sum = sum + i;
			i = i + 1;
		}
		
		if (sum == n) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void specialSquare(int n) {
		int count = 0;
		
		int i = 1;
		
		while (count < n) {
			if (canBeSummed(i * i)) {
				System.out.println(i * i);
				count = count + 1;
			}
			
			i = i + 1;
		}
	}
	
}
