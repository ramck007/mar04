import java.util.*;
public class NestingMethod {
	
	private int m,n;
	//constructor
	NestingMethod(int a , int b){
		
		m=a;
		n=b;
		
	}
	//method
	int largest() {
		
		if(m>n) 
			return m;
			else 
				return n;
		
	}
	
	void display() {
		
		int large = largest();
		System.out.println("The greatest number: "+ large);
	}
	
	public static void main(String[]args) {
		NestingMethod ob = new NestingMethod(10,20);
		ob.display();
		
	}

}
