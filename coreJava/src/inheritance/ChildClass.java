package inheritance;

public class ChildClass extends ParentClass {

	public void engine() {
		System.out.println("engine is implemeted");
	}
	
	public void color() {
		System.out.println(color);
	}
	
	public void audioSystem(){///overriding -- same name in parent class and child class  {
		System.out.println("New Audio of child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ChildClass child = new ChildClass();
		child.color();
		child.engine();
		child.audioSystem();
		child.breaks();
		
	}

}
