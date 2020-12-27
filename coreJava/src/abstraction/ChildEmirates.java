package abstraction;

public class ChildEmirates extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildEmirates child = new ChildEmirates();
		child.bodyColor();
		child.engine();
		child.safetyGuidelines();
		
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Body color of emirates is red");
		 
	}

}
