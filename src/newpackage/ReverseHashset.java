package newpackage;
import java.util.*;

public class ReverseHashset {
	
	public static void main(String[] args)
	{
		
		String [] array = {"the","it","test","ok"};
		
		HashSet<String> hs = new HashSet<String>(Arrays.asList(array)) ;
		
		System.out.println("Hashet Elements:\n"+hs);
		
		//Collections.reverse((List<?>) hs);
		//Collections.sort(hs);
		ArrayList<String> al = new ArrayList<String>(hs);
		
		Collections.reverse(al);
		System.out.println("Hashet Elements After:\n"+al);
	}

}
