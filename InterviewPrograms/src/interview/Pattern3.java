package interview;
//Pattern
// 1
// 1 2 
// 1 2 3 
// 1 2 3 4




public class Pattern3 {
	public static void main(String[] args) {
		
		int i,j;
		
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j +" ");
			}
				
			System.out.println();
		}
		
	}

}
