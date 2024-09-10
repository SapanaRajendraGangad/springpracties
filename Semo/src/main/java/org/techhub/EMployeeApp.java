package org.techhub;

public class EMployeeApp {
	private int id;
	private String name;
	private int sal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	public void show() {
		System.out.println("Id is:-"+getId()+"\nName is:-"+getName()+"\nsalary is:-"+getSal());
	}
}
