package ims;

public class ReplaceGivenCharFromAParagraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String org="hi, i love automation.";
		System.out.println(org);
		
		org=org.replace(",", "");
		System.out.println(org);
		
		org=org.replaceAll("hi", "bye");
		System.out.println(org);
	}

}
