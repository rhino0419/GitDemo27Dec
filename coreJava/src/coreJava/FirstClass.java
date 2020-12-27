package coreJava;

public class FirstClass {

	public   void firstMethod() {
		 
		System.out.println("Iam in first method");
	 
		
	}
	static int a=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass fp = new FirstClass();
		SecondClass sc = new SecondClass();
		sc.secondMethod();
		 fp.firstMethod();
		
		System.out.println (a);
		System.out.println("Hello world");
		System.out.print("aravindh is ");
		
	}

}
