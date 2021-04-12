package com.garg.lambda;

import java.util.ArrayList;

public class Orange {
	String color;
	int weight;
	int size;

	public Orange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orange(String color, int weight, int size) {
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
		return "Orange [color=" + color + ", weight=" + weight + "gm , size=" + size + "]";
	}

	public static ArrayList<Orange> getOrangeList() {
		
		ArrayList<Orange> orangeList = new ArrayList<Orange>();
		orangeList.add(new Orange("green", 10, 123));
		orangeList.add(new Orange("green", 155, 999));
		orangeList.add(new Orange("yellow", 22, 778));
		orangeList.add(new Orange("yellow", 155, 455));
		orangeList.add(new Orange("orange", 155, 567));
		orangeList.add(new Orange("orange", 44, 890));
		return orangeList;
	}
}
