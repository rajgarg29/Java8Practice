package com.garg.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * @author Rajesh Garg filter Apple list with conventional way
 *
 */
public class F_SixthAttempt {

	public static void main(String[] args) {

		ArrayList<Apple> appleList = Apple.getAppleList();
		List<Apple> redAppleList = F_SixthAttempt.filter(appleList, (Apple a) -> "red".equals(a.getColor()));
		System.out.println(redAppleList);

		List<Apple> heaveAppleList = F_SixthAttempt.filter(appleList, (Apple a) -> a.getWeight() > 150);
		System.out.println(heaveAppleList);

		List<Apple> redAndHeaveAppleList = F_SixthAttempt.filter(appleList, (Apple a) -> "red".equals(a.getColor()) && a.getWeight() > 150);
		System.out.println(redAndHeaveAppleList);
		

		ArrayList<Orange> orangeList = Orange.getOrangeList();
		List<Orange> yellowOrangeList = F_SixthAttempt.filter(orangeList, (Orange a) -> "yellow".equals(a.getColor()));
		System.out.println(yellowOrangeList);

		List<Orange> heaveOrangeList = F_SixthAttempt.filter(orangeList, (Orange a) -> a.getWeight() > 150);
		System.out.println(heaveOrangeList);

		List<Orange> yellowAndHeaveOrangeList = F_SixthAttempt.filter(orangeList, (Orange a) -> "yellow".equals(a.getColor()) && a.getWeight() > 150);
		System.out.println(yellowAndHeaveOrangeList);
		
	}

	public static <T> List<T> filter(List<T> l, Predicate<T> p) {
		System.out.println("\nFiltering "+l.get(0).getClass()+" with " + p.getClass());
		List<T> ll = new ArrayList<>();
		for (T e : l) {
			if (p.test(e))
				ll.add(e);
		}
		return ll;
	}
}
