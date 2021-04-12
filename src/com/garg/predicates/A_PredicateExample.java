package com.garg.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class A_PredicateExample {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("ONE");
		l.add("");
		l.add("THREE");
		l.add("");
		l.add("FIVE");
		l.add("");
		l.add("SEVEN");
		l.add("EIGHT");

		System.out.println(l);

		Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();

		System.out.println(filter(l, nonEmptyStringPredicate));

	}

	public static <T> List<T> filter(List<T> l, Predicate<T> p) {
		System.out.println("\nFiltering " + l.get(0).getClass() + " with " + p.getClass());
		List<T> ll = new ArrayList<>();
		for (T e : l) {
			if (p.test(e))
				ll.add(e);
		}
		return ll;
	}

}
