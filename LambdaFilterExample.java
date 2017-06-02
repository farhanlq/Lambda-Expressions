import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author FLaeeq
 *
 */
public class LambdaFilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> al = new ArrayList<Integer>();
		al.add(34);
		al.add(-43);
		al.add(62);
		al.removeIf(n -> n < 0);
		System.out.println(al);

		al.add(1);
		al.add(5);
		al.add(19);
		al.removeIf(n -> n % 10 == 9);
		System.out.println(al);

		al.add(12);
		al.add(15);
		al.add(13);
		al.removeIf(n -> n >= 13 && n <= 19);
		System.out.println(al);

		List<String> string = new ArrayList<String>();
		string.add("this");
		string.add("not");
		string.add("too");
		string.add("long");
		string.removeIf(n -> n.length() >= 4);
		System.out.println(string);

		List<String> strings = new ArrayList<String>();
		strings.add("aaa");
		strings.add("bbb");
		strings.add("aza");
		strings.removeIf(n -> n.contains("z"));
		System.out.println(strings);

		List<String> no34 = new ArrayList<String>();
		no34.add("a");
		no34.add("bb");
		no34.add("ccc");
		no34.add("dddd");
		no34.removeIf(n -> (n.length() == 3) || n.length() == 4);
		System.out.println(no34);

		List<Integer> two2 = new ArrayList<Integer>();
		two2.add(1);
		two2.add(3);
		two2.add(2);
		two2.removeIf(n -> n * 2 == 0);

		System.out.println(two2);

		List<Integer> square56 = new ArrayList<Integer>();
		square56.add(3);
		square56.add(1);
		square56.add(4);
	}

}
