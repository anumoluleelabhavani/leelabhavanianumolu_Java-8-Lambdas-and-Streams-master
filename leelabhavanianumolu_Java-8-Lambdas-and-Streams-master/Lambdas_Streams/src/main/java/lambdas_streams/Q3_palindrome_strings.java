package lambdas_streams;
import java.util.*;
import java.util.stream.IntStream;

public class Q3_palindrome_strings {
	static ArrayList<String> palindrome(List<String> l1)
    {
        ArrayList<String> pal=new ArrayList<String>();
        for(String i:l1)
        {String t = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                pal.add(i);}
        return pal;
    }
	public static void main(String args[])
    {
		
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter no. of strings:");
		int n = ob.nextInt();
		ArrayList<String> arr = new ArrayList<>();
		System.out.println("Enter the strings:");
		ob.nextLine();
		for(int i = 0;i < n;i++){ 
			String s =ob.nextLine();
			arr.add(s);
		}
        ArrayList<String> result=new ArrayList<String>();
        result=palindrome(arr);
        if(!result.isEmpty()) {
        System.out.println("The strings that are palindrome are::");
        for(String i:result)
            System.out.println(i);
        }
        else
        	System.out.println("There are no palindrome strings in the given list of strings");
        	
    }
   


}
