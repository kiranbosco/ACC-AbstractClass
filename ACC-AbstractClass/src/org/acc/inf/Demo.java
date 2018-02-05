package org.acc.inf;

abstract class MaheshPhone{
	
	public void call() {
		System.out.println("this is the call method()");
	}
	
	abstract void move();
	abstract void dance();
	abstract void cook();
}
abstract class Rameshphone extends MaheshPhone{

	@Override
	public void move() {
System.out.println("this is the move method()");		
	
	}
}
 class SureshPhone extends Rameshphone{
	
	public void dance() {
		System.out.println("i am dance method()");
		
	}
	public void cook() {
		System.out.println("cook method()");
	}
}

public class Demo {
	public static void main(String[] args) {
		MaheshPhone	obj=new SureshPhone();
		obj.call();
		obj.cook();
		obj.dance();
		obj.move();
		
	}

}