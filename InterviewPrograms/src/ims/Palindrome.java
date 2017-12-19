package ims;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
											//r=remainder
		int n=123,r,s=0;					//s=reversed number
		int t=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		if(t==s)
			System.out.println("Palindorme");
		else
			System.out.println("It's not an Panlindrome");
	}
}
