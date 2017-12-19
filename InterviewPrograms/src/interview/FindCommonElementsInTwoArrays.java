package interview;
//find common elements in tpw arrays

import java.util.Scanner;

public class FindCommonElementsInTwoArrays {

	public static void main(String[] args) {
		
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {40,50};
		
		int i,j;
		for( i=0;i<arr1.length;i++) {
			
			for( j=0;j<arr2.length;j++ )
			{
				if(arr1[i]==arr2[j]) 
				{
				
					System.out.println("Common Elements b/w arrays is "+arr1[i]);	
				}
				
				
			}
			
		}
		

	}

}
