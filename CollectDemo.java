package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		
		List<Integer> alist = new ArrayList<Integer>();
		alist.add(15);
		alist.add(25);
		alist.add(52);
		
		// get stream object
		Stream<Integer> openStream = alist.stream();
		// Configure stream by filtering out required values
		Stream<Integer> filterStream = openStream.filter(i -> i >= 20);
		List<Integer> newFilterListOrigin = filterStream.collect(Collectors.toList());
		newFilterListOrigin.stream().forEach(x -> System.out.println(x));
		
		System.out.println("Now in single line....");
		
		// What we have done :
		// 1) Open stream with .stream()
		// 2) Use lambda expression in filter out required objects from the open stream.
		// 3) Collect all filtered elements and add then to a new list called newFilteredList
		
		List<Integer> newFilteredList = alist.stream().filter(i -> i >= 20).collect(Collectors.toList());
		newFilteredList.forEach(x -> System.out.println(x));
	}
}
