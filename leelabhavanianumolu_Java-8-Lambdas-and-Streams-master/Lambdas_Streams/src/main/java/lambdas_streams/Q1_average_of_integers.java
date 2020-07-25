package lambdas_streams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
public class Q1_average_of_integers {
	
	public static OptionalDouble avg() {
        IntStream stream=IntStream.of(37,43,52,68,14,21,79,84,96);
        OptionalDouble obj=stream.average();
        return obj;
		
	}
	
	public static void main(String args[])
    {
		System.out.println("The list of integers are :: 37,43,52,68,14,21,79,84,96");
        OptionalDouble ans=avg();
        if(ans.isPresent())
        {
            System.out.println("Stream average is : "+ans.getAsDouble());
        }
        else
        {
            System.out.println(-1);
        }
    }
}
