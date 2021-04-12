package com.garg.predicates;

public class A_PredicateExample2 {
	public static void main(String[] args) {
		
		//1.
		Runnable r =new Runnable() {
			@Override
			public void run() {
				System.out.println("1. execution from runnbale inline implementation");
			}
		};
		r.run();
		//OR
		process(r);
		
		//2. Use class who provided implementation on Runnable
		Runnable r1 = new RunnableImps();
		process(r1);

		//3. Use Lambda to provide pass implementation as parameter
		Runnable r2 = ()->System.out.println("3. execution from lambda impl");
		process(r2);
		
		//4. provide implementation while calling process method.
		process(()->System.out.println("4. execution from lambda impl in process method"));
	}

	public static void process(Runnable r) {	
		r.run();
	}
}

class RunnableImps implements Runnable{

	@Override
	public void run() {
		System.out.println("2. execution from RunnableImps class");		
	}
	
}