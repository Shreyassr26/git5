package ims;

import java.util.Arrays;
import java.util.Collections;

public class SortingOfArray {
	public static void main(String[] args) {
		
		
		String str[]= {"a","z","c","b"};
		//using foreach loop
		System.out.println("Before Sorting");
		for(String strin:str) {
			System.out.println(strin);
		}
		
		Arrays.sort(str);
		System.out.println("After sorting");
		for(String string:str) {
			System.out.println(string);
		}
		Arrays.sort(str, Collections.reverseOrder());
		System.out.println("Decending order");
		for(String string:str) {
			System.out.println(string);
		}
	}

}
