package com.garg.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Rajesh Garg filter Apple list with conventional way
 * Using Lambda
 * passing implementation of test function as lambda
 * Passing Behavior/code as Parameter
 *
 */
public class E_FifthAttempt {

	public static void main(String[] args) {

		ArrayList<Apple> appleList = Apple.getAppleList();
		List<Apple> redAppleList = E_FifthAttempt.filterApple(appleList, (Apple a)->"red".equals(a.getColor()));
		System.out.println(redAppleList);

		List<Apple> heaveAppleList = E_FifthAttempt.filterApple(appleList, (Apple a) -> a.getWeight() > 150);
		System.out.println(heaveAppleList);

		List<Apple> redAndHeaveAppleList = E_FifthAttempt.filterApple(appleList, (Apple a) -> "red".equals(a.getColor()) && a.getWeight() > 150 );
		System.out.println(redAndHeaveAppleList);

	}

	public static List<Apple> filterApple(List<Apple> appleList, ApplePredicate p) {
		System.out.println("Filtering apples with " + p.getClass());
		List<Apple> newAppleList = new ArrayList<>();
		for (Apple a : appleList) {
			if (p.test(a))
				newAppleList.add(a);
		}
		return newAppleList;
	}
}

