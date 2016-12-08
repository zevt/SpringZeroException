package com.zeroexception;

public class Person {
	private String name;
	private int  age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println(" Name setter implemented");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println(" Name setter implemented");
		this.age = age;
	}
	
	public Person() {
		super();
		System.out.println(" Default Constructor implemented");
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("  Constructor with parameters implemented");
	}
	public void introduce() {
		System.out.println(" I'm "+ getName()+ " and I'm "+ getAge()+ " years old.");
	}
	
}
