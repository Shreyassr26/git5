//Search Elements in Array
package interview;

import java.util.Scanner;

public class SearchElementsInArray {

	public static void main(String[] args) {
		
		int n,n1,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size/index of the Array");
		n=sc.nextInt(); //taking index/size of the array
		
		int arr1[]=new int[n];
		System.out.println("Enter the elements int the Array:");
		for(i=0;i<n;i++)
			arr1[i]=sc.nextInt();//Adding the elements into the array
		
		System.out.println("Enter the elements to Search");
		n1=sc.nextInt(); //no. to search
		
		for(i=0;i<n;i++)
		{
			if(arr1[i]==n1)
			{
				System.out.println("number "+n1+" found at"+(i+1));
			}
							
			
		}
		
	
	}

}
