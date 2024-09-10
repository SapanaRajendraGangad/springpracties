package org.techhub;

public class ProductApp {
private int id;
private String Sal;
private int price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSal() {
	return Sal;
}
public void setSal(String sal) {
	Sal = sal;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String toString() {
	return "id is:-"+getId()+"\nname is"+getSal()+"\nprice is:-"+getPrice();
}
}
