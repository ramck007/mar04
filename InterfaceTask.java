interface Vehicles{
	public String Engine();
}

interface VehicleNumber{
	public String Number();
}

abstract class Cars implements Vehicles,VehicleNumber{
	public abstract String Engine();
	public abstract int Wheels();
	public abstract String Number();
}

abstract class Bikes implements Vehicles,VehicleNumber{
	public abstract String Engine();
	public abstract int Wheels();
	public abstract String Number();
	public String type() {
		return null;
		
	}
}

class Bmws extends Cars{
	public String Engine() {
		return "Big Engine";
	}
	public int Wheels() {
		return 4;
	}
	public String Number() {
		return "Yes it has Number Plate";		
	}
}
class Benzz extends Cars{
	public String Engine() {
		return "Big Engine";
	}
	public int Wheels() {
		return 4;
	}
	public String Number() {
		return "Yes it has Number Plate";		
	}
}

class Yamahas extends Bikes{
	public String Engine() {
		return "Small Engine";
	}
	public int Wheels() {
		return 2;
	}
	public String Number() {
		return "Yes it has Number Plate";		
	}
	
}

class Harleys extends Bikes{
	public String Engine() {
		return "Double Engine";
	}
	public int Wheels() {
		return 2;
	}
	public String Number() {
		return "Nope it has no Number Plate";		
	}
public String type() {
	//System.out.println("Crusier");
	return "Crusier";
}
	
}

public class InterfaceTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bmws bmw = new Bmws();
		Benzz benz = new Benzz();
		Yamahas yamaha = new Yamahas();
		Harleys harley = new Harleys();
		
		System.out.println(bmw.getClass().getName() +" has "+bmw.Engine());
		System.out.println(bmw.getClass().getName() +" has "+bmw.Wheels()+" Wheels.");
		System.out.println(bmw.getClass().getName() +" "+bmw.Number());
		System.out.println("");
		System.out.println(benz.getClass().getName() +" has "+benz.Engine());
		System.out.println(benz.getClass().getName() +" has "+benz.Wheels()+" Wheels.");
		System.out.println(benz.getClass().getName() +" "+benz.Number());
		System.out.println("");
		System.out.println(yamaha.getClass().getName() +" has "+yamaha.Engine());
		System.out.println(yamaha.getClass().getName() +" has "+yamaha.Wheels()+" Wheels.");
		System.out.println(yamaha.getClass().getName() +" "+yamaha.Number());
		System.out.println("");
		System.out.println(harley.getClass().getName() +" has "+harley.Engine());
		System.out.println(harley.getClass().getName() +" has "+harley.Wheels()+" Wheels.");
		System.out.println(harley.getClass().getName() +" is Of "+harley.type()+" type.");
		System.out.println(harley.getClass().getName() +" "+harley.Number());
	}

}

