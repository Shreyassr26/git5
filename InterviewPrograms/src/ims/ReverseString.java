package ims;

public class ReverseString {
	public static void main(String[] args) {
		
		String org="abcd";
		String rev="";
		
		//By using String Buffer
		StringBuffer sb=new StringBuffer(org);
		System.out.println(sb.reverse().toString());
		
		//using for loop
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
		
			}

}
