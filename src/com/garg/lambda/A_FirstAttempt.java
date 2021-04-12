package com.garg.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Rajesh Garg filter Apple list with conventional way
 *
 */
public class A_FirstAttempt {

	public static void main(String[] args) {

		ArrayList<Apple> appleList = Apple.getAppleList();
		List<Apple> greenAppleList = A_FirstAttempt.filterGreenApple(appleList);
		System.out.println(greenAppleList);

		List<Apple> redAppleList = A_FirstAttempt.filterRedApple(appleList);
		System.out.println(redAppleList);

		List<Apple> heaveAppleList = A_FirstAttempt.filterHeaveApple(appleList);
		System.out.println(heaveAppleList);

	}

	public static List<Apple> filterGreenApple(List<Apple> appleList) {
		List<Apple> greenAppleList = new ArrayList<>();
		for (Apple a : appleList) {
			if (a.getColor().equals("green"))
				greenAppleList.add(a);
		}
		return greenAppleList;
	}
	
	public static List<Apple> filterRedApple(List<Apple> appleList) {
		List<Apple> redAppleList = new ArrayList<>();
		for (Apple a : appleList) {
			if (a.getColor().equals("red"))
				redAppleList.add(a);
		}
		return redAppleList;
	}

	public static List<Apple> filterHeaveApple(List<Apple> appleList) {
		List<Apple> heaveAppleList = new ArrayList<>();
		for (Apple a : appleList) {
			if (a.getWeight() > 150)
				heaveAppleList.add(a);
		}
		return heaveAppleList;
	}
}
