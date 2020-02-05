package newpackage;
import java.util.*;

public class ReverseLinkedList {
	
	//methode1
	public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist)
	{
		for (int i = 0; i < llist.size() / 2; i++) { 
            Integer temp = llist.get(i); 
            llist.set(i, llist.get(llist.size() - i - 1)); 
            llist.set(llist.size() - i - 1, temp); 
        } 
  
        // Return the reversed arraylist 
        return llist;
	
	}
	
	static void reverse2(LinkedList<String> llist) 
    { 
		System.out.println("\nBefore Reverse Array by method 2 is:");
		System.out.println(llist);
		
		System.out.println("After Reverse Array by method 2 is:");
        Collections.reverse(llist); 
        System.out.println(llist); 
    } 
	
	//@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(1);
		linkedlist.add(2);
		linkedlist.add(3);
		
		System.out.print("Elements before reversing:\n");
		linkedlist.forEach(System.out::print);
		
		//System.out.print("Elements before reversing: \n" + linkedlist);
		
		linkedlist =reverseLinkedList(linkedlist);
		
		//using Collection.reverse method.
		//Collections.reverse(linkedlist);
		//System.out.print("\nElements after reversing: \n" + linkedlist);
		
		System.out.print("\nElements after reversing:\n");
		linkedlist.forEach(System.out::print);
		
		
		String [] array = {"the","it","test","ok"};
		//Integer [] arr1 = new Integer[array.length];
		//System.out.println("Length:" +array.length);
		LinkedList<String>  arr1 = new LinkedList<String>(Arrays.asList(array));
		
		/*for(int j=0;j<array.length;j++)
		{
			//arr1[j] = Integer.valueOf(array[j]);
			arr1[j] = String.valueOf(array[j]);
			//arr1.set(j, String.valueOf(array[j]));
			System.out.println(arr1);
		}*/
		
		
		reverse2(arr1);
		
		
	}
	
}
