//8)WAP to reverse a number?
package ims;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int original=sc.nextInt();
		
		String numString=String.valueOf(original);
		for(int i=numString.length()-1;i>=0;i--)
		{
			rev=rev+numString.charAt(i);
		}
		System.out.println(rev);
		
		
		
		 

	}

}
