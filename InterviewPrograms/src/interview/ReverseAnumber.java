package interview;

public class ReverseAnumber{
	
	public static void main(String[] args) {
		
		int original=542;
		int reverse=0;
		int remainder=0;
		
		while(original !=0)
			
		{
			remainder=original % 10;
			reverse=reverse *10 + remainder;
			original=original/10;
		}
		System.out.println(reverse);
		
	}

}
