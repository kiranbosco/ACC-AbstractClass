package org.acc.interf;

public class StudentDemo implements Student,StudentInfo {

	@Override
	public void add() {

		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}

	@Override
	public void mul() {
		
		int a=5;
		int b=2;
		int c=a*b;
		System.out.println(c);
	}

	@Override
	public void sub() {
		int a=50;
		int b=20;
		int c=a-b;
		System.out.println(c);		
	}

	@Override
	public void address() {
System.out.println("Chandrasekharapuram");		
	}

	@Override
	public void subject() {
System.out.println("Spring boot App");		
	}


public static void main(String[] args) {
	StudentDemo obj=new StudentDemo();
	obj.add();
	obj.mul();
	obj.sub();
	obj.address();
	obj.subject();
	
		
}
}
	
