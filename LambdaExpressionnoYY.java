import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionnoYY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> al = new ArrayList<String>();
		al.add("ad");
		al.add("cd");
		al.add("cy");
		al.add("yyx");
		al.add("y");
		al.replaceAll(n -> n + "y");
		al.removeIf(n -> n.endsWith("yy") || n.startsWith("yy"));
		System.out.println(al);

		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.replaceAll(n -> n * 2);
		nums.removeIf(n -> n % 10 == 2);
		System.out.println(nums);

		List<Integer> nums1 = new ArrayList<Integer>();
		nums1.add(3);
		nums1.add(1);
		nums1.add(4);
		nums1.replaceAll(n -> n * n);
		nums1.removeIf(n -> (n % 10 == 5) || (n % 10 == 6));
		nums1.replaceAll(n -> n + 10);
		System.out.println(nums1);
	}

}
