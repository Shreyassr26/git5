package interview;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
	int num=5;										//isjk
	for(int i=1;i<=num;i++)
	{
		for(int s=i;s<=num;s++)
			System.out.print("  ");
		
		for(int j=1;j<=i;j++)
			System.out.print(j+" ");
		
		for(int k=i-1;k>=1;k--)
			System.out.print(k+" ");
		
		System.out.println();
		}
	}
	
}
