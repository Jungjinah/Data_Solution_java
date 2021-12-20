package com.ddargiratte.dec201.person;

import com.beaver.dec201.avengers.Avengers;

public class Person {
	
	private String name;				//1
	private Avengers hero;	//hero	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}									//1

	public void pick(Avengers a) {
		hero = a;
		System.out.println("선택완료!");
	}
	
	public void helpAaaa() {
		hero.attack();
		
	}
	
	
}
