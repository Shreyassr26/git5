package interview;

import java.util.Scanner;

//find largest num in array
public class FindLargestNumInArray {

	public static void main(String[] args) {
		int i,j,max1,max2;
		
		max1=max2=Integer.MIN_VALUE;//set it to minimum balue
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		
		int n=sc.nextInt();
		int arr1[]=new int[n];
		
		System.out.println("Enter the elements into the array");
		
		for(i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		
	for(int k=0;k<n;k++)
		{
			if(arr1[k]>max1) {
				max2=max1;	//E line doubt idhe
			
				max1=arr1[k];
			}
			else if(arr1[k]>max2)
				max2=arr1[k];
		}
		System.out.println("First Largest Element is "+max1);
		System.out.println("Second Largest Element is "+max2);
	}

}
