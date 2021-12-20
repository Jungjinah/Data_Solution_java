package com.ddargiratte.dec201.planet;

import com.ddargiratte.dec201.person.Person;

public class Planet {
	
	private String name;						//1
	private int size;
	private boolean visible;

	public Planet() {
		// TODO Auto-generated constructor stub
	}
	
	public Planet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}											//1

	public void setName(String name) {
		this.name = name;
	}
 
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}											

	

	public void add(Person p) {
		System.out.printf("%s에 %s이/가 입주\n", p.getName(), name);
	}


}
