package lambdas_streams;

import java.util.*;
import java.util.stream.*;

public class Q2_3letter_strings {
	public static List<String> ReqStrings(List<String> list1) {
		List<String> req = list1.stream().filter(String->(String.length() == 3) && String.charAt(0) == 'a')
				.collect(Collectors.toList());
		return req;
	}
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter number of strings:");
		int n = ob.nextInt();
		List<String> strngs = new ArrayList<String>();
		System.out.println("Enter "+n+" number of strings:");
		ob.nextLine();
		for(int i = 0;i < n;i++){
			String s = ob.nextLine();
			strngs.add(s);
		}
		
		List<String> result = ReqStrings(strngs);
		if(!result.isEmpty()) {
		System.out.println("The strings that are starting with letter 'a' and have length 3 are ");
		result.forEach(x->System.out.println(x));
	}
		else {
			System.out.println("There are no such strings that start with letter 'a' and having length 3 in the given list of strings ");
		}
	}
	

}
