package newpackage;
import java.util.*;

public class ArrayReverse {
	
	//method 1 implementation for array reversing
	static void reverse1(int a[],int n)
	{
	
		int i,k,t;
		
		//n = arr.length;
		
		for(i=0;i<n/2;i++)
		{
			t = a[i];
			a[i] = a[n-i-1];
			a[n-i-1] = t;			
		}
		
		System.out.println("Reverse Array by method 1 is:");
		for(k=0;k<n;k++)
			System.out.println(a[k]);
		
	}
	
	static void reverse2(String a[]) 
    { 
		System.out.println("Reverse Array by method 2 is:");
        Collections.reverse(Arrays.asList(a)); 
        System.out.println(Arrays.asList(a)); 
    } 
	
	
	public static void main(String[] args)
	{
		int [] arr = {20,50,34,78,45};
		//method 1 for array reverse
		reverse1(arr,arr.length);
		
		//method 2 with collection reverse method
		//Integer [] arr1 = {45,67,78,89,65,98};
		//int [] array = {55,06,33,77,23,63,19};
		String [] array = {"the","it","test","ok"};
		//Integer [] arr1 = new Integer[array.length];
		String [] arr1 = new String[array.length];
		for(int j=0;j<array.length;j++)
		{
			//arr1[j] = Integer.valueOf(array[j]);
			arr1[j] = String.valueOf(array[j]);
		}
		
		
		reverse2(arr1);
		
	}	
	
}
