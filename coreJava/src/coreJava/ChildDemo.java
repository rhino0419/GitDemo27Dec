package coreJava;

public class ChildDemo extends ParentDemo {
	
	String name="Eeswar";
	public ChildDemo() {
		 super();
		System.out.println("I am child constructor");
	}
	
	
	public void getString() {
		 System.out.println(name);
		 System.out.println(super.name);
	}
	
	public void getData() {
		super.getData();
		System.out.println("I am in child method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildDemo cd= new ChildDemo();
		cd.getString();
		cd.getData();
	}

}
