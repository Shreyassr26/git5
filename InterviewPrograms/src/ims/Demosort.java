package ims;

import java.util.Arrays;

public class Demosort {
	
	public static void main(String[] args) {
		
	
	int arr[]= {10,20,22,40,32,50};
	System.out.println("Before sorting");
	for (int i : arr) {
		System.out.println(i);
		
		}
	Arrays.sort(arr);
	System.out.println("After sorting");
	for (int i : arr) {
		System.out.println(i);
	}
	
	System.out.println("desecnif");
for(int i=arr.length-1;i>=0;i--) {
	System.out.println(arr[i]);
}


}
}