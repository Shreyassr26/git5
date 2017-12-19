package ims;

public class MinInArray {
	public static void main(String[] args) {
		
		int min1;
		min1=Integer.MAX_VALUE;
		int arr[]= {10,20,30,40,50};
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]<min1)
				min1=arr[i];
		}
		System.out.println(min1);
		
		
		
		
	}

}
