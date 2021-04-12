package com.garg.lambda;

import java.util.ArrayList;
import java.util.List;

public class Apple {
	String color;
	int weight;
	int size;
	
	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Apple(String color, int weight, int size) {
		super();
		this.color = color;
		this.weight = weight;
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "gm, size=" + size + "]";
	}
	
	public static ArrayList<Apple> getAppleList(){
		ArrayList<Apple> appleList = new ArrayList<Apple>();
		appleList.add(new Apple("green", 10, 123));
		appleList.add(new Apple("red", 22, 999));
		appleList.add(new Apple("yellow", 22, 778));
		appleList.add(new Apple("green", 66, 455));
		appleList.add(new Apple("red", 155, 567));
		appleList.add(new Apple("yellow", 44, 890));
		
		return appleList;
		
		
	}
	
	
	
}
