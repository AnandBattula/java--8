package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxDemo {

	public static void main(String[] args) {
		
		List<Integer> alist = new ArrayList<Integer>();
		alist.add(15);
		alist.add(25);
		alist.add(52);
		
		// get stream object
		Stream<Integer> openStream = alist.stream();
		// Configure stream by filtering out required values
		Stream<Integer> filteredStream = openStream.filter(i -> i >= 20);
		// we can sort on any stream filter or mapped on normal stream (non filter or non mapped too)
		
		System.out.println("min function....");
		Integer min = filteredStream.min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(min);
		
		// max function
//		System.out.println("max function....");
//		Integer max = filteredStream.max((i1, i2) -> i1.compareTo(i2)).get();
//		System.out.println(max);
	
		System.out.println("Now in single line....");
		
		Integer minValue = alist.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(minValue);
		
		Integer maxValue = alist.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(maxValue);
		
	}
}
