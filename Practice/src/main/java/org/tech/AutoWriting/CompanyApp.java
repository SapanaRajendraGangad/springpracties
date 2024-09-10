package org.tech.AutoWriting;

public class CompanyApp {
	private EmployeeApp employee;
 public CompanyApp(EmployeeApp employee) {
	 this.employee=employee;
 }
 public void show() {
	 System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getSal());
 }
}
