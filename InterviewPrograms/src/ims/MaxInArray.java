package ims;

public class MaxInArray {
	public static void main(String[] args) {
		
		int max1;
		max1=Integer.MIN_VALUE;
		//System.out.println(max1);
		
	int arr[]= {10,20,30,40,50,20};
	
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]>max1) {
					
			max1=arr[i];
	}
		
	}
	System.out.println(max1);

}}
