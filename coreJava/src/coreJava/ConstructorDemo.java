package coreJava;

public class ConstructorDemo {

	//default constructor:
	public ConstructorDemo () {
		System.out.println("i am in constructor");
		System.out.println("i am in constructor lecture");
	}
	
	//parameterized constructor
	
	public ConstructorDemo (int a , int b) {
		System.out.println("I am in parameterized constructor");
	}
	
	
	public ConstructorDemo (String str) {
		System.out.println(str);
	}
	public void getData() {
		System.out.println("I am in getdata method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo c = new ConstructorDemo(4,5);
		ConstructorDemo string = new ConstructorDemo("Aravindh");
		cd.getData();
		
	}

}
