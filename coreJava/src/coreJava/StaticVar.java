package coreJava;

public class StaticVar {

	String name;
	String address;
	static String city="hyderabad";
	
	StaticVar(String name, String address){
	 
		this.name=name;
		this.address=address;
		 
	}
	
	public void getAddress() {
		 System.out.println(address + " ,"+ city);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StaticVar s= new StaticVar("Bob","Shamshabad");
		StaticVar s2= new StaticVar("ram","Attapur");
		s.getAddress();
		s2.getAddress();
		 
		
	}

}
