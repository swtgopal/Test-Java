package newpackage;

public class CreditSussaineTest {

	//@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] A = {1,4,3,6,8};
		//int B=0;
		
		Integer[] B = new Integer[A.length];
		
		int lenght = A.length;
		
		do
		{
		for(int i=0;i<=lenght;i++)
		{
			for (int j=0;j<lenght-1;j++)
			{
				B[j] = A[j] + A[j+1];
				A[j] = B[j];
				
			}
			lenght--;
		}
		}while(lenght==0);
		
		System.out.println("Last number="+B[0]);
		

	}

}
