package week.day2.assignments;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindIntersectionSet {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		HashSet<String> set1=new HashSet<String>();
		set.add("3");
		set.add("2");//3,2,11,4,6,7
		set.add("10");
		set.add("4");
		set.add("6");
		set.add("7");
		
		System.out.println("set: "+set);
		set1.add("1");
		set1.add("2");//1,2,8,4,9,7
		set1.add("8");
		set1.add("4");
		set1.add("9");
		set1.add("7");
		System.out.println("set1: "+set1);
		
		
		set1.retainAll(set);
		System.out.println("Intersection : "+set1);
	
		

	}

}
