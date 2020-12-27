package overloading;

public class ChildClass extends ParentClass {

	//same method name in class but different paremeters is method overloading
	public void getData(int a) {
		System.out.println(a);
	}
	
	public void getData(int a , int b ) {
		System.out.println(b);
	}
	
	public void getData(String a ) {
		System.out.println(a );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass chold = new ChildClass();
		chold.getData(10);
		 chold.getData(10, 20);
		 chold.getData("Aravindh");
	}

}
