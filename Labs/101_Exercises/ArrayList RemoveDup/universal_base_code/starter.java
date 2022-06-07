import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		removeDup(arr1);		//Create this method.
		printValuesInt(arr1);
	}
	
	public static void removeDup(ArrayList<Integer> arr) {
		for (int x = 0; x < arr.size(); x++){
			for (int y = x+1; y < arr.size(); y++){
				if(arr.get(x) == arr.get(y)){
					arr.remove(y);
					y--;
				}
			}
		}
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add((int)(Math.random()*100));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
}
