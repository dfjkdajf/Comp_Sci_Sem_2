import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> nums1 = randomIntegers(100,0,100);
		System.out.println("---- LIST #1 (ORIGINAL) ----");
		System.out.println(nums1);
		System.out.println();
		System.out.println("---- LIST #1 (SELECTION SORT) ----");
		System.out.println(selectionSort(nums1));
		System.out.println();
		
		ArrayList<Integer> nums2 = randomIntegers(100,0,100);
		System.out.println("---- LIST #2 (ORIGINAL) ----");
		System.out.println(nums2);
		System.out.println();
		System.out.println("---- LIST #2 (BUBBLE SORT) ----");
		System.out.println(selectionSort(nums2));
		System.out.println();
		
		ArrayList<Integer> nums3 = randomIntegers(100,0,100);
		System.out.println("---- LIST #3 (ORIGINAL) ----");
		System.out.println(nums3);
		System.out.println();
		System.out.println("---- LIST #3 (INSERTION SORT) ----");
		System.out.println(selectionSort(nums3));
	}
	public static ArrayList<Integer> randomIntegers(int count, int low, int high) {
		Random rand = new Random();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < count; i++) {
			numbers.add(rand.nextInt(low, high + 1));
		}
		return numbers;
	}
	public static ArrayList<Integer> selectionSort(ArrayList<Integer> nums) {
		ArrayList<Integer> sortedNums = new ArrayList<Integer>(nums);
		int n = sortedNums.size();
		int minIndex, min, temp;
		for(int i = 0; i < n - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < n - 1; j++) {
				if (sortedNums.get(j) < sortedNums.get(minIndex)) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				min = sortedNums.get(minIndex);
				temp = sortedNums.get(i);
				sortedNums.set(i, min);
				sortedNums.set(minIndex, temp);
			}
		}
		return sortedNums;
	}
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> nums) {
		ArrayList<Integer> sortedNums = new ArrayList<Integer>(nums);
		int n = sortedNums.size();
		int prev, curr;
		boolean swapped = true;
		while(swapped) {
			swapped = false;
			for (int i = 1; i < n; i++) {
				prev = sortedNums.get(i - 1);
				curr = sortedNums.get(i);
				if (prev > curr) {
					sortedNums.set(i - 1, curr);
					sortedNums.set(i, prev);
					swapped = true;
				}
			}
			n = n - 1;
		}
		return sortedNums;
	}
	public static ArrayList<Integer> insertionSort(ArrayList<Integer> nums) {
		ArrayList<Integer> sortedNums = new ArrayList<Integer>(nums);
		int i = 1;
		int j, temp;
		while (i < sortedNums.size()) {
			j = i;
		while (j > 0 && sortedNums.get(j - 1) > sortedNums.get(j)) {
			temp = sortedNums.get(j);
			sortedNums.set(j, sortedNums.get(j - 1));
			sortedNums.set(j - 1, temp);
			j = j - 1;
		}
		i = i + 1;
		}
	return sortedNums;
}
}
