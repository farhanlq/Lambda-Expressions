package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {

	public static void main(String[] args) {

		List<String> strList = Arrays.asList("abc", "", "bcde", "fgh", "", "ijkl", "", "xavi");
		long emptyCount = strList.stream().filter(x -> x.isEmpty()).count();

		long fullCount = strList.stream().filter(x -> !(x.isEmpty())).count();
		System.out
				.println("The list contains " + emptyCount + " empty Strings and " + fullCount + " not empty Strings");

		long lenCount = strList.stream().filter(x -> x.length() >= 4).count();
		System.out.println("Number of String with length 4 " + lenCount);

		List<String> filtered = strList.stream().filter(f -> !f.isEmpty()).collect(Collectors.toList());

		System.out.println(filtered);

		String G7Countries = filtered.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(":"));

		System.out.println(G7Countries);
		
		IntSummaryStatistics stats = Arrays.asList(13,43,53,15,25,2).stream().mapToInt((x)->x).summaryStatistics();
		
		System.out.println(stats.getAverage());
		
		System.out.println(stats.getCount());
		
		System.out.println(stats.getMax());

		System.out.println(stats.getMin());
		
		System.out.println(stats.getSum());
		
	}
}
