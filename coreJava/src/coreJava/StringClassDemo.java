package coreJava;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a = "java@training ";
		System.out.println("Character at "+a.charAt(2));
		System.out.println(a.indexOf("a"));
		System.out.println(a.substring(3, 6));

		System.out.println(a.substring(3));
		System.out.println(a.concat("aravindh is great"));
		System.out.println(a.trim());
		System.out.println(a.toUpperCase());
		String arr []=a.split("@");

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("a", "b"));
		
	}

}
