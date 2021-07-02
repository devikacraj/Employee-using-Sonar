package com.sonar;

public class Employee {

	String name;
	int age;
	String job;
	int sal;
	Employee(){
		
	}
	Employee(String n,int a, String j,int s){
		name=n;
		age=a;
		job=j;
		sal=s;
	}   
	public void create() {
		new JdbcConnection(name,age,job,sal);
	}	
	public void raiseSalary() {
		new JdbcConnection().raiseSal();
	}

}