package interview;

import java.util.Scanner;

public class FindSmallestNumInArray {
		public static void main(String[] args) {
		int i,min1,min2;
		min1=min2=Integer.MAX_VALUE;// 1st Set maximum value
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		
		int arr1[]=new int[n];
		System.out.println("Enter the elements into the array");
		for(i=0;i<n;i++)
			arr1[i]=sc.nextInt();
		
		for(int j=0;j<n;j++) {
			
			if(arr1[j]<min1) 
			{
			
				min1=arr1[j];			
			}
		
			else if(arr1[j]<min2)
				min2=arr1[j];
		
		}
		
		
		System.out.println("First Smallest Element is"+min1);
		System.out.println("Second Smallest Element is"+min2);
	}

}
