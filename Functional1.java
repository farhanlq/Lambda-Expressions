package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Functional1 {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements in the arraylist ");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		ArrayList<Integer> l = new ArrayList<Integer>();
			for(int i=0;i<num;i++){
				l.add(scn.nextInt());
			}
		System.out.println(doubling(l));
		System.out.println("___________________________________");
		
		System.out.println(square(l));
		System.out.println("___________________________________");
		
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("one");
		l1.add("two");
		l1.add("three");
		l1.add("*");
		System.out.println(addStar(l1));
		
		System.out.println("___________________________________");
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("one");
		l2.add("24");
		l2.add("demo");
		l2.add("*");
		System.out.println(copies3(l2));
		System.out.println("___________________________________");
	
		
		ArrayList<String> l3 = new ArrayList<String>();
		l3.add("one");
		l3.add("24");
		l3.add("demo");
		l3.add("*");
		System.out.println(moreY(l3));
		System.out.println("___________________________________");
		
		
		System.out.println(math1(l));
		System.out.println("___________________________________");
		
		System.out.println(rightDigit(l));
		System.out.println("___________________________________");
		
		ArrayList<String> l4 = new ArrayList<String>();
		l4.add("ONE");
		l4.add("tWo");
		l4.add("tHrEe");
		System.out.println(lower(l4));
		System.out.println("___________________________________");
		
		
		
		ArrayList<String> l5 = new ArrayList<String>();
		l5.add("ONEx");
		l5.add("xxtWo");
		l5.add("tHxrEex");
		System.out.println(noX(l5));
		System.out.println("___________________________________");
	}
	
	public static List<Integer> doubling(List<Integer> l){
		return l.stream().map(n->n*2).collect(Collectors.toList());
		
	}
	
	
	public static List<Integer> square(List<Integer> l){
		return l.stream().map(n->n*n).collect(Collectors.toList());
		
	}
	
	
	public static List<String> addStar(List<String> l){
		return l.stream().map(n->n+'*').collect(Collectors.toList());
		
	}
	
	
	public static List<String> copies3(List<String> l){
		return l.stream().map(n->n+n+n).collect(Collectors.toList());
		
	}
	
	
	public static List<String> moreY(List<String> l){
		return l.stream().map(n->"y"+n+"y").collect(Collectors.toList());
		
	}
	
	public static List<Integer> math1(List<Integer> l){
		return l.stream().map(n->(n+1)*10).collect(Collectors.toList());
		
	}
	
	
	public static List<Integer> rightDigit(List<Integer> l){
		return l.stream().map(n->n%10).collect(Collectors.toList());
		
	}
	
	
	public static List<String> lower(List<String> l){
		return l.stream().map(name->name.toLowerCase()).collect(Collectors.toList());
		
	}
	
	
	public static List<String> noX(List<String> l){
		return l.stream().map(name->name.toLowerCase()).collect(Collectors.toList());
		
	}
	
	
}
