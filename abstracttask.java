import java.util.*;

abstract class Vehicle{
	public abstract String Engine();
}

abstract class Car extends Vehicle{
	public abstract String Engine();
	public abstract int Wheels();
}

abstract class Bike extends Vehicle{
	public abstract String Engine();
	public abstract int Wheels();
	public String type() {
		return null;
		
	}
}

class Bmw extends Car{
	public String Engine() {
		return "Big Engine";
	}
	public int Wheels() {
		return 4;
	}
}
class Benz extends Car{
	public String Engine() {
		return "Big Engine";
	}
	public int Wheels() {
		return 4;
	}
}

class Yamaha extends Bike{
	public String Engine() {
		return "Small Engine";
	}
	public int Wheels() {
		return 2;
	}
	
}

class Harley extends Bike{
	public String Engine() {
		return "Double Engine";
	}
	public int Wheels() {
		return 2;
	}
	
public String type() {
	//System.out.println("Crusier");
	return "Crusier";
}
	
}

public class abstracttask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bmw bmw = new Bmw();
		Benz benz = new Benz();
		Yamaha yamaha = new Yamaha();
		Harley harley = new Harley();
		
		System.out.println(bmw.getClass().getName() +" has "+bmw.Engine());
		System.out.println(bmw.getClass().getName() +" has "+bmw.Wheels()+" Wheels.");
		System.out.println("");
		System.out.println(benz.getClass().getName() +" has "+benz.Engine());
		System.out.println(benz.getClass().getName() +" has "+benz.Wheels()+" Wheels.");
		System.out.println("");
		System.out.println(yamaha.getClass().getName() +" has "+yamaha.Engine());
		System.out.println(yamaha.getClass().getName() +" has "+yamaha.Wheels()+" Wheels.");
		System.out.println("");
		System.out.println(harley.getClass().getName() +" has "+harley.Engine());
		System.out.println(harley.getClass().getName() +" has "+harley.Wheels()+" Wheels.");
		System.out.println(harley.getClass().getName() +" is Of "+harley.type()+" type.");
	}

}
