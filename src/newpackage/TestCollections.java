//Clockwise and Anti-clockwise List movement
package newpackage;
import java.util.*;

public class TestCollections {

	public static void main(String[] args) 
    { 
		// Let us create a list of strings 
        List<String>  mylist = new ArrayList<String>(); 
        mylist.add("practice"); 
        mylist.add("code"); 
        mylist.add("quiz"); 
        mylist.add("geeksforgeeks"); 
        
                
        
        int lenght = mylist.size();
        int secondlast = lenght-1;
        System.out.println("List Size:"+ lenght);
        
        System.out.println("Original List : " + mylist);
        
        System.out.println("Rotated List Clockwise:");
        
               
        for (int i=1;i<=lenght;i++)
        {	
        
        Collections.rotate(mylist, secondlast);
        
        System.out.println(mylist);
        }
        
        System.out.println("Rotated List AntiClockwise:");
                
        for (int i=1;i<=lenght;i++)
        {	
        
        Collections.rotate(mylist, lenght-secondlast);
        
        System.out.println(mylist);
        }
    }
}
