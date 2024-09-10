package org.tech.AutoWriting;

public class Company {
private EmployeeApp employee;
public void setEmployee(EmployeeApp employee) {
	this.employee=employee;
}
public void show() {
	System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getSal());
}
}
