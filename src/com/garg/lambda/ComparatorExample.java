package com.garg.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

	public static void main(String[] args) {
		ArrayList<Apple> list = Apple.getAppleList();

		//1. 
		Comparator<Apple> weightComparator = new Comparator<Apple>() {
			public int compare(Apple o1, Apple o2) {
				// TODO Auto-generated method stub
				return Integer.valueOf(o1.getWeight()).compareTo(o2.getWeight());
			}

		};
		Collections.sort(list, weightComparator);
		display(list);

		//2.
		Comparator<Apple> colorComparator = new Comparator<Apple>() {
			public int compare(Apple o1, Apple o2) {
				// TODO Auto-generated method stub
				return o1.getColor().compareTo(o2.getColor());
			}
		};
		Collections.sort(list, colorComparator);
		display(list);
		
		//3.Comparator is Functional interface 
		//Using lambda to provide implementation of its abstract compare method
		Comparator<Apple> sizeComparator = (Apple a1, Apple a2) -> Integer.valueOf(a1.getSize()).compareTo(a2.getSize()); 
		Collections.sort(list, sizeComparator);
		display(list);

		//4.
		Comparator<Apple> colorComparator2 = (a1, a2) -> a1.getColor().compareTo(a2.getColor());
		Collections.sort(list, colorComparator2);
		display(list);

	}
	
	public static void display(ArrayList<Apple> list) {
		System.out.println("------------------------------------------------");
		for(Apple a: list) {
			System.out.println(a);
		}
	}
	
}
