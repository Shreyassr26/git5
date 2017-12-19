//14)WAP to print next char of given char?
package ims;

import java.util.Scanner;

public class PrintNextCharofGivenChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char");
		String s=sc.nextLine()	;
		char ch=s.charAt(0);
		ch++;
		System.out.println(ch);
		}

	

}
