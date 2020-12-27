package demoPack;

public class AustralianTraffic implements CentralTraffic, ContinentTraffic {

	public static void main (String[] args) {
		CentralTraffic ct = new AustralianTraffic();
		ct.greengo();
		ct.yelllowgo();
		ct.redgo();
		
		 
	  walkonroad();
	  
	  ContinentTraffic continent = new AustralianTraffic();
	  continent.dontSleepOnRoad();
		System.out.println(a);
	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("Green implementation");
	}

	@Override
	public void redgo() {
		// TODO Auto-generated method stub
		System.out.println("Red implementation");
	}

	@Override
	public void yelllowgo() {
		// TODO Auto-generated method stub
		System.out.println("Yellow implementation");
	}
	
	public static void walkonroad() {
		System.out.println("walking");
	}

	@Override
	public void dontSleepOnRoad() {
		// TODO Auto-generated method stub
		System.out.println("Dont sleeep on road");
	}
}
