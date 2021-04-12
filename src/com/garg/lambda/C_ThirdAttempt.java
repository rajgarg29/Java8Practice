package com.garg.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Rajesh Garg 
 * filter Apple list with Behavior Parameterization
 * Passing filter strategies as parameter
 *
 */
public class C_ThirdAttempt{

	public static void main(String[] args) {

		ArrayList<Apple> appleList = Apple.getAppleList();
		List<Apple> redAppleList = C_ThirdAttempt.filterApple(appleList, new RedApplePredicate());
		System.out.println(redAppleList);

		List<Apple> heaveAppleList = C_ThirdAttempt.filterApple(appleList, new HeavyApplePredicate());
		System.out.println(heaveAppleList);

		List<Apple> redAndHeaveAppleList = C_ThirdAttempt.filterApple(appleList, new RedAndHeavyApplePredicate());
		System.out.println(redAndHeaveAppleList);

	}

	public static List<Apple> filterApple(List<Apple> appleList, ApplePredicate p) {
		System.out.println("Filtering apples with" + p.getClass());
		List<Apple> newAppleList = new ArrayList<>();
		for (Apple a : appleList) {
			//here you will see the magic
			if (p.test(a))
				newAppleList.add(a);
		}
		return newAppleList;
	}
}

class RedApplePredicate implements ApplePredicate {
	@Override
	public boolean test(Apple apple) {
		System.out.println("Testing Red apples");
		return ("red".equals(apple.color));
	}

}
class HeavyApplePredicate implements ApplePredicate {
	@Override
	public boolean test(Apple apple) {
		System.out.println("Testing Heavy apples");
		return (apple.getSize()>150);
	}

}
class RedAndHeavyApplePredicate implements ApplePredicate {
	@Override
	public boolean test(Apple apple) {
		System.out.println("Testing Red & Heavy apples");
		return ("red".equals(apple.getColor()) && apple.getSize()>150);
	}

}
