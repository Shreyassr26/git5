package ims;

import java.util.Arrays;
import java.util.Collections;

public class DemoSortt {
	public static void main(String[] args) {
		
		
		System.out.println("Before sorting");
		int arr[]= {10,20,05,29,21};
		for(int count:arr) {
			System.out.println(count);
		}
		
		System.out.println("After sorting");
		Arrays.sort(arr);
		for(int count:arr) {
			System.out.println(count);
		}
		
		//Arrays.sort(arr,Collections.reverseOrder());
		
		
	}

}
