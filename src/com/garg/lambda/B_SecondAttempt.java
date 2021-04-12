package com.garg.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Rajesh Garg filter Apple list with conventional way and parameterize Values
 *
 */
public class B_SecondAttempt {

	public static void main(String[] args) {

		ArrayList<Apple> appleList = Apple.getAppleList();
		List<Apple> greenAppleList = B_SecondAttempt.filterAppleWithColor(appleList, "green");
		System.out.println(greenAppleList);

		List<Apple> redAppleList = B_SecondAttempt.filterAppleWithColor(appleList, "red");
		System.out.println(redAppleList);

		List<Apple> heaveAppleList = B_SecondAttempt.filterHeaveApple(appleList, 150);
		System.out.println(heaveAppleList);

		List<Apple> moreHeaveAppleList = B_SecondAttempt.filterHeaveApple(appleList, 250);
		System.out.println(moreHeaveAppleList);

	}

	public static List<Apple> filterAppleWithColor(List<Apple> appleList, String color) {
		List<Apple> greenAppleList = new ArrayList<>();
		for (Apple a : appleList) {
			if (a.getColor().equals(color))
				greenAppleList.add(a);
		}
		return greenAppleList;
	}
	
	public static List<Apple> filterHeaveApple(List<Apple> appleList, int minWeight) {
		List<Apple> heaveAppleList = new ArrayList<>();
		for (Apple a : appleList) {
			if (a.getWeight() > minWeight)
				heaveAppleList.add(a);
		}
		return heaveAppleList;
	}
}
