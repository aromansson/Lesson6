package com.practicaljava.lesson6;

public class TestPayIncreasePolyError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person workers[] = new Person[3];
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new ForeignContractor("Boris");

		for (Person p : workers) {
			((Payable) p).increasePay(30);
		}

	}

}
