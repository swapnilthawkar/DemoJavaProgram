package com.revision.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	
		int id;
		String name;
		int salary;
		public Employee() {
			
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(int id, String name, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		
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
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(100,"Swapnil",10000);
		Employee emp2 = new Employee(50,"mrunal",3300);
		Employee emp3 = new Employee(150,"piku",2100);
		Employee emp4 = new Employee(90,"Rajesh",80000);
		Employee emp5 = new Employee(110,"Kunal",90000);
		
		ArrayList<Employee> list = new ArrayList();
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		
	List<Employee> l1 = list.stream().filter(i->i.getSalary()>10000).collect(Collectors.toList());
		System.out.println(l1);
		
		list.stream().filter(i->i.getSalary()>80000).forEach(System.out::println);
		List<Integer> l2 =list.stream().filter(i->i.getName().equalsIgnoreCase("piku")).map(i->i.getSalary()).collect(Collectors.toList());
		System.out.println(l2);
//		
		
    	int maxSalary = list.stream().map(i->i.getSalary()).max(Integer::compare).get();
		System.out.println(maxSalary);
//		
//		list.stream().map(i->i.getName()).filter(i->i.startsWith("m")).forEach(System.out::println);
		
		//List<Integer> l1 = list.stream().map(i->i.getSalary())
		
		
	}
	
	
	}

 