package com.garg.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Rajesh Garg 
 * filter Apple list using Anonymous Class
 *
 */
public class D_FourthAttempt {

	public static void main(String[] args) {

		ArrayList<Apple> appleList = Apple.getAppleList();
		List<Apple> redAppleList = D_FourthAttempt.filterApple(appleList, new ApplePredicate() {
			@Override
			public boolean test(Apple apple) {
				System.out.println("Testing Red apples in Annonymous Class");
				return ("red".equals(apple.color));
			}
		});
		System.out.println(redAppleList);

		List<Apple> heaveAppleList = D_FourthAttempt.filterApple(appleList, new ApplePredicate() {
			@Override
			public boolean test(Apple apple) {
				System.out.println("Testing Heavy apples in Annonymous Class");
				return apple.getWeight() > 150;
			}
		});
		System.out.println(heaveAppleList);

		List<Apple> redAndHeaveAppleList = D_FourthAttempt.filterApple(appleList, new ApplePredicate() {
			@Override
			public boolean test(Apple apple) {
				System.out.println("Testing Red & Heavy apples in Annonymous Class");
				return "red".equals(apple.color) && apple.getWeight() > 150;
			}
		});
		
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
