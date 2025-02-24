package activities;

import java.util.Arrays;

public class Activity4 {
	public static void main(String[] args) {
		int[] Arr= {9,14,6,26,8,2,3,1};
		insertionSort(Arr);
		System.out.println("Sorted array: "+Arrays.toString(Arr));
}
	public static void insertionSort(int[] Arr) {
		// for loop starting for second number
		for(int i=1;i<Arr.length;i++) {
			int number = Arr[i]; // current number
			int j=i-1; // index of number just before the current number
			 //compare the number with each of the other number before shifting it
			while(j>=0 && Arr[j] > number) {
				Arr[j+1]= Arr[j]; 
				j--; // move to previous number
			}
			Arr[j+1] = number;
			}
			
		}
		
	}

