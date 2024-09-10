package org.tech;

public class product {
private int id;
private String Name;
private int price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String toString() {
	return "["+id+","+Name+","+price+"]";

}
}
